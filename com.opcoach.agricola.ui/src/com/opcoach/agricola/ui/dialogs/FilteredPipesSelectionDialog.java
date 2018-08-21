package com.opcoach.agricola.ui.dialogs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emfforms.common.Feature;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;
import com.bistiboy.agricola.InPlug;
import com.bistiboy.agricola.OutPlug;
import com.bistiboy.agricola.Plug;
import com.bistiboy.agricola.impl.OutPlugImpl;

public class FilteredPipesSelectionDialog extends FilteredItemsSelectionDialog {

	private static final String DIALOG_SETTINGS = "org.eclipse.pde.ui.dialogs.PluginSelectionDialog"; //$NON-NLS-1$
	private Set<InPlug> inPlugs;
	private Set<OutPlug> outPlugs;
	private Set<Plug> plugs;
	
	private boolean filterOpositeWayPlugs;
	
	private class AgricolaAdaptor extends LabelProvider{
		Agricola a;
		AgricolaAdaptor(Agricola a){
			this.a = a;
		}
		
		private Set<EObject> getEObjectByInterfaceName(EObject root,String interfaceName){
			return getEObject(root,interfaceName+"Impl");
		}
		
		private Set<EObject> getEObjectByClassName(EObject root, String className){
			return getEObject(root,className);
		}
		
		private Set<EObject> getEObject(EObject root, String searchedChildClassName){
			Set<EObject> result = new HashSet<EObject>();

					
			if(root!=null) {
				String searched;
				if(searchedChildClassName.contains("Impl")) {
					searched = searchedChildClassName;
				}
				else {
					searched = searchedChildClassName+"Impl";
				}
				TreeIterator<EObject> it = root.eAllContents();
				
				while(it.hasNext()) {
					EObject o = it.next();
					if(o.getClass().getCanonicalName().endsWith(searched)) {
						result.add(o);
					}
				}
			}
			return result;
		}
		
		Set<InPlug> getInPlugs(){
			Set<EObject> seo = getEObjectByInterfaceName(a,"InPlug");
			Set<InPlug> result = new HashSet<InPlug>();
			seo.forEach(elem -> result.add((InPlug)elem));
			return result;
		}
		
		Set<OutPlug> getOutPlugs(){
			Set<EObject> seo = getEObjectByInterfaceName(a,"OutPlug");
			Set<OutPlug> result = new HashSet<OutPlug>();
			seo.forEach(elem -> result.add((OutPlug)elem));
			return result;
		}

		public String getText(Object o) {
			if(o instanceof Plug) {
				Plug p = (Plug)o;
				return p.getName();
			}
			if(o != null) {
			return "ERROR : received object in AgricolaAdaptor.getText(Objec o) is of type "+
			o.getClass().getCanonicalName();
			}
			else {
				return "ERROR : o is null!!! ( at line 197 of "+this.getClass().getName()+".java)";
			}
			
		}
	}

	public FilteredPipesSelectionDialog(Shell parentShell, Agricola a) {
		super(parentShell, false);
		AgricolaAdaptor aa = new AgricolaAdaptor(a);
		inPlugs = aa.getInPlugs();
		outPlugs = aa.getOutPlugs();
		plugs = new HashSet<Plug>();
		plugs.addAll(inPlugs);
		plugs.addAll(outPlugs);
		
		setTitle("Select the Plug where you want to connect that Pipe");
		setMessage("! the direction (a Pipe connected to an InPlug on one hand, can only "
				+ "be connected to an OutPlug on the other hand and vice versa)");
		setListLabelProvider(aa);
	}

	@PostConstruct
	public void createContent(Composite parent) {
		Button bFilterOpositeWayPlugs = new Button(parent,SWT.CHECK);
		bFilterOpositeWayPlugs.setText("Filter oposite way plugs");
		filterOpositeWayPlugs = true;
		bFilterOpositeWayPlugs.setSelection(filterOpositeWayPlugs);
		bFilterOpositeWayPlugs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				if(event.detail == SWT.CHECK) {
					filterOpositeWayPlugs = true;
				}
				else {
					filterOpositeWayPlugs = false;
				}
			}
		});
		bFilterOpositeWayPlugs.setVisible(true);
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
	}

	@Override
	public boolean close() {
		return super.close();
	}


	@Override
	protected Control createExtendedContentArea(Composite parent) {
		return null;
	}

	@Override
	protected ItemsFilter createFilter() {
		return new ItemsFilter() {
			public boolean matchItem(Object item) {
				if(item instanceof Plug) {
					Plug p = (Plug)item;
					return matches(((Plug) item).getName());
				}
				return false;
			}
			
			public boolean isConsistentItem(Object item) {
				if(item instanceof Plug) {
					return true;
				}
				return false;
			}
		};
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, 
			ItemsFilter itemsFilter, IProgressMonitor progressMonitor) throws CoreException {
		for (Plug p : plugs) {
			contentProvider.add(p, itemsFilter);
			progressMonitor.worked(1);
		}
		progressMonitor.done();
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = new DialogSettings("root");
		return settings;
	}

	@Override
	public String getElementName(Object item) {
		if (item instanceof Plug) {
			Plug p = (Plug) item;
			return p.getName();
		}
		return null;
	}

	@Override
	protected Comparator<?> getItemsComparator() {
		return new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Plug) {
					Plug p1 = (Plug)o1;
					if(o2 instanceof Plug) {
						Plug p2 = (Plug)o2;
						return p1.getName().compareTo(p2.getName());
					}
				}
				return -1;
			}
		};
	}



	@Override
	protected IStatus validateItem(Object item) {
		return Status.OK_STATUS;
	}
}


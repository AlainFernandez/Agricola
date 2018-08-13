package com.opcoach.agricola.ui.dialogs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;
import com.bistiboy.agricola.InPlug;
import com.bistiboy.agricola.OutPlug;
import com.bistiboy.agricola.Plug;

public class FilteredPipesSelectionDialog4 extends FilteredItemsSelectionDialog {

	private static final String DIALOG_SETTINGS = "org.eclipse.pde.ui.dialogs.PluginSelectionDialog"; //$NON-NLS-1$
	//private IPluginModelBase[] fModels;
	private Set<InPlug> inPlugs;
	private Set<OutPlug> outPlugs;
	private Set<Plug> plugs;
	
	
	
//	private class PlugSearchItemsFilter extends ItemsFilter {
//
//		public PlugSearchItemsFilter() {
//			super();
//			String pattern = patternMatcher.getPattern();
//			if (pattern.indexOf("*") != 0 && pattern.indexOf("?") != 0 && pattern.indexOf(".") != 0) {//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//				pattern = "*" + pattern; //$NON-NLS-1$
//				patternMatcher.setPattern(pattern);
//			}
//		}
//
//		@Override
//		public boolean isConsistentItem(Object item) {
//			return true;
//		}
//
//		@Override
//		public boolean matchItem(Object item) {
//			String id = null;
//			Plug p = null;
//			if(item instanceof Plug) {
//				p = (Plug)item;
//			}
//			if(p!=null) {
//				id = p.getName();
//			}
//
//			return (matches(id));
//		}
//	}
//
//	private class PlugSearchComparator implements Comparator<Object> {
//
//		@Override
//		public int compare(Object o1, Object o2) {
//			int id1 = getIdType(o1);
//			int id2 = getIdType(o2);
//
//			if (id1 != id2) {
//				return id1 - id2;
//			}
//			return compareSimilarObjects(o1, o2);
//		}
//
//		private int getIdType(Object element) {
//			if (element instanceof InPlug) {
//				return 100;
//			}
//			else if (element instanceof OutPlug) {
//				return 101;
//			}
//			return 0;
//		}
//
//		private int compareSimilarObjects(Object o1, Object o2) {
//			if (o1 instanceof Plug && o2 instanceof Plug) {
//				Plug p1 = (Plug) o1;
//				Plug p2 = (Plug) o2;
//				return p1.getName().compareTo(p2.getName());
//			}
//			return 0;
//		}

//		private int comparePlugins(IPluginBase ipmb1, IPluginBase ipmb2) {
//			return ipmb1.getId().compareTo(ipmb2.getId());
//		}
//
//	}

//	public FilteredPipesSelectionDialog4(Shell parentShell, 
//			boolean includeFragments, boolean multipleSelection) {
//		this(parentShell, getElements(includeFragments), multipleSelection);
//	}
	private class AgricolaAdaptor extends LabelProvider{
		Agricola a;
		AgricolaAdaptor(Agricola a){
			this.a = a;
		}
		
		Set<InPlug> getInPlugs(){
			Set<InPlug> result = new HashSet<InPlug>();
			InPlug ip1 = AgricolaFactory.eINSTANCE.createInPlug();
			ip1.setName("ip1");
			result.add(ip1);
			InPlug ip2 = AgricolaFactory.eINSTANCE.createInPlug();
			ip2.setName("ip2");
			result.add(ip2);
			InPlug ip3 = AgricolaFactory.eINSTANCE.createInPlug();
			ip3.setName("ip3");
			result.add(ip3);
			return result;
		}
		
		Set<OutPlug> getOutPlugs(){
			Set<OutPlug> result = new HashSet<OutPlug>();
			return result;
		}

		public String getText(Object o) {
			if(o instanceof Plug) {
				Plug p = (Plug)o;
				System.out.println("receive o.getName() = "+p.getName()+" in AgricolaAdaptor.getText(Object o)");
				return p.getName();
			}
			return "ERROR : received object in AgricolaAdaptor.getText(Objec o) is of type "+
			o.getClass().getCanonicalName();
			
		}
	}

	public FilteredPipesSelectionDialog4(Shell parentShell, Agricola a) {
		super(parentShell, false);
		AgricolaAdaptor aa = new AgricolaAdaptor(a);
		inPlugs = aa.getInPlugs();
		outPlugs = aa.getOutPlugs();
		plugs = new HashSet<Plug>();
		plugs.addAll(inPlugs);
		plugs.addAll(outPlugs);
		
		setTitle("Select the Plug where you want to connect that Pipe");
		setMessage("beware of the direction (a Pipe which connected to an InPlug on one hand, can only "
				+ "be connected to an OutPlug on the other hand and vice versa");
		// see http://blog.eclipse-tips.com/2008/10/extending-filtereditemsselectiondialog.html
//		PDEPlugin.getDefault().getLabelProvider().connect(this);
//		setListLabelProvider(PDEPlugin.getDefault().getLabelProvider());
		setListLabelProvider(aa);
		
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(newShell, IHelpContextIds.PLUGIN_SELECTION);
	}

	@Override
	public boolean close() {
//		PDEPlugin.getDefault().getLabelProvider().disconnect(this);
		return super.close();
	}

//	private static IPluginModelBase[] getElements(boolean includeFragments) {
//		return PluginRegistry.getActiveModels(includeFragments);
//	}

//	public static HashSet<String> getExistingImports(IPluginModelBase model, boolean includeImportPkg) {
//		HashSet<String> existingImports = new HashSet<>();
//		addSelfAndDirectImports(existingImports, model);
//		if (model instanceof IFragmentModel) {
//			IFragment fragment = ((IFragmentModel) model).getFragment();
//			IPluginModelBase host = PluginRegistry.findModel(fragment.getPluginId());
//			if (host instanceof IPluginModel) {
//				addSelfAndDirectImports(existingImports, host);
//			}
//		}
//		if (includeImportPkg && model instanceof IBundlePluginModelBase) {
//			addImportedPackages((IBundlePluginModelBase) model, existingImports);
//		}
//		return existingImports;
//	}

//	private static void addSelfAndDirectImports(HashSet<String> set, IPluginModelBase model) {
//		set.add(model.getPluginBase().getId());
//		IPluginImport[] imports = model.getPluginBase().getImports();
//		for (IPluginImport pImport : imports) {
//			String id = pImport.getId();
//			if (set.add(id)) {
//				addReexportedImport(set, id);
//			}
//		}
//	}

//	private static void addReexportedImport(HashSet<String> set, String id) {
//		IPluginModelBase model = PluginRegistry.findModel(id);
//		if (model != null) {
//			IPluginImport[] imports = model.getPluginBase().getImports();
//			for (IPluginImport pImport : imports) {
//				if (pImport.isReexported() && set.add(pImport.getId())) {
//					addReexportedImport(set, pImport.getId());
//				}
//			}
//		}
//	}

//	private static void addImportedPackages(IBundlePluginModelBase base, HashSet<String> existingImports) {
//		HashMap<String, ImportPackageObject> map = getImportPackages(base);
//		if (map == null) {
//			return;
//		}

		//ExportPackageDescription exported[] = PDECore.getDefault().getModelManager().getState().getState().getExportedPackages();
//		for (int i = 0; i < exported.length; i++) {
//			// iterate through all the exported packages
//			ImportPackageObject ipo = map.get(exported[i].getName());
//			// if we find an exported package that matches a pkg in the map, then the exported package matches a package on our import-package statement
//			if (ipo != null) {
//				// check version to make sure we only add bundles from valid packages
//				String version = ipo.getVersion();
//				if (version != null) {
//					try {
//						if (!new VersionRange(version).isIncluded(exported[i].getVersion()))
//						 {
//							continue;
//						// NFE if ImportPackageObject's version is improperly formatted - ignore any matching imported packages since version is invalid
//						}
//					} catch (NumberFormatException e) {
//						continue;
//					}
//				}
//				existingImports.add(exported[i].getSupplier().getSymbolicName());
//			}
//		}
//	}

	// returns null instead of empty map so we know not to iterate through exported packages
//	private static HashMap<String, ImportPackageObject> getImportPackages(IBundlePluginModelBase base) {
//		IBundleModel bmodel = base.getBundleModel();
//		if (bmodel != null) {
//			ImportPackageHeader header = (ImportPackageHeader) bmodel.getBundle().getManifestHeader(Constants.IMPORT_PACKAGE);
//			if (header != null) {
//				// create a map of all the packages we import
//				HashMap<String, ImportPackageObject> map = new HashMap<>();
//				ImportPackageObject[] packages = header.getPackages();
//				for (ImportPackageObject importPackage : packages) {
//					map.put(importPackage.getName(), importPackage);
//				}
//				return map;
//			}
//		}
//		return null;
//	}

	@Override
	protected Control createExtendedContentArea(Composite parent) {
		return null;
	}

	@Override
	protected ItemsFilter createFilter() {
		//return new PlugSearchItemsFilter();
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
		//IDialogSettings settings = Activator.getDefault().getDialogSettings().getSection(SETTINGS);
		IDialogSettings settings = new DialogSettings("root");

//		if (settings == null) {
//			//settings = Activator.getDefault().getDialogSettings().addNewSection(SETTINGS);
//			IDialogSettings settings = getDialogSettings();
//		}

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
		//return new PlugSearchComparator();
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
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	protected IStatus validateItem(Object item) {
//		return new Status(IStatus.OK, IPDEUIConstants.PLUGIN_ID, 0, "", null); //$NON-NLS-1$
//	}
//
//	@Override
//	protected void createButtonsForButtonBar(Composite parent) {
//		createButton(parent, IDialogConstants.OK_ID, PDEUIMessages.ManifestEditor_addActionText, true);
//		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
//	}

}


 
package com.opcoach.agricola.ui.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.Pipe;
import com.bistiboy.agricola.Plug;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog2;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog3;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog4;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog5;

public class ConnectPipeHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL)Shell sh,
			@Named(IServiceConstants.ACTIVE_SELECTION)IStructuredSelection sel) {

		Object o = sel.getFirstElement();
		if(o instanceof Pipe) {
			System.out.println("To connect Pipe objects");
			Pipe p = (Pipe)o;
			EObject r = EcoreUtil.getRootContainer(p);
			System.out.println("r.getClass().getName()= "+r.getClass().getName());
			
			FilteredPipesSelectionDialog4 dg = new FilteredPipesSelectionDialog4(sh,(Agricola)r);
			dg.setInitialPattern("*");
			
			dg.create();
			if(dg.open() == Window.OK) {
				Plug selectedPlug = (Plug)dg.getFirstResult();
				System.out.println("vous avez sélectionné le Plug "+selectedPlug.getName());
			}
			
			
			
			
		}
		
	}
		
}
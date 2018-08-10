 
package com.opcoach.agricola.ui.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import com.bistiboy.agricola.Pipe;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog2;
import com.opcoach.agricola.ui.dialogs.FilteredPipesSelectionDialog3;

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
			
			FilteredPipesSelectionDialog2 dg = new FilteredPipesSelectionDialog2(sh, false, null, null, 0);
			dg.setTitle("Select a Plug where to connect this Pipe");
			dg.open();
			
		}
		
	}
		
}
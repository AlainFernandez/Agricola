 
package com.opcoach.agricola.ui.handlers;

import java.util.List;
import java.util.Set;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.Pipe;

public class ConnectPipeHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL)Shell sh,
			@Named(IServiceConstants.ACTIVE_SELECTION)IStructuredSelection sel) {

		Object o = sel.getFirstElement();
		if(o instanceof Pipe) {
			System.out.println("Pour connecter des pipes");
			Pipe p = (Pipe)o;
			EObject r = EcoreUtil.getRootContainer(p);
			System.out.println("r.getClass().getName()= "+r.getClass().getName());
			
			int numParent = 0;
			boolean found = false;
			EObject eo = (EObject)p;
			while(!found && (numParent < 8)) {
				eo = eo.eContainer();
				System.out.println("eo.getClass().getName() = "+eo.getClass().getName());
				numParent ++;
				if(eo instanceof Agricola) {
					found = true;
				}
			}
			if(!found) {
				System.out.println("Agricola parent was not found !");
			}
			else if (eo == r) {
				System.out.println("both technic give the same result!");
			}

			//Set<Pipe> knownPipes = r.getPipes();
			
		}
		
	}
		
}
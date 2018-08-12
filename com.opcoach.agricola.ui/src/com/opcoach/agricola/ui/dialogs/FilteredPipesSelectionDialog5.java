package com.opcoach.agricola.ui.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

public class FilteredPipesSelectionDialog5 extends Dialog {
	
	TableViewer viewer;

	public FilteredPipesSelectionDialog5(Shell parentShell) {
		super(parentShell);
		viewer = new TableViewer(parentShell,SWT.MULTI|SWT.H_SCROLL
				| SWT.V_SCROLL|SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
	}

}

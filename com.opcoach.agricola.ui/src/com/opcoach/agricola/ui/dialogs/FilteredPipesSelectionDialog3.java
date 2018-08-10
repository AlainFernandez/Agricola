package com.opcoach.agricola.ui.dialogs;

import java.util.Comparator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

public class FilteredPipesSelectionDialog3 extends FilteredItemsSelectionDialog {

	/**
	 * Creates new FilteredTypesSelectionDialog instance
	 *
	 * @param parent
	 *            shell to parent the dialog on
	 * @param multi
	 *            <code>true</code> if multiple selection is allowed
	 **/
	public FilteredPipesSelectionDialog3(Shell shell, boolean multi) {
		super(shell, multi);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createExtendedContentArea(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IStatus validateItem(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ItemsFilter createFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Comparator getItemsComparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
			IProgressMonitor progressMonitor) throws CoreException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getElementName(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.aptana.git.ui.internal.actions;

public class StatusAction extends GitAction
{

	@Override
	protected String[] getCommand()
	{
		return new String[] { "status" }; //$NON-NLS-1$
	}
}

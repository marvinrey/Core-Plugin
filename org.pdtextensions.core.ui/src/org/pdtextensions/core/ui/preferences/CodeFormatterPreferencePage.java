/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.pdtextensions.core.ui.preferences;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.pdtextensions.core.ui.PEXUIPlugin;
import org.pdtextensions.core.ui.preferences.formatter.CodeFormatterConfigurationBlock;
import org.pdtextensions.core.ui.preferences.formatter.ProfileConfigurationBlock;

/*
 * The page to configure the code formatter options.
 */
public class CodeFormatterPreferencePage extends ProfilePreferencePage {

	public static final String PREF_ID = "com.dubture.pdt.formatter.ui.preferences.CodeFormatterPreferencePage"; //$NON-NLS-1$
	public static final String PROP_ID = "com.dubture.pdt.formatter.ui.propertyPages.CodeFormatterPropertyPage"; //$NON-NLS-1$

	public CodeFormatterPreferencePage() {
		// only used when page is shown programatically
		setTitle(PreferencesMessages.CodeFormatterPreferencePage_title);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.preferences.ProfilePreferencePage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		PlatformUI.getWorkbench().getHelpSystem()
				.setHelp(getControl(), PEXUIPlugin.HELP_ID_FORMATTER);
	}

	protected ProfileConfigurationBlock createConfigurationBlock(
			PreferencesAccess access) {
		return new CodeFormatterConfigurationBlock(getProject(), access);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.preferences.PropertyAndPreferencePage#getPreferencePageID()
	 */
	protected String getPreferencePageID() {
		return PREF_ID;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.preferences.PropertyAndPreferencePage#getPropertyPageID()
	 */
	protected String getPropertyPageID() {
		return PROP_ID;
	}
}
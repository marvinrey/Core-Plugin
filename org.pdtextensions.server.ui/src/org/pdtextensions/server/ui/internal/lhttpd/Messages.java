package org.pdtextensions.server.ui.internal.lhttpd;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.pdtextensions.server.ui.internal.lhttpd.messages"; //$NON-NLS-1$
	public static String LHttpdRuntimeComposite_Browse;
	public static String LHttpdRuntimeComposite_Description;
	public static String LHttpdRuntimeComposite_Install;
	public static String LHttpdRuntimeComposite_InstallDir;
	public static String LHttpdRuntimeComposite_Name;
	public static String LHttpdRuntimeComposite_SelectApacheXamppInstallDir;
	public static String LHttpdRuntimeComposite_SelectXamppInstallDir;
	public static String LHttpdRuntimeComposite_TaskInstallingRuntime;
	public static String LHttpdRuntimeComposite_Title;
	public static String LHttpdRuntimeComposite_TitleDownloadAndInstall;
	public static String ServerConfigurationEditorPart_FormTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}

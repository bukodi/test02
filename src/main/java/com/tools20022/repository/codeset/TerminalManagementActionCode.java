package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Types of terminal management action to be performed by a point of
 * interaction.
 */
public class TerminalManagementActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data set must be activated.
	 */
	public static final MMCode Activate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Activate";
			definition = "Data set must be activated.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Data set must be deactivated.
	 */
	public static final MMCode Deactivate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deactivate";
			definition = "Data set must be deactivated.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DCTV";
		}
	};
	/**
	 * Data set must be deleted.
	 */
	public static final MMCode Delete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delete";
			definition = "Data set must be deleted.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DELT";
		}
	};
	/**
	 * Data set must be downloaded.
	 */
	public static final MMCode Download = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Download";
			definition = "Data set must be downloaded.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "DWNL";
		}
	};
	/**
	 * Data set must be installed.
	 */
	public static final MMCode Install = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Install";
			definition = "Data set must be installed.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Point of interaction must be restarted.
	 */
	public static final MMCode Restart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restart";
			definition = "Point of interaction must be restarted.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Data set must be uploaded.
	 */
	public static final MMCode Upload = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Upload";
			definition = "Data set must be uploaded.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "UPLD";
		}
	};
	/**
	 * Update, or replacement of the data set.
	 */
	public static final MMCode Update = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			definition = "Update, or replacement of the data set.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "UPDT";
		}
	};
	/**
	 * Creation or addition of a new data set.
	 */
	public static final MMCode Create = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Create";
			definition = "Creation or addition of a new data set.";
			owner_lazy = () -> TerminalManagementActionCode.mmObject();
			codeName = "CREA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionCode";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionCode.Activate, com.tools20022.repository.codeset.TerminalManagementActionCode.Deactivate,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Delete, com.tools20022.repository.codeset.TerminalManagementActionCode.Download, com.tools20022.repository.codeset.TerminalManagementActionCode.Install,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Restart, com.tools20022.repository.codeset.TerminalManagementActionCode.Upload, com.tools20022.repository.codeset.TerminalManagementActionCode.Update,
						com.tools20022.repository.codeset.TerminalManagementActionCode.Create);
			}
		});
		return mmObject_lazy.get();
	}
}
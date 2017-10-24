package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional process to perform before starting or after completing a terminal
 * management action.
 */
public class TerminalManagementAdditionalProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Manual confirmation of the merchant before the terminal management
	 * action.
	 */
	public static final MMCode ManualConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualConfirmation";
			definition = "Manual confirmation of the merchant before the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "MANC";
		}
	};
	/**
	 * Acquirer reconciliation to be performed before the terminal management
	 * action.
	 */
	public static final MMCode Reconciliation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Acquirer reconciliation to be performed before the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "RCNC";
		}
	};
	/**
	 * Restart the system after performing the terminal management action.
	 */
	public static final MMCode RestartSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestartSystem";
			definition = "Restart the system after performing the terminal management action.";
			owner_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
			codeName = "RSRT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MANC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAdditionalProcessCode";
				definition = "Additional process to perform before starting or after completing a terminal management action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.ManualConfirmation, com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.Reconciliation,
						com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode.RestartSystem);
			}
		});
		return mmObject_lazy.get();
	}
}
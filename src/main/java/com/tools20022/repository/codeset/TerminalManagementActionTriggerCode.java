package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Event to start a terminal management action by the point of interaction
 * (POI).
 */
public class TerminalManagementActionTriggerCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time trigger the terminal management action.
	 */
	public static final MMCode DateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateTime";
			definition = "Date and time trigger the terminal management action.";
			owner_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
			codeName = "DATE";
		}
	};
	/**
	 * Acquirer triggers the terminal management action.
	 */
	public static final MMCode HostEvent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HostEvent";
			definition = "Acquirer triggers the terminal management action.";
			owner_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
			codeName = "HOST";
		}
	};
	/**
	 * Acceptor triggers the terminal management action.
	 */
	public static final MMCode Manual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Manual";
			definition = "Acceptor triggers the terminal management action.";
			owner_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Sale system triggers the terminal management action.
	 */
	public static final MMCode SaleEvent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SaleEvent";
			definition = "Sale system triggers the terminal management action.";
			owner_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
			codeName = "SALE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DATE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionTriggerCode";
				definition = "Event to start a terminal management action by the point of interaction (POI).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.DateTime, com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.HostEvent,
						com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.Manual, com.tools20022.repository.codeset.TerminalManagementActionTriggerCode.SaleEvent);
			}
		});
		return mmObject_lazy.get();
	}
}
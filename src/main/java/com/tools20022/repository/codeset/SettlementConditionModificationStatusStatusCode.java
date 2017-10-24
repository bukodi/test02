package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a securities settlement condition modification
 * request.
 */
public class SettlementConditionModificationStatusStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been acknowledged/accepted by the account servicer.
	 */
	public static final MMCode AcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged/accepted by the account servicer.";
			owner_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Instruction has been rejected for further processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing.";
			owner_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Modification Request will not be executed.
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification Request will not be executed.";
			owner_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Modification has been completed.
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Modification has been completed.";
			owner_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "MODC";
		}
	};
	/**
	 * Modification is pending. At this time, it is unknown whether the
	 * modification can be affected.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Modification is pending. At this time, it is unknown whether the modification can be affected.";
			owner_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
			codeName = "MODP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PACK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementConditionModificationStatusStatusCode";
				definition = "Specifies the status of a securities settlement condition modification request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.AcknowledgedAccepted,
						com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Rejected, com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Denied,
						com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Completed, com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}
}
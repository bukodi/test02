package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about partial settlement.
 */
public class PartialSettlementCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Confirmation is for partial settlement. Part of the transaction remains
	 * unsettled.
	 */
	public static final MMCode PartialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlement";
			definition = "Confirmation is for partial settlement. Part of the transaction remains unsettled.";
			owner_lazy = () -> PartialSettlementCode.mmObject();
			codeName = "PAIN";
		}
	};
	/**
	 * Confirmation is for the remaining part of an instruction that was
	 * previously partially confirmed.
	 */
	public static final MMCode PreviouslyPartialConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviouslyPartialConfirmed";
			definition = "Confirmation is for the remaining part of an instruction that was previously partially confirmed.";
			owner_lazy = () -> PartialSettlementCode.mmObject();
			codeName = "PARC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PAIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartialSettlementCode";
				definition = "Information about partial settlement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartialSettlementCode.PartialSettlement, com.tools20022.repository.codeset.PartialSettlementCode.PreviouslyPartialConfirmed);
			}
		});
		return mmObject_lazy.get();
	}
}
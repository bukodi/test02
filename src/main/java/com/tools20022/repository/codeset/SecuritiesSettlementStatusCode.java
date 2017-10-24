package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the status of settlement of an instruction.
 */
public class SecuritiesSettlementStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction is pending. Settlement at the instructed settlement date is
	 * still possible.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Instruction is pending. Settlement at the instructed settlement date is still possible.";
			owner_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Instruction is failing. Settlement at the instructed settlement date is
	 * no longer possible.
	 */
	public static final MMCode Failing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			definition = "Instruction is failing. Settlement at the instructed settlement date is no longer possible.";
			owner_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
			codeName = "PENF";
		}
	};
	/**
	 * Instruction is unsettled.
	 */
	public static final MMCode Unsettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsettled";
			definition = "Instruction is unsettled.";
			owner_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
			codeName = "USET";
		}
	};
	/**
	 * Part of the instruction remains unsettled.
	 */
	public static final MMCode PartialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Part of the instruction remains unsettled.";
			owner_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
			codeName = "PAIN";
		}
	};
	/**
	 * Full settlement.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Full settlement.";
			owner_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
			codeName = "SETT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PEND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementStatusCode";
				definition = "Provides the status of settlement of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Pending, com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Failing,
						com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Unsettled, com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.PartialSettlement,
						com.tools20022.repository.codeset.SecuritiesSettlementStatusCode.Settled);
			}
		});
		return mmObject_lazy.get();
	}
}
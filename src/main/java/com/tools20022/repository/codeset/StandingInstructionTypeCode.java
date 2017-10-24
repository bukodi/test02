package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of standing instruction.
 */
public class StandingInstructionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Standing instruction for a cash distribution.
	 */
	public static final MMCode CashDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Standing instruction for a cash distribution.";
			owner_lazy = () -> StandingInstructionTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Standing instruction for the payment modality, gross or net.
	 */
	public static final MMCode GrossNet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossNet";
			definition = "Standing instruction for the payment modality, gross or net.";
			owner_lazy = () -> StandingInstructionTypeCode.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Standing instruction for a securities distribution.
	 */
	public static final MMCode SecuritiesDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDistribution";
			definition = "Standing instruction for a securities distribution.";
			owner_lazy = () -> StandingInstructionTypeCode.mmObject();
			codeName = "SECU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingInstructionTypeCode";
				definition = "Specifies the type of standing instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingInstructionTypeCode.CashDistribution, com.tools20022.repository.codeset.StandingInstructionTypeCode.GrossNet,
						com.tools20022.repository.codeset.StandingInstructionTypeCode.SecuritiesDistribution);
			}
		});
		return mmObject_lazy.get();
	}
}
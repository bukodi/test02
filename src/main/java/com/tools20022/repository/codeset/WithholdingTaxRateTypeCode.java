package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of withholding tax rate.
 */
public class WithholdingTaxRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Withholding tax related to income subject to FATCA (Foreign Account Tax
	 * Compliance Act).
	 */
	public static final MMCode FATCATax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCATax";
			definition = "Withholding tax related to income subject to FATCA (Foreign Account Tax Compliance Act).";
			owner_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
			codeName = "FTCA";
		}
	};
	/**
	 * Withholding tax related to income subject to NRA (Non Resident Alien).
	 */
	public static final MMCode NRATax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATax";
			definition = "Withholding tax related to income subject to NRA (Non Resident Alien).";
			owner_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
			codeName = "NRAT";
		}
	};
	/**
	 * Withholding tax related to payments subject to back up withholding.
	 */
	public static final MMCode BackUpWithholding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpWithholding";
			definition = "Withholding tax related to payments subject to back up withholding.";
			owner_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
			codeName = "BWIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "WithholdingTaxRateTypeCode";
				definition = "Specifies the type of withholding tax rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.FATCATax, com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.NRATax,
						com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.BackUpWithholding);
			}
		});
		return mmObject_lazy.get();
	}
}
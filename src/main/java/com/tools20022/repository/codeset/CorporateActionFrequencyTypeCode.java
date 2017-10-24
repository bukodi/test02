package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Automatic Reinvestment of Cash distributed by accumulating funds.
 */
public class CorporateActionFrequencyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment of a dividend, less amounts already paid through interim
	 * dividends.
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "Payment of a dividend, less amounts already paid through interim dividends.";
			owner_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Dividend declared and paid before annual earnings have been determined.
	 */
	public static final MMCode Interim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Dividend declared and paid before annual earnings have been determined.";
			owner_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Dividend paid at regular interval, for example, quarterly.
	 */
	public static final MMCode Regular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Dividend paid at regular interval, for example, quarterly.";
			owner_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
			codeName = "REGR";
		}
	};
	/**
	 * Dividend in addition to the regular dividend being paid by the company.
	 */
	public static final MMCode Special = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Dividend in addition to the regular dividend being paid by the company.";
			owner_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Automatic Reinvestment of Cash distributed by accumulating funds.
	 */
	public static final MMCode FundCashDistributionReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashDistributionReinvestment";
			definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
			owner_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
			codeName = "REIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FINL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyTypeCode";
				definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Final, com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Interim,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Regular, com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Special,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.FundCashDistributionReinvestment);
			}
		});
		return mmObject_lazy.get();
	}
}
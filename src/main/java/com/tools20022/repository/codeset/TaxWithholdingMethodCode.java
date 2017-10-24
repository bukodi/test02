package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specified the method by which the tax on the interests is to be processed
 * i.e. either withheld at source or reported to tax authorities or a tax
 * certificate has been provided by the beneficiary.
 */
public class TaxWithholdingMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax is withheld at source.
	 */
	public static final MMCode WithholdTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdTax";
			definition = "Tax is withheld at source.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Tax information is reported to the tax authorities and therefore not
	 * withheld at source.
	 */
	public static final MMCode ReportTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportTax";
			definition = "Tax information is reported to the tax authorities and therefore not withheld at source.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "REPT";
		}
	};
	/**
	 * Tax certificate is provided by the beneficiary from its tax authority in
	 * its country of residence. Therefore, the obligation of withholding tax is
	 * waived and tax information will be reported to the tax authorities.
	 */
	public static final MMCode TaxCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxCertificate";
			definition = "Tax certificate is provided by the beneficiary from its tax authority in its country of residence. Therefore, the obligation of withholding tax is waived and tax information will be reported to the tax authorities.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "CRTF";
		}
	};
	/**
	 * Tax is withheld at source and the tax information is also reported to the
	 * tax authorities.
	 */
	public static final MMCode WithholdTaxAndReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdTaxAndReport";
			definition = "Tax is withheld at source and the tax information is also reported to the tax authorities.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "WTRE";
		}
	};
	/**
	 * Withholding tax is applied to a corporate.
	 */
	public static final MMCode WithholdingCorporateTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingCorporateTax";
			definition = "Withholding tax is applied to a corporate.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "WHCO";
		}
	};
	/**
	 * Dividend tax is exempt.
	 */
	public static final MMCode Exempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exempt";
			definition = "Dividend tax is exempt.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "EXMT";
		}
	};
	/**
	 * Dividend tax is exempt according to the accountant.
	 */
	public static final MMCode Accountant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accountant";
			definition = "Dividend tax is exempt according to the accountant.";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Withholding tax is applied to an investment company.
	 */
	public static final MMCode InvestmentCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentCompany";
			definition = "Withholding tax is applied to an investment company. ";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Minority interest tax is withheld.
	 */
	public static final MMCode MinorityInterestTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinorityInterestTax";
			definition = "Minority interest tax is withheld. ";
			owner_lazy = () -> TaxWithholdingMethodCode.mmObject();
			codeName = "MITX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("WTHD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxWithholdingMethodCode";
				definition = "Specified the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdTax, com.tools20022.repository.codeset.TaxWithholdingMethodCode.ReportTax,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.TaxCertificate, com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdTaxAndReport,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdingCorporateTax, com.tools20022.repository.codeset.TaxWithholdingMethodCode.Exempt,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.Accountant, com.tools20022.repository.codeset.TaxWithholdingMethodCode.InvestmentCompany,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.MinorityInterestTax);
			}
		});
		return mmObject_lazy.get();
	}
}
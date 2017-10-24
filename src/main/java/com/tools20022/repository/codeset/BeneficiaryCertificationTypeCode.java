package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The holder of the security has to irrevocably certify that it is a Qualified
 * Institutional Buyer as defined in US Securities and Exchange Commission Rule
 * 144A.
 */
public class BeneficiaryCertificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The holder of the security has to irrevocably certify that it is an
	 * Accredited Investor as defined in US Securities and Exchange Commission
	 * Regulation D.
	 */
	public static final MMCode AccreditedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "ACCI";
		}
	};
	/**
	 * The holder of the security has to certify his domicile.
	 */
	public static final MMCode DomicileCountry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "The holder of the security has to certify his domicile.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "DOMI";
		}
	};
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 */
	public static final MMCode NonDomicileCountry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NDOM";
		}
	};
	/**
	 * The holder of the security has to provide his beneficial owner details
	 * for disclosure/instruction purpose.
	 */
	public static final MMCode FullBeneficialOwnerBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			definition = "The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * The holder of the security has to irrevocably certify that it is a
	 * Qualified Institutional Buyer as defined in US Securities and Exchange
	 * Commission Rule 144A.
	 */
	public static final MMCode QIBCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QIBCertification";
			definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "QIBB";
		}
	};
	/**
	 * The holder of the security has to provide basic details on nominals and
	 * associated tax rate to be used by the account servicer.
	 */
	public static final MMCode TaxRateBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRateBreakdown";
			definition = "The holder of the security has to provide basic details on nominals and associated tax rate to be used by the account servicer.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "TRBD";
		}
	};
	/**
	 * The holder of the security has to certify he is an Non-Company related
	 * person.
	 */
	public static final MMCode NonCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonCompany";
			definition = "The holder of the security has to certify he is an Non-Company related person.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NCOM";
		}
	};
	/**
	 * Indicates if the Beneficial Owner is responsible to fill in the
	 * paperwork.
	 */
	public static final MMCode BeneficialOwnerPaperwork = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerPaperwork";
			definition = "Indicates if the Beneficial Owner is responsible to fill in the paperwork.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "PAPW";
		}
	};
	/**
	 * The (I)CSD has to provide its participants' details for disclosure
	 * purpose to the issuer/issuer’s agent.
	 */
	public static final MMCode ICSDParticipantBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICSDParticipantBreakdown";
			definition = "The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "PABD";
		}
	};
	/**
	 * See narrative field for certification requirements.
	 */
	public static final MMCode NarrativeDescription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NarrativeDescription";
			definition = "See narrative field for certification requirements.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Indicates that the rounding rule in the Fraction Disposition component at
	 * the option level can be offered at the beneficial owner level.
	 */
	public static final MMCode FractionBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionBreakdown";
			definition = "Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "FRAC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationTypeCode";
				definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.AccreditedInvestor, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.DomicileCountry,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NonDomicileCountry, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.FullBeneficialOwnerBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.QIBCertification, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.TaxRateBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NonCompany, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.BeneficialOwnerPaperwork,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.ICSDParticipantBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NarrativeDescription,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.FractionBreakdown);
			}
		});
		return mmObject_lazy.get();
	}
}
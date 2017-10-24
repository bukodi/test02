package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.
 */
public class FATCAFormTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of foreign status of beneficial owner (also known as IRS form
	 * W-8BEN).
	 */
	public static final MMCode CertificateForeignStatusBeneficialOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignStatusBeneficialOwner";
			definition = "Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER1";
		}
	};
	/**
	 * Certificate of loss of nationality.
	 */
	public static final MMCode CertificateLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateLossNationality";
			definition = "Certificate of loss of nationality.";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER2";
		}
	};
	/**
	 * Self certification.
	 */
	public static final MMCode SelfCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertification";
			definition = "Self certification.";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER3";
		}
	};
	/**
	 * Self certificate of loss of nationality (also known as IRS form I-407).
	 */
	public static final MMCode SelfCertificationLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationLossNationality";
			definition = "Self certificate of loss of nationality (also known as IRS form I-407).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER4";
		}
	};
	/**
	 * Certificate of foreign intermediary (also known as IRS form W-8IMY).
	 */
	public static final MMCode CertificateForeignIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignIntermediary";
			definition = "Certificate of foreign intermediary (also known as IRS form W-8IMY).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER5";
		}
	};
	/**
	 * Form is a request for taxpayer identification number and certification
	 * (also known as IRS form W9).
	 */
	public static final MMCode TaxpayerIdentificationNumberRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxpayerIdentificationNumberRequest";
			definition = "Form is a request for taxpayer identification number and certification (also known as IRS form W9).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER6";
		}
	};
	/**
	 * Certificate of foreign person's claim that income is effectively
	 * connected with the conduct of a trade or business in the United States
	 * (also known as IRS form W-8BEN-E).
	 */
	public static final MMCode CertificateForeignPersonsClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignPersonsClaim";
			definition = "Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E).";
			owner_lazy = () -> FATCAFormTypeCode.mmObject();
			codeName = "CER7";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAFormTypeCode";
				definition = "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignStatusBeneficialOwner, com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertification, com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertificationLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignIntermediary, com.tools20022.repository.codeset.FATCAFormTypeCode.TaxpayerIdentificationNumberRequest,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignPersonsClaim);
			}
		});
		return mmObject_lazy.get();
	}
}
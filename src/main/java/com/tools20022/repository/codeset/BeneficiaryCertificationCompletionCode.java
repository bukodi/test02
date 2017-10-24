package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of certification completion required for a beneficiary.
 */
public class BeneficiaryCertificationCompletionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification is not required for this fund.
	 */
	public static final MMCode CertificationNotRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationNotRequired";
			definition = "Certification is not required for this fund.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "NCER";
		}
	};
	/**
	 * Electronic certification is acceptable.
	 */
	public static final MMCode ElectronicCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicCertification";
			definition = "Electronic certification is acceptable.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Electronic certification is not acceptable and is required in physical
	 * form.
	 */
	public static final MMCode PhysicalCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalCertification";
			definition = "Electronic certification is not acceptable and is required in physical form.";
			owner_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
			codeName = "PHYS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NCER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationCompletionCode";
				definition = "Specifies the type of certification completion required for a beneficiary.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.CertificationNotRequired,
						com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.ElectronicCertification, com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode.PhysicalCertification);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of certificate.
 */
public class CertificateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification of due formation and organisation.
	 */
	public static final MMCode DueFormationAndOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DueFormationAndOrganisation";
			definition = "Certification of due formation and organisation.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Certificate of good standing.
	 */
	public static final MMCode GoodStanding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoodStanding";
			definition = "Certificate of good standing.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "GOST";
		}
	};
	/**
	 * Letter of reference.
	 */
	public static final MMCode LetterOfReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfReference";
			definition = "Letter of reference.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "LREF";
		}
	};
	/**
	 * Anti-money laundering certification form.
	 */
	public static final MMCode AntiMoneyLaundering = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AntiMoneyLaundering";
			definition = "Anti-money laundering certification form.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "AMLC";
		}
	};
	/**
	 * Certification of incumbency.
	 */
	public static final MMCode Incumbency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incumbency";
			definition = "Certification of incumbency.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "INCU";
		}
	};
	/**
	 * Government issued form of picture identification - passport.
	 */
	public static final MMCode Passport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Passport";
			definition = "Government issued form of picture identification - passport.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Government issued form of picture identification - driving license.
	 */
	public static final MMCode DrivingLicense = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DrivingLicense";
			definition = "Government issued form of picture identification - driving license.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "DVLC";
		}
	};
	/**
	 * Government issued form of picture identification - identity card.
	 */
	public static final MMCode IdentityCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentityCard";
			definition = "Government issued form of picture identification - identity card.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "IDEN";
		}
	};
	/**
	 * Proof of the address, such as a utility bill.
	 */
	public static final MMCode ProofOfAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProofOfAddress";
			definition = "Proof of the address, such as a utility bill.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PRAD";
		}
	};
	/**
	 * Public key infrastructure certificate.
	 */
	public static final MMCode PublicKeyInfrastructureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PublicKeyInfrastructureCertificate";
			definition = "Public key infrastructure certificate.";
			owner_lazy = () -> CertificateTypeCode.mmObject();
			codeName = "PKIC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DFOR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CertificateTypeCode";
				definition = "Identifies the type of certificate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificateTypeCode.DueFormationAndOrganisation, com.tools20022.repository.codeset.CertificateTypeCode.GoodStanding,
						com.tools20022.repository.codeset.CertificateTypeCode.LetterOfReference, com.tools20022.repository.codeset.CertificateTypeCode.AntiMoneyLaundering, com.tools20022.repository.codeset.CertificateTypeCode.Incumbency,
						com.tools20022.repository.codeset.CertificateTypeCode.Passport, com.tools20022.repository.codeset.CertificateTypeCode.DrivingLicense, com.tools20022.repository.codeset.CertificateTypeCode.IdentityCard,
						com.tools20022.repository.codeset.CertificateTypeCode.ProofOfAddress, com.tools20022.repository.codeset.CertificateTypeCode.PublicKeyInfrastructureCertificate);
			}
		});
		return mmObject_lazy.get();
	}
}
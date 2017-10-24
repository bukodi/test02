package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to deliver the remittance advice information.
 */
public class RemittanceLocationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Remittance advice information must be faxed.
	 */
	public static final MMCode Fax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fax";
			definition = "Remittance advice information must be faxed.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "FAXI";
		}
	};
	/**
	 * Remittance advice information must be sent through Electronic Data
	 * Interchange (EDI).
	 */
	public static final MMCode ElectronicDataInterchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicDataInterchange";
			definition = "Remittance advice information must be sent through Electronic Data Interchange (EDI).";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "EDIC";
		}
	};
	/**
	 * Remittance advice information needs to be sent to a Uniform Resource
	 * Identifier (URI). URI is a compact string of characters that uniquely
	 * identify an abstract or physical resource. URI's are the super-set of
	 * identifiers, such as URLs, email addresses, ftp sites, etc, and as such,
	 * provide the syntax for all of the identification schemes.
	 */
	public static final MMCode UniformResourceIdentifier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UniformResourceIdentifier";
			definition = "Remittance advice  information needs to be sent to a Uniform Resource Identifier (URI). URI  is a compact string of characters that uniquely identify an abstract or physical resource.  URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "URID";
		}
	};
	/**
	 * Remittance advice information must be sent through e-mail.
	 */
	public static final MMCode EMail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EMail";
			definition = "Remittance advice  information must be sent through e-mail.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Remittance advice information must be sent through postal services.
	 */
	public static final MMCode Post = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Post";
			definition = "Remittance advice information must be sent through postal services.";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Remittance advice information must be sent through by phone as a short
	 * message service (SMS).
	 */
	public static final MMCode SMS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SMS";
			definition = "Remittance advice  information must be sent through by phone as a short message service (SMS).";
			owner_lazy = () -> RemittanceLocationMethodCode.mmObject();
			codeName = "SMSM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FAXI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethodCode";
				definition = "Specifies the method used to deliver the remittance advice information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethodCode.Fax, com.tools20022.repository.codeset.RemittanceLocationMethodCode.ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethodCode.EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethodCode.Post, com.tools20022.repository.codeset.RemittanceLocationMethodCode.SMS);
				derivation_lazy = () -> Arrays.asList(RemittanceLocationMethod2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
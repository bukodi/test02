package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Communication method used for the transmission of documents.
 */
public class CommunicationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transmission by Swift (FIN).
	 */
	public static final MMCode SWIFTMT = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMT";
			definition = "Transmission by Swift (FIN).";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "SWMT";
		}
	};
	/**
	 * Transmission by SWIFTNET.
	 */
	public static final MMCode SWIFTMX = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMX";
			definition = "Transmission by SWIFTNET.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "SWMX";
		}
	};
	/**
	 * Transmission by Fax.
	 */
	public static final MMCode Fax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			definition = "Transmission by Fax.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "FAXI";
		}
	};
	/**
	 * Transmission by e-mail.
	 */
	public static final MMCode Email = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Transmission by e-mail.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Transmission by proprietary method.
	 */
	public static final MMCode Proprietary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Transmission by proprietary method.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Transmission on line, for example, in a web portal.
	 */
	public static final MMCode Online = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Online";
			definition = "Transmission on line, for example, in a web portal.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "ONLI";
		}
	};
	/**
	 * Transmission by telephone.
	 */
	public static final MMCode Phone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Transmission by telephone.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Transmission by postal service.
	 */
	public static final MMCode PostalService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalService";
			definition = "Transmission by postal service.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "POST";
		}
	};
	/**
	 * Transmission by file transfer.
	 */
	public static final MMCode File = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			definition = "Transmission by file transfer.";
			owner_lazy = () -> CommunicationMethodCode.mmObject();
			codeName = "FILE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SWMT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethodCode";
				definition = "Communication method used for the transmission of documents.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethodCode.SWIFTMT, com.tools20022.repository.codeset.CommunicationMethodCode.SWIFTMX,
						com.tools20022.repository.codeset.CommunicationMethodCode.Fax, com.tools20022.repository.codeset.CommunicationMethodCode.Email, com.tools20022.repository.codeset.CommunicationMethodCode.Proprietary,
						com.tools20022.repository.codeset.CommunicationMethodCode.Online, com.tools20022.repository.codeset.CommunicationMethodCode.Phone, com.tools20022.repository.codeset.CommunicationMethodCode.PostalService,
						com.tools20022.repository.codeset.CommunicationMethodCode.File);
			}
		});
		return mmObject_lazy.get();
	}
}
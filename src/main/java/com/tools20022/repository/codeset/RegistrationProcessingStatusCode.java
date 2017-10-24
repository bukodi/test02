package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the registration processing.
 */
public class RegistrationProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Registration has been acknowledged/accepted by the issuer/registrar.
	 */
	public static final MMCode AcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Registration has been acknowledged/accepted by the issuer/registrar.";
			owner_lazy = () -> RegistrationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Registration has been rejected by the issuer/registrar.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Registration has been rejected by the issuer/registrar.";
			owner_lazy = () -> RegistrationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PACK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegistrationProcessingStatusCode";
				definition = "Specifies the status of the registration processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegistrationProcessingStatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.RegistrationProcessingStatusCode.Rejected);
			}
		});
		return mmObject_lazy.get();
	}
}
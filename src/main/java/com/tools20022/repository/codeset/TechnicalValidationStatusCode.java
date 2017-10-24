package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the result of the technical validation carried out by the receiver
 * (forwarding or first agent).
 */
public class TechnicalValidationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the request has been correctly received and that the
	 * technical validation was successful.
	 */
	public static final MMCode ReceptionConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionConfirmation";
			definition = "Indicates that the request has been correctly received and that the technical validation was successful.";
			owner_lazy = () -> TechnicalValidationStatusCode.mmObject();
			codeName = "RCCF";
		}
	};
	/**
	 * Indicates there was an error in the reception of the request or that the
	 * technical validation was not successful.
	 */
	public static final MMCode ReceptionError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionError";
			definition = "Indicates there was an error in the reception of the request or that the technical validation was not successful.";
			owner_lazy = () -> TechnicalValidationStatusCode.mmObject();
			codeName = "RCER";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RCCF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TechnicalValidationStatusCode";
				definition = "Specifies the result of the technical validation carried out by the receiver (forwarding or first agent).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TechnicalValidationStatusCode.ReceptionConfirmation, com.tools20022.repository.codeset.TechnicalValidationStatusCode.ReceptionError);
			}
		});
		return mmObject_lazy.get();
	}
}
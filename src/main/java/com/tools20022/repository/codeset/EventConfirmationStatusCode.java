package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the status of the occurrence of an event.
 */
public class EventConfirmationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrence of the event has been confirmed.
	 */
	public static final MMCode Confirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Confirmed";
			definition = "Occurrence of the event has been confirmed.";
			owner_lazy = () -> EventConfirmationStatusCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Occurrence of the event has not been confirmed.
	 */
	public static final MMCode Unconfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unconfirmed";
			definition = "Occurrence of the event has not been confirmed.";
			owner_lazy = () -> EventConfirmationStatusCode.mmObject();
			codeName = "UCON";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CONF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EventConfirmationStatusCode";
				definition = "Indicates the status of the occurrence of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventConfirmationStatusCode.Confirmed, com.tools20022.repository.codeset.EventConfirmationStatusCode.Unconfirmed);
			}
		});
		return mmObject_lazy.get();
	}
}
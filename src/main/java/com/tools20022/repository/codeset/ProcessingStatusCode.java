package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the processing status.
 */
public class ProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message contains complete details of the corporate action event at the
	 * time the event is communicated and the occurrence of the event has been
	 * confirmed by the account servicer's chosen official source. Further
	 * updates to the event are still possible.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Message contains complete details of the corporate action event at the time the event is communicated and the occurrence of the event has been confirmed by the account servicer's chosen official source. Further updates to the event are still possible.";
			owner_lazy = () -> ProcessingStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Message may not contain complete details of the corporate action event,
	 * however, the occurrence of the event is confirmed.
	 */
	public static final MMCode PreliminaryConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreliminaryConfirmed";
			definition = "Message may not contain complete details of the corporate action event,\nhowever, the occurrence of the event is confirmed.";
			owner_lazy = () -> ProcessingStatusCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Message may not contain complete details of the corporate action event
	 * and the occurrence of the event is not yet confirmed.
	 */
	public static final MMCode PreliminaryUnconfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreliminaryUnconfirmed";
			definition = "Message may not contain complete details of the corporate action event and\nthe occurrence of the event is not yet confirmed.";
			owner_lazy = () -> ProcessingStatusCode.mmObject();
			codeName = "PREU";
		}
	};
	/**
	 * The message is for information only.
	 */
	public static final MMCode ForInformationOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForInformationOnly";
			definition = "The message is for information only.";
			owner_lazy = () -> ProcessingStatusCode.mmObject();
			codeName = "INFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatusCode";
				definition = "Specifies the processing status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingStatusCode.Complete, com.tools20022.repository.codeset.ProcessingStatusCode.PreliminaryConfirmed,
						com.tools20022.repository.codeset.ProcessingStatusCode.PreliminaryUnconfirmed, com.tools20022.repository.codeset.ProcessingStatusCode.ForInformationOnly);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the occurrence of the event contained in the notification is
 * confirmed or unconfirmed. Details of the event can be complete or incomplete.
 */
public class NotificationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The notification contains all the details.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "The notification contains all the details.";
			owner_lazy = () -> NotificationStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Notification may not contain complete details, however, the occurrence of
	 * the event has been confirmed by the issuer or other official source.
	 */
	public static final MMCode PreliminaryEventConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryEventConfirmed";
			definition = "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.";
			owner_lazy = () -> NotificationStatusCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Notification may not contain complete details as the occurrence of the
	 * event has not been confirmed by the issuer or other official source at
	 * the time the notification was sent.
	 */
	public static final MMCode PreliminaryEventUnconfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryEventUnconfirmed";
			definition = "Notification may not contain complete details as the occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.";
			owner_lazy = () -> NotificationStatusCode.mmObject();
			codeName = "PREU";
		}
	};
	/**
	 * Notification may not contain complete details, however, the occurrence of
	 * the event has been confirmed by the issuer or other official source.
	 */
	public static final MMCode EventConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConfirmed";
			definition = "Notification may not contain complete details, however, the occurrence of the event has been confirmed by the issuer or other official source.";
			owner_lazy = () -> NotificationStatusCode.mmObject();
			codeName = "ECON";
		}
	};
	/**
	 * The occurrence of the event has not been confirmed by the issuer or other
	 * official source at the time the notification was sent.
	 */
	public static final MMCode EventUnconfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventUnconfirmed";
			definition = "The occurrence of the event has not been confirmed by the issuer or other official source at the time the notification was sent.";
			owner_lazy = () -> NotificationStatusCode.mmObject();
			codeName = "EUNC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NotificationStatusCode";
				definition = "Specifies if the occurrence of the event contained in the notification is confirmed or unconfirmed. Details of the event can be complete or incomplete.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationStatusCode.Complete, com.tools20022.repository.codeset.NotificationStatusCode.PreliminaryEventConfirmed,
						com.tools20022.repository.codeset.NotificationStatusCode.PreliminaryEventUnconfirmed, com.tools20022.repository.codeset.NotificationStatusCode.EventConfirmed,
						com.tools20022.repository.codeset.NotificationStatusCode.EventUnconfirmed);
			}
		});
		return mmObject_lazy.get();
	}
}
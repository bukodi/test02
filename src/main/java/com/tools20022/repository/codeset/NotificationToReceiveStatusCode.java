package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether or not the event as mentioned in the notification occurred.
 * Details of the event can be different from the details as per notification.
 */
public class NotificationToReceiveStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event(s) as described in the notification to receive occurred but details
	 * are different.
	 */
	public static final MMCode ReceivedButDifferent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedButDifferent";
			definition = "Event(s) as described in the notification to receive occurred but details are different.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "RCBD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive occurred.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Event(s) as described in the notification to receive occurred.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Event(s) as described in the notification to receive did not occur.
	 */
	public static final MMCode NotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReceived";
			definition = "Event(s) as described in the notification to receive did not occur.";
			owner_lazy = () -> NotificationToReceiveStatusCode.mmObject();
			codeName = "NRCD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RCBD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveStatusCode";
				definition = "Specifies whether or not the event as mentioned in the notification occurred. Details of the event can be different from the details as per notification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationToReceiveStatusCode.ReceivedButDifferent, com.tools20022.repository.codeset.NotificationToReceiveStatusCode.Received,
						com.tools20022.repository.codeset.NotificationToReceiveStatusCode.NotReceived);
			}
		});
		return mmObject_lazy.get();
	}
}
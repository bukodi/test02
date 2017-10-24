package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the margin call request was sent on a non valuation day or
 * was received after notification time.
 */
public class MarginCallResponseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the margin call request was sent on a non valuation day.
	 */
	public static final MMCode NonValuationDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonValuationDay";
			definition = "Indicates that the margin call request was sent on a non valuation day.";
			owner_lazy = () -> MarginCallResponseCode.mmObject();
			codeName = "NVDA";
		}
	};
	/**
	 * Indicates that the margin call request was sent after the notification
	 * time.
	 */
	public static final MMCode ReceivedAfterNotificationTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAfterNotificationTime";
			definition = "Indicates that the margin call request was sent after the notification time.";
			owner_lazy = () -> MarginCallResponseCode.mmObject();
			codeName = "RANT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NVDA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarginCallResponseCode";
				definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginCallResponseCode.NonValuationDay, com.tools20022.repository.codeset.MarginCallResponseCode.ReceivedAfterNotificationTime);
			}
		});
		return mmObject_lazy.get();
	}
}
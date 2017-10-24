package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of notification.
 */
public class CorporateActionNotificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * New notification.
	 */
	public static final MMCode New = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "New";
			definition = "New notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "NEWM";
		}
	};
	/**
	 * Notification replacing a previously sent notification.
	 */
	public static final MMCode Replacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Replacement";
			definition = "Notification replacing a previously sent notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Notification sent as a reminder of an event taking place.
	 */
	public static final MMCode Reminder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reminder";
			definition = "Notification sent as a reminder of an event taking place.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "RMDR";
		}
	};
	/**
	 * Notification sent to void a previously sent notification due to the
	 * withdrawal of the event by the issuer.
	 */
	public static final MMCode Withrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withrawal";
			definition = "Notification sent to void a previously sent notification due to the withdrawal of the event by the issuer.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Notification requesting the cancellation of a previously sent
	 * notification.
	 */
	public static final MMCode Cancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Notification requesting the cancellation of a previously sent notification.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Cancellation due to a processing error.
	 */
	public static final MMCode Processing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
			codeName = "PROC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NEWM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationTypeCode";
				definition = "Type of notification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.New, com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.Replacement,
						com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.Reminder, com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.Withrawal,
						com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.Cancellation, com.tools20022.repository.codeset.CorporateActionNotificationTypeCode.Processing);
			}
		});
		return mmObject_lazy.get();
	}
}
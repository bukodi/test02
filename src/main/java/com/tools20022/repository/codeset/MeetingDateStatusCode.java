package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the possible statuses of a meeting date.
 */
public class MeetingDateStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting date is tentative.
	 */
	public static final MMCode Tentative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tentative";
			definition = "Meeting date is tentative.";
			owner_lazy = () -> MeetingDateStatusCode.mmObject();
			codeName = "TNTA";
		}
	};
	/**
	 * Meeting date is confirmed.
	 */
	public static final MMCode Confirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Meeting date is confirmed.";
			owner_lazy = () -> MeetingDateStatusCode.mmObject();
			codeName = "CNFR";
		}
	};
	/**
	 * Meeting date has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Meeting date has been cancelled.";
			owner_lazy = () -> MeetingDateStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Meeting could not take place as the quorum was not reached.
	 */
	public static final MMCode NoQuorum = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoQuorum";
			definition = "Meeting could not take place as the quorum was not reached.";
			owner_lazy = () -> MeetingDateStatusCode.mmObject();
			codeName = "NOQO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TNTA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingDateStatusCode";
				definition = "Identifies the possible statuses of a meeting date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingDateStatusCode.Tentative, com.tools20022.repository.codeset.MeetingDateStatusCode.Confirmed,
						com.tools20022.repository.codeset.MeetingDateStatusCode.Cancelled, com.tools20022.repository.codeset.MeetingDateStatusCode.NoQuorum);
			}
		});
		return mmObject_lazy.get();
	}
}
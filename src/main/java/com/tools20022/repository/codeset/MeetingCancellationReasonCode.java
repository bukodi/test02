package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for cancelling a meeting.
 */
public class MeetingCancellationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to insufficient participation to the vote.
	 */
	public static final MMCode Quorum = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quorum";
			definition = "Cancellation due to insufficient participation to the vote.";
			owner_lazy = () -> MeetingCancellationReasonCode.mmObject();
			codeName = "QORM";
		}
	};
	/**
	 * Cancellation due to a processing error.
	 */
	public static final MMCode Processing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> MeetingCancellationReasonCode.mmObject();
			codeName = "PROC";
		}
	};
	/**
	 * Cancellation due to another reason.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Cancellation due to another reason.";
			owner_lazy = () -> MeetingCancellationReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Cancellation due to the meeting being cancelled by the issuer.
	 */
	public static final MMCode Withdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Cancellation due to the meeting being cancelled by the issuer.";
			owner_lazy = () -> MeetingCancellationReasonCode.mmObject();
			codeName = "WITH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("QORM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationReasonCode";
				definition = "Specifies the reason for cancelling a meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingCancellationReasonCode.Quorum, com.tools20022.repository.codeset.MeetingCancellationReasonCode.Processing,
						com.tools20022.repository.codeset.MeetingCancellationReasonCode.Other, com.tools20022.repository.codeset.MeetingCancellationReasonCode.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}
}
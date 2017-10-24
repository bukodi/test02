package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a corporate action instruction cancellation process.
 */
public class CorporateActionInstructionCancellationProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation request has been completed.
	 */
	public static final MMCode CancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationCompleted";
			definition = "Cancellation request has been completed.";
			owner_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation request is pending. It is not known at this time whether
	 * cancellation can be affected.
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request is pending. It is not known at this time whether cancellation can be affected.";
			owner_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation request has been accepted for further processing.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Cancellation request has been accepted for further processing.";
			owner_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Cancellation request has been rejected for further processing due to
	 * system (data) reasons.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Cancellation request has been rejected for further processing due to system (data) reasons.";
			owner_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionCancellationProcessingStatusCode";
				definition = "Specifies the status of a corporate action instruction cancellation process.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.CancellationCompleted,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.Accepted, com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode.Rejected);
			}
		});
		return mmObject_lazy.get();
	}
}
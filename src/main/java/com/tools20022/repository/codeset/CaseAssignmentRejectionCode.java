package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for not accepting a Case.
 */
public class CaseAssignmentRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying instruction can not be found.
	 */
	public static final MMCode UnderlyingPaymentNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPaymentNotFound";
			definition = "Underlying instruction can not be found.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "NFND";
		}
	};
	/**
	 * Case Assignee is not allowed to investigate on this instruction (eg. Case
	 * Assignee is not the next party in the payment chain).
	 */
	public static final MMCode NotAuthorisedToInvestigate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAuthorisedToInvestigate";
			definition = "Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain).";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Case has never been assigned before.
	 */
	public static final MMCode UnknownCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownCase";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Used when the payment instruction has been rejected.
	 */
	public static final MMCode PaymentRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentRejected";
			definition = "Used when the payment instruction has been rejected.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Used when the payment instruction has been cancelled.
	 */
	public static final MMCode PaymentCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCancelled";
			definition = "Used when the payment instruction has been cancelled.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Used when the payment instruction has previously been cancelled or
	 * rejected.
	 */
	public static final MMCode PaymentPreviouslyCancelledOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			definition = "Used when the payment instruction has previously been cancelled or rejected.";
			owner_lazy = () -> CaseAssignmentRejectionCode.mmObject();
			codeName = "PCOR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NFND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseAssignmentRejectionCode";
				definition = "Specifies the reason for not accepting a Case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnknownCase, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentRejected,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentCancelled, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentPreviouslyCancelledOrRejected);
			}
		});
		return mmObject_lazy.get();
	}
}
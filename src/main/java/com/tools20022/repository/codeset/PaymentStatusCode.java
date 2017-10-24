package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the status of a single payment transaction or of a group of payment
 * transactions.
 */
public class PaymentStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Authentication and syntactical and semantical validation are successful.
	 */
	public static final MMCode AcceptedTechnicalValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Authentication and syntactical and semantical validation are successful.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Payment initiation has been received by the receiving agent.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Payment initiation has been received by the receiving agent.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * A number of transactions have been accepted, whereas another number of
	 * transactions have not yet achieved 'accepted' status.
	 */
	public static final MMCode PartiallyAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyAccepted";
			definition = "A number of transactions have been accepted, whereas another number of transactions have not yet achieved 'accepted' status.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Payment initiation or individual transaction included in the payment
	 * initiation has been rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Payment initiation or individual transaction included in the payment initiation has been rejected.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Payment initiation or individual transaction included in the payment
	 * initiation is pending. Further checks and status update will be
	 * performed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Payment initiation or individual transaction included in the payment initiation is pending.  Further checks and status update will be performed.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Preceding check of technical validation was successful. Customer profile
	 * check was also successful.
	 */
	public static final MMCode AcceptedCustomerProfile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedCustomerProfile";
			definition = "Preceding check of technical validation was successful. Customer profile check was also successful.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * All preceding checks such as technical validation and customer profile
	 * were successful and therefore the payment initiation has been accepted
	 * for execution.
	 */
	public static final MMCode AcceptedSettlementInProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementInProcess";
			definition = "All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACSP";
		}
	};
	/**
	 * Settlement on the debtor's account has been completed.
	 * 
	 * Usage : this can be used by the first agent to report to the debtor that
	 * the transaction has been completed. Warning : this status is provided for
	 * transaction status reasons, not for financial information. It can only be
	 * used after bilateral agreement
	 */
	public static final MMCode AcceptedSettlementCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedSettlementCompleted";
			definition = "Settlement on the debtor's account has been completed. \n\nUsage : this can be used by the first agent to report to the debtor that the transaction has been completed. Warning : this status is provided for transaction status reasons, not for financial information. It can only be used after bilateral agreement";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACSC";
		}
	};
	/**
	 * Request is accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Request is accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Cancellation is accepted.
	 */
	public static final MMCode AcceptedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedCancellationRequest";
			definition = "Cancellation is accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACCR";
		}
	};
	/**
	 * Cancellation request is rejected
	 */
	public static final MMCode RejectedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationRequest";
			definition = "Cancellation request is rejected";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "RJCR";
		}
	};
	/**
	 * Instruction is accepted but a change will be made, such as date or
	 * remittance not sent.
	 */
	public static final MMCode AcceptedWithChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedWithChange";
			definition = "Instruction is accepted but a change will be made, such as date or remittance not sent.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "ACWC";
		}
	};
	/**
	 * Cancellation is partially accepted.
	 */
	public static final MMCode PartiallyAcceptedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyAcceptedCancellationRequest";
			definition = "Cancellation is partially accepted.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PACR";
		}
	};
	/**
	 * Cancellation request is pending.
	 */
	public static final MMCode PendingCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCancellationRequest";
			definition = "Cancellation request is pending.";
			owner_lazy = () -> PaymentStatusCode.mmObject();
			codeName = "PDCR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusCode";
				definition = "Indicates the status of a single payment transaction or of a group of payment transactions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentStatusCode.AcceptedTechnicalValidation, com.tools20022.repository.codeset.PaymentStatusCode.Received,
						com.tools20022.repository.codeset.PaymentStatusCode.PartiallyAccepted, com.tools20022.repository.codeset.PaymentStatusCode.Rejected, com.tools20022.repository.codeset.PaymentStatusCode.Pending,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedCustomerProfile, com.tools20022.repository.codeset.PaymentStatusCode.AcceptedSettlementInProcess,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedSettlementCompleted, com.tools20022.repository.codeset.PaymentStatusCode.Accepted,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedCancellationRequest, com.tools20022.repository.codeset.PaymentStatusCode.RejectedCancellationRequest,
						com.tools20022.repository.codeset.PaymentStatusCode.AcceptedWithChange, com.tools20022.repository.codeset.PaymentStatusCode.PartiallyAcceptedCancellationRequest,
						com.tools20022.repository.codeset.PaymentStatusCode.PendingCancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}
}
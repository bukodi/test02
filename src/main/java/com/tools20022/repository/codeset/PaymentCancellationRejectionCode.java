package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Returned when a request for cancellation cannot be executed.
 */
public class PaymentCancellationRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reported when the cancellation cannot be accepted because of regulatory
	 * rules.
	 */
	public static final MMCode LegalDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDecision";
			definition = "Reported when the cancellation cannot be accepted because of regulatory rules.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "LEGL";
		}
	};
	/**
	 * Reported when the cancellation cannot be accepted because of an agent
	 * refuses to cancel.
	 */
	public static final MMCode AgentDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentDecision";
			definition = "Reported when the cancellation cannot be accepted because of an agent refuses to cancel.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Reported when the cancellation cannot be accepted because of a customer
	 * decision (Creditor).
	 */
	public static final MMCode CustomerDecision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecision";
			definition = "Reported when the cancellation cannot be accepted because of a customer decision (Creditor).";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Cancellation not accepted as the transaction has already been returned.
	 */
	public static final MMCode AlreadyReturned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyReturned";
			definition = "Cancellation not accepted as the transaction has already been returned.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "ARDT";
		}
	};
	/**
	 * No response from beneficiary (to the cancellation request).
	 */
	public static final MMCode NoAnswerFromCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAnswerFromCustomer";
			definition = "No response from beneficiary (to the cancellation request).";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "NOAS";
		}
	};
	/**
	 * Original transaction (subject to cancellation) never received.
	 */
	public static final MMCode NoOriginalTransactionReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOriginalTransactionReceived";
			definition = "Original transaction (subject to cancellation) never received.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "NOOR";
		}
	};
	/**
	 * Account number specified has been closed on the receiver’s books.
	 */
	public static final MMCode ClosedAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the receiver’s books.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Amount of funds available to cover specified message amount is
	 * insufficient.
	 */
	public static final MMCode InsufficientFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			definition = "Amount of funds available to cover specified message amount is insufficient.";
			owner_lazy = () -> PaymentCancellationRejectionCode.mmObject();
			codeName = "AM04";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LEGL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCancellationRejectionCode";
				definition = "Returned when a request for cancellation cannot be executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCancellationRejectionCode.LegalDecision, com.tools20022.repository.codeset.PaymentCancellationRejectionCode.AgentDecision,
						com.tools20022.repository.codeset.PaymentCancellationRejectionCode.CustomerDecision, com.tools20022.repository.codeset.PaymentCancellationRejectionCode.AlreadyReturned,
						com.tools20022.repository.codeset.PaymentCancellationRejectionCode.NoAnswerFromCustomer, com.tools20022.repository.codeset.PaymentCancellationRejectionCode.NoOriginalTransactionReceived,
						com.tools20022.repository.codeset.PaymentCancellationRejectionCode.ClosedAccountNumber, com.tools20022.repository.codeset.PaymentCancellationRejectionCode.InsufficientFunds);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for requesting the cancellation of a payment
 * instruction.
 */
public class CancellationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment is a duplicate of another payment.
	 */
	public static final MMCode DuplicatePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatePayment";
			definition = "Payment is a duplicate of another payment.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "DUPL";
		}
	};
	/**
	 * Agent in the payment workflow is incorrect.
	 */
	public static final MMCode IncorrectAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			definition = "Agent in the payment workflow is incorrect.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Currency of the payment is incorrect.
	 */
	public static final MMCode IncorrectCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			definition = "Currency of the payment is incorrect.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Cancellation requested by the Debtor.
	 */
	public static final MMCode RequestedByCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			definition = "Cancellation requested by the Debtor.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Payment is not justified.
	 */
	public static final MMCode UnduePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			definition = "Payment is not justified.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Payment is a suspicious payment.
	 */
	public static final MMCode SuspiciousPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousPayment";
			definition = "Payment is a suspicious payment.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Insufficient or incoherent details about the debtor with respect to
	 * regulatory requirements.
	 */
	public static final MMCode InsufficientDebtorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor with respect to regulatory requirements.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "MM23";
		}
	};
	/**
	 * Insufficient or incoherent details about the creditor with respect to
	 * regulatory requirements.
	 */
	public static final MMCode InsufficientCreditorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor with respect to regulatory requirements.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "MM24";
		}
	};
	/**
	 * Cancellation requested because an investigation request has been received
	 * and no remediation is possible.
	 */
	public static final MMCode CancelUponUnableToApply = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelUponUnableToApply";
			definition = "Cancellation requested because an investigation request has been received and no remediation is possible.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "CUTA";
		}
	};
	/**
	 * Cancellation requested following technical problems resulting in an
	 * erroneous transaction.
	 */
	public static final MMCode TechnicalProblem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalProblem";
			definition = "Cancellation requested following technical problems resulting in an erroneous transaction.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "TECH";
		}
	};
	/**
	 * Cancellation requested following a transaction that was originated
	 * fraudulently. The use of the FraudulentOrigin code should be governed by
	 * jurisdictions.
	 */
	public static final MMCode FraudulentOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FraudulentOrigin";
			definition = "Cancellation requested following a transaction that was originated fraudulently. The use of the FraudulentOrigin code should be governed by jurisdictions.";
			owner_lazy = () -> CancellationReasonCode.mmObject();
			codeName = "FRAD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DUPL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationReasonCode";
				definition = "Specifies the reason for requesting the cancellation of a payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationReasonCode.DuplicatePayment, com.tools20022.repository.codeset.CancellationReasonCode.IncorrectAgent,
						com.tools20022.repository.codeset.CancellationReasonCode.IncorrectCurrency, com.tools20022.repository.codeset.CancellationReasonCode.RequestedByCustomer,
						com.tools20022.repository.codeset.CancellationReasonCode.UnduePayment, com.tools20022.repository.codeset.CancellationReasonCode.SuspiciousPayment,
						com.tools20022.repository.codeset.CancellationReasonCode.InsufficientDebtorDetails, com.tools20022.repository.codeset.CancellationReasonCode.InsufficientCreditorDetails,
						com.tools20022.repository.codeset.CancellationReasonCode.CancelUponUnableToApply, com.tools20022.repository.codeset.CancellationReasonCode.TechnicalProblem,
						com.tools20022.repository.codeset.CancellationReasonCode.FraudulentOrigin);
			}
		});
		return mmObject_lazy.get();
	}
}
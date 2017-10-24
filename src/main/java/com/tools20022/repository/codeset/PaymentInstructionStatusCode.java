package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the state of a payment.
 */
public class PaymentInstructionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been accepted by the clearing agent.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Transaction has been accepted by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "ACPD";
		}
	};
	/**
	 * Transaction has been validated by the clearing agent.
	 */
	public static final MMCode Validated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Validated";
			definition = "Transaction has been validated by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "VALD";
		}
	};
	/**
	 * Transaction has been authorised by the transaction administrator or
	 * authorised party.
	 */
	public static final MMCode Authorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorised";
			definition = "Transaction has been authorised by the transaction administrator or authorised party.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "AUTD";
		}
	};
	/**
	 * Transaction is invalid.
	 */
	public static final MMCode Invalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invalid";
			definition = "Transaction is invalid.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "INVD";
		}
	};
	/**
	 * Transaction has been matched with a corresponding transaction by the
	 * clearing agent.
	 */
	public static final MMCode Matched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Matched";
			definition = "Transaction has been matched with a corresponding transaction by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "MATD";
		}
	};
	/**
	 * Clearing agent attempted to match the transaction with a corresponding
	 * transaction but failed.
	 */
	public static final MMCode Unmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unmatched";
			definition = "Clearing agent attempted to match the transaction with a corresponding transaction but failed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "UMAC";
		}
	};
	/**
	 * Clearing agent attempted to match the transaction with a corresponding
	 * transaction, but some non-essential characteristics of both transactions
	 * failed to match.
	 */
	public static final MMCode Mismatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mismatched";
			definition = "Clearing agent attempted to match the transaction with a corresponding transaction, but some non-essential characteristics of both transactions failed to match.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "MMTD";
		}
	};
	/**
	 * Transaction is eligible for future settlement.
	 */
	public static final MMCode SettlementEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementEligible";
			definition = "Transaction is eligible for future settlement.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLE";
		}
	};
	/**
	 * Transaction is eligible for immediate settlement.
	 */
	public static final MMCode SettlementMature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMature";
			definition = "Transaction is eligible for immediate settlement.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLM";
		}
	};
	/**
	 * Transaction has been suspended by the clearing agent.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "Transaction has been suspended by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SSPD";
		}
	};
	/**
	 * Clearing agent has received a cancellation request for the transaction,
	 * and needs either a matching request for cancellation from the
	 * counterparty or a confirmation from an authorised party.
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCancellation";
			definition = "Clearing agent has received a cancellation request for the transaction, and needs either a matching request for cancellation from the counterparty or a confirmation from an authorised party.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PCAN";
		}
	};
	/**
	 * Transaction is eligible for settlement, but is pending.
	 */
	public static final MMCode PendingSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Transaction is eligible for settlement, but is pending.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Transaction eligible for immediate settlement, has failed to settle.
	 */
	public static final MMCode PendingFailingSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Transaction eligible for immediate settlement, has failed to settle.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "PFST";
		}
	};
	/**
	 * Transaction causes the 'Sender multilateral limit' to be exceeded and
	 * cannot currently be processed.
	 */
	public static final MMCode SenderMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SenderMultilateralLimitRelated";
			definition = "Transaction causes the 'Sender multilateral limit' to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SMLR";
		}
	};
	/**
	 * Transaction causes the 'Receiver multilateral limit' to be exceeded and
	 * cannot currently be processed.
	 */
	public static final MMCode ReceiverMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverMultilateralLimitRelated";
			definition = "Transaction causes the 'Receiver multilateral limit' to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "RMLR";
		}
	};
	/**
	 * Transaction causes the bilateral limit fixed between Sender and Receiver
	 * to be exceeded and cannot currently be processed.
	 */
	public static final MMCode SenderReceiverBilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverBilateralLimitRelated";
			definition = "Transaction causes the bilateral limit fixed between Sender and Receiver to be exceeded and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SRBL";
		}
	};
	/**
	 * Transaction has been successfully processed by the clearing agent.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Transaction has been successfully processed by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Transaction has been rejected by the clearing agent.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Transaction has been rejected by the clearing agent.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "RJTD";
		}
	};
	/**
	 * Transaction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transaction has been cancelled.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Transaction has been successfully processed by the clearing agent.
	 * Settlement will take place outside of the system.
	 */
	public static final MMCode Finalised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Finalised";
			definition = "Transaction has been successfully processed by the clearing agent. Settlement will take place outside of the system.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "FNLD";
		}
	};
	/**
	 * Specifies that the message is queued to the receiving payment system and
	 * is awaiting processing because the receiving payment system is not
	 * operational (open) at that point in time.
	 */
	public static final MMCode HeldForServiceAvailability = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HeldForServiceAvailability";
			definition = "Specifies that the message is queued to the receiving payment system and is awaiting processing because the receiving payment system is not operational (open) at that point in time.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "AVLB";
		}
	};
	/**
	 * Transaction causes the multilateral limits fixed between Sender and
	 * Receiver to be exceeded by the total amount of submitted payments at the
	 * end of the day and cannot currently be processed.
	 */
	public static final MMCode SenderReceiverMultilateralLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverMultilateralLimitRelated";
			definition = "Transaction causes the multilateral limits fixed between Sender and Receiver to be exceeded by the total amount of submitted payments at the end of the day and cannot currently be processed.";
			owner_lazy = () -> PaymentInstructionStatusCode.mmObject();
			codeName = "SRML";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstructionStatusCode";
				definition = "Specifies the state of a payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentInstructionStatusCode.Accepted, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Validated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Authorised, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Invalid,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Matched, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Unmatched,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Mismatched, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SettlementEligible,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.SettlementMature, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Suspended,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingCancellation, com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingSettlement,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.PendingFailingSettlement, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderMultilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Settled, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Rejected,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.Cancelled, com.tools20022.repository.codeset.PaymentInstructionStatusCode.Finalised,
						com.tools20022.repository.codeset.PaymentInstructionStatusCode.HeldForServiceAvailability, com.tools20022.repository.codeset.PaymentInstructionStatusCode.SenderReceiverMultilateralLimitRelated);
			}
		});
		return mmObject_lazy.get();
	}
}
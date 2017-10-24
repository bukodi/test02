package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.MandateReason1Choice;
import com.tools20022.repository.choice.MandateSuspensionReason1Choice;
import com.tools20022.repository.choice.ReversalReason4Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.MandateSuspensionReason1;
import com.tools20022.repository.msg.PaymentCancellationReason1;
import com.tools20022.repository.msg.StatusReasonInformation9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a payment at a specified time.
 */
public class PaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the status of the payment execution.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader7.GroupStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.PaymentInformationStatus,
					com.tools20022.repository.msg.OriginalPaymentInstruction24.PaymentInformationStatus, com.tools20022.repository.msg.OriginalGroupInformation28.GroupStatus);
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the payment execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentStatusCode.mmObject();
		}
	};
	/**
	 * Payment for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Reason the transaction/instruction is unmatched.
	 */
	public static final MMBusinessAttribute UnmatchedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason the transaction/instruction is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason the transaction/instruction is suspended.
	 */
	public static final MMBusinessAttribute SuspendedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason the transaction/instruction is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason the instruction is pending settlement, ie, delivery or receipt of
	 * the financial instrument. Settlement on the instructed settlement date is
	 * still possible.
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Reason the instruction is pending settlement, ie, delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the state of a payment instruction.
	 */
	public static final MMBusinessAttribute InstructionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionStatus";
			definition = "Specifies the state of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstructionStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason to reject, return or reverse the transaction.
	 */
	public static final MMBusinessAttribute TransactionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReversalReason4Choice.Code, com.tools20022.repository.choice.ReversalReason4Choice.Proprietary);
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRejectionReason";
			definition = "Specifies the reason to reject, return or reverse the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionReasonCode.mmObject();
		}
	};
	/**
	 * Specifies an investigation case in relation with the payment status.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Specifies an investigation case in relation with the payment status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}
	};
	/**
	 * Specifies the status of the payment in comparison with the notification
	 * to receive.
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the payment in comparison with the notification to receive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationToReceiveStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the processing status of an investment fund transaction.
	 */
	public static final MMBusinessAttribute TransactionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the processing status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}
	};
	/**
	 * Specifies a generic status of a payment at a specified time.
	 */
	public static final MMBusinessAttribute CashPaymentStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPaymentStatus";
			definition = "Specifies a generic status of a payment at a specified time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashPaymentStatusCode.mmObject();
		}
	};
	/**
	 * Reason provided for the status of a transaction.The reason may be in
	 * coded or free text form.
	 */
	public static final MMBusinessAttribute UnsuccessfulStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsuccessfulStatusReason";
			definition = "Reason provided for the status of a transaction.The reason may be in coded or free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalStatusReason1Code.mmObject();
		}
	};
	/**
	 * Reason for the cancellation of the payment.
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Reason for requesting the cancellation or the amendment of a mandate.
	 */
	public static final MMBusinessAttribute MandateRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MandateReason1Choice.Code, com.tools20022.repository.choice.MandateReason1Choice.Proprietary,
					com.tools20022.repository.msg.PaymentCancellationReason1.Reason, com.tools20022.repository.choice.MandateSuspensionReason1Choice.Code, com.tools20022.repository.choice.MandateSuspensionReason1Choice.Proprietary);
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateRejectionReason";
			definition = "Reason for requesting the cancellation or the amendment of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateReasonCode.mmObject();
		}
	};
	/**
	 * Reason the transaction/instruction is pending due to failing settlement.
	 */
	public static final MMBusinessAttribute PendingFailingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason the transaction/instruction is pending due to failing settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlementCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentStatus";
				definition = "Specifies the status of a payment at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentStatus.Status, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.PaymentStatus.UnmatchedStatusReason,
						com.tools20022.repository.entity.PaymentStatus.SuspendedStatusReason, com.tools20022.repository.entity.PaymentStatus.PendingSettlement, com.tools20022.repository.entity.PaymentStatus.InstructionStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionRejectionReason, com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase, com.tools20022.repository.entity.PaymentStatus.NotificationStatus,
						com.tools20022.repository.entity.PaymentStatus.TransactionStatus, com.tools20022.repository.entity.PaymentStatus.CashPaymentStatus, com.tools20022.repository.entity.PaymentStatus.UnsuccessfulStatusReason,
						com.tools20022.repository.entity.PaymentStatus.CancellationReason, com.tools20022.repository.entity.PaymentStatus.MandateRejectionReason, com.tools20022.repository.entity.PaymentStatus.PendingFailingSettlement);
				derivationComponent_lazy = () -> Arrays.asList(ReversalReason4Choice.mmObject(), StatusReasonInformation9.mmObject(), MandateReason1Choice.mmObject(), PaymentCancellationReason1.mmObject(),
						MandateSuspensionReason1Choice.mmObject(), MandateSuspensionReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
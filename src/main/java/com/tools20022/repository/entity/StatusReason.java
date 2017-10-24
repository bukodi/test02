package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.StatusReason6Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.MandateAmendmentReason1;
import com.tools20022.repository.msg.PaymentReversalReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for the status of an object.
 */
public class StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status for which a reason is provided.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
		}
	};
	/**
	 * Reason provided for the status.
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReversalReason7.AdditionalInformation, com.tools20022.repository.choice.StatusReason6Choice.Code,
					com.tools20022.repository.choice.StatusReason6Choice.Proprietary, com.tools20022.repository.msg.AcceptanceResult6.AdditionalRejectReasonInformation, com.tools20022.repository.msg.MandateAmendmentReason1.Reason);
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates that there is no reason available or to report.
	 */
	public static final MMBusinessAttribute NoSpecifiedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	/**
	 * Proprietary identification of the reason for the status.
	 */
	public static final MMBusinessAssociationEnd DataSourceScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Reason for the rejected status.
	 */
	public static final MMBusinessAttribute RejectedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedStatusReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason why a transaction has a failing status.
	 */
	public static final MMBusinessAttribute FailingReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailingReason";
			definition = "Reason why a transaction has a failing status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the related instruction is cancelled, or the
	 * related cancellation request is executed.
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction processing is pending.
	 */
	public static final MMBusinessAttribute PendingReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction processing is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the reason why the instruction/request has a repair or
	 * rejection status.
	 */
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonV2Code.mmObject();
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 */
	public static final MMBusinessAttribute AcknowledgedAcceptedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Related reason of closure of the contract.
	 */
	public static final MMBusinessAssociationEnd RelatedClosureReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClosureReason";
			definition = "Related reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ClosureReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusReason";
				definition = "Specifies the underlying reason for the status of an object.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.Status.StatusReason,
						com.tools20022.repository.entity.RegisteredContract.ClosureReason);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReversalReason7.Reason);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeStatusReason.mmObject(), CorporateActionStatusReason.mmObject(), UndertakingStatusReason.mmObject(), MeetingStatusReason.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.StatusReason.Reason, com.tools20022.repository.entity.StatusReason.NoSpecifiedReason,
						com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.StatusReason.RejectedStatusReason, com.tools20022.repository.entity.StatusReason.FailingReason,
						com.tools20022.repository.entity.StatusReason.CancellationReason, com.tools20022.repository.entity.StatusReason.PendingReason, com.tools20022.repository.entity.StatusReason.RejectionReason,
						com.tools20022.repository.entity.StatusReason.AcknowledgedAcceptedReason, com.tools20022.repository.entity.StatusReason.RelatedClosureReason);
				derivationComponent_lazy = () -> Arrays.asList(PaymentReversalReason7.mmObject(), StatusReason6Choice.mmObject(), MandateAmendmentReason1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
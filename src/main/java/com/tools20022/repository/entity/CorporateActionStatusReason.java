package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a corporate action.
 */
public class CorporateActionStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies reasons for cancellation of a corporate action event.
	 */
	public static final MMBusinessAttribute CorporateActionCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionCancellationReason";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Corporate actions status for which a reason is provided.
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatus";
			definition = "Corporate actions status for which a reason is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmObject();
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 */
	public static final MMBusinessAttribute AcceptedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AcknowledgementReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the reversal.
	 */
	public static final MMBusinessAttribute ReversalReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReasonCode.mmObject();
		}
	};
	/**
	 * The reason for the failure.
	 */
	public static final MMBusinessAttribute MovementFailureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementFailureReason";
			definition = "The reason for the failure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailedSettlementReasonCode.mmObject();
		}
	};
	/**
	 * Provides information about the rejection status.
	 */
	public static final MMBusinessAttribute MovementRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementRejectionReason";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatusReason";
				definition = "Specifies the underlying reason for a status of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionCancellationReason, com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus,
						com.tools20022.repository.entity.CorporateActionStatusReason.AcceptedReason, com.tools20022.repository.entity.CorporateActionStatusReason.ReversalReason,
						com.tools20022.repository.entity.CorporateActionStatusReason.MovementFailureReason, com.tools20022.repository.entity.CorporateActionStatusReason.MovementRejectionReason);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.SettlementAdviceTypeCode;
import com.tools20022.repository.codeset.TerminationReasonCode;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the status or for the action (for instance
 * settlement reason).
 */
public class UndertakingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Demand is refused because of a discrepancy in the demand.
	 */
	public static final MMBusinessAssociationEnd Discrepancy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discrepancy";
			definition = "Demand is refused because of a discrepancy in the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Discrepancy.UndertakingStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
		}
	};
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 */
	public static final MMBusinessAssociationEnd UndertakingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.UndertakingStatusReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
		}
	};
	/**
	 * Reason for the termination.
	 */
	public static final MMBusinessAttribute TerminationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationReason";
			definition = "Reason for the termination.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminationReasonCode.mmObject();
		}
	};
	/**
	 * Processing status reported by the issuer for the refusal of a demand.
	 */
	public static final MMBusinessAttribute DemandRefusalStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandRefusalStatusReason";
			definition = "Processing status reported by the issuer for the refusal of a demand.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason for the settlement of an amount.
	 */
	public static final MMBusinessAttribute SettlementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement of an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementAdviceTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatusReason";
				definition = "Specifies the reason for the status or for the action (for instance settlement reason).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.UndertakingStatusReason, com.tools20022.repository.entity.Discrepancy.UndertakingStatusReason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatusReason.Discrepancy, com.tools20022.repository.entity.UndertakingStatusReason.UndertakingStatus,
						com.tools20022.repository.entity.UndertakingStatusReason.TerminationReason, com.tools20022.repository.entity.UndertakingStatusReason.DemandRefusalStatusReason,
						com.tools20022.repository.entity.UndertakingStatusReason.SettlementReason);
			}
		});
		return mmObject_lazy.get();
	}
}
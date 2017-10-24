package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the delivery instructions for the securities and cash proceeds at
 * any stage of the Corporate Action process.
 */
public class CorporateActionProceedsDeliveryInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Parameters of the distribution of the proceeds of a CA event.
	 */
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDistribution";
			definition = "Parameters of the distribution of the proceeds of a CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}
	};
	/**
	 * Instructions for the movement of securities related to a corporate
	 * action.
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsMovement";
			definition = "Instructions for the movement of securities related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
		}
	};
	/**
	 * Instructions for the movement of cash related to a corporate action.
	 */
	public static final MMBusinessAssociationEnd CashProceedsMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceedsMovement";
			definition = "Instructions for the movement of cash related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Information relative to the account(s) to be used for the delivery of the
	 * proceeds (cash or securities)
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedProceedsDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Standing instruction related to a corporate action.
	 */
	public static final MMBusinessAssociationEnd CorporateActionStandingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstruction";
			definition = "Standing instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProceedsDeliveryInstruction";
				definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}
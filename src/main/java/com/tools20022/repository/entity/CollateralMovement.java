package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the agreed amount and the collateral movement direction.
 */
public class CollateralMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral proposal for which collateral movements are detailed.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralProposal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralProposal";
			definition = "Collateral proposal for which collateral movements are detailed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralProposal.mmObject();
		}
	};
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 */
	public static final MMBusinessAttribute VariationMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 */
	public static final MMBusinessAttribute SegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Magin call which needs to be executed.
	 */
	public static final MMBusinessAssociationEnd MarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Magin call which needs to be executed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.CollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	/**
	 * Movement of assets in relation with collateral updates.
	 */
	public static final MMBusinessAssociationEnd SecuritiesCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
		}
	};
	/**
	 * Movement of assets in relation with collateral updates.
	 */
	public static final MMBusinessAssociationEnd CashCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Financial transaction to which the collateral management is associated.
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the collateral management is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.CollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralMovement";
				definition = "Provides the agreed amount and the collateral movement direction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement,
						com.tools20022.repository.entity.MarginCall.CollateralMovement, com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement,
						com.tools20022.repository.entity.FinancialTransaction.CollateralMovement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal, com.tools20022.repository.entity.CollateralMovement.VariationMargin,
						com.tools20022.repository.entity.CollateralMovement.SegregatedIndependentAmount, com.tools20022.repository.entity.CollateralMovement.MarginCall,
						com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement, com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement,
						com.tools20022.repository.entity.CollateralMovement.FinancialTransaction);
			}
		});
		return mmObject_lazy.get();
	}
}
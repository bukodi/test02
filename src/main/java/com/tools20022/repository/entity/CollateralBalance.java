package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different values taken into account to calculate the current
 * collateral.
 */
public class CollateralBalance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Describes the collateral included in the collateral balance,
	 */
	public static final MMBusinessAssociationEnd CollateralDescription = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Describes the collateral included in the collateral balance,";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}
	};
	/**
	 * Specifies the collateral currently held.
	 */
	public static final MMBusinessAttribute HeldAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldAmount";
			definition = "Specifies the collateral currently held.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the collateral which has been agreed but is not yet
	 * transferred.
	 */
	public static final MMBusinessAttribute PriorAgreed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreed";
			definition = "Specifies the collateral which has been agreed but is not yet transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Risk coverage for which a current variation margin is provided.
	 */
	public static final MMBusinessAssociationEnd VariationMarginRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedRiskCalculation";
			definition = "Risk coverage for which a current variation margin is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};
	/**
	 * Specifies the collateral which is being transferred.
	 */
	public static final MMBusinessAttribute InTransit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransit";
			definition = "Specifies the collateral which is being transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Risk coverage for which a collateral balance is provided.
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedRiskCalculation";
			definition = "Risk coverage for which a collateral balance is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};
	/**
	 * Collateral interest management for which an opening balance is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralInterestManagement";
			definition = "Collateral interest management for which an opening balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
		}
	};
	/**
	 * Collateral interest management for which a closing balance is specified.
	 */
	public static final MMBusinessAssociationEnd CollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInterestManagement";
			definition = "Collateral interest management for which a closing balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralBalance";
				definition = "Specifies the different values taken into account to calculate the current collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.CollateralBalance, com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount, com.tools20022.repository.entity.CollateralInterestAdministration.ClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.OpeningCollateralBalance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralBalance.CollateralDescription, com.tools20022.repository.entity.CollateralBalance.HeldAmount,
						com.tools20022.repository.entity.CollateralBalance.PriorAgreed, com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation, com.tools20022.repository.entity.CollateralBalance.InTransit,
						com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation, com.tools20022.repository.entity.CollateralBalance.RelatedCollateralInterestManagement,
						com.tools20022.repository.entity.CollateralBalance.CollateralInterestManagement);
			}
		});
		return mmObject_lazy.get();
	}
}
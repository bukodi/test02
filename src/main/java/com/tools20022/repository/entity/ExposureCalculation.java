package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the calculation of the amounts representing the risk that
 * needs to be covered, together with the calculation of the existing coverage.
 */
public class ExposureCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total value of the collateral derived from the sum of the current
	 * independent amounts and variation margins held, agreed and in transit.
	 */
	public static final MMBusinessAttribute TotalCollateralCurrentValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralCurrentValue";
			definition = "Total value of the collateral derived from the sum of the current independent amounts and variation margins held, agreed and in transit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * The sum of the exposures of all transactions which are in favour of a
	 * Party. That is, all transactions which would have an amount payable by
	 * the counterparty if they were being terminated.
	 */
	public static final MMBusinessAttribute TotalExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount applied as an add-on to the exposure usually intended to cover a
	 * possible increase in exposure before the next valuation date.
	 */
	public static final MMBusinessAssociationEnd CurrentIndependentAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentIndependentAmount";
			definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IndependentAmount.RelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> IndependentAmount.mmObject();
		}
	};
	/**
	 * Provides details about the collateral held, in transit or that still
	 * needs to be agreed by both parties, against the variation margin.
	 */
	public static final MMBusinessAssociationEnd CurrentVariationMargin = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentVariationMargin";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}
	};
	/**
	 * Provides details about the collateral held, in transit or that still
	 * needs to be agreed by both parties, against the segregated independent
	 * amount only.
	 */
	public static final MMBusinessAssociationEnd CurrentSegregatedIndependentAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSegregatedIndependentAmount";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties, against the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}
	};
	/**
	 * Amount of expected margin required by any of the parties of the margin
	 * calculation.
	 */
	public static final MMBusinessAssociationEnd VariationMarginAmountRequirement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirement";
			definition = "Amount of expected margin required by any of the parties of the margin calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginAmountRequirement.mmObject();
		}
	};
	/**
	 * Margin requirements for the segregated independent amount.
	 */
	public static final MMBusinessAssociationEnd SegregatedAmountRequirement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirement";
			definition = "Margin requirements for the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginAmountRequirement.mmObject();
		}
	};
	/**
	 * Specifies the collateral management actions resulting from the
	 * calculation of the risk.
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Specifies the collateral management actions resulting from the calculation of the risk.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.RiskToCover;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	/**
	 * Calculation of the exposure amount that one party has vis-a-vis one
	 * counterparty or a central system, based on its credit risk.
	 */
	public static final MMBusinessAssociationEnd CounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
		}
	};
	/**
	 * Calculation of the exposure amount that one party has vis-a-vis one
	 * counterparty or a central system, based on the transactions that are not
	 * yet settled.
	 */
	public static final MMBusinessAssociationEnd TransactionRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionRisk";
			definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.ExposureCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
		}
	};
	/**
	 * Collateral currently received (+)/delivered (-) in the base currency.
	 * This amount is after the haircut has been applied.
	 */
	public static final MMBusinessAttribute TotalCollateralAfterHaircut = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExposureCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralAfterHaircut";
			definition = "Collateral currently received (+)/delivered (-) in the base currency. This amount is after the haircut has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureCalculation";
				definition = "Description of the calculation of the amounts representing the risk that needs to be covered, together with the calculation of the existing coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.RiskToCover, com.tools20022.repository.entity.CollateralBalance.VariationMarginRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.SegregatedIndependentAmountRelatedRiskCalculation, com.tools20022.repository.entity.IndependentAmount.RelatedRiskCalculation,
						com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation,
						com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation, com.tools20022.repository.entity.TransactionRisk.ExposureCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.TotalCollateralCurrentValue, com.tools20022.repository.entity.ExposureCalculation.TotalExposedAmount,
						com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.CurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.CurrentSegregatedIndependentAmount, com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement,
						com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.CollateralManagement,
						com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.TransactionRisk,
						com.tools20022.repository.entity.ExposureCalculation.TotalCollateralAfterHaircut);
			}
		});
		return mmObject_lazy.get();
	}
}
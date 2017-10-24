package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.DocumentAdjustment1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 */
public class Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money that results from the application of an adjustment
	 * (charges. fees, discount or allowance) to the amount due.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.Amount, com.tools20022.repository.msg.DiscountAmountAndType1.Amount, com.tools20022.repository.msg.Charges2.Amount);
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate used to calculate the amount of the adjustment, allowance, charge or
	 * fee.
	 */
	public static final MMBusinessAttribute ChargeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Method used to calculate an adjustment (financial adjustment, charge or
	 * allowance).
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Specifies the payment resulting from charges due by one party to another
	 * or the payment to which adjustements (for instance charges) are applied.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 */
	public static final MMBusinessAttribute Direction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.CreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}
	};
	/**
	 * Reason for the amount adjustment.
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentAdjustment1.Reason);
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the line item on which a financial adjustment took place.
	 */
	public static final MMBusinessAssociationEnd RelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.FinancialAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge (Indicator
	 * is Yes) that should be added or an allowance that should be subtracted
	 * (Indicator is No).
	 */
	public static final MMBusinessAttribute AllowanceChargeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the price which is adjusted.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.PriceAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	/**
	 * Indication of whether or not this allowance charge is a charge.
	 */
	public static final MMBusinessAttribute ChargeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	/**
	 * Balance for which adjustments are specified.
	 */
	public static final MMBusinessAssociationEnd AdjustedBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of charges due.
	 */
	public static final MMBusinessAssociationEnd ChargesPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ChargePartyRole.mmObject();
		}
	};
	/**
	 * Period during which the adjustment is applicable.
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Currency exchange for which adjustments such as fees or commissions are
	 * applied.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Order for which adjustments are specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Adjustments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Information on the calculation method resulting in the tax amount
	 * included in the charge transfer. The tax is expressed as a fixed amount,
	 * or as a percentage of the charge amount, upon which the tax is applied.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Adjustment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Adjustment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Balance.Adjustment, com.tools20022.repository.entity.Price.PriceAdjustment, com.tools20022.repository.entity.CurrencyExchange.Adjustment,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.ChargePartyRole.Adjustment, com.tools20022.repository.entity.LineItem.FinancialAdjustment,
						com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.AdjustmentAmountAndReason);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject(), Discount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.Amount, com.tools20022.repository.entity.Adjustment.ChargeRate, com.tools20022.repository.entity.Adjustment.CalculationMethod,
						com.tools20022.repository.entity.Adjustment.Payment, com.tools20022.repository.entity.Adjustment.Direction, com.tools20022.repository.entity.Adjustment.Reason,
						com.tools20022.repository.entity.Adjustment.RelatedLineItem, com.tools20022.repository.entity.Adjustment.AllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.Price,
						com.tools20022.repository.entity.Adjustment.ChargeIndicator, com.tools20022.repository.entity.Adjustment.Type, com.tools20022.repository.entity.Adjustment.CollateralManagement,
						com.tools20022.repository.entity.Adjustment.AdjustedBalance, com.tools20022.repository.entity.Adjustment.ChargesPartyRole, com.tools20022.repository.entity.Adjustment.EffectivePeriod,
						com.tools20022.repository.entity.Adjustment.CurrencyExchange, com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.Adjustment.Tax);
				derivationComponent_lazy = () -> Arrays.asList(DocumentAdjustment1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
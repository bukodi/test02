package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Prices related to a corporate action.
 */
public class CorporateActionPrice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Corporate event for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage.<br>
	 * 2. Price at which a bond is converted to underlying security either as an
	 * actual amount or a percentage.<br>
	 * 3. Strike price of an option, represented either as an actual amount or a
	 * percentage.
	 */
	public static final MMBusinessAssociationEnd CorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 */
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 */
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 */
	public static final MMBusinessAssociationEnd CashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 */
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 */
	public static final MMBusinessAssociationEnd CashValueForTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Specifies the parameters taken into account to calculate the price.
	 */
	public static final MMBusinessAssociationEnd PricingCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
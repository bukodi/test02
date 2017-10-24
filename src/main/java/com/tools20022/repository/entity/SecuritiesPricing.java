package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AmountPriceTypeCode;
import com.tools20022.repository.codeset.PriceMethodCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the price of the security.
 */
public class SecuritiesPricing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of pricing calculation method.
	 */
	public static final MMBusinessAttribute PriceMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}
	};
	/**
	 * Type and information about a price.
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	/**
	 * Indicates whether the dividend is included, ie, cum-dividend, in the
	 * executed price. When the dividend is not included, the price will be
	 * ex-dividend.
	 */
	public static final MMBusinessAttribute CumDividendIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Ratio applied on the non-adjusted price.
	 */
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a change of price is specified.
	 */
	public static final MMBusinessAssociationEnd PriceChangeRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}
	};
	/**
	 * Price expressed as a rate, ie, percentage.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a highest price value is specified.
	 */
	public static final MMBusinessAssociationEnd HighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a lowest price value is specified.
	 */
	public static final MMBusinessAssociationEnd LowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ValuationStatistics.mmObject();
		}
	};
	/**
	 * Identifies the security for which a price is given.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Pricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Trade execution for which a deal price is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	/**
	 * Indicates whether the price is expressed as a yield (yield is the annual
	 * rate of return expressed as a percentage).
	 */
	public static final MMBusinessAttribute Yielded = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 */
	public static final MMBusinessAttribute TypeOfRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	/**
	 * Derivative for which an exercise price is specified.
	 */
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.ExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	/**
	 * Warrant for which a subscription price is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedWarrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Warrant.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a conversion price is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Lot for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 */
	public static final MMBusinessAttribute TypeOfAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}
	};
	/**
	 * Corporate action event for which an exercise price is provided.
	 */
	public static final MMBusinessAssociationEnd ExercisePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Corporate action event for which a generic cash price received per
	 * product is provided.
	 */
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Price expressed as an amount per a quantity of financial instruments.
	 */
	public static final MMBusinessAssociationEnd AmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountAndQuantity.mmObject();
		}
	};
	/**
	 * Price expressed as an amount per another amount.
	 */
	public static final MMBusinessAssociationEnd AmountPricePerAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRatio.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRatio.mmObject();
		}
	};
	/**
	 * Corporate action event for which a generic cash price paid per product is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Period during which the price of a security is determined (For outturn
	 * securities).
	 */
	public static final MMBusinessAssociationEnd PriceCalculationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Corporate action event for which a cash in lieu of share price is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd CashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Corporate action event for which an over subscription deposit price is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Corporate action event for which a cash value has been provided.
	 */
	public static final MMBusinessAssociationEnd CashValueForTaxRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a maximum price is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a minimum price is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}
	};
	/**
	 * Date on which the price is obtained.
	 */
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate of return on an investment, based on the price.
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.RedemptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	/**
	 * Securities financing process for which an end price is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.EndPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}
	};
	/**
	 * Fund order for which an executed price is specified.
	 */
	public static final MMBusinessAssociationEnd FundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}
	};
	/**
	 * Fund order for which an informative price is specified.
	 */
	public static final MMBusinessAssociationEnd FundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}
	};
	/**
	 * Tax voucher for which the cost per share is specified.
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	/**
	 * Trade for which the trade price is calculated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Value calculation for which a securities pricing is specified.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * BuyIn process for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.BuyInPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}
	};
	/**
	 * Specifies the index information when used for calculating the price.
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	/**
	 * Party which provided the pricing.
	 */
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	/**
	 * Period during which the price fact type is valid.
	 */
	public static final MMBusinessAssociationEnd PriceFactPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Calculated analytics based on the price.
	 */
	public static final MMBusinessAssociationEnd AnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
		}
	};
	/**
	 * Calculated duration based on the price.
	 */
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
		}
	};
	/**
	 * Calculated life based on the price.
	 */
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
		}
	};
	/**
	 * Date/time of the price. For CIV, this is the NAV date.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Spread which uses the price as benchmark.
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	/**
	 * Securities order for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Order for which a stop price is specified.
	 */
	public static final MMBusinessAssociationEnd StopPriceOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.StopPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Allocation process for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	/**
	 * Order for which a previous closing price is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}
	};
	/**
	 * Issuance for which a discount is specified.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.OriginalIssueDiscount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Entitlement for which a strike price is specified.
	 */
	public static final MMBusinessAssociationEnd Entitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entitlement.StrikePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
		}
	};
	/**
	 * Securities distribution for which a cash fractions price is provided.
	 */
	public static final MMBusinessAssociationEnd CashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a subscription price is provided.
	 */
	public static final MMBusinessAssociationEnd SuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a reinvestment price is provided.
	 */
	public static final MMBusinessAssociationEnd ReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Contract for which a tick is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedFuture = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.Tick;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	/**
	 * Distribution for which an offer price is specified.
	 */
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.OfferPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	/**
	 * Redemption schedule for which a change in price is provided.
	 */
	public static final MMBusinessAssociationEnd PriceChangeRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.PriceChange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RedemptionSchedule.mmObject();
		}
	};
	/**
	 * Redemption schedule for which a price is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RedemptionSchedule.mmObject();
		}
	};
	/**
	 * Quote which contains a previous closing price.
	 */
	public static final MMBusinessAssociationEnd PreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.PreviousClosingPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Quote which contains a requested price.
	 */
	public static final MMBusinessAssociationEnd RequestedPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.RequestedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Quote which contains a price.
	 */
	public static final MMBusinessAssociationEnd PriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Quote which contains a market price.
	 */
	public static final MMBusinessAssociationEnd MarketPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MarketPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Value of the price.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.SecuritiesPricing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	/**
	 * Corporate action price for which pricing information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPrice.mmObject();
		}
	};
	/**
	 * Position for which a price is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPricing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Position.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.InformationPartyRole.Price, com.tools20022.repository.entity.NetAssetValueCalculation.Price,
						com.tools20022.repository.entity.RedemptionSchedule.PriceChange, com.tools20022.repository.entity.RedemptionSchedule.Price, com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing, com.tools20022.repository.entity.SecuritiesTrade.TradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice, com.tools20022.repository.entity.LotBreakdown.LotPrice, com.tools20022.repository.entity.Price.SecuritiesPricing,
						com.tools20022.repository.entity.ValuationStatistics.PriceChange, com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue, com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice, com.tools20022.repository.entity.Derivative.Tick, com.tools20022.repository.entity.Derivative.ExercisePrice,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Index.SecuritiesPricing, com.tools20022.repository.entity.Warrant.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesFinancing.EndPrice, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct, com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice,
						com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice, com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax,
						com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation, com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing, com.tools20022.repository.entity.AmountRatio.SecuritiesPricing,
						com.tools20022.repository.entity.Spread.BenchmarkPrice, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice, com.tools20022.repository.entity.SecuritiesOrder.StopPrice,
						com.tools20022.repository.entity.YieldCalculation.RedemptionPrice, com.tools20022.repository.entity.Allocation.AllocatedPrice, com.tools20022.repository.entity.Distribution.OfferPrice,
						com.tools20022.repository.entity.BuyIn.BuyInPrice, com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice, com.tools20022.repository.entity.Quote.PreviousClosingPrice,
						com.tools20022.repository.entity.Quote.RequestedPrice, com.tools20022.repository.entity.Quote.Price, com.tools20022.repository.entity.Quote.MarketPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice, com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing,
						com.tools20022.repository.entity.DurationCalculation.RelatedSecuritiesPricing, com.tools20022.repository.entity.LifeCalculation.SecuritiesPricing, com.tools20022.repository.entity.Entitlement.StrikePrice,
						com.tools20022.repository.entity.Position.Price);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.PriceMethod, com.tools20022.repository.entity.SecuritiesPricing.PriceType,
						com.tools20022.repository.entity.SecuritiesPricing.CumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.CalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.Rate,
						com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.Yielded,
						com.tools20022.repository.entity.SecuritiesPricing.TypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.Derivative, com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.TypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.QuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.YieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.Index, com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation, com.tools20022.repository.entity.SecuritiesPricing.DurationCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.LifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.Date, com.tools20022.repository.entity.SecuritiesPricing.Spread,
						com.tools20022.repository.entity.SecuritiesPricing.Order, com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.SecuritiesPricing.Allocation,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Entitlement,
						com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.RelatedFuture,
						com.tools20022.repository.entity.SecuritiesPricing.Distribution, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.PreviousClosingPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.RequestedPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.PriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.MarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.Price, com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedPosition);
			}
		});
		return mmObject_lazy.get();
	}
}
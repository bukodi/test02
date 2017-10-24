package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Statistical data related to the price change of a security.
 */
public class ValuationStatistics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency of the net asset value calculation.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the net asset value calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Type of price from which the change is calculated, eg, bid, offer, or
	 * single.
	 */
	public static final MMBusinessAttribute PriceTypeChangeBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceTypeChangeBasis";
			definition = "Type of price from which the change is calculated, eg, bid, offer, or single.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}
	};
	/**
	 * Change in price since the last valuation.
	 */
	public static final MMBusinessAssociationEnd PriceChange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the last valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Rate of income from the financial instrument, usually calculated as total
	 * dividends or coupon interest available to investors in the last
	 * year,divided by the current price.
	 */
	public static final MMBusinessAttribute Yield = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Highest price for the referenced period.
	 */
	public static final MMBusinessAssociationEnd HighestPriceValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValue";
			definition = "Highest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Lowest price for the referenced period.
	 */
	public static final MMBusinessAssociationEnd LowestPriceValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValue";
			definition = "Lowest price for the referenced period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Reference period for the valuation.
	 */
	public static final MMBusinessAssociationEnd Period = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Reference period for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Information related to the price valuation of an investment fund class.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Information related to the price valuation of an investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Rate of change of the net asset value.
	 */
	public static final MMBusinessAttribute NetAssetValueChangeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ValuationStatistics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueChangeRate";
			definition = "Rate of change of the net asset value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ValuationStatistics";
				definition = "Statistical data related to the price change of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.HighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.LowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ValuationStatistics.Currency, com.tools20022.repository.entity.ValuationStatistics.PriceTypeChangeBasis,
						com.tools20022.repository.entity.ValuationStatistics.PriceChange, com.tools20022.repository.entity.ValuationStatistics.Yield, com.tools20022.repository.entity.ValuationStatistics.HighestPriceValue,
						com.tools20022.repository.entity.ValuationStatistics.LowestPriceValue, com.tools20022.repository.entity.ValuationStatistics.Period, com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.NetAssetValueChangeRate);
			}
		});
		return mmObject_lazy.get();
	}
}
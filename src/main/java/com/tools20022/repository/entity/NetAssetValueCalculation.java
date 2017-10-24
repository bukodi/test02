package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.codeset.ValuationTimingCode;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the net asset value for an investment fund/fund class.
 */
public class NetAssetValueCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency of the valuation.
	 */
	public static final MMBusinessAttribute ValuationFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Date and time of the price valuation for the investment fund/fund class.
	 */
	public static final MMBusinessAttribute ValuationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Value of all the holdings, less the fund's liabilities, attributable to a
	 * specific investment fund class.
	 */
	public static final MMBusinessAttribute NetAssetValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the fund for which the NAV is calculated (per fund unit).
	 */
	public static final MMBusinessAssociationEnd RelatedFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFund";
			definition = "Specifies the fund for which the NAV is calculated (per fund unit).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Specifies how the valuation is done, based on the schedule stated in the
	 * prospectus.
	 */
	public static final MMBusinessAttribute ValuationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTimingCode.mmObject();
		}
	};
	/**
	 * Indicates whether the valuation of the investment fund class is
	 * suspended.
	 */
	public static final MMBusinessAttribute SuspendedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the price information can be used for the execution of
	 * a transaction.
	 */
	public static final MMBusinessAttribute ForExecutionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForExecutionIndicator";
			definition = "Indicates whether the price information can be used for the execution of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to taxes that are due.
	 */
	public static final MMBusinessAssociationEnd TaxLiability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiability";
			definition = "Information related to taxes that are due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Information related to taxes that are paid back.
	 */
	public static final MMBusinessAssociationEnd TaxRefund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefund";
			definition = "Information related to taxes that are paid back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxRefundValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Indicates whether the valuation is an official valuation.
	 */
	public static final MMBusinessAttribute OfficialValuationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the price is an estimated price.
	 */
	public static final MMBusinessAttribute EstimatedPriceIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedPriceIndicator";
			definition = "Indicates whether the price is an estimated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information related to the price variations of an investment fund class.
	 */
	public static final MMBusinessAssociationEnd ValuationStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	/**
	 * Factors that give indications about the performance of a fund.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundPerformanceFactors = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPerformanceFactors";
			definition = "Factors that give indications about the performance of a fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PerformanceFactors.mmObject();
		}
	};
	/**
	 * Price derived from the net asset value.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price derived from the net asset value.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Quantity on which the NAV is calculated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity on which the NAV is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Interest that has accumulated between the most recent payment of interest
	 * and the sale of the financial instrument.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Net cash flow for a valuation date, which is incorporated in the NAV.
	 */
	public static final MMBusinessAssociationEnd FundsCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundsCashFlow";
			definition = "Net cash flow for a valuation date, which is incorporated in the NAV.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	/**
	 * Means of the net asset value publication, for example, a newspaper.
	 */
	public static final MMBusinessAttribute DeclarationChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationChannel";
			definition = "Means of the net asset value publication, for example, a newspaper.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time of the net asset value publication.
	 */
	public static final MMBusinessAttribute DeclarationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationDate";
			definition = "Date/time of the net asset value publication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the investment fund class was first priced.
	 */
	public static final MMBusinessAttribute FirstValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstValuationDate";
			definition = "Date on which the investment fund class was first priced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Indicates whether the price is historic or forward.
	 */
	public static final MMBusinessAttribute HistoricPricingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NetAssetValueCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HistoricPricingIndicator";
			definition = "Indicates whether the price is historic or forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NetAssetValueCalculation";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation, com.tools20022.repository.entity.SecuritiesPricing.NetAssetValueCalculation,
						com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation, com.tools20022.repository.entity.Tax.TaxRefundValueCalculation, com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.NetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation,
						com.tools20022.repository.entity.Interest.RelatedNetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.ValuationFrequency, com.tools20022.repository.entity.NetAssetValueCalculation.ValuationDateTime,
						com.tools20022.repository.entity.NetAssetValueCalculation.NetAssetValue, com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund,
						com.tools20022.repository.entity.NetAssetValueCalculation.ValuationType, com.tools20022.repository.entity.NetAssetValueCalculation.SuspendedIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.ForExecutionIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund, com.tools20022.repository.entity.NetAssetValueCalculation.OfficialValuationIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.EstimatedPriceIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.ValuationStatistics,
						com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors, com.tools20022.repository.entity.NetAssetValueCalculation.Price,
						com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity, com.tools20022.repository.entity.NetAssetValueCalculation.Interest,
						com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow, com.tools20022.repository.entity.NetAssetValueCalculation.DeclarationChannel,
						com.tools20022.repository.entity.NetAssetValueCalculation.DeclarationDate, com.tools20022.repository.entity.NetAssetValueCalculation.FirstValuationDate,
						com.tools20022.repository.entity.NetAssetValueCalculation.HistoricPricingIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.OperatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the value expressed as a rate or an amount. For example, the value
 * of a tax or a commission.
 */
public class RateAndAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend information for which a final dividend rate is specified.
	 */
	public static final MMBusinessAssociationEnd FinalDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FinalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}
	};
	/**
	 * Dividend information for which a fully franked rate and amount is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}
	};
	/**
	 * Dividend information for which a gross dividend rate is specified.
	 */
	public static final MMBusinessAssociationEnd GrossDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.GrossDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}
	};
	/**
	 * Value expressed as an amount.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Index for which a factor is specified.
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.IndexFactor;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	/**
	 * Dividend information for which a net dividend rate is specified.
	 */
	public static final MMBusinessAssociationEnd NetDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.NetDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a maximum amount is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumAllowedBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}
	};
	/**
	 * Dividend information for which a provisional dividend rate is specified.
	 */
	public static final MMBusinessAssociationEnd ProvisionalDividendParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.ProvisionalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}
	};
	/**
	 * Corporate event for which a solicitation fee is specified.
	 */
	public static final MMBusinessAssociationEnd SolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}
	};
	/**
	 * Value expressed as a rate.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a rate is specified.
	 */
	public static final MMBusinessAssociationEnd RateBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.ApplicableRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}
	};
	/**
	 * Tax for which a percentage of the gross dividend rate is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.RelatedTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
		}
	};
	/**
	 * Corporate event for which an early solicitation fee is specified.
	 */
	public static final MMBusinessAssociationEnd EarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}
	};
	/**
	 * Issuance for which an interest shortfall has been specified.
	 */
	public static final MMBusinessAssociationEnd InterestRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.InterestShortfall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}
	};
	/**
	 * Issuance for which a realised loss has been specified.
	 */
	public static final MMBusinessAssociationEnd LossRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.RealisedLoss;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}
	};
	/**
	 * Absolute value determined with a number.
	 */
	public static final MMBusinessAttribute AbsoluteValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AbsoluteValue";
			definition = "Absolute value determined with a number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Provides the relationship between a variable and a fixed value.
	 */
	public static final MMBusinessAttribute Operator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Operator";
			definition = "Provides the relationship between a variable and a fixed value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OperatorCode.mmObject();
		}
	};
	/**
	 * Yield calculation which uses a yield range.
	 */
	public static final MMBusinessAssociationEnd RelatedYieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RateAndAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.YieldRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> YieldCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.FinalDividend, com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount,
						com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend,
						com.tools20022.repository.entity.SecuritiesTax.RelatedTax, com.tools20022.repository.entity.Issuance.InterestShortfall, com.tools20022.repository.entity.Issuance.RealisedLoss,
						com.tools20022.repository.entity.Index.IndexFactor, com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee, com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate,
						com.tools20022.repository.entity.YieldCalculation.YieldRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.Amount, com.tools20022.repository.entity.RateAndAmount.Index,
						com.tools20022.repository.entity.RateAndAmount.NetDividendParameters, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.Rate, com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.SecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.AbsoluteValue, com.tools20022.repository.entity.RateAndAmount.Operator,
						com.tools20022.repository.entity.RateAndAmount.RelatedYieldCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
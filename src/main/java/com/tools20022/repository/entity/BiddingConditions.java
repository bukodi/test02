package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions under which securities can be acquired as part of a
 * corporate action.
 */
public class BiddingConditions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate proposed in a remarketing of variable rate notes.
	 */
	public static final MMBusinessAttribute ProposedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate of allowed over-subscription.
	 */
	public static final MMBusinessAttribute OversubscriptionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, eg, not open to US/Canadian residents, QIB or SIL to be
	 * provided.
	 */
	public static final MMBusinessAttribute InformationToComplyWith = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Date by which cash must be in place in order to take part in the event.
	 */
	public static final MMBusinessAttribute SubscriptionCostDebitDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * A maximum percentage of shares available through the over subscription
	 * privilege, usually a percentage of the basic subscription shares, eg, an
	 * account owner subscribing to 100 shares may over subscribe to a maximum
	 * of 50 additional shares when the over subscription maximum is 50%.
	 */
	public static final MMBusinessAssociationEnd MaximumAllowedOverSubscription = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedOverSubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Proportionate allocation used for the offer.
	 */
	public static final MMBusinessAttribute ProrationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 */
	public static final MMBusinessAssociationEnd ApplicableRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Rate used to determine the cash consideration split across outturn
	 * settlement transactions that are the result of a transformation of the
	 * parent transaction.
	 */
	public static final MMBusinessAttribute TransformationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date (and time) at which an issuer will determine the proration
	 * amount/quantity of an offer.
	 */
	public static final MMBusinessAttribute ProrationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 */
	public static final MMBusinessAssociationEnd CompulsoryPurchasePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Percentage of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 */
	public static final MMBusinessAttribute PercentageSought = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Acceptable price increment used for submitting a bid.
	 */
	public static final MMBusinessAttribute BidInterval = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 */
	public static final MMBusinessAssociationEnd MaximumPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 */
	public static final MMBusinessAssociationEnd MinimumPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Maximum number of securities the offeror is requesting to complete the
	 * event.
	 */
	public static final MMBusinessAssociationEnd MaximumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Maximum number of securities the offeror is requesting to complete the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities the offeror/issuer will purchase or redeem
	 * under the terms of the event. This can be a number or the term
	 * "any and all".
	 */
	public static final MMBusinessAssociationEnd MinimumQuantitySought = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 */
	public static final MMBusinessAssociationEnd BaseDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * The method of calculation of drawings and partial redemptions.
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
		}
	};
	/**
	 * Additional costs - coming on top of the subscription costs - which the
	 * subscriber should pay as per the subscription process.
	 */
	public static final MMBusinessAttribute AdditionalSubscriptionCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalSubscriptionCost";
			definition = "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Event to which the bidding conditions apply.
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BiddingConditions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Event to which the bidding conditions apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BiddingConditions";
				definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions,
						com.tools20022.repository.entity.DateTimePeriod.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BiddingConditions.ProposedRate, com.tools20022.repository.entity.BiddingConditions.OversubscriptionRate,
						com.tools20022.repository.entity.BiddingConditions.InformationToComplyWith, com.tools20022.repository.entity.BiddingConditions.SubscriptionCostDebitDate,
						com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ProrationRate, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.TransformationRate, com.tools20022.repository.entity.BiddingConditions.ProrationDate, com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod,
						com.tools20022.repository.entity.BiddingConditions.PercentageSought, com.tools20022.repository.entity.BiddingConditions.BidInterval, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought,
						com.tools20022.repository.entity.BiddingConditions.BaseDenomination, com.tools20022.repository.entity.BiddingConditions.CalculationMethod,
						com.tools20022.repository.entity.BiddingConditions.AdditionalSubscriptionCost, com.tools20022.repository.entity.BiddingConditions.Event);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics for a securities distribution event.
 */
public class SecuritiesDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the maximum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 */
	public static final MMBusinessAssociationEnd MaximumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHolding";
			definition = "Indicates the maximum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumerator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * The quantity of interim securities awarded for a given quantity of
	 * underlying shares.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominator";
			definition = "The quantity of interim securities awarded for a given quantity of underlying shares.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of new securities that will be derived by the exercise of a
	 * given quantity of intermediate securities.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumerator";
			definition = "Quantity of new securities that will be derived by the exercise of a given quantity of intermediate securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates the minimum quantity of financial instrument that must be held
	 * in order to be entitled to take part in the event.
	 */
	public static final MMBusinessAssociationEnd MinimumHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHolding";
			definition = "Indicates the minimum quantity of financial instrument that must be held in order to be entitled to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Price paid by the issuer for the remaining fraction.
	 */
	public static final MMBusinessAssociationEnd CashFractionsPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPrice";
			definition = "Price paid by the issuer for the remaining fraction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * The amount of money required per unit for the purchase of an instrument.
	 */
	public static final MMBusinessAssociationEnd SubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "The amount of money required per unit for the purchase of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Price at which a cash disbursement will be reinvested into a security.
	 */
	public static final MMBusinessAssociationEnd ReinvestmentPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPrice";
			definition = "Price at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Date/time at which a privilege or an intermediate security is no longer
	 * available.
	 */
	public static final MMBusinessAttribute IntermediateSecurityExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityExpiryDate";
			definition = "Date/time at which a privilege or an intermediate security is no longer available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which a security starts or resumes trading.
	 */
	public static final MMBusinessAttribute TradingAvailabilityDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingAvailabilityDate";
			definition = "Date/time at which a security starts or resumes trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which a privilege or a security is no longer available.
	 */
	public static final MMBusinessAttribute OfferExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferExpiryDate";
			definition = "Date/time at which a privilege or a security is no longer available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate of oversubscription allowed by the issuer.
	 */
	public static final MMBusinessAttribute OversubscriptionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of oversubscription allowed by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of oversubscription allowed by the issuer.
	 */
	public static final MMBusinessAttribute OversubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionAmount";
			definition = "Amount of oversubscription allowed by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount at which a cash disbursement will be reinvested into a security.
	 */
	public static final MMBusinessAttribute ReinvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate at which a cash disbursement will be reinvested into a security.
	 */
	public static final MMBusinessAttribute ReinvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentRate";
			definition = "Rate at which a cash disbursement will be reinvested into a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Dividend, in addition to regular dividends, payable to loyal (time, size,
	 * amount) investors.
	 */
	public static final MMBusinessAttribute LoyalityPremiumIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoyalityPremiumIndicator";
			definition = "Dividend, in addition to regular dividends, payable to loyal (time, size, amount) investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the event permits the holder to subscribe to more
	 * securities than the underlying position allows.
	 */
	public static final MMBusinessAttribute OversubscriptionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionIndicator";
			definition = "Indicates that the event permits the holder to subscribe to more securities than the underlying position allows.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the intermediate securities held by the beneficial
	 * owner or agent can be sold.
	 */
	public static final MMBusinessAttribute RenounceableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenounceableIndicator";
			definition = "Indicates whether the intermediate securities held by the beneficial owner or agent can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the number of digits to the right of the decimal point.
	 */
	public static final MMBusinessAttribute DecimalPrecision = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecimalPrecision";
			definition = "Indicates the number of digits to the right of the decimal point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies whether the investment will be net or gross.
	 */
	public static final MMBusinessAttribute ReinvestmentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentType";
			definition = "Specifies whether the investment will be net or gross.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Action or event can be reversed at anytime, or otherwise annulled.
	 */
	public static final MMBusinessAttribute RevocableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevocableIndicator";
			definition = "Action or event can be reversed at anytime, or otherwise annulled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Distribution for which the cash distribution elements are provided.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Specifies how the fractions will be treated.
	 */
	public static final MMBusinessAttribute FractionTreatment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies how the fractions will be treated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Indicates whether there will be a distribution of intermediate securities
	 * or privilege.
	 */
	public static final MMBusinessAttribute IntermediateSecurityDistributionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecurityDistributionIndicator";
			definition = "Indicates whether there will be a distribution of intermediate securities or privilege.";
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
				name = "SecuritiesDistribution";
				definition = "Characteristics for a securities distribution event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.CashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.SuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.ReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.SecuritiesDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding,
						com.tools20022.repository.entity.SecuritiesDistribution.CashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.SubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentPrice, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateSecurityExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.TradingAvailabilityDate, com.tools20022.repository.entity.SecuritiesDistribution.OfferExpiryDate,
						com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionRate, com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionAmount,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentAmount, com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentRate,
						com.tools20022.repository.entity.SecuritiesDistribution.LoyalityPremiumIndicator, com.tools20022.repository.entity.SecuritiesDistribution.OversubscriptionIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.RenounceableIndicator, com.tools20022.repository.entity.SecuritiesDistribution.DecimalPrecision,
						com.tools20022.repository.entity.SecuritiesDistribution.ReinvestmentType, com.tools20022.repository.entity.SecuritiesDistribution.RevocableIndicator,
						com.tools20022.repository.entity.SecuritiesDistribution.SecuritiesAndCashDistribution, com.tools20022.repository.entity.SecuritiesDistribution.FractionTreatment,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateSecurityDistributionIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}
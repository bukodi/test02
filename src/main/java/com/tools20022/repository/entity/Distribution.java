package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CorporateActionOptionCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distributions in cash and/or securities following a corporate event.
 */
public class Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the right and/or privilege on an underlying financial
	 * instrument may be executed.
	 */
	public static final MMBusinessAssociationEnd ExercisePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriod";
			definition = "Period during which the right and/or privilege on an underlying financial instrument may be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period during which an open offer remains valid.
	 */
	public static final MMBusinessAssociationEnd OfferPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPeriod";
			definition = "Period during which an open offer remains valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period during which a financial instrument is available for trading.
	 */
	public static final MMBusinessAssociationEnd TradingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which a financial instrument is available for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period, set by the issuer, during which the security is blocked, ie, not
	 * available for exchange.
	 */
	public static final MMBusinessAssociationEnd BlockingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriod";
			definition = "Period, set by the issuer, during which the security is blocked, ie, not available for exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period during which interest has accrued.
	 */
	public static final MMBusinessAssociationEnd InterestPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which interest has accrued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Provides the tax description associated with the corporate event.
	 */
	public static final MMBusinessAssociationEnd DistributionTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionTax";
			definition = "Provides the tax description associated with the corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Price, determined by the offerer, at which the investor is entitled to
	 * take part in an event.
	 */
	public static final MMBusinessAssociationEnd OfferPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPrice";
			definition = "Price, determined by the offerer, at which the investor is entitled to take part in an event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Distribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 */
	public static final MMBusinessAssociationEnd IncentivePremium = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	/**
	 * Date/time at which the event or part of the event, for example, an
	 * option, becomes valid and should be processed and/or applied to holdings.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which the event or part of the event, for example, an option, becomes valid and should be processed and/or applied to holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Conditions that the issuer has placed on the completion of the event, for
	 * example, tender percentage required.
	 */
	public static final MMBusinessAttribute EventConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventConditions";
			definition = "Conditions that the issuer has placed on the completion of the event, for example, tender percentage required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 */
	public static final MMBusinessAttribute ExDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Percentage paid before deductions and/or allowances have been made.
	 */
	public static final MMBusinessAttribute GrossRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossRate";
			definition = "Percentage paid before deductions and/or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time at which the meeting will take place.
	 */
	public static final MMBusinessAttribute MeetingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingDate";
			definition = "Date/time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Percentage paid after deductions and/or allowances have been made.
	 */
	public static final MMBusinessAttribute NetRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetRate";
			definition = "Percentage paid after deductions and/or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * New unit value of a debt security.
	 */
	public static final MMBusinessAttribute NewFaceValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewFaceValue";
			definition = "New unit value of a debt security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * New nominal value of an equity security.
	 */
	public static final MMBusinessAttribute NewParValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewParValue";
			definition = "New nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date/time at which the distribution is due to take place (cash and/or
	 * securities).
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the distribution is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Dividend per financial instrument.
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.RelatedDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	/**
	 * Specifies information about the choices offered to the holder of a
	 * corporate action.
	 */
	public static final MMBusinessAttribute CorporateActionOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Specifies information about the choices offered to the holder of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Currency choice given to the investor.
	 */
	public static final MMBusinessAttribute CurrencyOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Amount by which the issuer devalues a share (in a decrease value event).
	 */
	public static final MMBusinessAttribute DecreaseAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecreaseAmount";
			definition = "Amount by which the issuer devalues a share  (in a decrease value event).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount, expressed as a percentage, by which the issuer devalues a share
	 * (in a decrease value event).
	 */
	public static final MMBusinessAttribute DecreaseRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DecreaseRate";
			definition = "Amount, expressed as a percentage, by which the issuer devalues a share  (in a decrease value event).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time at which an offer price is determined (as compared to its reset
	 * date if applicable).
	 */
	public static final MMBusinessAttribute OfferPriceFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Distribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Distribution";
				definition = "Distributions in cash and/or securities following a corporate event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.RelatedDistribution, com.tools20022.repository.entity.SecuritiesPricing.Distribution,
						com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.CashDistribution, com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution,
						com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution);
				subType_lazy = () -> Arrays.asList(CashDistribution.mmObject(), SecuritiesAndCashDistribution.mmObject(), SecuritiesDistribution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Distribution.ExercisePeriod, com.tools20022.repository.entity.Distribution.OfferPeriod, com.tools20022.repository.entity.Distribution.TradingPeriod,
						com.tools20022.repository.entity.Distribution.BlockingPeriod, com.tools20022.repository.entity.Distribution.InterestPeriod, com.tools20022.repository.entity.Distribution.DistributionTax,
						com.tools20022.repository.entity.Distribution.OfferPrice, com.tools20022.repository.entity.Distribution.IncentivePremium, com.tools20022.repository.entity.Distribution.EffectiveDate,
						com.tools20022.repository.entity.Distribution.EventConditions, com.tools20022.repository.entity.Distribution.ExDate, com.tools20022.repository.entity.Distribution.GrossRate,
						com.tools20022.repository.entity.Distribution.MeetingDate, com.tools20022.repository.entity.Distribution.NetRate, com.tools20022.repository.entity.Distribution.NewFaceValue,
						com.tools20022.repository.entity.Distribution.NewParValue, com.tools20022.repository.entity.Distribution.PaymentDate, com.tools20022.repository.entity.Distribution.Dividend,
						com.tools20022.repository.entity.Distribution.CorporateActionOption, com.tools20022.repository.entity.Distribution.CurrencyOption, com.tools20022.repository.entity.Distribution.DecreaseAmount,
						com.tools20022.repository.entity.Distribution.DecreaseRate, com.tools20022.repository.entity.Distribution.OfferPriceFixingDate);
			}
		});
		return mmObject_lazy.get();
	}
}
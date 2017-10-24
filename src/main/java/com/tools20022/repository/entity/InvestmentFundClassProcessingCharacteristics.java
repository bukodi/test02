package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 */
public class InvestmentFundClassProcessingCharacteristics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency with which the reinvestment takes place, This is the same or
	 * less than the dividend frequency,
	 */
	public static final MMBusinessAttribute ReinvestmentFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentFrequency";
			definition = "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Front end charge on subscription orders for this class can be applied.
	 */
	public static final MMBusinessAttribute FrontEndLoadIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoadIndicator";
			definition = "Front end charge on subscription orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Exit charge (eg. CDSC) on redemption orders for this class can be
	 * applied.
	 */
	public static final MMBusinessAttribute BackEndLoadIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndLoadIndicator";
			definition = "Exit charge (eg. CDSC) on redemption orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a separate fee for switching between sub-funds of the same umbrella
	 * can be applied.
	 */
	public static final MMBusinessAttribute SwitchingFeeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwitchingFeeIndicator";
			definition = "If a separate fee for switching between sub-funds of the same umbrella can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be subscribed to.
	 */
	public static final MMBusinessAttribute LimitedSubscriptionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedSubscriptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 */
	public static final MMBusinessAttribute LimitedRedemptionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedRedemptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
	 */
	public static final MMBusinessAttribute Decimalisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
	 */
	public static final MMBusinessAttribute HoldingTransferableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferableIndicator";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Physical application form is required.
	 */
	public static final MMBusinessAttribute ApplicationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationForm";
			definition = "Physical application form is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies which type of signature is required when completing an initial
	 * subscription, when completing a subsequent subscription, and when
	 * completing redemption.
	 */
	public static final MMBusinessAttribute SignatureRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureRequired";
			definition = "Specifies which type of signature is required when completing an initial subscription, when completing a subsequent subscription, and when completing redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SignatureTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether subscriptions/redemption in amount are allowed.
	 */
	public static final MMBusinessAttribute AmountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether subscriptions/redemption in amount are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether subsciptions/redemption may be placed as a number of
	 * units.
	 */
	public static final MMBusinessAttribute UnitsIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsIndicator";
			definition = "Indicates whether subsciptions/redemption may be placed as a number of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Last date/time at which an order to subscribe or an order to redeem can
	 * be given.
	 */
	public static final MMBusinessAttribute OrderCutOffDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderCutOffDateTime";
			definition = "Last date/time at which an order to subscribe or an order to redeem can be given.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period <br>
	 * Where T = the date the price is applied to a transaction.
	 */
	public static final MMBusinessAssociationEnd SettlementCycle = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCycle";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \r\nWhere T = the date the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TimeFrame.mmObject();
		}
	};
	/**
	 * Investment fund class for which processing characteristics are specified.
	 */
	public static final MMBusinessAssociationEnd FundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundClass";
			definition = "Investment fund class for which processing characteristics are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
	 */
	public static final MMBusinessAttribute HoldingTransferable = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferable";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HoldingTransferableCode.mmObject();
		}
	};
	/**
	 * Frequency at which the subscriptions and redemptions are done.
	 */
	public static final MMBusinessAttribute DealingFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingFrequency";
			definition = "Frequency at which the subscriptions and redemptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 */
	public static final MMBusinessAttribute LimitedPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Account used for settlement of fund transactions.
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Account used for settlement of fund transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Country in which the processing characteristic applies.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	/**
	 * Context, or geographic environment, in which trading parties may meet in
	 * order to negotiate and execute trades among themselves.
	 */
	public static final MMBusinessAssociationEnd LocalMarketAnnex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalMarketAnnex";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Date/time as from which the processing characteristics are valid.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time as from which the processing characteristics are valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Physical application form for subsequent investments by the same
	 * investor.
	 */
	public static final MMBusinessAttribute SubsequentSubscriptionApplicationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubsequentSubscriptionApplicationForm";
			definition = "Physical application form for subsequent investments by the same investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Physical written instruction/renunciation form for redemption of
	 * units/shares by the investor.
	 */
	public static final MMBusinessAttribute RedemptionForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionForm";
			definition = "Physical written instruction/renunciation form for redemption of units/shares by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency in which a subscription or redemption is accepted.
	 */
	public static final MMBusinessAttribute DealingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingCurrency";
			definition = "Currency in which a subscription or redemption is accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the number of days for cut off before or after an activity.
	 */
	public static final MMBusinessAssociationEnd DealingCutOffTimeFrame = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "Specifies the number of days for cut off before or after an activity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TimeFrame.mmObject();
		}
	};
	/**
	 * Minimum value of units that must be maintained to avoid automatic
	 * redemption.
	 */
	public static final MMBusinessAttribute MinimumHoldingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingAmount";
			definition = "Minimum value of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum number of shares/units that may be redeemed on a single dealing
	 * day.
	 */
	public static final MMBusinessAttribute MaximumRedemptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionUnits";
			definition = "Maximum number of shares/units that may be redeemed on a single dealing day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum number of units that must be maintained to avoid automatic
	 * redemption.
	 */
	public static final MMBusinessAttribute MinimumHoldingUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingUnits";
			definition = "Minimum number of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum value of units/shares that must be retained to avoid automatic
	 * redemption.
	 */
	public static final MMBusinessAttribute MinimumRemainingHoldingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRemainingHoldingAmount";
			definition = "Minimum value of units/shares that must be retained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum quantity of securities, expressed as a percentage that can be
	 * sold.
	 */
	public static final MMBusinessAttribute MaximumRedemptionPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionPercentage";
			definition = "Maximum quantity of securities, expressed as a percentage that can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum quantity of securities, expressed as an amount that can be sold.
	 */
	public static final MMBusinessAttribute MaximumRedemptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionAmount";
			definition = "Maximum quantity of securities, expressed as an amount that can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum initial number of units/shares that must be purchased.
	 */
	public static final MMBusinessAttribute MinimumInitialSubscriptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionUnits";
			definition = "Minimum initial number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities, expressed as an amount that must be
	 * purchased.
	 */
	public static final MMBusinessAttribute MinimumSubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionAmount";
			definition = "Minimum quantity of securities, expressed as an amount that must be purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum initial quantity of securities, expressed as an amount that must
	 * be purchased at subscription.
	 */
	public static final MMBusinessAttribute MinimumInitialSubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionAmount";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum number of units/shares that must be purchase by existing
	 * investors.
	 */
	public static final MMBusinessAttribute MinimumSubscriptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionUnits";
			definition = "Minimum number of units/shares that must be purchase by existing investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Description of a period, that may be a number of days, weeks or
	 * descriptive period during which the units/shares must be held following
	 * their issue before redemption will be permitted.
	 */
	public static final MMBusinessAttribute MinimumHoldingPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingPeriod";
			definition = "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClassProcessingCharacteristics";
				definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics, com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing, com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing,
						com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics, com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.ReinvestmentFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FrontEndLoadIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.BackEndLoadIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SwitchingFeeIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedSubscriptionPeriod,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedRedemptionPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Decimalisation,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.HoldingTransferableIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.ApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SignatureRequired, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.AmountIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.UnitsIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.OrderCutOffDateTime,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.HoldingTransferable, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.EffectiveDate, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SubsequentSubscriptionApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.RedemptionForm, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCurrency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionUnits, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumRemainingHoldingAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionPercentage,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingPeriod);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 */
public class Security extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Way(s) of identifying the security.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Way(s) of identifying the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}
	};
	/**
	 * Country in which the processing characteristic applies.
	 */
	public static final MMBusinessAttribute RegisteredDistributionCountry = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Currency in which a security is issued or redenominated.
	 */
	public static final MMBusinessAttribute DenominationCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the form, ie, ownership, of the security.
	 */
	public static final MMBusinessAttribute RegistrationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurityCode.mmObject();
		}
	};
	/**
	 * Indicates whether a security exists only as an electronic record, ie,
	 * there is no physical document representing the security.
	 */
	public static final MMBusinessAttribute DematerialisedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the investment fund class is subject to the European
	 * Union Saving Directive.
	 */
	public static final MMBusinessAttribute EUSavingsDirective = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirectiveCode.mmObject();
		}
	};
	/**
	 * Specifies the quantity associated with a security.
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Specifies the quantity associated with a security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Fees related to securities.
	 */
	public static final MMBusinessAssociationEnd Fees = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRelatedFees.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesRelatedFees.mmObject();
		}
	};
	/**
	 * Information on the price of the security.
	 */
	public static final MMBusinessAssociationEnd Pricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pricing";
			definition = "Information on the price of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Account on which the security is held.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the security is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Market(s) on which the security is traded.
	 */
	public static final MMBusinessAssociationEnd TradingMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingMarket";
			definition = "Market(s) on which the security is traded.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	/**
	 * Market(s) on which the security is listed.
	 */
	public static final MMBusinessAssociationEnd PlaceOfListing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.ListedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	/**
	 * Information related to registration of securities.
	 */
	public static final MMBusinessAssociationEnd Registration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registration";
			definition = "Information related to registration of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}
	};
	/**
	 * Regulatory restriction(s) linked to the security.
	 */
	public static final MMBusinessAssociationEnd Restriction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restriction";
			definition = "Regulatory restriction(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesRestriction.mmObject();
		}
	};
	/**
	 * Corporate event linked to the security
	 */
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event linked to the security";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Specifies that the security is a temporary security.
	 */
	public static final MMBusinessAttribute TemporaryFinancialInstrumentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which securities become available for sale.
	 */
	public static final MMBusinessAttribute AvailableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableDate";
			definition = "Date on which securities become available for sale.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Provides declaration details narrative relative to the financial
	 * instrument, eg, beneficial ownership.
	 */
	public static final MMBusinessAttribute DeclarationDetails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Spread that uses the security as benchmark reference.
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread that uses the security as benchmark reference.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.BenchmarkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	/**
	 * Dividend per financial instrument.
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend per financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	/**
	 * Balance of the account which holds a specific security.
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account which holds a specific security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Indicates whether a security is interchangeable, ie, the security is
	 * allowed to be replaced by another security, without loss of value.
	 */
	public static final MMBusinessAttribute FungibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FungibleIndicator";
			definition = "Indicates whether a security is interchangeable, ie, the security is allowed to be replaced by another security, without loss of value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the deliverability of a security.
	 */
	public static final MMBusinessAttribute Appearance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AppearanceCode.mmObject();
		}
	};
	/**
	 * Position limit in the near-term contract for a given exchange-traded
	 * product.
	 */
	public static final MMBusinessAttribute NearTermPositionLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NearTermPositionLimit";
			definition = "Position limit in the near-term contract for a given exchange-traded product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies when the contract (i.e. MBS/TBA) will settle.
	 */
	public static final MMBusinessAttribute ContractSettlementMonth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Minimum price increase for a given exchange-traded Instrument
	 */
	public static final MMBusinessAttribute MinimumTradingPricingIncrement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Minimum price increase for a given exchange-traded Instrument";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Rating(s) of the security.
	 */
	public static final MMBusinessAssociationEnd Rating = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating(s) of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	/**
	 * Coupon information of the security.
	 */
	public static final MMBusinessAssociationEnd CouponAttached = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CouponAttached";
			definition = "Coupon information of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CouponAttached.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
		}
	};
	/**
	 * Indicates the market sector the security is classified as
	 * pharmaceuticals, automobile, housing, etc.
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Indicates the market sector the security is classified as pharmaceuticals, automobile, housing, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	/**
	 * Indicates whether the warrants on a financial instrument (which has been
	 * traded cum warrants) will be attached on delivery.
	 */
	public static final MMBusinessAttribute WarrantAttachedOnDelivery = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WarrantAttachedOnDelivery";
			definition = "Indicates whether the warrants on a financial instrument (which has been traded cum warrants) will be attached on delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the interest is separable from the principal.
	 */
	public static final MMBusinessAttribute StrippableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrippableIndicator";
			definition = "Indicates whether the interest is separable from the principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which new securities begin trading.
	 */
	public static final MMBusinessAttribute FirstDealingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstDealingDate";
			definition = "Date on which new securities begin trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Tax details of the security.
	 */
	public static final MMBusinessAssociationEnd TaxDetails = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDetails";
			definition = "Tax details of the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}
	};
	/**
	 * Trade in which the security is involved.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade in which the security is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) in which the
	 * security is legally recorded for regulatory and/or tax purposes.
	 */
	public static final MMBusinessAssociationEnd RegistrationJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationJurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) in which the security is legally recorded for regulatory and/or tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}
	};
	/**
	 * Specifies roles played by a party that are linked to the handling of
	 * securities but not related to a specific process.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPartyRole.mmObject();
		}
	};
	/**
	 * Specifies the status of the security within its lifecycle.
	 */
	public static final MMBusinessAssociationEnd SecurityStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesStatus.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesStatus.mmObject();
		}
	};
	/**
	 * Modification process which applies to a specific security.
	 */
	public static final MMBusinessAssociationEnd Modification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Modification";
			definition = "Modification process which applies to a specific security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesModification.mmObject();
		}
	};
	/**
	 * RedemptionSchedule(s) linked to the security.
	 */
	public static final MMBusinessAssociationEnd RedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "RedemptionSchedule(s) linked to the security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	/**
	 * Settlement of a specific security.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Transfer process in which that security is transferred..
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process in which that security is transferred..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Standing instructions related to the security in the context of corporate
	 * action.
	 */
	public static final MMBusinessAssociationEnd CorporateActionStandingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstructions";
			definition = "Standing instructions related to the security in the context of corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
		}
	};
	/**
	 * Quote of a security.
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	/**
	 * Order for which a specific security is indicated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a specific security is indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Variable interest parameters specified for interest related to a
	 * financial instrument.
	 */
	public static final MMBusinessAssociationEnd RelatedVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedVariableInterest";
			definition = "Variable interest parameters specified for interest related to a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.BenchmarkReference;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VariableInterest.mmObject();
		}
	};
	/**
	 * Information on the conversion exchange of an entitlement or of preferred
	 * equities or of convertible bonds, into another form of securities,
	 * usually common equities.
	 */
	public static final MMBusinessAssociationEnd Conversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Conversion";
			definition = "Information on the conversion exchange of an entitlement or of preferred equities or of convertible bonds, into another form of securities, usually common equities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * The security is part of the component security.
	 */
	public static final MMBusinessAssociationEnd ComponentSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "The security is part of the component security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	/**
	 * Indicates whether the interest and the principal can be recomposed. This
	 * is the reverse operation of stripping.
	 */
	public static final MMBusinessAttribute RecompositionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecompositionIndicator";
			definition = "Indicates whether the interest and the principal can be recomposed. This is the reverse operation of stripping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifier that links multiple security classes.
	 */
	public static final MMBusinessAttribute Series = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Identifier that links multiple security classes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Percentage of the underlying assets of a fund that represents a debt and
	 * is in the scope of the EU Savings directive.
	 */
	public static final MMBusinessAttribute PercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt and is in the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of dividends the issuer intends to pay out the following year
	 * based on their normalised earnings.
	 */
	public static final MMBusinessAttribute CoverRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverRate";
			definition = "Amount of dividends the issuer intends to pay out the following year based on their normalised earnings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Return of an investor's principal in a security at maturity.
	 */
	public static final MMBusinessAttribute MaturityRedemption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityRedemption";
			definition = "Return of an investor's principal in a security at maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MaturityRedemptionTypeCode.mmObject();
		}
	};
	/**
	 * Margin call for which the associated securities are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginCall";
			definition = "Margin call for which the associated securities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.Security;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}
	};
	/**
	 * Situation in which two entities are linked because one of these entities
	 * owns some of the capital of the other one, or has a control relationship
	 * with it.
	 */
	public static final MMBusinessAssociationEnd CloseLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLink";
			definition = "Situation in which two entities are linked because one of these entities owns some of the capital of the other one, or has a control relationship with it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.CloseLinkSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}
	};
	/**
	 * Indicates that the security is intended to be held in a manner that could
	 * allow the Eurosystem eligibility.
	 */
	public static final MMBusinessAttribute PotentialEuroSystemEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentialEuroSystemEligibility";
			definition = "Indicates that the security is intended to be held in a manner that could allow the Eurosystem eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable quantity of a security.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Indicates the minimum tradable quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144 of the
	 * Securities and Exchange Commission,that sets the conditions under which
	 * restricted, unregistered and control securities can be sold).
	 */
	public static final MMBusinessAttribute RestrictedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Security.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictedIndicator";
			definition = "Identifies if the securities is restricted or not (as per Rule 144 of the Securities and Exchange Commission,that sets the conditions under which restricted, unregistered and control securities can be sold).";
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
				name = "Security";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity, com.tools20022.repository.entity.Dividend.Security,
						com.tools20022.repository.entity.SecuritiesPricing.Security, com.tools20022.repository.entity.Party.CloseLinkSecurity, com.tools20022.repository.entity.RedemptionSchedule.Security,
						com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.ListedSecurity, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesTax.Security, com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt,
						com.tools20022.repository.entity.SecuritiesTrade.Security, com.tools20022.repository.entity.SecuritiesTransfer.Security, com.tools20022.repository.entity.SecuritiesPartyRole.Security,
						com.tools20022.repository.entity.SecuritiesSettlement.Security, com.tools20022.repository.entity.SecuritiesRelatedFees.Security, com.tools20022.repository.entity.SecuritiesStatus.Security,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.CouponAttached.Security, com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.Security, com.tools20022.repository.entity.SecuritiesRestriction.Security, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.CorporateActionEvent.UnderlyingSecurity, com.tools20022.repository.entity.SecuritiesModification.NewSecurityReferenceData, com.tools20022.repository.entity.Spread.BenchmarkSecurity,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.Rating.Security, com.tools20022.repository.entity.Sector.Security,
						com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.Quote.QuotedSecurity, com.tools20022.repository.entity.ComponentSecurity.Security);
				subType_lazy = () -> Arrays.asList(InvestmentFundClass.mmObject(), Debt.mmObject(), Warrant.mmObject(), Entitlement.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Identification, com.tools20022.repository.entity.Security.RegisteredDistributionCountry,
						com.tools20022.repository.entity.Security.DenominationCurrency, com.tools20022.repository.entity.Security.RegistrationForm, com.tools20022.repository.entity.Security.DematerialisedIndicator,
						com.tools20022.repository.entity.Security.EUSavingsDirective, com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.Fees,
						com.tools20022.repository.entity.Security.Pricing, com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.Security.TradingMarket,
						com.tools20022.repository.entity.Security.PlaceOfListing, com.tools20022.repository.entity.Security.Registration, com.tools20022.repository.entity.Security.Restriction,
						com.tools20022.repository.entity.Security.CorporateEvent, com.tools20022.repository.entity.Security.TemporaryFinancialInstrumentIndicator, com.tools20022.repository.entity.Security.AvailableDate,
						com.tools20022.repository.entity.Security.DeclarationDetails, com.tools20022.repository.entity.Security.Spread, com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Security.Balance,
						com.tools20022.repository.entity.Security.FungibleIndicator, com.tools20022.repository.entity.Security.Appearance, com.tools20022.repository.entity.Security.NearTermPositionLimit,
						com.tools20022.repository.entity.Security.ContractSettlementMonth, com.tools20022.repository.entity.Security.MinimumTradingPricingIncrement, com.tools20022.repository.entity.Security.Rating,
						com.tools20022.repository.entity.Security.CouponAttached, com.tools20022.repository.entity.Security.Sector, com.tools20022.repository.entity.Security.WarrantAttachedOnDelivery,
						com.tools20022.repository.entity.Security.StrippableIndicator, com.tools20022.repository.entity.Security.FirstDealingDate, com.tools20022.repository.entity.Security.TaxDetails,
						com.tools20022.repository.entity.Security.SecuritiesTrade, com.tools20022.repository.entity.Security.RegistrationJurisdiction, com.tools20022.repository.entity.Security.PartyRole,
						com.tools20022.repository.entity.Security.SecurityStatus, com.tools20022.repository.entity.Security.Modification, com.tools20022.repository.entity.Security.RedemptionSchedule,
						com.tools20022.repository.entity.Security.SecuritiesSettlement, com.tools20022.repository.entity.Security.SecuritiesTransfer, com.tools20022.repository.entity.Security.CorporateActionStandingInstructions,
						com.tools20022.repository.entity.Security.Quote, com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.Security.RelatedVariableInterest,
						com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.Security.ComponentSecurity, com.tools20022.repository.entity.Security.RecompositionIndicator,
						com.tools20022.repository.entity.Security.Series, com.tools20022.repository.entity.Security.PercentageOfDebtClaim, com.tools20022.repository.entity.Security.CoverRate,
						com.tools20022.repository.entity.Security.MaturityRedemption, com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.Security.CloseLink,
						com.tools20022.repository.entity.Security.PotentialEuroSystemEligibility, com.tools20022.repository.entity.Security.MinimumQuantity, com.tools20022.repository.entity.Security.RestrictedIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}
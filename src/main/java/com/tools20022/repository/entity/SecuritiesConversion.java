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
 * Conversion exchange of securities, generally convertible bonds or preferred
 * equities, into another form of securities, usually common equities.
 */
public class SecuritiesConversion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price of one target security in the conversion.
	 */
	public static final MMBusinessAssociationEnd ConversionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Deadline by which a convertible security must be converted according to
	 * the terms of the issue.
	 */
	public static final MMBusinessAttribute ConversionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Minimum quantity of financial instrument or lot of rights/warrants that
	 * must be exercised.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Minimum multiple quantity of financial instrument or lot of
	 * rights/warrants that must be exercised.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the conversion type of an instrument.
	 */
	public static final MMBusinessAttribute ConversionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConversionTypeCode.mmObject();
		}
	};
	/**
	 * Period during which a convertible security may be converted according to
	 * the terms of the issue.
	 */
	public static final MMBusinessAssociationEnd ConversionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Number of held securities for the conversion.
	 */
	public static final MMBusinessAssociationEnd ConversionRatioDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Number of target securities for the conversion.
	 */
	public static final MMBusinessAssociationEnd ConversionRatioNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Ratio applied to convert the related security.
	 */
	public static final MMBusinessAssociationEnd Ratio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 */
	public static final MMBusinessAssociationEnd ConversionUnitCurrency = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionUnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Option for which securities conversion information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option for which securities conversion information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.OptionConversionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Option.mmObject();
		}
	};
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};
	/**
	 * Specifies whether the conversion is mandatory or optional.
	 */
	public static final MMBusinessAttribute ConversionChoice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionChoice";
			definition = "Specifies whether the conversion is mandatory or optional.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}
	};
	/**
	 * Currency exchange rate between the bond currency and the underlying
	 * equity currency used to calculate the convertion ratio.
	 */
	public static final MMBusinessAttribute ConversionFixedExchangeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionFixedExchangeRate";
			definition = "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of cash needed for the conversion.
	 */
	public static final MMBusinessAttribute ConversionMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionMarginAmount";
			definition = "Amount of cash needed for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies information about the choices offered to the holder of a
	 * conversion.
	 */
	public static final MMBusinessAttribute ConversionOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionOption";
			definition = "Specifies information about the choices offered to the holder of a conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
	 */
	public static final MMBusinessAttribute ConversionQuotedCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionQuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Minimum number of days that must be given by either the issuer or the
	 * holder before conversion can take place.
	 */
	public static final MMBusinessAttribute MinimumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of days that must be given by either the issuer or the holder before conversion can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of notice period.
	 */
	public static final MMBusinessAttribute NoticePeriodType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the security is protected against dilution with regards
	 * to capital events.
	 */
	public static final MMBusinessAttribute ProtectionAgainstDilutionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectionAgainstDilutionIndicator";
			definition = "Indicates whether the security is protected against dilution with regards to capital events.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the bond is convertible into an equity and back to the
	 * bond.
	 */
	public static final MMBusinessAttribute ReverseConversionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseConversionIndicator";
			definition = "Indicates whether the bond is convertible into an equity and back to the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * ISIN identification of the related financial instrument into which this
	 * security can be converted.
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Conversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Specifies if the issuer or the holder are allowed to convert the security
	 * into another one.
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies if the issuer or the holder are allowed to convert the security into another one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Ratio or multiplying factor used to convert one contract into a quantity.
	 */
	public static final MMBusinessAttribute ContractSize = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesConversion";
				definition = "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion,
						com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.Option.OptionConversionInformation,
						com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesConversion.ConversionDate,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.ConversionType,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator, com.tools20022.repository.entity.SecuritiesConversion.Ratio,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.SecuritiesConversion.BusinessDayConvention, com.tools20022.repository.entity.SecuritiesConversion.ConversionChoice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionFixedExchangeRate, com.tools20022.repository.entity.SecuritiesConversion.ConversionMarginAmount,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionOption, com.tools20022.repository.entity.SecuritiesConversion.ConversionQuotedCurrency,
						com.tools20022.repository.entity.SecuritiesConversion.FinancialCenter, com.tools20022.repository.entity.SecuritiesConversion.MinimumNoticeDays, com.tools20022.repository.entity.SecuritiesConversion.NoticePeriodType,
						com.tools20022.repository.entity.SecuritiesConversion.ProtectionAgainstDilutionIndicator, com.tools20022.repository.entity.SecuritiesConversion.ReverseConversionIndicator,
						com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification, com.tools20022.repository.entity.SecuritiesConversion.PartyType, com.tools20022.repository.entity.SecuritiesConversion.ContractSize);
			}
		});
		return mmObject_lazy.get();
	}
}
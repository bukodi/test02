package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Derivative;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 */
public class Option extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method under which assignment was conducted.
	 */
	public static final MMBusinessAttribute InstrumentAssignmentMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}
	};
	/**
	 * Specifies whether the option contract settles at the open or close of the
	 * market.
	 */
	public static final MMBusinessAttribute SettleStyle = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}
	};
	/**
	 * Specifies whether the terms of the security (underlying instruments,
	 * expiration date, contract size) are defined according to the exchange
	 * specifications or whether they can be user defined.
	 */
	public static final MMBusinessAttribute Standardisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of listed option contracts on a single
	 * security which can be held by an investor or group of investors acting
	 * jointly.
	 */
	public static final MMBusinessAttribute PositionLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of underlying to which the option relates.
	 */
	public static final MMBusinessAttribute UnderlyingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the underlying financial instrument of an option is
	 * owned by the writer of the option.
	 */
	public static final MMBusinessAttribute CoverIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information on the conversion exchange of an option into another form of
	 * securities.
	 */
	public static final MMBusinessAssociationEnd OptionConversionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Expresses the risk of an option leg. Value must be between -1 and 1. A
	 * Call Option will require a ratio value between 0 and 1. A Put Option will
	 * require a ratio value between -1 and 0.
	 */
	public static final MMBusinessAttribute OptionRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the trade elements for the option.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOptionTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
		}
	};
	/**
	 * Indicates whether the trade is to be settled as principal or netted off
	 * against another trade.
	 */
	public static final MMBusinessAttribute SettlementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}
	};
	/**
	 * Multiplier applied to the strike price for the purpose of calculating the
	 * settlement value (Used for derivatives).
	 */
	public static final MMBusinessAttribute StrikeMultiplier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Financial center where option expires.
	 */
	public static final MMBusinessAttribute ExpiryLocation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Date on which the trade is settled. i.e., the amounts are due.
	 */
	public static final MMBusinessAttribute FinalSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies how an option can be exercised (American, European, Bermudan)
	 */
	public static final MMBusinessAttribute OptionStyle = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}
	};
	/**
	 * Information specific to a currency option.
	 */
	public static final MMBusinessAssociationEnd CurrencyOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.OptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	/**
	 * First date on which an american option can be exercised.
	 */
	public static final MMBusinessAttribute EarliestExerciseDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Number of business days between the hit date and the payment date in case
	 * of settlement at hit.
	 */
	public static final MMBusinessAttribute SettlementDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Predetermined price at which the holder will have to buy or sell the
	 * underlying instrument.
	 */
	public static final MMBusinessAssociationEnd StrikePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}
	};
	/**
	 * First date on which an option becomes effective.
	 */
	public static final MMBusinessAttribute OptionStartDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * For European options, date on which the option holder can only exercise
	 * the right or let it lapse. For American options, the option holder can
	 * exercise the right up to the expiry date.
	 */
	public static final MMBusinessAttribute ExpiryDateAndTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether it is a Call option (right to purchase a specific
	 * underlying asset) or a Put option (right to sell a specific underlying
	 * asset).
	 */
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}
	};
	/**
	 * Number of shares/units for the financial instrument involved in the
	 * option trade (Used for derivatives).
	 */
	public static final MMBusinessAttribute StrikeValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies how settlement will take place for instance at expiration or at
	 * hit.
	 */
	public static final MMBusinessAttribute SettlementPeriodType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Option.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.Option, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.CurrencyOption.OptionDefinition, com.tools20022.repository.entity.SecuritiesOptionTrade.Option);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Option.InstrumentAssignmentMethod, com.tools20022.repository.entity.Option.SettleStyle, com.tools20022.repository.entity.Option.Standardisation,
						com.tools20022.repository.entity.Option.PositionLimit, com.tools20022.repository.entity.Option.UnderlyingType, com.tools20022.repository.entity.Option.CoverIndicator,
						com.tools20022.repository.entity.Option.OptionConversionInformation, com.tools20022.repository.entity.Option.OptionRatio, com.tools20022.repository.entity.Option.SecuritiesOptionTrade,
						com.tools20022.repository.entity.Option.SettlementType, com.tools20022.repository.entity.Option.StrikeMultiplier, com.tools20022.repository.entity.Option.ExpiryLocation,
						com.tools20022.repository.entity.Option.FinalSettlementDate, com.tools20022.repository.entity.Option.OptionStyle, com.tools20022.repository.entity.Option.CurrencyOption,
						com.tools20022.repository.entity.Option.EarliestExerciseDate, com.tools20022.repository.entity.Option.SettlementDays, com.tools20022.repository.entity.Option.StrikePrice,
						com.tools20022.repository.entity.Option.OptionStartDate, com.tools20022.repository.entity.Option.ExpiryDateAndTime, com.tools20022.repository.entity.Option.OptionType,
						com.tools20022.repository.entity.Option.StrikeValue, com.tools20022.repository.entity.Option.SettlementPeriodType);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, a dividend option or valuation currency.
 */
public class InvestmentFundClass extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, eg, front end or back end, an income policy, eg,
	 * pay out or accumulate, or a trailer policy, eg, with or without. Fund
	 * classes are typically denoted by a single character, eg, 'Class A',
	 * 'Class 2'.
	 */
	public static final MMBusinessAttribute ClassType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Income policy relating to a class type, ie, if income is paid out or
	 * retained in the fund.
	 */
	public static final MMBusinessAttribute DistributionPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Dividend policy of the fund, eg, cash, units.
	 */
	public static final MMBusinessAttribute DividendPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendPolicyCode.mmObject();
		}
	};
	/**
	 * Indicates whether the fund has two prices.
	 */
	public static final MMBusinessAttribute DualFundIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
	 */
	public static final MMBusinessAttribute RequestedNAVCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency of the investment fund class.
	 */
	public static final MMBusinessAttribute TradingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Investment fund which is related to the investment fund class.
	 */
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Investment fund which is related to the investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	/**
	 * Indicates whether or not it is possible to hold bearer units/shares in
	 * this class in certified form
	 */
	public static final MMBusinessAttribute PhysicalBearerSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicates whether or not it is possible to hold bearer units/shares in this class in certified form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold bearer units/shares in
	 * paperless form
	 */
	public static final MMBusinessAttribute DematerialisedBearerSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
	 */
	public static final MMBusinessAttribute PhysicalRegisteredSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicate whether or not it is possible to hold registered units/shares in
	 * this class in paperless form
	 */
	public static final MMBusinessAttribute DematerialisedRegisteredSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Processing characteristics linked to the investment fund class, ie, not
	 * to the market.
	 */
	public static final MMBusinessAssociationEnd ProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingCharacteristics";
			definition = "Processing characteristics linked to the investment fund class, ie, not to  the market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	/**
	 * Company specific description of a group of funds.
	 */
	public static final MMBusinessAttribute ProductGroup = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Account which holds investment fund classes.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account which holds investment fund classes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	/**
	 * Calculation of the value of the fund.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation of the value of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Transaction which is related to the fund class.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is related to the fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	/**
	 * Date that identifies the issue of a fund series. Typically applicable to
	 * a redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 */
	public static final MMBusinessAttribute SeriesIssueIdentificationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesIssueIdentificationDate";
			definition = "Date that identifies the issue of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identifies the name of a fund series. Typically applicable to a
	 * redemption or order confirmation, but may be specified in the
	 * subscription, if known.
	 */
	public static final MMBusinessAttribute SeriesName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeriesName";
			definition = "Identifies the name of a fund series. Typically applicable to a redemption or order confirmation, but may be specified in the subscription, if known.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates that the financial instrument and/or series included in the
	 * message is a new issue.
	 */
	public static final MMBusinessAttribute NewIssueIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssueIndicator";
			definition = "Indicates that the financial instrument and/or series included in the message is a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 */
	public static final MMBusinessAssociationEnd Equalisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Equalisation.RelatedInvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
		}
	};
	/**
	 * Additional amount of money (top-up amount) required to meet the minimum
	 * subscription amount.
	 */
	public static final MMBusinessAttribute TopUpAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the redemption amount subject to hold back.
	 */
	public static final MMBusinessAttribute HoldBackAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackAmount";
			definition = "Value of the redemption amount subject to hold back.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which the hold back amount is to be released.
	 */
	public static final MMBusinessAttribute HoldBackReleaseDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldBackReleaseDate";
			definition = "Date on which the hold back amount is to be released.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Description of the lot.
	 */
	public static final MMBusinessAttribute LotDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotDescription";
			definition = "Description of the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Method of classifying a fund.
	 */
	public static final MMBusinessAssociationEnd FundClassification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundClassification";
			definition = "Method of classifying a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Specifies the type of assets in which the fund invests.
	 */
	public static final MMBusinessAttribute UnderlyingAssetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAssetType";
			definition = "Specifies the type of assets in which the fund invests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
		}
	};
	/**
	 * Type of investor that can invest in the fund class.
	 */
	public static final MMBusinessAttribute InvestorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that can invest in the fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};
	/**
	 * Reinvestment information which involves this investment fund class.
	 */
	public static final MMBusinessAssociationEnd Reinvestment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information which involves this investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.InvestmentFundClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};
	/**
	 * Investment fund class currently held by shareholders.
	 */
	public static final MMBusinessAttribute OutstandingUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundClass.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutstandingUnits";
			definition = "Investment fund class currently held by shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClass";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, a dividend option or valuation currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass, com.tools20022.repository.entity.NetAssetValueCalculation.RelatedFund,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass, com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass,
						com.tools20022.repository.entity.Equalisation.RelatedInvestmentFundTransaction, com.tools20022.repository.entity.Reinvestment.InvestmentFundClass);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.ClassType, com.tools20022.repository.entity.InvestmentFundClass.DistributionPolicy,
						com.tools20022.repository.entity.InvestmentFundClass.DividendPolicy, com.tools20022.repository.entity.InvestmentFundClass.DualFundIndicator, com.tools20022.repository.entity.InvestmentFundClass.RequestedNAVCurrency,
						com.tools20022.repository.entity.InvestmentFundClass.TradingCurrency, com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund,
						com.tools20022.repository.entity.InvestmentFundClass.PhysicalBearerSecurities, com.tools20022.repository.entity.InvestmentFundClass.DematerialisedBearerSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.PhysicalRegisteredSecurities, com.tools20022.repository.entity.InvestmentFundClass.DematerialisedRegisteredSecurities,
						com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics, com.tools20022.repository.entity.InvestmentFundClass.ProductGroup,
						com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundClass.NetAssetValueCalculation,
						com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentFundClass.SeriesIssueIdentificationDate,
						com.tools20022.repository.entity.InvestmentFundClass.SeriesName, com.tools20022.repository.entity.InvestmentFundClass.NewIssueIndicator, com.tools20022.repository.entity.InvestmentFundClass.Equalisation,
						com.tools20022.repository.entity.InvestmentFundClass.TopUpAmount, com.tools20022.repository.entity.InvestmentFundClass.HoldBackAmount, com.tools20022.repository.entity.InvestmentFundClass.HoldBackReleaseDate,
						com.tools20022.repository.entity.InvestmentFundClass.LotDescription, com.tools20022.repository.entity.InvestmentFundClass.FundClassification, com.tools20022.repository.entity.InvestmentFundClass.UnderlyingAssetType,
						com.tools20022.repository.entity.InvestmentFundClass.InvestorType, com.tools20022.repository.entity.InvestmentFundClass.Reinvestment, com.tools20022.repository.entity.InvestmentFundClass.OutstandingUnits);
			}
		});
		return mmObject_lazy.get();
	}
}
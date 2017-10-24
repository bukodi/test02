package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.ExchangeRate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed to process a currency exchange or conversion.
 */
public class CurrencyExchange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount in its original currency when conversion from/into another
	 * currency has occurred.
	 */
	public static final MMBusinessAttribute OriginalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Trade which uses the specified exchange rate.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 */
	public static final MMBusinessAttribute UnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRate1.UnitCurrency);
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
	 */
	public static final MMBusinessAttribute QuotedCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * The value of one currency expressed in relation to another currency.
	 * ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency
	 * (ExchangeRate = UnitCurrency/QuotedCurrency).
	 */
	public static final MMBusinessAttribute ExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRate1.ExchangeRate);
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of money resulting from a foreign exchange transaction.
	 */
	public static final MMBusinessAttribute ResultingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified an exchange
	 * rate for the payment in a currency different from the announced one.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Specifies a securities balance which used a specific exchange rate.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Date and time at which an exchange rate is quoted.
	 */
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Asset value calculated in a different currency.
	 */
	public static final MMBusinessAssociationEnd CalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}
	};
	/**
	 * Currency of the amount to be converted in a currency conversion.
	 */
	public static final MMBusinessAttribute SourceCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which an amount is to be converted in a currency
	 * conversion.
	 */
	public static final MMBusinessAttribute TargetCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Cash entry to which the currency exchange parameters apply.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}
	};
	/**
	 * Payment for which currency exchange parameters are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Specifies the type used to complete the currency exchange.
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRate1.RateType);
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}
	};
	/**
	 * Limit for which an exchange rate is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LiquidityManagementLimit.mmObject();
		}
	};
	/**
	 * Set of parameters used to calculate a rate for instance, the fixing rate
	 * to be applied to a non-deliverable agreement.
	 */
	public static final MMBusinessAssociationEnd FixingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.FixingRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FixingCondition.mmObject();
		}
	};
	/**
	 * Tax for which exchange information is provided.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * Invoice for which currency exchange information is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}
	};
	/**
	 * Set of applications which use currency exchange information.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TransactionAdministrator.mmObject();
		}
	};
	/**
	 * Specifies the account which uses an exchange rate to report entries and
	 * balances.
	 */
	public static final MMBusinessAssociationEnd ReportedAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Cash entitlement for which an exchange rate is specified.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionCashEntitlement.mmObject();
		}
	};
	/**
	 * Payment execution process for which currrency exchange information is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	/**
	 * Quote which uses currency exchange information.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Securities conversion for which a conversion currency is specified.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Cash distribution for which a conversion currency is specified.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashDistribution.mmObject();
		}
	};
	/**
	 * Fees or commission applied to the currency exchange.<br>
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Adjustment.CurrencyExchange,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.AssetHolding.ExchangeRate,
						com.tools20022.repository.entity.PaymentExecution.CurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange, com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate, com.tools20022.repository.entity.FixingCondition.FixingRate, com.tools20022.repository.entity.Invoice.CurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange, com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation,
						com.tools20022.repository.entity.Quote.QuotedRate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.OriginalAmount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.UnitCurrency, com.tools20022.repository.entity.CurrencyExchange.QuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.ExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.ResultingAmount, com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.QuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.SourceCurrency, com.tools20022.repository.entity.CurrencyExchange.TargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.CurrencyExchange.RateType,
						com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.FixingConditions, com.tools20022.repository.entity.CurrencyExchange.Tax,
						com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.ReportedAccount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.Adjustment);
				derivationComponent_lazy = () -> Arrays.asList(ExchangeRate1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
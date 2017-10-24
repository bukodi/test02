package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateType1Code;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CurrencyExchange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further detailed information on the exchange rate that has been used in the
 * payment transaction.
 */
public class ExchangeRate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 */
	public static final MMMessageAttribute UnitCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.UnitCurrency;
			componentContext_lazy = () -> ExchangeRate1.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * The factor used for conversion of an amount from one currency to another.
	 * This reflects the price at which one currency was bought with another
	 * currency.
	 */
	public static final MMMessageAttribute ExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.ExchangeRate;
			componentContext_lazy = () -> ExchangeRate1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Specifies the type used to complete the currency exchange.
	 */
	public static final MMMessageAttribute RateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RateType;
			componentContext_lazy = () -> ExchangeRate1.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExchangeRateType1Code.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference to the foreign exchange contract agreed
	 * between the initiating party/creditor and the debtor agent.
	 */
	public static final MMMessageAttribute ContractIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			componentContext_lazy = () -> ExchangeRate1.mmObject();
			isDerived = false;
			xmlTag = "CtrctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractIdentification";
			definition = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRate1.UnitCurrency, com.tools20022.repository.msg.ExchangeRate1.ExchangeRate, com.tools20022.repository.msg.ExchangeRate1.RateType,
						com.tools20022.repository.msg.ExchangeRate1.ContractIdentification);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangeRate1";
				definition = "Further detailed information on the exchange rate that has been used in the payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technique whereby a position in the underlying is traded for a futures
 * position in the physical commodity markets.
 */
public class ExchangeForPhysicalTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unexpected divergence between the price behaviour of an underlying
	 * position or portfolio and the price behaviour of a hedging position or
	 * benchmark.
	 */
	public static final MMBusinessAttribute OutsideIndex = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExchangeForPhysicalTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutsideIndex";
			definition = "Unexpected divergence between the price behaviour of an underlying position or portfolio and the price behaviour of a hedging position or benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Difference between the value of a future and the value of the underlying
	 * equities after allowing for the discounted cash flows associated with the
	 * underlying stocks.
	 */
	public static final MMBusinessAttribute FairValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExchangeForPhysicalTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FairValue";
			definition = "Difference between the value of a future and the value of the underlying equities after allowing for the discounted cash flows associated with the underlying stocks.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of a futures position involved in an Exchange For Physical trade.
	 */
	public static final MMBusinessAttribute ValueForFutures = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExchangeForPhysicalTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueForFutures";
			definition = "Value of a futures position involved in an Exchange For Physical trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Accepted value of stocks composing an index located outside its country
	 * of origin.
	 */
	public static final MMBusinessAttribute OutMainCountryIndex = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExchangeForPhysicalTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutMainCountryIndex";
			definition = "Accepted value of stocks composing an index located outside its country of origin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Order for which parameters for exchange for physical trading are
	 * specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExchangeForPhysicalTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which parameters for exchange for physical trading are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangeForPhysicalTrade";
				definition = "Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExchangeForPhysicalTrade.OutsideIndex, com.tools20022.repository.entity.ExchangeForPhysicalTrade.FairValue,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.ValueForFutures, com.tools20022.repository.entity.ExchangeForPhysicalTrade.OutMainCountryIndex,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder);
			}
		});
		return mmObject_lazy.get();
	}
}
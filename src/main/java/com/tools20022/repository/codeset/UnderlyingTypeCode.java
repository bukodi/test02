package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying financial instrument.
 */
public class UnderlyingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The underlying is an equity.
	 */
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equity";
			definition = "The underlying is an equity.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * The underlying is an index.
	 */
	public static final MMCode Index = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "The underlying is an index.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * The underlying is an interest.
	 */
	public static final MMCode Interest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "The underlying is an interest.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * The underlying is a currency.
	 */
	public static final MMCode Currency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "The underlying is a currency.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * The underlying is a precious metal.
	 */
	public static final MMCode PreciousMetal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreciousMetal";
			definition = "The underlying is a precious metal.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "PRME";
		}
	};
	/**
	 * The underlying is a future.
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "The underlying is a future.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * The underlying is an option.
	 */
	public static final MMCode Option = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "The underlying is an option.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * The underlying is a basket.
	 */
	public static final MMCode Basket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "The underlying is a basket.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "BASK";
		}
	};
	/**
	 * The underlying is a swap.
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "The underlying is a swap.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * The underlying is a commodity.
	 */
	public static final MMCode Commodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commodity";
			definition = "The underlying is a commodity.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Underlying is a stock index.
	 */
	public static final MMCode StockIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			definition = "Underlying is a stock index.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "STIX";
		}
	};
	/**
	 * Underlying is a share.
	 */
	public static final MMCode Share = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Underlying is a share.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Underlying is a dividend index.
	 */
	public static final MMCode DividendIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			definition = "Underlying is a dividend index.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Underlying is a stock dividend.
	 */
	public static final MMCode StockDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Underlying is a stock dividend.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Underlying is of other type.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Underlying is of other type.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Underlying is a volatility index.
	 */
	public static final MMCode VolatilityIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			definition = "Underlying is a volatility index.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "VOLI";
		}
	};
	/**
	 * Underlying is an exchange traded fund.
	 */
	public static final MMCode ExchangeTradedFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Underlying is an exchange traded fund.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "ETFT";
		}
	};
	/**
	 * Underlying is a bond.
	 */
	public static final MMCode Bond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Underlying is a bond.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Underlying is a future on equity.
	 */
	public static final MMCode FutureOnEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOnEquity";
			definition = "Underlying is a future on equity.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "FTEQ";
		}
	};
	/**
	 * Underlying is an option on equity.
	 */
	public static final MMCode OptionOnEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOnEquity";
			definition = "Underlying is an option on equity.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "OPEQ";
		}
	};
	/**
	 * Underlying is a bond future.
	 */
	public static final MMCode BondFuture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondFuture";
			definition = "Underlying is a bond future.";
			owner_lazy = () -> UnderlyingTypeCode.mmObject();
			codeName = "BNDF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EQUI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTypeCode";
				definition = "Specifies the underlying financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingTypeCode.Equity, com.tools20022.repository.codeset.UnderlyingTypeCode.Index, com.tools20022.repository.codeset.UnderlyingTypeCode.Interest,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Currency, com.tools20022.repository.codeset.UnderlyingTypeCode.PreciousMetal, com.tools20022.repository.codeset.UnderlyingTypeCode.Future,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Option, com.tools20022.repository.codeset.UnderlyingTypeCode.Basket, com.tools20022.repository.codeset.UnderlyingTypeCode.Swap,
						com.tools20022.repository.codeset.UnderlyingTypeCode.Commodity, com.tools20022.repository.codeset.UnderlyingTypeCode.StockIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.Share,
						com.tools20022.repository.codeset.UnderlyingTypeCode.DividendIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.StockDividend, com.tools20022.repository.codeset.UnderlyingTypeCode.Other,
						com.tools20022.repository.codeset.UnderlyingTypeCode.VolatilityIndex, com.tools20022.repository.codeset.UnderlyingTypeCode.ExchangeTradedFund, com.tools20022.repository.codeset.UnderlyingTypeCode.Bond,
						com.tools20022.repository.codeset.UnderlyingTypeCode.FutureOnEquity, com.tools20022.repository.codeset.UnderlyingTypeCode.OptionOnEquity, com.tools20022.repository.codeset.UnderlyingTypeCode.BondFuture);
			}
		});
		return mmObject_lazy.get();
	}
}
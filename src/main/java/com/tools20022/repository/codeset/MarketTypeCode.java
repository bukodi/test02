package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of place where a trade was executed, a price was sourced
 * from, an instrument is listed.
 */
public class MarketTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The place is a primary market.
	 */
	public static final MMCode PrimaryMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrimaryMarket";
			definition = "The place is a primary market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * The place is a secondary market.
	 */
	public static final MMCode SecondaryMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecondaryMarket";
			definition = "The place is a secondary market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * The place is a third market.
	 */
	public static final MMCode ThirdMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdMarket";
			definition = "The place is a third market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "THIM";
		}
	};
	/**
	 * The place is a fourth market.
	 */
	public static final MMCode FourthMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourthMarket";
			definition = "The place is a fourth market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "FOUM";
		}
	};
	/**
	 * The place is over the counter.
	 */
	public static final MMCode OverTheCounter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverTheCounter";
			definition = "The place is over the counter.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "OTCO";
		}
	};
	/**
	 * Various places.
	 */
	public static final MMCode Various = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Various";
			definition = "Various places.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * The place is a stock exchange.
	 */
	public static final MMCode StockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "The place is a stock exchange.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * The place is a fund (transfer agent, fund itself, etc.).
	 */
	public static final MMCode Fund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fund";
			definition = "The place is a fund (transfer agent, fund itself, etc.).";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * The place is a local market.
	 */
	public static final MMCode LocalMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalMarket";
			definition = "The place is a local market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "LMAR";
		}
	};
	/**
	 * The place is theoretical.
	 */
	public static final MMCode Theoretical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Theoretical";
			definition = "The place is theoretical.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "THEO";
		}
	};
	/**
	 * The place is a vendor.
	 */
	public static final MMCode Vendor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Vendor";
			definition = "The place is a vendor.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "VEND";
		}
	};
	/**
	 * Specified type of market is inter bank market.
	 */
	public static final MMCode InterBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBank";
			definition = "Specified type of market is inter bank market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "INBA";
		}
	};
	/**
	 * Specified type of market is counter market.
	 */
	public static final MMCode Counter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Specified type of market is counter market.";
			owner_lazy = () -> MarketTypeCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketTypeCode";
				definition = "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketTypeCode.PrimaryMarket, com.tools20022.repository.codeset.MarketTypeCode.SecondaryMarket, com.tools20022.repository.codeset.MarketTypeCode.ThirdMarket,
						com.tools20022.repository.codeset.MarketTypeCode.FourthMarket, com.tools20022.repository.codeset.MarketTypeCode.OverTheCounter, com.tools20022.repository.codeset.MarketTypeCode.Various,
						com.tools20022.repository.codeset.MarketTypeCode.StockExchange, com.tools20022.repository.codeset.MarketTypeCode.Fund, com.tools20022.repository.codeset.MarketTypeCode.LocalMarket,
						com.tools20022.repository.codeset.MarketTypeCode.Theoretical, com.tools20022.repository.codeset.MarketTypeCode.Vendor, com.tools20022.repository.codeset.MarketTypeCode.InterBank,
						com.tools20022.repository.codeset.MarketTypeCode.Counter);
			}
		});
		return mmObject_lazy.get();
	}
}
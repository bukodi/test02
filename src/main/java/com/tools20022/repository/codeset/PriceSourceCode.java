package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the source of a price quotation.
 */
public class PriceSourceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of price quotation is a fund, eg, transfer agent, fund itself.
	 */
	public static final MMCode Fund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fund";
			definition = "Source of price quotation is a fund, eg, transfer agent, fund itself.";
			owner_lazy = () -> PriceSourceCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * Source of price quotation is a theoretical value based on the market
	 * yield.
	 */
	public static final MMCode Theoretical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Theoretical";
			definition = "Source of price quotation is a theoretical value based on the market yield.";
			owner_lazy = () -> PriceSourceCode.mmObject();
			codeName = "THEO";
		}
	};
	/**
	 * Source of price quotation is an external vendor.
	 */
	public static final MMCode Vendor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Vendor";
			definition = "Source of price quotation is an external vendor.";
			owner_lazy = () -> PriceSourceCode.mmObject();
			codeName = "VEND";
		}
	};
	/**
	 * Source of price quotation is a stock exchange.
	 */
	public static final MMCode StockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Source of price quotation is a stock exchange.";
			owner_lazy = () -> PriceSourceCode.mmObject();
			codeName = "EXCH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FUND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriceSourceCode";
				definition = "Specifies the source of a price quotation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceSourceCode.Fund, com.tools20022.repository.codeset.PriceSourceCode.Theoretical, com.tools20022.repository.codeset.PriceSourceCode.Vendor,
						com.tools20022.repository.codeset.PriceSourceCode.StockExchange);
			}
		});
		return mmObject_lazy.get();
	}
}
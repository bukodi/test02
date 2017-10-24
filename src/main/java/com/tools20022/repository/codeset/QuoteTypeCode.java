package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of quote. Can be either an indicative, a tradeable or a
 * restricted tradeable quote.
 */
public class QuoteTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the type of quote is an indicative quote.
	 * 
	 * An indicative quote is used to inform a counterparty of a market. An
	 * indicative quote does not result directly in a trade.
	 */
	public static final MMCode Indicative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicative";
			definition = "Indicates the type of quote is an indicative quote. \n\nAn indicative quote is used to inform a counterparty of a market. An indicative quote does not result directly in a trade.";
			owner_lazy = () -> QuoteTypeCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Indicates the type of quote is a tradeable quote. A tradeable quote is
	 * submitted to a market and will result directly in a trade against other
	 * orders and quotes in a market.
	 */
	public static final MMCode Tradeable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tradeable";
			definition = "Indicates the type of quote is a tradeable quote. \nA tradeable quote is submitted to a market and will result directly in a trade against other orders and quotes in a market.";
			owner_lazy = () -> QuoteTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Indicates the type of quote is a restricted tradeable quote. A restricted
	 * tradeable quote is submitted to a market and within a certain restriction
	 * (possibly based upon price or quantity) will automatically trade against
	 * orders. Order that do not comply with restrictions are sent to the quote
	 * issuer who can choose to accept or decline the order.
	 */
	public static final MMCode RestrictedTradeable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedTradeable";
			definition = "Indicates the type of quote is a restricted tradeable quote. \nA restricted tradeable quote is submitted to a market and within a certain restriction (possibly based upon price or quantity) will automatically trade against orders. Order that do not comply with restrictions are sent to the quote issuer who can choose to accept or decline the order.";
			owner_lazy = () -> QuoteTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Indicates the type of quote is a counter quote.
	 */
	public static final MMCode Counter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Indicates the type of quote is a counter quote.";
			owner_lazy = () -> QuoteTypeCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INDI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuoteTypeCode";
				definition = "Identifies the type of quote. Can be either an indicative, a tradeable or a restricted tradeable quote.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteTypeCode.Indicative, com.tools20022.repository.codeset.QuoteTypeCode.Tradeable, com.tools20022.repository.codeset.QuoteTypeCode.RestrictedTradeable,
						com.tools20022.repository.codeset.QuoteTypeCode.Counter);
			}
		});
		return mmObject_lazy.get();
	}
}
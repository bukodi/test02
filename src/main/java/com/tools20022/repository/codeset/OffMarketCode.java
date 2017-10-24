package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates that the trade was executed off-market.
 */
public class OffMarketCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade was executed off-market.
	 */
	public static final MMCode OffMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffMarket";
			definition = "Trade was executed off-market.";
			owner_lazy = () -> OffMarketCode.mmObject();
			codeName = "XOFF";
		}
	};
	/**
	 * Trade was executed off-exchange because the instrument is not admitted to
	 * trade on an exchange.
	 */
	public static final MMCode NotAdmittedOnExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAdmittedOnExchange";
			definition = "Trade was executed off-exchange because the instrument is not admitted to trade on an exchange.";
			owner_lazy = () -> OffMarketCode.mmObject();
			codeName = "XXXX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("XOFF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OffMarketCode";
				definition = "Indicates that the trade was executed off-market.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OffMarketCode.OffMarket, com.tools20022.repository.codeset.OffMarketCode.NotAdmittedOnExchange);
			}
		});
		return mmObject_lazy.get();
	}
}
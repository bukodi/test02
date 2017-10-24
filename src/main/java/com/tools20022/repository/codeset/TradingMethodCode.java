package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used for the negotiation and execution of a trade.
 */
public class TradingMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade executed through an electronic trading system.
	 */
	public static final MMCode Electronic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Electronic";
			definition = "Trade executed through an electronic trading system.";
			owner_lazy = () -> TradingMethodCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Trade executed over the phone.
	 */
	public static final MMCode Phone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Phone";
			definition = "Trade executed over the phone.";
			owner_lazy = () -> TradingMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Trade executed through a broker.
	 */
	public static final MMCode Broker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Broker";
			definition = "Trade executed through a broker.";
			owner_lazy = () -> TradingMethodCode.mmObject();
			codeName = "BROK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELEC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingMethodCode";
				definition = "Specifies the method used for the negotiation and execution of a trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingMethodCode.Electronic, com.tools20022.repository.codeset.TradingMethodCode.Phone, com.tools20022.repository.codeset.TradingMethodCode.Broker);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * indicates if the Trade Regulatory Conditions is solicited or not.
 */
public class TradeRegulatoryConditionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade was solicited by the executing broker. The broker has suggested to
	 * his client to buy/sell financial instruments.
	 */
	public static final MMCode Solicited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Solicited";
			definition = "Trade was solicited by the executing broker. The broker has suggested to his client to buy/sell financial instruments.";
			owner_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
			codeName = "SOLI";
		}
	};
	/**
	 * Trade was unsolicited. The client acts on its own without advice from the
	 * executing broker.
	 */
	public static final MMCode Unsolicited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsolicited";
			definition = "Trade was unsolicited. The client acts on its own without advice from the executing broker.";
			owner_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
			codeName = "USOL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SOLI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeRegulatoryConditionsCode";
				definition = "indicates if the Trade Regulatory Conditions is solicited or not.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.Solicited, com.tools20022.repository.codeset.TradeRegulatoryConditionsCode.Unsolicited);
			}
		});
		return mmObject_lazy.get();
	}
}
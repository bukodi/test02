package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the trade is negotiated.
 */
public class NegotiatedTradeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is negotiated.
	 */
	public static final MMCode Negotiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Negotiated";
			definition = "Trade is negotiated.";
			owner_lazy = () -> NegotiatedTradeCode.mmObject();
			codeName = "NEGO";
		}
	};
	/**
	 * Trade is not negotiated.
	 */
	public static final MMCode NotNegotiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotNegotiated";
			definition = "Trade is not negotiated.";
			owner_lazy = () -> NegotiatedTradeCode.mmObject();
			codeName = "NNGO";
		}
	};
	/**
	 * Whether the trade is negotiated or not is unknown.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Whether the trade is negotiated or not is unknown.";
			owner_lazy = () -> NegotiatedTradeCode.mmObject();
			codeName = "UNKW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NEGO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NegotiatedTradeCode";
				definition = "Specifies whether the trade is negotiated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NegotiatedTradeCode.Negotiated, com.tools20022.repository.codeset.NegotiatedTradeCode.NotNegotiated,
						com.tools20022.repository.codeset.NegotiatedTradeCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the trade is maintained as a separate individual position in the
 * clearing account, or not.
 */
public class TradePostingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is maintained as a separate individual position in the clearing
	 * account.
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			definition = "Trade is maintained as a separate individual position in the clearing account.";
			owner_lazy = () -> TradePostingCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Trade is maintained as a net position in the clearing account.
	 */
	public static final MMCode Net = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			definition = "Trade is maintained as a net position in the clearing account.";
			owner_lazy = () -> TradePostingCode.mmObject();
			codeName = "NETT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradePostingCode";
				definition = "Specifies the trade is maintained as a separate individual position in the clearing account, or not.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradePostingCode.Gross, com.tools20022.repository.codeset.TradePostingCode.Net);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates how an option trade is settled.
 */
public class SettlementTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option trade is settled as principal.
	 */
	public static final MMCode Principal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Principal";
			definition = "Option trade is settled as principal.";
			owner_lazy = () -> SettlementTypeCode.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Option trade is netted off against another trade.
	 */
	public static final MMCode NettedOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NettedOff";
			definition = "Option trade is netted off against another trade.";
			owner_lazy = () -> SettlementTypeCode.mmObject();
			codeName = "NETO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTypeCode";
				definition = "Indicates how an option trade is settled.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTypeCode.Principal, com.tools20022.repository.codeset.SettlementTypeCode.NettedOff);
			}
		});
		return mmObject_lazy.get();
	}
}
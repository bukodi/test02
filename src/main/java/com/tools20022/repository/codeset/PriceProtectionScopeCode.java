package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the type of price protection the customer requires on their order.
 */
public class PriceProtectionScopeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price protection is local (for example, Exchange, ECN, ATS).
	 */
	public static final MMCode Local = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Local";
			definition = "Price protection is local (for example, Exchange, ECN, ATS).";
			owner_lazy = () -> PriceProtectionScopeCode.mmObject();
			codeName = "LOCA";
		}
	};
	/**
	 * Price protection is national (across all national markets).
	 */
	public static final MMCode National = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "National";
			definition = "Price protection is national (across all national markets).";
			owner_lazy = () -> PriceProtectionScopeCode.mmObject();
			codeName = "NATI";
		}
	};
	/**
	 * Price protection is global (across all markets).
	 */
	public static final MMCode Global = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Price protection is global (across all markets).";
			owner_lazy = () -> PriceProtectionScopeCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Price protection is national (across all national markets) excluding
	 * local price protection.
	 */
	public static final MMCode NationalExcludingLocal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalExcludingLocal";
			definition = "Price protection is national (across all national markets) excluding local price protection.";
			owner_lazy = () -> PriceProtectionScopeCode.mmObject();
			codeName = "NAEL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LOCA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriceProtectionScopeCode";
				definition = "Defines the type of price protection the customer requires on their order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceProtectionScopeCode.Local, com.tools20022.repository.codeset.PriceProtectionScopeCode.National,
						com.tools20022.repository.codeset.PriceProtectionScopeCode.Global, com.tools20022.repository.codeset.PriceProtectionScopeCode.NationalExcludingLocal);
			}
		});
		return mmObject_lazy.get();
	}
}
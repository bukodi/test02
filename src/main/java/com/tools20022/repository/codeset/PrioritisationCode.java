package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates if one side or the other of a cross order should be prioritized.
 */
public class PrioritisationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * None of the sides should be prioritised.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "None of the sides should be prioritised.";
			owner_lazy = () -> PrioritisationCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Buy side is prioritized.
	 */
	public static final MMCode BuySide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySide";
			definition = "Buy side is prioritized.";
			owner_lazy = () -> PrioritisationCode.mmObject();
			codeName = "BSPR";
		}
	};
	/**
	 * Sell side is prioritised.
	 */
	public static final MMCode SellSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellSide";
			definition = "Sell side is prioritised.";
			owner_lazy = () -> PrioritisationCode.mmObject();
			codeName = "SSPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrioritisationCode";
				definition = "Indicates if one side or the other of a cross order should be prioritized.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PrioritisationCode.None, com.tools20022.repository.codeset.PrioritisationCode.BuySide, com.tools20022.repository.codeset.PrioritisationCode.SellSide);
			}
		});
		return mmObject_lazy.get();
	}
}
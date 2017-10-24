package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of standing order.
 */
public class StandingOrderTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Liquidity transfer standing order type, that has been customised or
	 * defined to the specific need of the user.
	 */
	public static final MMCode UserDefinedStandingOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefinedStandingOrder";
			definition = "Liquidity transfer standing order type, that has been customised or defined to the specific need of the user.";
			owner_lazy = () -> StandingOrderTypeCode.mmObject();
			codeName = "USTO";
		}
	};
	/**
	 * Liquidity transfer standing order type, as predefined in the system.
	 */
	public static final MMCode PredefinedStandingOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PredefinedStandingOrder";
			definition = "Liquidity transfer standing order type, as predefined in the system.";
			owner_lazy = () -> StandingOrderTypeCode.mmObject();
			codeName = "PSTO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("USTO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingOrderTypeCode";
				definition = "Specifies the type of standing order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingOrderTypeCode.UserDefinedStandingOrder, com.tools20022.repository.codeset.StandingOrderTypeCode.PredefinedStandingOrder);
			}
		});
		return mmObject_lazy.get();
	}
}
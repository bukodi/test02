package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether an automatic routing system is involved.
 */
public class AutoRoutingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the Designated Order Turnaround system: computerized order
	 * routing system (used at the New York Stock Exchange) is to be used.
	 */
	public static final MMCode DOTSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DOTSystem";
			definition = "Indicates the Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.";
			owner_lazy = () -> AutoRoutingCode.mmObject();
			codeName = "DDOT";
		}
	};
	/**
	 * Indicates the evolution of the DOT system, a Designated Order Turnaround
	 * system: computerized order routing system (used at the New York Stock
	 * Exchange) is to be used.
	 */
	public static final MMCode SuperDOTSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuperDOTSystem";
			definition = "Indicates the evolution of the DOT system, a Designated Order Turnaround system: computerized order routing system (used at the New York Stock Exchange) is to be used.";
			owner_lazy = () -> AutoRoutingCode.mmObject();
			codeName = "SDOT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DDOT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AutoRoutingCode";
				definition = "Indicates whether an automatic routing system is involved.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoRoutingCode.DOTSystem, com.tools20022.repository.codeset.AutoRoutingCode.SuperDOTSystem);
			}
		});
		return mmObject_lazy.get();
	}
}
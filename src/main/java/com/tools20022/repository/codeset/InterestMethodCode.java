package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the interest will be setlled in cash or rolled in.
 */
public class InterestMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the interest is intended to be settled in cash.
	 */
	public static final MMCode PhysicalSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Indicates that the interest is intended to be settled in cash.";
			owner_lazy = () -> InterestMethodCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Indicates that the interest is intended to be rolled in to existing
	 * collateral balances.
	 */
	public static final MMCode RollIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollIn";
			definition = "Indicates that the interest is intended to be rolled in to existing collateral balances.";
			owner_lazy = () -> InterestMethodCode.mmObject();
			codeName = "ROLL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PHYS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestMethodCode";
				definition = "Specifies whether the interest will be setlled in cash or rolled in.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestMethodCode.PhysicalSettlement, com.tools20022.repository.codeset.InterestMethodCode.RollIn);
			}
		});
		return mmObject_lazy.get();
	}
}
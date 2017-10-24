package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying product of the margin.
 */
public class MarginProductCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the margin is related to equities.
	 */
	public static final MMCode Equities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equities";
			definition = "Specifies that the margin is related to equities.";
			owner_lazy = () -> MarginProductCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Specifies that the margin is related to fixed income.
	 */
	public static final MMCode FixedIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			definition = "Specifies that the margin is related to fixed income.";
			owner_lazy = () -> MarginProductCode.mmObject();
			codeName = "FIXI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EQUI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarginProductCode";
				definition = "Specifies the underlying product of the margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginProductCode.Equities, com.tools20022.repository.codeset.MarginProductCode.FixedIncome);
			}
		});
		return mmObject_lazy.get();
	}
}
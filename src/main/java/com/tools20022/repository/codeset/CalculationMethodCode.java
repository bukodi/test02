package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the interest calculation method is simple or compounding.
 */
public class CalculationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Calculation method by which interest is calculated on the original
	 * principal only. Accumulated interest from prior periods is not used in
	 * calculations for the following periods.
	 */
	public static final MMCode Simple = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "Calculation method by which interest is calculated on the original principal only. Accumulated interest from prior periods is not used in calculations for the following periods.";
			owner_lazy = () -> CalculationMethodCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Calculation method by which interest is calculated each period on the
	 * original principal and all interest accumulated during past periods.
	 */
	public static final MMCode Compounding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compounding";
			definition = "Calculation method by which interest is calculated each period on the original principal and all interest accumulated during past periods.";
			owner_lazy = () -> CalculationMethodCode.mmObject();
			codeName = "COMP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SIMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CalculationMethodCode";
				definition = "Specifies whether the interest calculation method is simple or compounding.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationMethodCode.Simple, com.tools20022.repository.codeset.CalculationMethodCode.Compounding);
			}
		});
		return mmObject_lazy.get();
	}
}
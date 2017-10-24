package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the collateral that is substituted was posted against the
 * variation margin or the independent amount.
 */
public class CollateralSubstitutionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * variation margin.
	 */
	public static final MMCode AgainstVariationMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstVariationMargin";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin.";
			owner_lazy = () -> CollateralSubstitutionTypeCode.mmObject();
			codeName = "AVMG";
		}
	};
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * independent amount.
	 */
	public static final MMCode AgainstSegregatedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstSegregatedIndependentAmount";
			definition = "Specifies if the collateral that is substituted was posted against the independent amount.";
			owner_lazy = () -> CollateralSubstitutionTypeCode.mmObject();
			codeName = "ASIA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AVMG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionTypeCode";
				definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.AgainstVariationMargin, com.tools20022.repository.codeset.CollateralSubstitutionTypeCode.AgainstSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
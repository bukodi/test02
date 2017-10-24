package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the collateral has been posted against the variation margin
 * or the segregated independent amount.
 */
public class CollateralPurposeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral has been posted against the variation margin.
	 */
	public static final MMCode VariationMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Collateral has been posted against the variation margin.";
			owner_lazy = () -> CollateralPurposeCode.mmObject();
			codeName = "VAMA";
		}
	};
	/**
	 * Collateral has been posted against the segregated independent amount.
	 */
	public static final MMCode SegregatedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Collateral has been posted against the segregated independent amount.";
			owner_lazy = () -> CollateralPurposeCode.mmObject();
			codeName = "SINA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VAMA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralPurposeCode";
				definition = "Indicates whether the collateral has been posted against the variation margin or the segregated independent amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralPurposeCode.VariationMargin, com.tools20022.repository.codeset.CollateralPurposeCode.SegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
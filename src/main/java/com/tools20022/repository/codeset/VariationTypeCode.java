package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of variation.
 */
public class VariationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Increase to undertaking amount.
	 */
	public static final MMCode Increase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Increase";
			definition = "Increase to undertaking amount.";
			owner_lazy = () -> VariationTypeCode.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Decrease to undertaking amount.
	 */
	public static final MMCode Decrease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decrease";
			definition = "Decrease to undertaking amount.";
			owner_lazy = () -> VariationTypeCode.mmObject();
			codeName = "DECR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INCR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VariationTypeCode";
				definition = "Specifies the type of variation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.VariationTypeCode.Increase, com.tools20022.repository.codeset.VariationTypeCode.Decrease);
			}
		});
		return mmObject_lazy.get();
	}
}
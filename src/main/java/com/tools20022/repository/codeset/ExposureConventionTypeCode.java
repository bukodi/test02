package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Determines how the variation margin requirement will be calculated, either
 * net or gross.
 */
public class ExposureConventionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the exposed amount to party A and B will be netted
	 * together for the variation margin calculation, and then two separate
	 * variation margin requirements will be determined.
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			definition = "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation, and then two separate variation margin requirements will be determined.";
			owner_lazy = () -> ExposureConventionTypeCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Indicates that the exposed amount to party A and B will be netted
	 * together for the variation margin calculation.
	 */
	public static final MMCode Net = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			definition = "Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation.";
			owner_lazy = () -> ExposureConventionTypeCode.mmObject();
			codeName = "NET1";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureConventionTypeCode";
				definition = "Determines how the variation margin requirement will be calculated, either net or gross.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureConventionTypeCode.Gross, com.tools20022.repository.codeset.ExposureConventionTypeCode.Net);
			}
		});
		return mmObject_lazy.get();
	}
}
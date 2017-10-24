package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of conversion.
 */
public class ConversionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * This is a final conversion.
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "This is a final conversion.";
			owner_lazy = () -> ConversionTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * This is an interim conversion.
	 */
	public static final MMCode Interim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "This is an interim conversion.";
			owner_lazy = () -> ConversionTypeCode.mmObject();
			codeName = "INTE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FINL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConversionTypeCode";
				definition = "Specifies the type of conversion.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConversionTypeCode.Final, com.tools20022.repository.codeset.ConversionTypeCode.Interim);
			}
		});
		return mmObject_lazy.get();
	}
}
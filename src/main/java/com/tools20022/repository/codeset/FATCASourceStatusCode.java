package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.
 */
public class FATCASourceStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status is as
	 * declared by the investor.
	 */
	public static final MMCode Declared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declared";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status is as declared by the investor.";
			owner_lazy = () -> FATCASourceStatusCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status
	 * calculated
	 */
	public static final MMCode Calculated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status calculated";
			owner_lazy = () -> FATCASourceStatusCode.mmObject();
			codeName = "CALC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCASourceStatusCode";
				definition = "Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCASourceStatusCode.Declared, com.tools20022.repository.codeset.FATCASourceStatusCode.Calculated);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the source of Common Reporting Standard (CRS) status.
 */
public class CRSSourceStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Source of the Common Reporting Standard (CRS) status is calculated.
	 */
	public static final MMCode Calculated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			definition = "Source of the Common Reporting Standard (CRS) status is calculated.";
			owner_lazy = () -> CRSSourceStatusCode.mmObject();
			codeName = "CALC";
		}
	};
	/**
	 * Source of the Common Reporting Standard (CRS) status is as declared by
	 * the investor.
	 */
	public static final MMCode Declared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declared";
			definition = "Source of the Common Reporting Standard (CRS) status is as declared by the investor.";
			owner_lazy = () -> CRSSourceStatusCode.mmObject();
			codeName = "DECL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSSourceStatusCode";
				definition = "Specifies the source of Common Reporting Standard (CRS) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSSourceStatusCode.Calculated, com.tools20022.repository.codeset.CRSSourceStatusCode.Declared);
			}
		});
		return mmObject_lazy.get();
	}
}
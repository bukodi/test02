package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of consent announced.
 */
public class ConsentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Change in the terms and conditions of the bond.
	 */
	public static final MMCode ChangeInTerms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInTerms";
			definition = "Change in the terms and conditions of the bond.";
			owner_lazy = () -> ConsentTypeCode.mmObject();
			codeName = "CTRM";
		}
	};
	/**
	 * Change in the due and payable conditions.
	 */
	public static final MMCode DueAndPayable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueAndPayable";
			definition = "Change in the due and payable conditions.";
			owner_lazy = () -> ConsentTypeCode.mmObject();
			codeName = "DUPY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConsentTypeCode";
				definition = "Specifies the type of consent announced.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConsentTypeCode.ChangeInTerms, com.tools20022.repository.codeset.ConsentTypeCode.DueAndPayable);
			}
		});
		return mmObject_lazy.get();
	}
}
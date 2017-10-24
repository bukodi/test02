package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of insurance.
 */
public class InsuranceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Life insurance
	 */
	public static final MMCode LifeInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeInsurance";
			definition = "Life insurance";
			owner_lazy = () -> InsuranceCode.mmObject();
			codeName = "LIFE";
		}
	};
	/**
	 * Permanent disability insurance.
	 */
	public static final MMCode PermanentDisabilityInsurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PermanentDisabilityInsurance";
			definition = "Permanent disability insurance.";
			owner_lazy = () -> InsuranceCode.mmObject();
			codeName = "PDIS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LIFE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InsuranceCode";
				definition = "Specifies the type of insurance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceCode.LifeInsurance, com.tools20022.repository.codeset.InsuranceCode.PermanentDisabilityInsurance);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if income is to be paid out (distributed) or retained
 * (accumulated).
 */
public class DistributionPolicyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Income is distributed to the investors in the fund.
	 */
	public static final MMCode Distribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Income is distributed to the investors in the fund.";
			owner_lazy = () -> DistributionPolicyCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Income is added to the capital of the fund.
	 */
	public static final MMCode Accumulation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accumulation";
			definition = "Income is added to the capital of the fund.";
			owner_lazy = () -> DistributionPolicyCode.mmObject();
			codeName = "ACCU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DIST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DistributionPolicyCode";
				definition = "Specifies if income is to be paid out (distributed) or retained (accumulated).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionPolicyCode.Distribution, com.tools20022.repository.codeset.DistributionPolicyCode.Accumulation);
			}
		});
		return mmObject_lazy.get();
	}
}
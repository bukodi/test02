package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information about ERISA (Eligibility to federal Employee Retirement
 * Income Security Act) eligibility.
 */
public class ERISAEligibilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is subject to an ERISA declaration.
	 */
	public static final MMCode ERISAEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligible";
			definition = "Investor is subject to an ERISA declaration.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Investment is not subject to an ERISA declaration.
	 */
	public static final MMCode NotERISAEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotERISAEligible";
			definition = "Investment is not subject to an ERISA declaration.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "NELI";
		}
	};
	/**
	 * Eligibility is unknown at the time the order is sent, and the instructing
	 * party will confirm later.
	 */
	public static final MMCode ERISAEligibilityUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibilityUnknown";
			definition = "Eligibility is unknown at the time the order is sent, and the instructing party will confirm later.";
			owner_lazy = () -> ERISAEligibilityCode.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ERISAEligibilityCode";
				definition = "Specifies information about ERISA (Eligibility to federal Employee Retirement Income Security Act) eligibility.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ERISAEligibilityCode.ERISAEligible, com.tools20022.repository.codeset.ERISAEligibilityCode.NotERISAEligible,
						com.tools20022.repository.codeset.ERISAEligibilityCode.ERISAEligibilityUnknown);
			}
		});
		return mmObject_lazy.get();
	}
}
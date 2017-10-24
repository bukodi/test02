package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the identification of the rules and laws governing the undertaking.
 */
public class GovernanceIdentificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The version of the ICC Uniform Rules For Demand Guarantees (URDG) as
	 * published by the International Chamber of Commerce (ICC) that is in
	 * effect on the date of issue of the undertaking.
	 */
	public static final MMCode UniformRulesForDemandGuarantees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformRulesForDemandGuarantees";
			definition = "The version of the ICC Uniform Rules For Demand Guarantees (URDG) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> GovernanceIdentificationCode.mmObject();
			codeName = "URDG";
		}
	};
	/**
	 * The version of the International Standby Practices (ISP) that is in
	 * effect on the date of issue of the undertaking.
	 */
	public static final MMCode InternationalStandbyPractices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalStandbyPractices";
			definition = "The version of the International Standby Practices (ISP) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> GovernanceIdentificationCode.mmObject();
			codeName = "ISPR";
		}
	};
	/**
	 * The version of the Uniform Customs and Practice for Documentary Credits
	 * (UCP) as published by the International Chamber of Commerce (ICC) that is
	 * in effect on the date of issue of the undertaking.
	 */
	public static final MMCode UniformCustomsAndPractice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformCustomsAndPractice";
			definition = "The version of the Uniform Customs and Practice for Documentary Credits (UCP) as published by the International Chamber of Commerce (ICC) that is in effect on the date of issue of the undertaking.";
			owner_lazy = () -> GovernanceIdentificationCode.mmObject();
			codeName = "UCPR";
		}
	};
	/**
	 * No applicable rule set defined.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "No applicable rule set defined.";
			owner_lazy = () -> GovernanceIdentificationCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("URDG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GovernanceIdentificationCode";
				definition = "Specifies the identification of the rules and laws governing the undertaking.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GovernanceIdentificationCode.UniformRulesForDemandGuarantees, com.tools20022.repository.codeset.GovernanceIdentificationCode.InternationalStandbyPractices,
						com.tools20022.repository.codeset.GovernanceIdentificationCode.UniformCustomsAndPractice, com.tools20022.repository.codeset.GovernanceIdentificationCode.None);
			}
		});
		return mmObject_lazy.get();
	}
}
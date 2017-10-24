package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the proceeds of the event will be distributed on a rolling
 * basis rather than on a specific date.
 */
public class DistributionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event will have a number of acceptance and payment dates until further
	 * announcement by the Issuer or its agent.
	 */
	public static final MMCode RollingBasis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RollingBasis";
			definition = "Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent.";
			owner_lazy = () -> DistributionTypeCode.mmObject();
			codeName = "ROLL";
		}
	};
	/**
	 * Final payment.
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Final payment.";
			owner_lazy = () -> DistributionTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Interim payment.
	 */
	public static final MMCode Interim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			definition = "Interim payment.";
			owner_lazy = () -> DistributionTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Event is ongoing for acceptance on an unsolicited basis.
	 */
	public static final MMCode Ongoing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ongoing";
			definition = "Event is ongoing for acceptance on an unsolicited basis.";
			owner_lazy = () -> DistributionTypeCode.mmObject();
			codeName = "ONGO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ROLL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DistributionTypeCode";
				definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionTypeCode.RollingBasis, com.tools20022.repository.codeset.DistributionTypeCode.Final,
						com.tools20022.repository.codeset.DistributionTypeCode.Interim, com.tools20022.repository.codeset.DistributionTypeCode.Ongoing);
			}
		});
		return mmObject_lazy.get();
	}
}
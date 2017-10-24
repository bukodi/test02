package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the demand for payment.
 */
public class DemandStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Demand refused.
	 */
	public static final MMCode Refused = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refused";
			definition = "Demand refused.";
			owner_lazy = () -> DemandStatusCode.mmObject();
			codeName = "REFD";
		}
	};
	/**
	 * Extend undertaking expiry date.
	 */
	public static final MMCode Extend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extend";
			definition = "Extend undertaking expiry date. ";
			owner_lazy = () -> DemandStatusCode.mmObject();
			codeName = "EXTD";
		}
	};
	/**
	 * Pay undertaking demand.
	 */
	public static final MMCode PAY = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAY";
			definition = "Pay undertaking demand.";
			owner_lazy = () -> DemandStatusCode.mmObject();
			codeName = "PAYD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REFD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DemandStatusCode";
				definition = "Specifies the status of the demand for payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DemandStatusCode.Refused, com.tools20022.repository.codeset.DemandStatusCode.Extend, com.tools20022.repository.codeset.DemandStatusCode.PAY);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of rate.
 */
public class RateStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate is actual.
	 */
	public static final MMCode ActualRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualRate";
			definition = "Rate is actual.";
			owner_lazy = () -> RateStatusCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Rate is indicative.
	 */
	public static final MMCode IndicativeRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicativeRate";
			definition = "Rate is indicative.";
			owner_lazy = () -> RateStatusCode.mmObject();
			codeName = "INDI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateStatusCode";
				definition = "Specifies the type of rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RateStatusCode.ActualRate, com.tools20022.repository.codeset.RateStatusCode.IndicativeRate);
			}
		});
		return mmObject_lazy.get();
	}
}
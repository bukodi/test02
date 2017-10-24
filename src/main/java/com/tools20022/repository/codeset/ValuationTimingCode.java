package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the price valuation timing is done based on the timeline
 * defined in the prospectus.
 */
public class ValuationTimingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price valuation is done exceptionally, outside the timeframe specified in
	 * the prospectus.
	 */
	public static final MMCode Exceptional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exceptional";
			definition = "Price valuation is done exceptionally, outside the timeframe specified in the prospectus.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "EXCP";
		}
	};
	/**
	 * Price valuation is done within the timeframe specified in the prospectus.
	 */
	public static final MMCode Usual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Usual";
			definition = "Price valuation is done within the timeframe specified in the prospectus.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "USUA";
		}
	};
	/**
	 * Price valuation that is done outside the usual timeframe, but in
	 * conformance with a case specified in the prospectus, eg, market closing
	 * day.
	 */
	public static final MMCode Particular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Particular";
			definition = "Price valuation that is done outside the usual timeframe, but in conformance with a case specified in the prospectus, eg, market closing day.";
			owner_lazy = () -> ValuationTimingCode.mmObject();
			codeName = "PATC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EXCP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ValuationTimingCode";
				definition = "Specifies how the price valuation timing is done based on the timeline defined in the prospectus.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ValuationTimingCode.Exceptional, com.tools20022.repository.codeset.ValuationTimingCode.Usual,
						com.tools20022.repository.codeset.ValuationTimingCode.Particular);
			}
		});
		return mmObject_lazy.get();
	}
}
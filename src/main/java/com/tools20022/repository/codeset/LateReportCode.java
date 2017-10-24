package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether a transaction report is late.
 */
public class LateReportCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The confirmation is late.
	 */
	public static final MMCode Late = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Late";
			definition = "The confirmation is late.";
			owner_lazy = () -> LateReportCode.mmObject();
			codeName = "LAT1";
		}
	};
	/**
	 * The confirmation is late because the trade was executed as a number of
	 * partials.
	 */
	public static final MMCode LateBecausePartial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateBecausePartial";
			definition = "The confirmation is late because the trade was executed as a number of partials.";
			owner_lazy = () -> LateReportCode.mmObject();
			codeName = "LAT2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LAT1");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LateReportCode";
				definition = "Specifies whether a transaction report is late.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LateReportCode.Late, com.tools20022.repository.codeset.LateReportCode.LateBecausePartial);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates which type of interest is applied to a balance left on an account.
 */
public class InterestCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * During or within a business day.
	 */
	public static final MMCode IntraDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntraDay";
			definition = "During or within a business day.";
			owner_lazy = () -> InterestCode.mmObject();
			codeName = "INDY";
		}
	};
	/**
	 * Period of time between the end of a business day and the start of the
	 * next business day (usually the day after).
	 */
	public static final MMCode OverNight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverNight";
			definition = "Period of time between the end of a business day and the start of the next business day (usually the day after).";
			owner_lazy = () -> InterestCode.mmObject();
			codeName = "OVRN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INDY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestCode";
				definition = "Indicates which type of interest is applied to a balance left on an account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestCode.IntraDay, com.tools20022.repository.codeset.InterestCode.OverNight);
			}
		});
		return mmObject_lazy.get();
	}
}
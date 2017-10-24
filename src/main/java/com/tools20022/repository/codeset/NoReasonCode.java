package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies that there is no reason available.
 */
public class NoReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No reason to report or no reason available to report.
	 */
	public static final MMCode NoReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoReason";
			definition = "No reason to report or no reason available to report.";
			owner_lazy = () -> NoReasonCode.mmObject();
			codeName = "NORE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NORE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NoReasonCode";
				definition = "Specifies that there is no reason available.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NoReasonCode.NoReason);
			}
		});
		return mmObject_lazy.get();
	}
}
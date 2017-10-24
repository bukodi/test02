package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the method of preallocation.
 */
public class PreAllocationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Preallocation is proratised.
	 */
	public static final MMCode Prorata = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prorata";
			definition = "Preallocation is proratised.";
			owner_lazy = () -> PreAllocationMethodCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * No prorata, discuss first.
	 */
	public static final MMCode SpeakFirst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpeakFirst";
			definition = "No prorata, discuss first.";
			owner_lazy = () -> PreAllocationMethodCode.mmObject();
			codeName = "TALK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PreAllocationMethodCode";
				definition = "Indicates the method of preallocation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreAllocationMethodCode.Prorata, com.tools20022.repository.codeset.PreAllocationMethodCode.SpeakFirst);
			}
		});
		return mmObject_lazy.get();
	}
}
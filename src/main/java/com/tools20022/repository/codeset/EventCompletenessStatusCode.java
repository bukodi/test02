package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the details provided about an event are complete or
 * incomplete.
 */
public class EventCompletenessStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event details are complete.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Event details are complete.";
			owner_lazy = () -> EventCompletenessStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Event details are not complete.
	 */
	public static final MMCode Incomplete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incomplete";
			definition = "Event details are not complete.";
			owner_lazy = () -> EventCompletenessStatusCode.mmObject();
			codeName = "INCO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EventCompletenessStatusCode";
				definition = "Indicates whether the details provided about an event are complete or incomplete.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventCompletenessStatusCode.Complete, com.tools20022.repository.codeset.EventCompletenessStatusCode.Incomplete);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.PriorityCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the priority level of an event.
 */
public class Priority2Code extends PriorityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode High = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			owner_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Normal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Normal";
			owner_lazy = () -> Priority2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HIGH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Priority2Code";
				definition = "Specifies the priority level of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Priority2Code.High, com.tools20022.repository.codeset.Priority2Code.Normal);
				trace_lazy = () -> PriorityCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
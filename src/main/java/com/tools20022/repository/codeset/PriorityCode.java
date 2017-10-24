package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the priority level of an event.
 */
public class PriorityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Priority level is urgent (highest priority possible)
	 */
	public static final MMCode Urgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Urgent";
			definition = "Priority level is urgent (highest priority possible)";
			owner_lazy = () -> PriorityCode.mmObject();
			codeName = "URGT";
		}
	};
	/**
	 * Priority level is high.
	 */
	public static final MMCode High = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "High";
			definition = "Priority level is high.";
			owner_lazy = () -> PriorityCode.mmObject();
			codeName = "HIGH";
		}
	};
	/**
	 * Priority level is normal.
	 */
	public static final MMCode Normal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Normal";
			definition = "Priority level is normal.";
			owner_lazy = () -> PriorityCode.mmObject();
			codeName = "NORM";
		}
	};
	/**
	 * Priority level is low.
	 */
	public static final MMCode Low = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Low";
			definition = "Priority level is low.";
			owner_lazy = () -> PriorityCode.mmObject();
			codeName = "LOWW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("URGT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriorityCode";
				definition = "Specifies the priority level of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriorityCode.Urgent, com.tools20022.repository.codeset.PriorityCode.High, com.tools20022.repository.codeset.PriorityCode.Normal,
						com.tools20022.repository.codeset.PriorityCode.Low);
				derivation_lazy = () -> Arrays.asList(Priority2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
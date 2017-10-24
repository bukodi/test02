package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.MandateClassificationCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of direct debit amount, such as fixed or variable.
 */
public class MandateClassification1Code extends MandateClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> MandateClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode UsageBased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsageBased";
			owner_lazy = () -> MandateClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Variable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			owner_lazy = () -> MandateClassification1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateClassification1Code";
				definition = "Specifies the type of direct debit amount, such as fixed or variable.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateClassification1Code.Fixed, com.tools20022.repository.codeset.MandateClassification1Code.UsageBased,
						com.tools20022.repository.codeset.MandateClassification1Code.Variable);
				trace_lazy = () -> MandateClassificationCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
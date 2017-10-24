package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of direct debit amount, such as fixed or variable.
 */
public class MandateClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit amount is fixed.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Direct debit amount is fixed.";
			owner_lazy = () -> MandateClassificationCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * Direct debit amount is variable.
	 */
	public static final MMCode Variable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			definition = "Direct debit amount is variable.";
			owner_lazy = () -> MandateClassificationCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Direct debit amount is based on usage.
	 */
	public static final MMCode UsageBased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsageBased";
			definition = "Direct debit amount is based on usage.";
			owner_lazy = () -> MandateClassificationCode.mmObject();
			codeName = "USGB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateClassificationCode";
				definition = "Specifies the type of direct debit amount, such as fixed or variable.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateClassificationCode.Fixed, com.tools20022.repository.codeset.MandateClassificationCode.Variable,
						com.tools20022.repository.codeset.MandateClassificationCode.UsageBased);
				derivation_lazy = () -> Arrays.asList(MandateClassification1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
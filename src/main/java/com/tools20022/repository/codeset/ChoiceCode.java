package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the separation of the security is optional or mandatory.
 */
public class ChoiceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Separation is optional.
	 */
	public static final MMCode Optional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Optional";
			definition = "Separation is optional.";
			owner_lazy = () -> ChoiceCode.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * Separation is mandatory.
	 */
	public static final MMCode Mandatory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Separation is mandatory.";
			owner_lazy = () -> ChoiceCode.mmObject();
			codeName = "MAND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OPTI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChoiceCode";
				definition = "Specifies if the separation of the security is optional or mandatory.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChoiceCode.Optional, com.tools20022.repository.codeset.ChoiceCode.Mandatory);
			}
		});
		return mmObject_lazy.get();
	}
}
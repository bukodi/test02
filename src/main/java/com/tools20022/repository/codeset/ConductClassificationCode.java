package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the classification of the conduct.
 */
public class ConductClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Standard.
	 */
	public static final MMCode Standard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			definition = "Standard.";
			owner_lazy = () -> ConductClassificationCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Non standard or unusual.
	 */
	public static final MMCode NonStandard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandard";
			definition = "Non standard or unusual.";
			owner_lazy = () -> ConductClassificationCode.mmObject();
			codeName = "NSTA";
		}
	};
	/**
	 * Reluctant.
	 */
	public static final MMCode Reluctant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reluctant";
			definition = "Reluctant.";
			owner_lazy = () -> ConductClassificationCode.mmObject();
			codeName = "RCLT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STAN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConductClassificationCode";
				definition = "Specifies the classification of the conduct.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConductClassificationCode.Standard, com.tools20022.repository.codeset.ConductClassificationCode.NonStandard,
						com.tools20022.repository.codeset.ConductClassificationCode.Reluctant);
			}
		});
		return mmObject_lazy.get();
	}
}
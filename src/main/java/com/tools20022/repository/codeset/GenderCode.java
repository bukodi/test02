package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the gender of a person.
 */
public class GenderCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Individual is a male.
	 */
	public static final MMCode Male = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Male";
			definition = "Individual is a male.";
			owner_lazy = () -> GenderCode.mmObject();
			codeName = "MALE";
		}
	};
	/**
	 * Individual is a female.
	 */
	public static final MMCode Female = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Female";
			definition = "Individual is a female.";
			owner_lazy = () -> GenderCode.mmObject();
			codeName = "FEMA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MALE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GenderCode";
				definition = "Specifies the gender of a person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GenderCode.Male, com.tools20022.repository.codeset.GenderCode.Female);
			}
		});
		return mmObject_lazy.get();
	}
}
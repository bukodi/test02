package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Method under which assignment was conducted.
 */
public class AssignmentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Assignment was conducted randomly.
	 */
	public static final MMCode Random = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Random";
			definition = "Assignment was conducted randomly.";
			owner_lazy = () -> AssignmentMethodCode.mmObject();
			codeName = "RAND";
		}
	};
	/**
	 * Assignment was conducted on a prorata basis.
	 */
	public static final MMCode Prorata = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prorata";
			definition = "Assignment was conducted on a prorata basis.";
			owner_lazy = () -> AssignmentMethodCode.mmObject();
			codeName = "PROR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssignmentMethodCode";
				definition = "Method under which assignment was conducted.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssignmentMethodCode.Random, com.tools20022.repository.codeset.AssignmentMethodCode.Prorata);
			}
		});
		return mmObject_lazy.get();
	}
}
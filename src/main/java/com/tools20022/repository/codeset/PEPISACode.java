package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Transfer, PEP or ISA.
 */
public class PEPISACode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Personal equity plan.
	 */
	public static final MMCode PEP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PEP";
			definition = "Personal equity plan.";
			owner_lazy = () -> PEPISACode.mmObject();
			codeName = "PEPT";
		}
	};
	/**
	 * Individual savings account.
	 */
	public static final MMCode ISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISA";
			definition = "Individual savings account.";
			owner_lazy = () -> PEPISACode.mmObject();
			codeName = "ISAT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PEPT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PEPISACode";
				definition = "Specifies the type of Transfer, PEP or ISA.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PEPISACode.PEP, com.tools20022.repository.codeset.PEPISACode.ISA);
			}
		});
		return mmObject_lazy.get();
	}
}
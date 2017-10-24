package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the external discrepancy type code in the format of a character
 * string with a maximum length of 4 characters. The list of valid codes is an
 * external code list published separately.<br>
 * External code sets can be downloaded from www.iso20022.org.
 */
public class ExternalDiscrepancyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AAAA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalDiscrepancyCode";
				definition = "Specifies the external discrepancy type code in the format of a character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Portuguese National Clearing Code. Identifies Portuguese financial
 * institutions on the Portuguese national clearing system.
 */
public class PortugueseNCCIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PT12345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortugueseNCCIdentifier";
				definition = "Portuguese National Clearing Code. Identifies Portuguese financial institutions on the Portuguese national clearing system.";
				identificationScheme = "Banco de Portugal; PortugueseNCC";
			}
		});
		return mmObject_lazy.get();
	}
}
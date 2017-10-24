package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifier for Swiss securities assigned by Telekurs Financial, the Swiss
 * numbering agency.
 */
public class ValorenIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("832614");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ValorenIdentifier";
				definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
				identificationScheme = "Valoren; ValorenIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
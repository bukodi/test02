package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * German Bankleitzahl. Identifies German financial institutions on the German
 * national clearing systems.
 */
public class GermanBankleitzahlIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BL12345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GermanBankleitzahlIdentifier";
				definition = "German Bankleitzahl. Identifies German financial institutions on the German national clearing systems.";
				identificationScheme = "Deutsche Bundesbank ; German Bankleitzahl";
			}
		});
		return mmObject_lazy.get();
	}
}
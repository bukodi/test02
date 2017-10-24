package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Polish National Clearing Code Identifier. Identifies Polish financial
 * institutions on the Polish national clearing system.
 */
public class PolishNationalClearingCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PL12345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PolishNationalClearingCodeIdentifier";
				definition = "Polish National Clearing Code Identifier. Identifies Polish financial institutions on the Polish national clearing system.";
				identificationScheme = "Polish Central Bank; Payment Routing Number";
			}
		});
		return mmObject_lazy.get();
	}
}
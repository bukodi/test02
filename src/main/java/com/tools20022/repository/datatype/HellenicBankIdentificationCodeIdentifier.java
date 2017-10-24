package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Hellenic Bank Identification Code Identifier. Identifies Greek financial
 * institutions on the greek national clearing system.
 */
public class HellenicBankIdentificationCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GR1234567");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HellenicBankIdentificationCodeIdentifier";
				definition = "Hellenic Bank Identification Code Identifier. Identifies Greek financial institutions on the greek national clearing system.";
				identificationScheme = "Hellenic Central Bank; Payment Routing Number";
			}
		});
		return mmObject_lazy.get();
	}
}
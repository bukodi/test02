package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Canadian Payments Association Routing Number. Identifies Canadian financial
 * institutions on the Canadian national clearing system.
 */
public class CanadianPaymentsARNIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CA123456789");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CanadianPaymentsARNIdentifier";
				definition = "Canadian Payments Association Routing Number. Identifies Canadian financial institutions on the Canadian national clearing system.";
				identificationScheme = "Candian Payment Association; Payment Routing Number";
			}
		});
		return mmObject_lazy.get();
	}
}
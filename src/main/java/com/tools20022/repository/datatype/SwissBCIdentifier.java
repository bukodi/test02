package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Swiss Bank Code. Identifies Swiss institutions on the Swiss national clearing
 * system.
 */
public class SwissBCIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SW123");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwissBCIdentifier";
				definition = "Swiss Bank Code. Identifies Swiss institutions on the Swiss national clearing system.";
				identificationScheme = "Swiss Interbank Clearing Ltd; BC Identifier";
			}
		});
		return mmObject_lazy.get();
	}
}
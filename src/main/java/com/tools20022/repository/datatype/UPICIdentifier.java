package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Universal Payment Identification Code (UPIC). Identifier used by the New York
 * Clearing House to mask confidential data, such as bank accounts and bank
 * routing numbers. UPIC numbers remain with business customers, regardless of
 * banking relationship changes.
 */
public class UPICIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("12345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UPICIdentifier";
				definition = "Universal Payment Identification Code (UPIC).  Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
				identificationScheme = "The Clearing House (formerly The New York Clearing House); Universal Payment Identification Code";
			}
		});
		return mmObject_lazy.get();
	}
}
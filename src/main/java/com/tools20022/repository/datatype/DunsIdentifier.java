package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Data Universal Numbering System. A unique identification number provided by
 * Dun &amp; Bradstreet to identify an organization.
 */
public class DunsIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("578942538");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DunsIdentifier";
				definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
				identificationScheme = "Dun & Bradstreet; DunsIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
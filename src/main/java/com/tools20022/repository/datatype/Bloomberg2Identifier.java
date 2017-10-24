package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An identifier of a security assigned by the Bloomberg organisation.
 */
public class Bloomberg2Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BBG000KBVJX0", "BBG000BLNNH6", "BBG000M5WT59");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Bloomberg2Identifier";
				definition = "An identifier of a security assigned by the Bloomberg organisation.";
				identificationScheme = "Bloomberg;  BloombergIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
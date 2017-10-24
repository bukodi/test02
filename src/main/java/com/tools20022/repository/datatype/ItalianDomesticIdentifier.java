package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Italian Domestic Identification Code. Identifies Italian financial
 * institutions on the Italian national clearing system. The code is assigned by
 * the Associazione Bancaria Italiana (ABI).
 */
public class ItalianDomesticIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("IT1234567890");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ItalianDomesticIdentifier";
				definition = "Italian Domestic Identification Code. Identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
				identificationScheme = "Associazione Bancaria Italiana; Italian Domestic Identification";
			}
		});
		return mmObject_lazy.get();
	}
}
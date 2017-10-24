package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Market Identifier Code. The identification of a financial market, as
 * stipulated in the norm ISO 10383 'Codes for exchanges and market
 * identifications'.
 */
public class MICIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("XTKS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MICIdentifier";
				definition = "Market Identifier Code. The identification of a financial market, as stipulated in the norm ISO 10383 'Codes for exchanges and market identifications'.";
				identificationScheme = "SWIFT; MICIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Spanish Domestic Interbanking Code. Identifies Spanish financial institutions
 * on the Spanish national clearing system. The code is assigned by the Centro
 * de Cooperacion Interbancaria (CCI).
 */
public class SpanishDomesticInterbankingIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ES12345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SpanishDomesticInterbankingIdentifier";
				definition = "Spanish Domestic Interbanking Code. Identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
				identificationScheme = "Centro de Cooperacion Interbancaria (CCI); Spanish Domestic Interbanking Identifier";
			}
		});
		return mmObject_lazy.get();
	}
}
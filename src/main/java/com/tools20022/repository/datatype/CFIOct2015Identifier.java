package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Classification type of the financial instrument, as per the ISO 10962
 * Classification of Financial Instrument (CFI) codification, eg, common share
 * with voting rights, fully paid, or registered.
 */
public class CFIOct2015Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ESVUFR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CFIOct2015Identifier";
				definition = "Classification type of the financial instrument, as per the ISO 10962 Classification of Financial Instrument (CFI) codification, eg, common share with voting rights, fully paid, or registered.";
				identificationScheme = "ANNA; CFIIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
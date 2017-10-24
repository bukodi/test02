package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier
 * Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains
 * 6-digits, but no check digit. There are different ranges of numbers
 * representing different classes of securities.
 */
public class WertpapierIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("911958");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "WertpapierIdentifier";
				definition = "Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
				identificationScheme = "Wertpapier;  WertpapierIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
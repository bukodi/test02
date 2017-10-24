package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * International Securities Identification Number (ISIN). A numbering system
 * designed by the United Nation's International Organisation for
 * Standardisation (ISO). The ISIN is composed of a 2-character prefix
 * representing the country of issue, followed by the national security number
 * (if one exists), and a check digit. Each country has a national numbering
 * agency that assigns ISIN numbers for securities in that country.
 */
public class ISINOct2015Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("US3134A33L82");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISINOct2015Identifier";
				definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
				identificationScheme = "ANNA; ISINIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
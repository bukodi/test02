package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * (United States) Clearing House Interbank Payments System (CHIPS) Universal
 * Identification (UID). Identifies entities that own accounts at CHIPS
 * participating financial institutions, through which CHIPS payments are
 * effected. The CHIPS UID is assigned by the New York Clearing House.
 */
public class CHIPSUniversalIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CH123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CHIPSUniversalIdentifier";
				definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification  (UID).  Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected.  The CHIPS UID is assigned by the New York Clearing House.";
				identificationScheme = "American Banker's Association (ABA); CHIPS UID";
			}
		});
		return mmObject_lazy.get();
	}
}
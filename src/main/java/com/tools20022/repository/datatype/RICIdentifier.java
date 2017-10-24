package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reuters Identification Code (RIC). A numbering system used within the Reuters
 * system to identify instruments worldwide. The RIC contains an X-character
 * market specific code (can be the CUSIP or EPIC codes) followed by a full
 * stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.
 */
public class RICIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TDVd.CR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RICIdentifier";
				definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
				identificationScheme = "REUTERS ; REUTERSIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
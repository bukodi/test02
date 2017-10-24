package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code allocated to a non-financial institution by the ISO 9362 Registration
 * Authority as described in ISO 9362
 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
 * .
 */
public class BICNonFIIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("USINFRPP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BICNonFIIdentifier";
				definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
				identificationScheme = "SWIFT; BEIIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
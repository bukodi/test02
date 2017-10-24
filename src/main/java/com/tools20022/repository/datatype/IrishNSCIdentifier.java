package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Irish National Sorting Code. Identifies Irish financial institutions on the
 * Irish national clearing system.
 */
public class IrishNSCIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("IE123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IrishNSCIdentifier";
				definition = "Irish National Sorting Code. Identifies Irish financial institutions on the Irish national clearing system.";
				identificationScheme = "Irish Payment Services Organisation (IPSO); Irish National Sort Code";
			}
		});
		return mmObject_lazy.get();
	}
}
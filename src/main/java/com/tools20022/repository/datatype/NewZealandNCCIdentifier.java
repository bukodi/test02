package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * New Zealand Bank/Branch Code. Identifies New Zealand institutions on the New
 * Zealand national clearing system. The code is assigned by the New Zealand
 * Bankers' Association (NZBA).
 */
public class NewZealandNCCIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NZ123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NewZealandNCCIdentifier";
				definition = "New Zealand Bank/Branch Code. Identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
				identificationScheme = "New Zealand Bankers Association; NewZealandNCC";
			}
		});
		return mmObject_lazy.get();
	}
}
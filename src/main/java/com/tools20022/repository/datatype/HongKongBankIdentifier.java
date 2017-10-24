package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Hong Kong Bank Code. Identifies Hong Kong financial institutions on the Hong
 * Kong local clearing system.
 */
public class HongKongBankIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HK123");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HongKongBankIdentifier";
				definition = "Hong Kong Bank Code. Identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
				identificationScheme = "Hong Kong Interbank Clearing Ltd (HKICL); Bank Code of Hong Kong";
			}
		});
		return mmObject_lazy.get();
	}
}
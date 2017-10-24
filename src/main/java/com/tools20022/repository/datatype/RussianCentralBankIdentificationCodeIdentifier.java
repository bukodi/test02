package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Russian Central Bank Identification Code. Identifies Russian financial
 * institutions on the Russian national clearing system.
 */
public class RussianCentralBankIdentificationCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RU123456789");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RussianCentralBankIdentificationCodeIdentifier";
				definition = "Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system.";
				identificationScheme = "Central Bank of Russia; RussianCentralBankIdentificationCode";
			}
		});
		return mmObject_lazy.get();
	}
}
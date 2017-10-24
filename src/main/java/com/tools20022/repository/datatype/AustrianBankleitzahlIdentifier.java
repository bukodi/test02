package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Austrian Bankleitzahl. Identifies Austrian financial institutions on the
 * Austrian national clearing system.
 */
public class AustrianBankleitzahlIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AT12345");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AustrianBankleitzahlIdentifier";
				definition = "Austrian Bankleitzahl. Identifies Austrian financial institutions on the Austrian national clearing system.";
				identificationScheme = "Oesterreichische NationalBank; Austrian Bankleitzahl";
			}
		});
		return mmObject_lazy.get();
	}
}
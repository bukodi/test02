package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Basic Bank Account Number (BBAN). Identifier used nationally by financial
 * institutions, ie, in individual countries, generally as part of a National
 * Account Numbering Scheme(s), which uniquely identifies the account of a
 * customer.
 */
public class BBANIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BARC12345612345678");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BBANIdentifier";
				definition = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.";
				identificationScheme = "National Banking Association; Basic Bank Account Number";
			}
		});
		return mmObject_lazy.get();
	}
}
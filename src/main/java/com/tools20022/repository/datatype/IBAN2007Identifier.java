package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An identifier used internationally by financial institutions to uniquely
 * identify the account of a customer at a financial institution, as described
 * in the latest edition of the international standard ISO 13616:2007 -
 * "Banking and related financial services - International Bank Account Number (IBAN)"
 * .
 */
public class IBAN2007Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AT611904300234573201");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IBAN2007Identifier";
				definition = "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\".";
				identificationScheme = "National Banking Association; International Bank Account Number (ISO 13616)";
			}
		});
		return mmObject_lazy.get();
	}
}
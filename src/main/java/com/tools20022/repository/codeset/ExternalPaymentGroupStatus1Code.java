package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a group of payment instructions, as published in an
 * external payment group status code set.<br>
 * External code sets can be downloaded from www.iso20022.org.
 */
public class ExternalPaymentGroupStatus1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DUPL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalPaymentGroupStatus1Code";
				definition = "Specifies the status of a group of payment instructions, as published in an external payment group status code set.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}
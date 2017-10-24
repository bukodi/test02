package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the external mandate setup reason code in the format of character
 * string with a maximum length of 4 characters.<br>
 * External code sets can be downloaded from www.iso20022.org.
 */
public class ExternalMandateSetupReason1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalMandateSetupReason1Code";
				definition = "Specifies the external mandate setup reason code in the format of character string with a maximum length of 4 characters.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}
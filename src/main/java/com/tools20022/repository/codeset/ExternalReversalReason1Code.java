package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reversal reason, as published in an external reversal reason
 * code list.<br>
 * External code sets can be downloaded from www.iso20022.org.
 */
public class ExternalReversalReason1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AC04");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalReversalReason1Code";
				definition = "Specifies the reversal reason, as published in an external reversal reason code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}
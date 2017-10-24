package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a numeric string with a maximum length of 15 digits and may be
 * prefixed with a plus sign.
 */
public class Max15PlusSignedNumericText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Max15PlusSignedNumericText";
				definition = "Specifies a numeric string with a maximum length of 15 digits and may be prefixed with a plus sign.";
			}
		});
		return mmObject_lazy.get();
	}
}
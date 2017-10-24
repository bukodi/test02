package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a character string with a minimum length of 6 characters, and a
 * maximum length of 8 characters.
 */
public class Min6Max8Text {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Min6Max8Text";
				definition = "Specifies a character string with a minimum length of 6 characters, and a maximum length of 8 characters.";
			}
		});
		return mmObject_lazy.get();
	}
}
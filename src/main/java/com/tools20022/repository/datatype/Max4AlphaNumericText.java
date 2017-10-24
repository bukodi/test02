package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an alphanumeric string with a maximum length of 4 characters.
 */
public class Max4AlphaNumericText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Max4AlphaNumericText";
				definition = "Specifies an alphanumeric string with a maximum length of 4 characters.";
			}
		});
		return mmObject_lazy.get();
	}
}
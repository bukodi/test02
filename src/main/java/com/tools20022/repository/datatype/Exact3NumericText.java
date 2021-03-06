package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a numeric string with an exact length of 3 digits.
 */
public class Exact3NumericText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Exact3NumericText";
				definition = "Specifies a numeric string with an exact length of 3 digits.";
			}
		});
		return mmObject_lazy.get();
	}
}
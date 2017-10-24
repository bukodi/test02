package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates a "Yes" or "No" type of answer for an element.
 */
public class YesNoIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "YesNoIndicator";
				definition = "Indicates a \"Yes\" or \"No\" type of answer for an element.";
				meaningWhenTrue = "Yes";
				meaningWhenFalse = "No";
			}
		});
		return mmObject_lazy.get();
	}
}
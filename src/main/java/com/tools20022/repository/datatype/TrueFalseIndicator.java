package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A flag indicating a True or False value.
 */
public class TrueFalseIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TrueFalseIndicator";
				definition = "A flag indicating a True or False value.";
				meaningWhenTrue = "True";
				meaningWhenFalse = "False";
			}
		});
		return mmObject_lazy.get();
	}
}
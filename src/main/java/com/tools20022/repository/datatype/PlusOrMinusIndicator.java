package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates a positive or negative value.
 */
public class PlusOrMinusIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PlusOrMinusIndicator";
				definition = "Indicates a positive or negative value.";
				meaningWhenTrue = "Plus";
				meaningWhenFalse = "Minus";
			}
		});
		return mmObject_lazy.get();
	}
}
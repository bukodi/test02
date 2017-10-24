package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number (max 999) of objects represented as an integer.
 */
public class Max3Number {

	final static private AtomicReference<MMQuantity> mmObject_lazy = new AtomicReference<>();

	final static public MMQuantity mmObject() {
		mmObject_lazy.compareAndSet(null, new MMQuantity() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("123");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Max3Number";
				definition = "Number (max 999) of objects represented as an integer.";
			}
		});
		return mmObject_lazy.get();
	}
}
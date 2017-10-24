package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMQuantity;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of objects represented as a decimal number, eg, 0.75 or 45.6.
 */
public class DecimalNumber {

	final static private AtomicReference<MMQuantity> mmObject_lazy = new AtomicReference<>();

	final static public MMQuantity mmObject() {
		mmObject_lazy.compareAndSet(null, new MMQuantity() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("123456789.123456789");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DecimalNumber";
				definition = "Number of objects represented as a decimal number, eg, 0.75 or 45.6.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether charges have already been included.
 */
public class ChargeIncludedIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargeIncludedIndicator";
				definition = "Indicates whether charges have already been included.";
				meaningWhenTrue = "Included ";
				meaningWhenFalse = "Pre-advised";
			}
		});
		return mmObject_lazy.get();
	}
}
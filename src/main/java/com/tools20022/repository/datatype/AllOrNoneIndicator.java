package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether a round-lot market or limit-price order must be executed in
 * its entirety or not at all.
 */
public class AllOrNoneIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AllOrNoneIndicator";
				definition = "Indicates whether a round-lot market or limit-price order must be executed in its entirety or not at all.";
				meaningWhenTrue = "All";
				meaningWhenFalse = "None";
			}
		});
		return mmObject_lazy.get();
	}
}
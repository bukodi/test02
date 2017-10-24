package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The direction of capital repayment for asset backed securities.
 */
public class PaymentDirectionIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentDirectionIndicator";
				definition = "The direction of capital repayment for asset backed securities.";
				meaningWhenTrue = "Up";
				meaningWhenFalse = "Down";
			}
		});
		return mmObject_lazy.get();
	}
}
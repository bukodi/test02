package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether the sending party requests a single debit or credit entry
 * per individual transaction or a batch entry for the sum of the amounts of all
 * transactions.
 */
public class BatchBookingIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BatchBookingIndicator";
				definition = "Identifies whether the sending party requests a single debit or credit entry per individual transaction or a batch entry for the sum of the amounts of all transactions.";
				meaningWhenTrue = "Identifies that a batch entry for the sum of the amounts of all transactions in the batch or message is requested.";
				meaningWhenFalse = "Identifies that a single entry for each of the transactions in the batch or message is requested. ";
			}
		});
		return mmObject_lazy.get();
	}
}
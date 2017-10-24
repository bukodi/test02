package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of monetary units specified in a currency where the unit of currency
 * is implied by the context and compliant with ISO 4217. The decimal separator
 * is a dot. Note: a zero amount is considered a positive amount.
 */
public class ImpliedCurrencyAndAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("500000");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ImpliedCurrencyAndAmount";
				definition = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.\nNote: a zero amount is considered a positive amount.";
			}
		});
		return mmObject_lazy.get();
	}
}
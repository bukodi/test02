package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMAmount;
import com.tools20022.repository.codeset.CurrencyCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of monetary units specified in a currency, where the unit of currency
 * is explicit and compliant with ISO 4217. The decimal separator is a dot.
 * Note: A zero amount is considered a positive amount.
 */
public class CurrencyAndAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("100000");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyAndAmount";
				definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.  The decimal separator is a dot.\nNote: A zero amount is considered a positive amount.";
				currencyIdentifierSet_lazy = () -> CurrencyCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMAmount;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A number of monetary units specified in an active or a historic currency
 * where the unit of currency is explicit and compliant with ISO 4217.
 */
public class ActiveOrHistoricCurrencyAndAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("6284534");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ActiveOrHistoricCurrencyAndAmount";
				definition = "A number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.";
				currencyIdentifierSet_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
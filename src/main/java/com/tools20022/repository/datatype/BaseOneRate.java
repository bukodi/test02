package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rate expressed as a decimal, eg, 0.7 is 7/10 and 70%.
 */
public class BaseOneRate {

	final static private AtomicReference<MMRate> mmObject_lazy = new AtomicReference<>();

	final static public MMRate mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRate() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("0.60");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaseOneRate";
				definition = "Rate expressed as a decimal, eg, 0.7 is 7/10 and 70%.";
				baseValue = 1.0;
			}
		});
		return mmObject_lazy.get();
	}
}
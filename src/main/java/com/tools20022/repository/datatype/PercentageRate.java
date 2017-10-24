package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a
 * percent, and 7.0 is 7%.
 */
public class PercentageRate {

	final static private AtomicReference<MMRate> mmObject_lazy = new AtomicReference<>();

	final static public MMRate mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRate() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("35");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PercentageRate";
				definition = "Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.";
				baseValue = 100.0;
			}
		});
		return mmObject_lazy.get();
	}
}
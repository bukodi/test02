package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMYearMonth;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Month within a particular calendar year represented by YYYY-MM (ISO 8601).
 */
public class ISOYearMonth {

	final static private AtomicReference<MMYearMonth> mmObject_lazy = new AtomicReference<>();

	final static public MMYearMonth mmObject() {
		mmObject_lazy.compareAndSet(null, new MMYearMonth() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("2002-01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISOYearMonth";
				definition = "Month within a particular calendar year represented by YYYY-MM (ISO 8601).";
			}
		});
		return mmObject_lazy.get();
	}
}
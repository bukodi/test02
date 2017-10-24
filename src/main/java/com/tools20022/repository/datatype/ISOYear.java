package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMYear;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Year represented by YYYY (ISO 8601)
 */
public class ISOYear {

	final static private AtomicReference<MMYear> mmObject_lazy = new AtomicReference<>();

	final static public MMYear mmObject() {
		mmObject_lazy.compareAndSet(null, new MMYear() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("2000");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISOYear";
				definition = "Year represented by YYYY (ISO 8601)";
			}
		});
		return mmObject_lazy.get();
	}
}
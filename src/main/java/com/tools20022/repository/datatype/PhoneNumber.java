package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The collection of information which identifies a specific phone or FAX number
 * as defined by telecom services. It consists of a "+" followed by the country
 * code (from 1 to 3 characters) then a "-" and finally, any combination of
 * numbers, "(", ")", "+" and "-" (up to 30 characters).
 */
public class PhoneNumber {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PhoneNumber";
				definition = "The collection of information which identifies a specific phone or FAX number as defined by telecom services.\nIt consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMDate;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A particular point in the progression of time in a calendar year expressed in
 * the YYYY-MM-DD format. This representation is defined in
 * "XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004"
 * which is aligned with ISO 8601.
 */
public class ISODate {

	final static private AtomicReference<MMDate> mmObject_lazy = new AtomicReference<>();

	final static public MMDate mmObject() {
		mmObject_lazy.compareAndSet(null, new MMDate() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISODate";
				definition = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMTime;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A particular point in the progression of time in a calendar day expressed in
 * either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format
 * (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These
 * representations are defined in
 * "XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004"
 * which is aligned with ISO 8601. Note on the time format: 1) beginning / end
 * of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end
 * of a calendar day 2) fractions of second in time format Decimal fractions of
 * seconds may be included. In this case, the involved parties shall agree on
 * the maximum number of digits that are allowed.
 */
public class ISOTime {

	final static private AtomicReference<MMTime> mmObject_lazy = new AtomicReference<>();

	final static public MMTime mmObject() {
		mmObject_lazy.compareAndSet(null, new MMTime() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISOTime";
				definition = "A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.\nNote on the time format:\n1) beginning / end of calendar day\n00:00:00 = the beginning of a calendar day\n24:00:00 = the end of a calendar day\n2) fractions of second in time format\nDecimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.";
			}
		});
		return mmObject_lazy.get();
	}
}
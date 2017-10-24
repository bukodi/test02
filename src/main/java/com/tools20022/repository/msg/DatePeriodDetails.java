package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DateTimePeriod;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Range of time defined by a start date and an end date.
 */
public class DatePeriodDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Start date of the range.
	 */
	public static final MMMessageAttribute FromDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.FromDateTime;
			componentContext_lazy = () -> DatePeriodDetails.mmObject();
			isDerived = false;
			xmlTag = "FrDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDate";
			definition = "Start date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * End date of the range.
	 */
	public static final MMMessageAttribute ToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ToDateTime;
			componentContext_lazy = () -> DatePeriodDetails.mmObject();
			isDerived = false;
			xmlTag = "ToDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDate";
			definition = "End date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.FromDate, com.tools20022.repository.msg.DatePeriodDetails.ToDate);
				trace_lazy = () -> DateTimePeriod.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DatePeriodDetails";
				definition = "Range of time defined by a start date and an end date.";
			}
		});
		return mmObject_lazy.get();
	}
}
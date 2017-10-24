package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between a date or a date and time format.
 */
public class DateAndDateTimeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specified date.
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndDateTimeChoice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Specified date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specified date and time.
	 */
	public static final MMMessageAttribute DateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndDateTimeChoice.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Specified date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateAndDateTimeChoice.Date, com.tools20022.repository.choice.DateAndDateTimeChoice.DateTime);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateAndDateTimeChoice";
				definition = "Choice between a date or a date and time format.";
			}
		});
		return mmObject_lazy.get();
	}
}
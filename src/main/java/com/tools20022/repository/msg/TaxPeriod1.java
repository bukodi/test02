package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.TaxRecordPeriod1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.TaxPeriod;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period of time details related to the tax payment.
 */
public class TaxPeriod1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Year related to the tax payment.
	 */
	public static final MMMessageAttribute Year = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxPeriod.Year;
			componentContext_lazy = () -> TaxPeriod1.mmObject();
			isDerived = false;
			xmlTag = "Yr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			definition = "Year related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identification of the period related to the tax payment.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxPeriod.Type;
			componentContext_lazy = () -> TaxPeriod1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identification of the period related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxRecordPeriod1Code.mmObject();
		}
	};
	/**
	 * Range of time between a start date and an end date for which the tax
	 * report is provided.
	 */
	public static final MMMessageAttribute FromToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxPeriod.FromToDate;
			componentContext_lazy = () -> TaxPeriod1.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the tax report is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxPeriod1.Year, com.tools20022.repository.msg.TaxPeriod1.Type, com.tools20022.repository.msg.TaxPeriod1.FromToDate);
				trace_lazy = () -> TaxPeriod.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxPeriod1";
				definition = "Period of time details related to the tax payment.";
			}
		});
		return mmObject_lazy.get();
	}
}
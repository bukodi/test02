package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.DecimalNumber;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines a frequency in terms on counts per period for a specific period type.
 */
public class FrequencyPeriod1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period for which the number of instructions are to be created and
	 * processed.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyPeriod1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Period for which the number of instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}
	};
	/**
	 * Number of instructions to be created and processed during the specified
	 * period
	 */
	public static final MMMessageAttribute CountPerPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyPeriod1.mmObject();
			isDerived = false;
			xmlTag = "CntPerPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountPerPeriod";
			definition = "Number of instructions to be created and processed during the specified period";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FrequencyPeriod1.Type, com.tools20022.repository.msg.FrequencyPeriod1.CountPerPeriod);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FrequencyPeriod1";
				definition = "Defines a frequency in terms on counts per period for a specific period type.";
			}
		});
		return mmObject_lazy.get();
	}
}
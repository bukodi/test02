package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.Exact2NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines a frequency in terms a specific moment within a specified period
 * type.
 */
public class FrequencyAndMoment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period for which the number of instructions are to be created and
	 * processed.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyAndMoment1.mmObject();
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
	 * Further information on the exact point in time the event should take
	 * place.
	 */
	public static final MMMessageAttribute PointInTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FrequencyAndMoment1.mmObject();
			isDerived = false;
			xmlTag = "PtInTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointInTime";
			definition = "Further information on the exact point in time the event should take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FrequencyAndMoment1.Type, com.tools20022.repository.msg.FrequencyAndMoment1.PointInTime);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FrequencyAndMoment1";
				definition = "Defines a frequency in terms a specific moment within a specified period type.";
			}
		});
		return mmObject_lazy.get();
	}
}
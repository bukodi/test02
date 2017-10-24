package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.msg.FrequencyAndMoment1;
import com.tools20022.repository.msg.FrequencyPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of format for a frequency, for example, the frequency of payment.
 */
public class Frequency36Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a frequency in terms of a specified period type.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies a frequency in terms of a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}
	};
	/**
	 * Specifies a frequency in terms of a count per period within a specified
	 * period type.
	 */
	public static final MMMessageAttribute Period = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Specifies a frequency in terms of a count per period within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FrequencyPeriod1.mmObject();
		}
	};
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within
	 * a specified period type.
	 */
	public static final MMMessageAssociationEnd PointInTime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Frequency36Choice.mmObject();
			isDerived = false;
			xmlTag = "PtInTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FrequencyAndMoment1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Frequency36Choice.Type, com.tools20022.repository.choice.Frequency36Choice.Period, com.tools20022.repository.choice.Frequency36Choice.PointInTime);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Frequency36Choice";
				definition = "Choice of format for a frequency, for example, the frequency of payment.";
			}
		});
		return mmObject_lazy.get();
	}
}
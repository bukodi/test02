package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalMandateStatus1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Scheme;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sets of elements to identify the status of a mandate.
 */
public class MandateStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the mandate, in a coded form as published in an external list.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Scheme.Code;
			componentContext_lazy = () -> MandateStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Status of the mandate, in a coded form as published in an external list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalMandateStatus1Code.mmObject();
		}
	};
	/**
	 * Name of the identification scheme, in a free text form.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Scheme.Code;
			componentContext_lazy = () -> MandateStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Name of the identification scheme, in a free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MandateStatus1Choice.Code, com.tools20022.repository.choice.MandateStatus1Choice.Proprietary);
				trace_lazy = () -> Scheme.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateStatus1Choice";
				definition = "Sets of elements to identify the status of a mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}
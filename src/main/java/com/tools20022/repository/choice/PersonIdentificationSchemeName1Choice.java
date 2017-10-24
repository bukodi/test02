package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalPersonIdentification1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PersonIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sets of elements to identify a name of the identification scheme.
 */
public class PersonIdentificationSchemeName1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the identification scheme, in a coded form as published in an
	 * external list.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Scheme.Code;
			componentContext_lazy = () -> PersonIdentificationSchemeName1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Name of the identification scheme, in a coded form as published in an external list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalPersonIdentification1Code.mmObject();
		}
	};
	/**
	 * Name of the identification scheme, in a free text form.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Scheme.NameShort;
			componentContext_lazy = () -> PersonIdentificationSchemeName1Choice.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Code, com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Proprietary);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationSchemeName1Choice";
				definition = "Sets of elements to identify a name of the identification scheme.";
			}
		});
		return mmObject_lazy.get();
	}
}
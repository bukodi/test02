package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalServiceLevel1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ServiceLevel;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the service level of the transaction.
 */
public class ServiceLevel8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a pre-agreed service or level of service between the parties,
	 * as published in an external service level code list.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ServiceLevel.Code;
			componentContext_lazy = () -> ServiceLevel8Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies a pre-agreed service or level of service between the parties, as published in an external service level code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalServiceLevel1Code.mmObject();
		}
	};
	/**
	 * Specifies a pre-agreed service or level of service between the parties,
	 * as a proprietary code.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ServiceLevel.mmObject();
			componentContext_lazy = () -> ServiceLevel8Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies a pre-agreed service or level of service between the parties, as a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel8Choice.Code, com.tools20022.repository.choice.ServiceLevel8Choice.Proprietary);
				trace_lazy = () -> ServiceLevel.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel8Choice";
				definition = "Specifies the service level of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalPurpose1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentObligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for the payment transaction. Usage: Purpose
 * is used by the end-customers, that is initiating party, (ultimate) debtor,
 * (ultimate) creditor to provide information concerning the nature of the
 * payment. Purpose is a content element, which is not used for processing by
 * any of the agents involved in the payment chain.
 */
public class Purpose2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying reason for the payment transaction, as published in an
	 * external purpose code list.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Purpose;
			componentContext_lazy = () -> Purpose2Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Underlying reason for the payment transaction, as published in an external purpose code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalPurpose1Code.mmObject();
		}
	};
	/**
	 * Purpose, in a proprietary form.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Purpose;
			componentContext_lazy = () -> Purpose2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Purpose, in a proprietary form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Purpose2Choice.Code, com.tools20022.repository.choice.Purpose2Choice.Proprietary);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Purpose2Choice";
				definition = "Specifies the underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			}
		});
		return mmObject_lazy.get();
	}
}
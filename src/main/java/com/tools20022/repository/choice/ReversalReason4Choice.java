package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalReversalReason1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the reversal of the transaction.
 */
public class ReversalReason4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the reversal, as published in an external reason code list.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.TransactionRejectionReason;
			componentContext_lazy = () -> ReversalReason4Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Reason for the reversal, as published in an external reason code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalReversalReason1Code.mmObject();
		}
	};
	/**
	 * Reason for the reversal, in a proprietary form.
	 */
	public static final MMMessageAttribute Proprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.TransactionRejectionReason;
			componentContext_lazy = () -> ReversalReason4Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Reason for the reversal, in a proprietary form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReversalReason4Choice.Code, com.tools20022.repository.choice.ReversalReason4Choice.Proprietary);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReversalReason4Choice";
				definition = "Specifies the reason for the reversal of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}
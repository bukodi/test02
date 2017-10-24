package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide further means of referencing a payment
 * transaction.
 */
public class PaymentIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification as assigned by an instructing party for an
	 * instructed party to unambiguously identify the instruction.
	 * 
	 * Usage: the instruction identification is a point to point reference that
	 * can be used between the instructing party and the instructed party to
	 * refer to the individual instruction. It can be included in several
	 * messages related to the instruction.
	 */
	public static final MMMessageAttribute InstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification;
			componentContext_lazy = () -> PaymentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.\n\nUsage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by the initiating party to unambiguously
	 * identify the transaction. This identification is passed on, unchanged,
	 * throughout the entire end-to-end chain.<br>
	 * <br>
	 * Usage: The end-to-end identification can be used for reconciliation or to
	 * link tasks relating to the transaction. It can be included in several
	 * messages related to the transaction.
	 */
	public static final MMMessageAttribute EndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification;
			componentContext_lazy = () -> PaymentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\r\n\r\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification1.InstructionIdentification, com.tools20022.repository.msg.PaymentIdentification1.EndToEndIdentification);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification1";
				definition = "Set of elements used to provide further means of referencing a payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique identification, as assigned by the original instructing party, to
 * unambiguously identify the message.
 */
public class OriginalMessageInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the original initiating party,
	 * to unambiguously identify the original mandate request message.
	 */
	public static final MMMessageAttribute MessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessageInformation1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original mandate request message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the message name identifier to which the message refers.
	 */
	public static final MMMessageAttribute MessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessageInformation1.mmObject();
			isDerived = false;
			xmlTag = "MsgNmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNameIdentification";
			definition = "Specifies the message name identifier to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which the message was created.
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalMessageInformation1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalMessageInformation1.MessageIdentification, com.tools20022.repository.msg.OriginalMessageInformation1.MessageNameIdentification,
						com.tools20022.repository.msg.OriginalMessageInformation1.CreationDateTime);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalMessageInformation1";
				definition = "Unique identification, as assigned by the original instructing party, to unambiguously identify the message.";
			}
		});
		return mmObject_lazy.get();
	}
}
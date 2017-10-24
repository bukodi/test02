package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.Instruction3Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further information related to the processing of the payment instruction that
 * may need to be acted upon by the creditor's agent. The instruction may relate
 * to a level of service, or may be an instruction that has to be executed by
 * the creditor's agent, or may be information required by the creditor's agent.
 */
public class InstructionForCreditorAgent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Coded information related to the processing of the payment instruction,
	 * provided by the initiating party, and intended for the creditor's agent.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructionForCreditorAgent;
			componentContext_lazy = () -> InstructionForCreditorAgent1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction3Code.mmObject();
		}
	};
	/**
	 * Further information complementing the coded instruction or instruction to
	 * the creditor's agent that is bilaterally agreed or specific to a user
	 * community.
	 */
	public static final MMMessageAttribute InstructionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionForCreditorAgent1.mmObject();
			isDerived = false;
			xmlTag = "InstrInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Further information complementing the coded instruction or instruction to the creditor's agent that is bilaterally agreed or specific to a user community.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForCreditorAgent1.Code, com.tools20022.repository.msg.InstructionForCreditorAgent1.InstructionInformation);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionForCreditorAgent1";
				definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor's agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the creditor's agent.";
			}
		});
		return mmObject_lazy.get();
	}
}
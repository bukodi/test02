package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.codeset.SequenceType3Code;
import com.tools20022.repository.entity.PaymentProcessing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide further details of the type of payment.
 */
public class PaymentTypeInformation24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 */
	public static final MMMessageAttribute InstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.Priority;
			componentContext_lazy = () -> PaymentTypeInformation24.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 */
	public static final MMMessageAssociationEnd ServiceLevel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.ServiceLevel;
			componentContext_lazy = () -> PaymentTypeInformation24.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
		}
	};
	/**
	 * User community specific instrument.
	 * 
	 * Usage: This element is used to specify a local instrument, local clearing
	 * option and/or further qualify the service or service level.
	 */
	public static final MMMessageAssociationEnd LocalInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.LocalInstrument;
			componentContext_lazy = () -> PaymentTypeInformation24.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\n\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
		}
	};
	/**
	 * Identifies the direct debit sequence, such as first, recurrent, final or
	 * one-off.
	 */
	public static final MMMessageAttribute SequenceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.SequenceType;
			componentContext_lazy = () -> PaymentTypeInformation24.mmObject();
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the direct debit sequence, such as first, recurrent, final or one-off.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories. Usage: This is used by the initiating party to
	 * provide information concerning the processing of the payment. It is
	 * likely to trigger special processing by any of the agents involved in the
	 * payment chain.
	 */
	public static final MMMessageAssociationEnd CategoryPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose;
			componentContext_lazy = () -> PaymentTypeInformation24.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation24.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation24.ServiceLevel,
						com.tools20022.repository.msg.PaymentTypeInformation24.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation24.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation24.CategoryPurpose);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeInformation24";
				definition = "Set of elements used to provide further details of the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}
}
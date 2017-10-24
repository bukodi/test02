package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeType2Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ChequeIssue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics related to a cheque instruction, such as cheque type
 * or cheque number.
 */
public class Cheque7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of cheque to be issued.
	 */
	public static final MMMessageAttribute ChequeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.ChequeType;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque to be issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a cheque as assigned by the agent.
	 */
	public static final MMMessageAttribute ChequeNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CreditInstrument.CreditInstrumentIdentification;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeNumber";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the party that ordered the issuance of the cheque.
	 */
	public static final MMMessageAssociationEnd ChequeFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeFrom";
			definition = "Identifies the party that ordered the issuance of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress10.mmObject();
		}
	};
	/**
	 * Specifies the delivery method of the cheque by the debtor's agent.
	 */
	public static final MMMessageAssociationEnd DeliveryMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliveryMethod;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "DlvryMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChequeDeliveryMethod1Choice.mmObject();
		}
	};
	/**
	 * Party to whom the debtor's agent needs to send the cheque.
	 */
	public static final MMMessageAssociationEnd DeliverTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliverTo;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "DlvrTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverTo";
			definition = "Party to whom the debtor's agent needs to send the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress10.mmObject();
		}
	};
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment instruction to apply to the processing of the
	 * payment instruction.
	 */
	public static final MMMessageAttribute InstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Priority;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	/**
	 * Date when the draft becomes payable and the debtor's account is debited.
	 */
	public static final MMMessageAttribute ChequeMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.MaturityDate;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "ChqMtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeMaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Identifies, in a coded form, the cheque layout, company logo and
	 * digitised signature to be used to print the cheque, as agreed between the
	 * initiating party and the debtor's agent.
	 */
	public static final MMMessageAttribute FormsCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.FormsCode;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, the cheque layout, company logo and digitised signature to be used to print the cheque, as agreed between the initiating party and the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information that needs to be printed on a cheque, used by the payer to
	 * add miscellaneous information.
	 */
	public static final MMMessageAttribute MemoField = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.MemoField;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "MemoFld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Regional area in which the cheque can be cleared, when a country has no
	 * nation-wide cheque clearing organisation.
	 */
	public static final MMMessageAttribute RegionalClearingZone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Cheque.RegionalClearingZone;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "RgnlClrZone";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the print location of the cheque.
	 */
	public static final MMMessageAttribute PrintLocation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ChequeIssue.PrintLocation;
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "PrtLctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Signature to be used by the cheque servicer on a specific cheque to be
	 * printed.
	 */
	public static final MMMessageAttribute Signature = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			componentContext_lazy = () -> Cheque7.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature to be used by the cheque servicer on a specific cheque to be printed.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeType, com.tools20022.repository.msg.Cheque7.ChequeNumber, com.tools20022.repository.msg.Cheque7.ChequeFrom,
						com.tools20022.repository.msg.Cheque7.DeliveryMethod, com.tools20022.repository.msg.Cheque7.DeliverTo, com.tools20022.repository.msg.Cheque7.InstructionPriority,
						com.tools20022.repository.msg.Cheque7.ChequeMaturityDate, com.tools20022.repository.msg.Cheque7.FormsCode, com.tools20022.repository.msg.Cheque7.MemoField, com.tools20022.repository.msg.Cheque7.RegionalClearingZone,
						com.tools20022.repository.msg.Cheque7.PrintLocation, com.tools20022.repository.msg.Cheque7.Signature);
				trace_lazy = () -> ChequeIssue.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Cheque7";
				definition = "Set of characteristics related to a cheque instruction, such as cheque type or cheque number.";
			}
		});
		return mmObject_lazy.get();
	}
}
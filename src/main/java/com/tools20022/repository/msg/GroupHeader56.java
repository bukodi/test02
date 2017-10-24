package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Authorisation1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 */
public class GroupHeader56 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the instructing party, and sent
	 * to the next party in the chain to unambiguously identify the message.
	 * Usage: The instructing party has to make sure that MessageIdentification
	 * is unique per instructed party for a pre-agreed period.
	 */
	public static final MMMessageAttribute MessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.";
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CreationDate;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * User identification or any user key to be used to check whether the
	 * initiating party is allowed to initiate transactions from the account
	 * specified in the message.
	 * 
	 * Usage: The content is not of a technical nature, but reflects the
	 * organisational structure at the initiating side. The authorisation
	 * element can typically be used in relay scenarios, payment initiations,
	 * payment returns or payment reversals that are initiated on behalf of a
	 * party different from the initiating party.
	 */
	public static final MMMessageAttribute Authorisation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key to be used to check whether the initiating party is allowed to initiate transactions from the account specified in the message.\n\nUsage: The content is not of a technical nature, but reflects the organisational structure at the initiating side.\nThe authorisation element can typically be used in relay scenarios, payment initiations, payment returns or payment reversals that are initiated on behalf of a party different from the initiating party.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> Authorisation1Choice.mmObject();
		}
	};
	/**
	 * Number of individual transactions contained in the message.
	 */
	public static final MMMessageAttribute NumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the message, irrespective of
	 * currencies.
	 */
	public static final MMMessageAttribute ControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether the reversal applies to the whole group of transactions
	 * or to individual transactions within the original group.
	 */
	public static final MMMessageAttribute GroupReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "GrpRvsl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversal";
			definition = "Indicates whether the reversal applies to the whole group of transactions or to individual transactions within the original group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Party that initiates the reversal message. Usage: This can be either the
	 * creditor or a party that initiates the reversal of the direct debit on
	 * behalf of the creditor.
	 */
	public static final MMMessageAssociationEnd InitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiates the reversal message. \nUsage: This can be either the creditor or a party that initiates the reversal of the direct debit on behalf of the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Financial institution that receives the instruction from the initiating
	 * party and forwards it to the next agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd ForwardingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "FwdgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardingAgent";
			definition = "Financial institution that receives the instruction from the initiating party and forwards it to the next agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the debtor.
	 */
	public static final MMMessageAssociationEnd DebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the creditor.
	 */
	public static final MMMessageAssociationEnd CreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> GroupHeader56.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader56.MessageIdentification, com.tools20022.repository.msg.GroupHeader56.CreationDateTime,
						com.tools20022.repository.msg.GroupHeader56.Authorisation, com.tools20022.repository.msg.GroupHeader56.NumberOfTransactions, com.tools20022.repository.msg.GroupHeader56.ControlSum,
						com.tools20022.repository.msg.GroupHeader56.GroupReversal, com.tools20022.repository.msg.GroupHeader56.InitiatingParty, com.tools20022.repository.msg.GroupHeader56.ForwardingAgent,
						com.tools20022.repository.msg.GroupHeader56.DebtorAgent, com.tools20022.repository.msg.GroupHeader56.CreditorAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentReversalV07.GroupHeader);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GroupHeader56";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Authorisation1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 */
public class GroupHeader47 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the instructing party, and sent
	 * to the instructed party, to unambiguously identify the message. Usage:
	 * The instructing party has to make sure that MessageIdentification is
	 * unique per instructed party for a pre-agreed period.
	 */
	public static final MMMessageAttribute MessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification;
			componentContext_lazy = () -> GroupHeader47.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the instructing party, and sent to the instructed party, to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.";
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
			componentContext_lazy = () -> GroupHeader47.mmObject();
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
	 * User identification or any user key to be used to check the authority of
	 * the initiating party.
	 * 
	 * Usage: The content is not of a technical nature, but reflects the
	 * organisational structure at the initiating side. The authorisation
	 * element can typically be used in relay scenarios, payment initiations,
	 * payment returns or payment reversals that are initiated on behalf of a
	 * party different from the initiating party.
	 */
	public static final MMMessageAttribute Authorisation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader47.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key to be used to check the authority of the initiating party.\n\nUsage: The content is not of a technical nature, but reflects the organisational structure at the initiating side. The authorisation element can typically be used in relay scenarios, payment initiations, payment returns or payment reversals that are initiated on behalf of a party different from the initiating party.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> Authorisation1Choice.mmObject();
		}
	};
	/**
	 * Party that initiates the mandate message.
	 */
	public static final MMMessageAssociationEnd InitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> GroupHeader47.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiates the mandate message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Agent that instructs the next party in the chain to carry out an
	 * instruction.
	 * 
	 * Usage Rule: In case of amendment and cancellation request messages, the
	 * instructing agent is the party sending the amendment and cancellation
	 * request message and not the party that sent the original mandate
	 * initiation request message. In case of acceptance report message, the
	 * instructing agent is the party sending the acceptance report message and
	 * not the party that sent the original mandate request message.
	 */
	public static final MMMessageAssociationEnd InstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> GroupHeader47.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out an instruction.\n\nUsage Rule:\nIn case of amendment and cancellation request messages, the instructing agent is the party sending the amendment and cancellation request message and not the party that sent the original mandate initiation request message.\nIn case of acceptance report message, the instructing agent is the party sending the acceptance report message and not the party that sent the original mandate request message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Agent that is instructed by the previous party in the chain to carry out
	 * an instruction.
	 * 
	 * Usage Rule: In case of amendment and cancellation request messages, the
	 * instructed agent is the party receiving the amendment and cancellation
	 * request message and not the party that received the original mandate
	 * initiation request message. In case of acceptance report message, the
	 * instructed agent is the party receiving the acceptance report message and
	 * not the party that received the original mandate request message.
	 */
	public static final MMMessageAssociationEnd InstructedAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> GroupHeader47.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out an instruction.\n\nUsage Rule:\nIn case of amendment and cancellation request messages, the instructed agent is the party receiving the amendment and cancellation request message and not the party that received the original mandate initiation request message.\nIn case of acceptance report message, the instructed agent is the party receiving the acceptance report message and not the party that received the original mandate request message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader47.MessageIdentification, com.tools20022.repository.msg.GroupHeader47.CreationDateTime,
						com.tools20022.repository.msg.GroupHeader47.Authorisation, com.tools20022.repository.msg.GroupHeader47.InitiatingParty, com.tools20022.repository.msg.GroupHeader47.InstructingAgent,
						com.tools20022.repository.msg.GroupHeader47.InstructedAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAcceptanceReportV05.GroupHeader, com.tools20022.repository.area.pain.MandateAmendmentRequestV05.GroupHeader,
						com.tools20022.repository.area.pain.MandateInitiationRequestV05.GroupHeader, com.tools20022.repository.area.pain.MandateCancellationRequestV05.GroupHeader,
						com.tools20022.repository.area.pain.MandateSuspensionRequestV01.GroupHeader, com.tools20022.repository.area.pain.MandateCopyRequestV01.GroupHeader);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GroupHeader47";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
			}
		});
		return mmObject_lazy.get();
	}
}
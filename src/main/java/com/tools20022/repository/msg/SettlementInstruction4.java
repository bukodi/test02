package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.SettlementMethod1Code;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.SettlementInstructionSystemRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details on the settlement of the instruction.
 */
public class SettlementInstruction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method used to settle the (batch of) payment instructions.
	 */
	public static final MMMessageAttribute SettlementMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementMethod;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 */
	public static final MMMessageAssociationEnd SettlementAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementAccount;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Specification of a pre-agreed offering between clearing agents or the
	 * channel through which the payment instruction is processed.
	 */
	public static final MMMessageAssociationEnd ClearingSystem = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SettlementInstructionSystemRole.mmObject();
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification3Choice.mmObject();
		}
	};
	/**
	 * Agent through which the instructing agent will reimburse the instructed
	 * agent.
	 * 
	 * Usage: If InstructingAgent and InstructedAgent have the same
	 * reimbursement agent, then only InstructingReimbursementAgent must be
	 * used.
	 */
	public static final MMMessageAssociationEnd InstructingReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the instructing
	 * reimbursement agent account at its servicing agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd InstructingReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Agent at which the instructed agent will be reimbursed. Usage: If
	 * InstructedReimbursementAgent contains a branch of the InstructedAgent,
	 * then the party in InstructedAgent will claim reimbursement from that
	 * branch/will be paid by that branch. Usage: If InstructingAgent and
	 * InstructedAgent have the same reimbursement agent, then only
	 * InstructingReimbursementAgent must be used.
	 */
	public static final MMMessageAssociationEnd InstructedReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.InstructedReimbursementAgent.mmObject();
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the instructed reimbursement
	 * agent account at its servicing agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd InstructedReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Agent at which the instructed agent will be reimbursed. Usage: If
	 * ThirdReimbursementAgent contains a branch of the InstructedAgent, then
	 * the party in InstructedAgent will claim reimbursement from that
	 * branch/will be paid by that branch.
	 */
	public static final MMMessageAssociationEnd ThirdReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If ThirdReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the third reimbursement
	 * agent account at its servicing agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd ThirdReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			componentContext_lazy = () -> SettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.SettlementMethod, com.tools20022.repository.msg.SettlementInstruction4.SettlementAccount,
						com.tools20022.repository.msg.SettlementInstruction4.ClearingSystem, com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgent,
						com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInstruction4.InstructedReimbursementAgent,
						com.tools20022.repository.msg.SettlementInstruction4.InstructedReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgent,
						com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgentAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementInstruction4";
				definition = "Provides further details on the settlement of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}
}
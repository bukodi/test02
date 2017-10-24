package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agent at which the instructed agent will be reimbursed. Usage: If the
 * instructing and instructed agents have the same reimbursement agent, then
 * only InstructedReimbursementAgent is not allowed. Usage: If
 * InstructedReimbursementAgent contains a branch of the instructed agent, then
 * the instructed agent will claim reimbursement from that branch/will be paid
 * by that branch.
 */
public class InstructedReimbursementAgent extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructedReimbursementAgent";
				definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If the instructing and instructed agents have the same reimbursement agent, then only InstructedReimbursementAgent is not allowed.\nUsage: If InstructedReimbursementAgent contains a branch of the instructed agent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.InstructedReimbursementAgent);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
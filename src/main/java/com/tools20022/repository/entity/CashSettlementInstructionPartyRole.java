package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in cash settlement.
 */
public class CashSettlementInstructionPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role such as instructing reimbursement agent account...
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInstruction4.InstructedReimbursementAgentAccount,
					com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgentAccount);
			isDerived = false;
			elementContext_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as instructing reimbursement agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Identifies the settlement instruction in which a party plays a role.
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Identifies the settlement instruction in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlementInstructionPartyRole";
				definition = "Role played by a party in cash settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole, com.tools20022.repository.entity.CashSettlement.PartyRole);
				subType_lazy = () -> Arrays.asList(SettlementInstructionSystemRole.mmObject(), InstructedReimbursementAgent.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}
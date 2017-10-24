package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a specific system or set of rules and/or processes to be
 * applied at the settlement place.
 */
public class SettlementInstructionSystemRole extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the system which plays a role in the settlement of a payment.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementInstructionSystemRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the settlement of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.SystemRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionSystemRole";
				definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.SystemRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.ClearingSystem);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementInstructionSystemRole.System);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Infrastructure that may be a component of a clearing house and which
 * facilitates clearing and settlement for its members by standing between the
 * buyer and the seller. It may net transactions and it substitutes itself as
 * settlement counterparty for each position.
 */
public class CentralClearingCounterpartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the system which plays a role in the clearing of securities.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CentralClearingCounterpartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the clearing of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.CentralClearingCounterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CentralClearingCounterpartyRole";
				definition = "Infrastructure that may be a component of a clearing house and which facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.CentralClearingCounterparty);
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CentralClearingCounterpartyRole.System);
			}
		});
		return mmObject_lazy.get();
	}
}
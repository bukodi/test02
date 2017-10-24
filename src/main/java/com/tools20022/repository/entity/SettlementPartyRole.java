package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in a settlement process.
 */
public class SettlementPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account which is used for settlement.
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Account which is used for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SettlementPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Specifies the settlement process for which the party plays a role.
	 */
	public static final MMBusinessAssociationEnd Settlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SettlementPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Specifies the settlement process for which the party plays a role.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.SettlementPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementPartyRole";
				definition = "Role played by a party in a settlement process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.SettlementPartyRole, com.tools20022.repository.entity.Settlement.SettlementPartyRole);
				subType_lazy = () -> Arrays.asList(SecuritiesSettlementPartyRole.mmObject(), CashSettlementInstructionPartyRole.mmObject(), TreasurySettlementPartyRole.mmObject(), SSIDatabaseProvider.mmObject(),
						CentralClearingCounterpartyRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount, com.tools20022.repository.entity.SettlementPartyRole.Settlement);
			}
		});
		return mmObject_lazy.get();
	}
}
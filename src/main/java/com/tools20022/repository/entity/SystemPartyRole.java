package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in a system.
 */
public class SystemPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the system for which a party plays a role
	 */
	public static final MMBusinessAssociationEnd RelatedSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSystem";
			definition = "Specifies the system for which a party plays a role";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemPartyRole";
				definition = "Role played by a party in a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.PartyRole);
				subType_lazy = () -> Arrays.asList(SystemMemberRole.mmObject(), TransactionAdministrator.mmObject(), TerminalManagerRole.mmObject(), ClearingMemberRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemPartyRole.RelatedSystem);
			}
		});
		return mmObject_lazy.get();
	}
}
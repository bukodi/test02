package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation represented by a person, or for which a person works.
 */
public class EmployingPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the employee of a party.
	 */
	public static final MMBusinessAssociationEnd Employee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> EmployingPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Employee";
			definition = "Identifies the employee of a party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.EmployingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EmployingPartyRole";
				definition = "Organisation represented by a person, or for which a person works.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.EmployingParty);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.EmployingPartyRole.Employee);
			}
		});
		return mmObject_lazy.get();
	}
}
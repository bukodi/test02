package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the members of a household in relation with the ownership of an
 * account.
 */
public class Household {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the member of a household.
	 */
	public static final MMBusinessAssociationEnd Member = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Household.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Member";
			definition = "Identifies the member of a household.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.Household;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Household";
				definition = "Specifies the members of a household in relation with the ownership of an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.Household);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Household.Member);
			}
		});
		return mmObject_lazy.get();
	}
}
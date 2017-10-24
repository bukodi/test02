package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Multilateral system among participating institutions, including the operator
 * of the system, used for the purposes of clearing, settling, or recording
 * payments, securities, derivatives or other financial transactions.
 */
public class MarketInfrastructure extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines the link between the accounts held with a market infrastructure.
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarketInfrastructure.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between the accounts held with a market infrastructure.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.MarketInfrastructure;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketInfrastructure";
				definition = "Multilateral system among participating institutions, including the operator of the system, used for the purposes of clearing, settling, or recording payments, securities, derivatives or other financial transactions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountLink.MarketInfrastructure);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketInfrastructure.AccountLink);
			}
		});
		return mmObject_lazy.get();
	}
}
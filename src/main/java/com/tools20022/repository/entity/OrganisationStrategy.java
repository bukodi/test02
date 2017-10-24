package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PortfolioStrategy;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Strategy is organisation based.
 */
public class OrganisationStrategy extends PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Strategy is organisation based.
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Strategy is organisation based.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationStrategy";
				definition = "Strategy is organisation based.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.Strategy);
				superType_lazy = () -> PortfolioStrategy.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationStrategy.Organisation);
			}
		});
		return mmObject_lazy.get();
	}
}
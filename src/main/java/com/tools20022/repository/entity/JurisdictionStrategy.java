package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PortfolioStrategy;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Strategy is jurisdiction based.
 */
public class JurisdictionStrategy extends PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Jurisdiction (country, county, state, province, city) of the investment.
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> JurisdictionStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) of the investment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.AssociatedStrategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "JurisdictionStrategy";
				definition = "Strategy is jurisdiction based.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Jurisdiction.AssociatedStrategy);
				superType_lazy = () -> PortfolioStrategy.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.JurisdictionStrategy.Jurisdiction);
			}
		});
		return mmObject_lazy.get();
	}
}
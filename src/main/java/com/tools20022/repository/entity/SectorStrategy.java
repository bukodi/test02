package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PortfolioStrategy;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Strategy is sector based.
 */
public class SectorStrategy extends PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SectorStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SectorStrategy";
				definition = "Strategy is sector based.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Sector.Strategy);
				superType_lazy = () -> PortfolioStrategy.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SectorStrategy.Sector);
			}
		});
		return mmObject_lazy.get();
	}
}
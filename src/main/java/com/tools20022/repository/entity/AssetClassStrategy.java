package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PortfolioStrategy;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Strategy is asset class based.
 */
public class AssetClassStrategy extends PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Strategy based on asset classes.
	 */
	public static final MMBusinessAssociationEnd AssetClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetClassStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClass";
			definition = "Strategy based on asset classes.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssetClassification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassStrategy";
				definition = "Strategy is asset class based.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.Strategy);
				superType_lazy = () -> PortfolioStrategy.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassStrategy.AssetClass);
			}
		});
		return mmObject_lazy.get();
	}
}
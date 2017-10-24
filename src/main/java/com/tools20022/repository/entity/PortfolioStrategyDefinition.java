package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional information on the definition of the strategy.
 */
public class PortfolioStrategyDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Stategy attached to the portfolio.
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategyDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Stategy attached to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.Definition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioStrategy.mmObject();
		}
	};
	/**
	 * Name of the defined strategy.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategyDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the defined strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Free text description of the strategy definition.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategyDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the strategy definition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Period during which the defined strategy is valid.
	 */
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategyDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the defined strategy is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioStrategyDefinition";
				definition = "Additional information on the definition of the strategy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioStrategy.Definition);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioStrategyDefinition.Strategy, com.tools20022.repository.entity.PortfolioStrategyDefinition.Name,
						com.tools20022.repository.entity.PortfolioStrategyDefinition.Description, com.tools20022.repository.entity.PortfolioStrategyDefinition.EffectivePeriod);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DistributionPolicyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rough allocation of the portfolio.
 */
public class PortfolioStrategy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Portfolio for which a strategy is specified.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which a strategy is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Indicates whether the referred strategy is included.
	 */
	public static final MMBusinessAttribute InclusionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InclusionIndicator";
			definition = "Indicates whether the referred strategy is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum amount that has to be invested in the specified strategy.
	 */
	public static final MMBusinessAttribute MinimumInvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentAmount";
			definition = "Minimum amount that has to be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum percentage that has to be invested in the specified strategy.
	 */
	public static final MMBusinessAttribute MinimumInvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInvestmentRate";
			definition = "Minimum percentage that has to be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum amount that may be invested in the specified strategy.
	 */
	public static final MMBusinessAttribute MaximumInvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentAmount";
			definition = "Maximum amount that may be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum percentage that may be invested in the specified strategy.
	 */
	public static final MMBusinessAttribute MaximumInvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumInvestmentRate";
			definition = "Maximum percentage that may be invested in the specified strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Period during which the investment guideline is valid.
	 */
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the investment guideline is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Income policy relating to the fund, ie, if income is paid out or retained
	 * in the fund.
	 */
	public static final MMBusinessAttribute DistributionPolicy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to the fund, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Free text description of the investment guideline, for example, rating
	 * requirements.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the investment guideline, for example, rating requirements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	/**
	 * Definition of the portfolio strategy.
	 */
	public static final MMBusinessAssociationEnd Definition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioStrategy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Definition";
			definition = "Definition of the portfolio strategy.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategyDefinition.Strategy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioStrategyDefinition.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioStrategy";
				definition = "Rough allocation of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Strategy, com.tools20022.repository.entity.PortfolioStrategyDefinition.Strategy);
				subType_lazy = () -> Arrays.asList(JurisdictionStrategy.mmObject(), OrganisationStrategy.mmObject(), SectorStrategy.mmObject(), AssetClassStrategy.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioStrategy.Portfolio, com.tools20022.repository.entity.PortfolioStrategy.InclusionIndicator,
						com.tools20022.repository.entity.PortfolioStrategy.MinimumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.MinimumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.MaximumInvestmentAmount, com.tools20022.repository.entity.PortfolioStrategy.MaximumInvestmentRate,
						com.tools20022.repository.entity.PortfolioStrategy.EffectivePeriod, com.tools20022.repository.entity.PortfolioStrategy.DistributionPolicy, com.tools20022.repository.entity.PortfolioStrategy.Description,
						com.tools20022.repository.entity.PortfolioStrategy.Definition);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Wrapper for a specific product or a specific sub-product owned by a set of
 * beneficial owners.
 */
public class Portfolio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Valuation process for the portfolio.
	 */
	public static final MMBusinessAssociationEnd Valuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioValuation.mmObject();
		}
	};
	/**
	 * Transfer information related to a portfolio.
	 */
	public static final MMBusinessAssociationEnd Transfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transfer";
			definition = "Transfer information related to a portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};
	/**
	 * Specifies the assets included in the portfolio together with their value.
	 */
	public static final MMBusinessAssociationEnd AssetDescription = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetDescription";
			definition = "Specifies the assets included in the portfolio together with their value.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}
	};
	/**
	 * Name of the portfolio.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identification of the portfolio.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Strategy set for the portfolio.
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy set for the portfolio.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioStrategy.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioStrategy.mmObject();
		}
	};
	/**
	 * Information on the benchmark set for the portfolio.
	 */
	public static final MMBusinessAssociationEnd Benchmark = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Information on the benchmark set for the portfolio.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioBenchmark.mmObject();
		}
	};
	/**
	 * Investment plan associated with a portfolio.
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan associated with a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	/**
	 * Account on which the portfolio is held.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Portfolio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account on which the portfolio is held.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.Portfolio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Portfolio";
				definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Portfolio, com.tools20022.repository.entity.InvestmentAccount.Portfolio, com.tools20022.repository.entity.InvestmentPlan.Portfolio,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio, com.tools20022.repository.entity.PortfolioValuation.Portfolio, com.tools20022.repository.entity.PortfolioStrategy.Portfolio,
						com.tools20022.repository.entity.PortfolioBenchmark.Portfolio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Valuation, com.tools20022.repository.entity.Portfolio.Transfer, com.tools20022.repository.entity.Portfolio.AssetDescription,
						com.tools20022.repository.entity.Portfolio.Name, com.tools20022.repository.entity.Portfolio.Identification, com.tools20022.repository.entity.Portfolio.Strategy, com.tools20022.repository.entity.Portfolio.Benchmark,
						com.tools20022.repository.entity.Portfolio.InvestmentPlan, com.tools20022.repository.entity.Portfolio.Account);
			}
		});
		return mmObject_lazy.get();
	}
}
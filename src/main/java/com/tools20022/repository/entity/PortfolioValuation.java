package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Valuation information of the portfolio.
 */
public class PortfolioValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total value of the portfolio. It is derived from the sum of the values of
	 * the asset holdings, of the unrealised gain/loss and of the liabilities.
	 */
	public static final MMBusinessAttribute TotalPortfolioValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalPortfolioValue";
			definition = "Total value of the portfolio. It is derived from the sum of the values of the asset holdings, of the unrealised gain/loss and of the liabilities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Net asset on balance sheet - total portfolio value minus or plus the
	 * unrealised gain or loss.
	 */
	public static final MMBusinessAttribute TotalBookValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total receipts attributable to the portfolio.
	 */
	public static final MMBusinessAttribute TotalReceipts = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalReceipts";
			definition = "Total receipts attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total disbursements attributable to the portfolio.
	 */
	public static final MMBusinessAttribute TotalDisbursements = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalDisbursements";
			definition = "Total disbursements attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Income attributable to the portfolio.
	 */
	public static final MMBusinessAttribute IncomeReceived = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeReceived";
			definition = "Income attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Expenses attributable to the portfolio
	 */
	public static final MMBusinessAttribute ExpensesPaid = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpensesPaid";
			definition = "Expenses attributable to the portfolio";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the portfolio for which a valuation is calculated.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Specifies the portfolio for which a valuation is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Valuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Period for which the valuation is calculated.
	 */
	public static final MMBusinessAssociationEnd ValuationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationPeriod";
			definition = "Period for which the valuation is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioValuation";
				definition = "Valuation information of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation, com.tools20022.repository.entity.Portfolio.Valuation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioValuation.TotalPortfolioValue, com.tools20022.repository.entity.PortfolioValuation.TotalBookValue,
						com.tools20022.repository.entity.PortfolioValuation.TotalReceipts, com.tools20022.repository.entity.PortfolioValuation.TotalDisbursements, com.tools20022.repository.entity.PortfolioValuation.IncomeReceived,
						com.tools20022.repository.entity.PortfolioValuation.ExpensesPaid, com.tools20022.repository.entity.PortfolioValuation.Portfolio, com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod);
			}
		});
		return mmObject_lazy.get();
	}
}
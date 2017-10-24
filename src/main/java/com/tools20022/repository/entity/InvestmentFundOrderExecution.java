package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of investment fund units subscribed or redeemed.
	 */
	public static final MMBusinessAssociationEnd UnitsNumber = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 */
	public static final MMBusinessAttribute NonStandardSettlementInformation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Order which is executed.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrder.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
	 */
	public static final MMBusinessAttribute DealIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Price at which the order was executed.
	 */
	public static final MMBusinessAssociationEnd ExecutedTradePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
	 */
	public static final MMBusinessAttribute PartiallyExecutedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
	 */
	public static final MMBusinessAttribute InterimProfitAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Other quoted price than the one at which the order was executed.
	 */
	public static final MMBusinessAssociationEnd InformativePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 */
	public static final MMBusinessAttribute BestExecution = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}
	};
	/**
	 * Percentage of units partially settled.
	 */
	public static final MMBusinessAttribute PartialSettlementOfUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage of cash partially settled.
	 */
	public static final MMBusinessAttribute PartialSettlementOfCash = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies whether the order execution confirmation is late.
	 */
	public static final MMBusinessAttribute LateReport = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}
	};
	/**
	 * Indicates whether the cash payment with respect to the executed order is
	 * settled.
	 */
	public static final MMBusinessAttribute SettledIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the executed order has a registered status on the books
	 * of the transfer agent.
	 */
	public static final MMBusinessAttribute RegisteredIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money invested or redeemed as a result of an investment fund
	 * order.
	 */
	public static final MMBusinessAttribute ExecutedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Transaction which is executed.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	/**
	 * Specifies the cash flow resulting from the execution of an order.
	 */
	public static final MMBusinessAssociationEnd CashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}
	};
	/**
	 * Source of cash used for the settlement of the execution.
	 */
	public static final MMBusinessAttribute SourceOfCash = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.FundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution, com.tools20022.repository.entity.FundsCashFlow.RelatedOrder);
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.NonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.Order, com.tools20022.repository.entity.InvestmentFundOrderExecution.DealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.BestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.PartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.LateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.SettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.RegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.ExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.SourceOfCash);
			}
		});
		return mmObject_lazy.get();
	}
}
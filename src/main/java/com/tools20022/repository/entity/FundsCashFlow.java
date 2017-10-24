package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, for example, subscriptions or redemptions.
 */
public class FundsCashFlow {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the cash flow is exceptional , eg, extraordinary cash
	 * amounts in or out.
	 */
	public static final MMBusinessAttribute ExceptionalCashFlowIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the direction of the cash flow from the perspective of the
	 * fund.
	 */
	public static final MMBusinessAttribute FlowDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionTypeCode.mmObject();
		}
	};
	/**
	 * Account entry which is linked to a fund subscription process.
	 */
	public static final MMBusinessAssociationEnd FundSubscriptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionAccountEntry";
			definition = "Account entry which is linked to a fund subscription process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}
	};
	/**
	 * Account entry which is linked to a fund redemption process.
	 */
	public static final MMBusinessAssociationEnd FundRedemptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionAccountEntry";
			definition = "Account entry which is linked to a fund redemption process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}
	};
	/**
	 * Trade which is the source for the calculation of the cash flow movements.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Trade which is the source for the calculation of the cash flow movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}
	};
	/**
	 * Indicates whether the cash flow is the result of netting.
	 */
	public static final MMBusinessAttribute NetIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetIndicator";
			definition = "Indicates whether the cash flow is the result of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Net asset value incorporating the net cash flow for a valuation date.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value incorporating the net cash flow for a valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Value and quantity of the cash flow.
	 */
	public static final MMBusinessAssociationEnd CashFlowQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FundsCashFlow.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlowQuantity";
			definition = "Value and quantity of the cash flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundsCashFlow";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.FundsCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.CashFlow, com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundsCashFlow.ExceptionalCashFlowIndicator, com.tools20022.repository.entity.FundsCashFlow.FlowDirection,
						com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.RelatedOrder,
						com.tools20022.repository.entity.FundsCashFlow.NetIndicator, com.tools20022.repository.entity.FundsCashFlow.NetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity);
			}
		});
		return mmObject_lazy.get();
	}
}
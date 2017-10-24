package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.OffMarketCode;
import com.tools20022.repository.codeset.ProcessingPositionCode;
import com.tools20022.repository.codeset.ReportingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 */
public class SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Whether the net proceeds include stamp duty amount.
	 */
	public static final MMBusinessAttribute StampDutyIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDutyIndicator";
			definition = "Whether the net proceeds include stamp duty amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * When the transaction is to be executed relative to a linked transaction.
	 */
	public static final MMBusinessAttribute ProcessingPosition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingPositionCode.mmObject();
		}
	};
	/**
	 * Process of settling securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Process of settling securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 */
	public static final MMBusinessAssociationEnd DealPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Difference in prices at which a dealer will buy and sell.
	 */
	public static final MMBusinessAttribute MarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAmount";
			definition = "Difference in prices at which a dealer will buy and sell.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument executed by the trading party.
	 */
	public static final MMBusinessAssociationEnd ExecutedTradeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Reason for which the trade was executed off-market.
	 */
	public static final MMBusinessAttribute OffMarketReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffMarketReason";
			definition = "Reason for which the trade was executed off-market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffMarketCode.mmObject();
		}
	};
	/**
	 * Trade which is executed through one or more execution trades.
	 */
	public static final MMBusinessAssociationEnd RelatedTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTrade";
			definition = "Trade which is executed through one or more execution trades.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradingExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Deal price multiplied by the quantity of a financial instrument traded
	 * for the specific trade transaction i.e. the partially filled quantity.
	 */
	public static final MMBusinessAttribute DealExecutionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealExecutionAmount";
			definition = "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the cash delivery obligations resulting from the trade.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the securities delivery obligations resulting from the trade.
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the securities delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	/**
	 * Specifies that a trade is to be reported to a third party.
	 */
	public static final MMBusinessAttribute ReportingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingType";
			definition = "Specifies that a trade is to be reported to a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeExecution";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesTrade.TradingExecution,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrderExecution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeExecution.StampDutyIndicator, com.tools20022.repository.entity.SecuritiesTradeExecution.ProcessingPosition,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice,
						com.tools20022.repository.entity.SecuritiesTradeExecution.MarginAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTradeExecution.OffMarketReason, com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealExecutionAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.SecuritiesTradeExecution.ReportingType);
			}
		});
		return mmObject_lazy.get();
	}
}
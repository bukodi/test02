package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Order;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Intention to transfer an ownership of a financial instrument.
 */
public class SecuritiesOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time on which the order is effective.
	 */
	public static final MMBusinessAttribute OrderEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderEffectiveDate";
			definition = "Date/time on which the order is effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time on which the order is to expire.
	 */
	public static final MMBusinessAttribute OrderExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExpiryDate";
			definition = "Date/time on which the order is to expire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique identifier for an order, as assigned by the sell-side. The
	 * identifier must be unique within a single trading day.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies whether an order is a margin order or a non-margin order. This
	 * is primarily used when sending orders to Japanese exchanges to indicate
	 * sell margin or buy to cover. The same tag could be assigned also by
	 * buy-side to indicate the intent to sell or buy margin and the sell-side
	 * to accept or reject (base on some validation criteria) the margin
	 * request.
	 */
	public static final MMBusinessAttribute CashMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashMarginOrderCode.mmObject();
		}
	};
	/**
	 * Coded list to specify the side of the order.
	 */
	public static final MMBusinessAttribute Side = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SideCode.mmObject();
		}
	};
	/**
	 * Indicates that an order has been generated in response to an
	 * advertisement or an indication of interest.
	 */
	public static final MMBusinessAttribute SolicitedOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Capacity of customer placing the order. Primarily used by futures
	 * exchanges to indicate the CTI code (customer type indicator) as required
	 * by the US CFTC (Commodity Futures Trading Commission).
	 */
	public static final MMBusinessAttribute CustomerCapacity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerOrderCapacityCode.mmObject();
		}
	};
	/**
	 * Indicates whether the resulting position after a trade should be an
	 * opening position or closing position. Used for omnibus accounting - where
	 * accounts are held on a gross basis instead of being netted together.
	 */
	public static final MMBusinessAttribute PositionEffect = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositionEffectCode.mmObject();
		}
	};
	/**
	 * Indicates a request for a foreign exchange accommodation trade to be
	 * executed along with security transaction.
	 */
	public static final MMBusinessAttribute ForeignExchangeExecutionRequested = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency to be used for settlement.
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Counterparties eligibility as defined by article 24 of the EU MiFID
	 * Directive applicable to transactions executed by investment firms for
	 * eligible counterparties.
	 */
	public static final MMBusinessAttribute OrderOriginatorEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to be ordered.
	 */
	public static final MMBusinessAssociationEnd OrderedQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Type of business process model used to carry out the transaction.
	 */
	public static final MMBusinessAttribute BusinessProcessType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessProcessType";
			definition = "Type of business process model used to carry out the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessProcessTypeCode.mmObject();
		}
	};
	/**
	 * Market at which the order is to be traded.
	 */
	public static final MMBusinessAssociationEnd PlaceOfTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market at which the order is to be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Cash amount to be used to derive the appropriate quantity of financial
	 * instrument to be bought or sold.
	 */
	public static final MMBusinessAttribute OrderedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedAmount";
			definition = "Cash amount to be used to derive the appropriate quantity of financial instrument to be bought or sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the number of days from trade date that the counterparty on the
	 * other side of the trade should be "given up" or divulged.
	 */
	public static final MMBusinessAttribute GiveUpNumberOfDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	/**
	 * Specifies the regulatory conditions type of the trade.
	 */
	public static final MMBusinessAttribute TradeRegulatoryConditionsType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
		}
	};
	/**
	 * For good till orders, the order quantity less all quantity (adjusted for
	 * stock splits) that traded on previous days.
	 */
	public static final MMBusinessAssociationEnd DayOrderQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayOrderQuantity";
			definition = "For good till orders, the order quantity less all quantity (adjusted for stock splits) that traded on previous days.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the party which plays a role in the process of ordering
	 * securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderPartyRole";
			definition = "Specifies the party which plays a role in the process of ordering securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderPartyRole.mmObject();
		}
	};
	/**
	 * Indicates the status of an order at a specific point in time.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Indicates the status of an order at a specific point in time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
		}
	};
	/**
	 * Negotiation which resulted in an order.
	 */
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation which resulted in an order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}
	};
	/**
	 * Charges and commissions associated with a securities order.
	 */
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Charges and commissions associated with a securities order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Legal parameters required in a securities order for regulatory purposes.
	 */
	public static final MMBusinessAssociationEnd LegalParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalParameters";
			definition = "Legal parameters required in a securities order for regulatory purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
		}
	};
	/**
	 * Indicates the requested price for the order. This can be a "stop" price a
	 * "limit" price or a "deal" price.
	 */
	public static final MMBusinessAssociationEnd OrderPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPrice";
			definition = "Indicates the requested price for the order. This can be a \"stop\" price a \"limit\" price or a \"deal\" price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates the stop price in case of a stop order or a stop limit order.
	 */
	public static final MMBusinessAssociationEnd StopPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopPrice";
			definition = "Indicates the stop price in case of a stop order or a stop limit order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Information about the pre-allocation of an order.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderAllocation";
			definition = "Information about the pre-allocation of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}
	};
	/**
	 * Conditions under which a securities order must be executed.
	 */
	public static final MMBusinessAssociationEnd OrderExecutionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecutionParameters";
			definition = "Conditions under which a securities order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}
	};
	/**
	 * Result of a securities order.
	 */
	public static final MMBusinessAssociationEnd OrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderExecution";
			definition = "Result of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Account impacted by a security transaction.
	 */
	public static final MMBusinessAssociationEnd OrderingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderingAccount";
			definition = "Account impacted by a security transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Quote for which the order conditions are specified.
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote for which the order conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Indicates the type of investment funds transaction.
	 */
	public static final MMBusinessAttribute FundTransactionDirectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundTransactionDirectionIndicator";
			definition = "Indicates the type of investment funds transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * Date/time on which the order was placed by the investor with the trading
	 * party.
	 */
	public static final MMBusinessAttribute OrderDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDate";
			definition = "Date/time on which the order was placed by the investor with the \ntrading party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Price difference for a pegged order.
	 */
	public static final MMBusinessAttribute PegDifference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PegDifference";
			definition = "Price difference for a pegged order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Details of a specific trading session associated with a securities order.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrderTradingSession";
			definition = "Details of a specific trading session associated with a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}
	};
	/**
	 * Order book whichgenerates an order.
	 */
	public static final MMBusinessAssociationEnd RelatedOrderBook = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderBook";
			definition = "Order book whichgenerates an order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrderBook.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> OrderBook.mmObject();
		}
	};
	/**
	 * List trading information containing a serie of orders.
	 */
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading information containing a serie of orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.SecuritiesListOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};
	/**
	 * Cross trade for which the buy side information is provided.
	 */
	public static final MMBusinessAssociationEnd BuySideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideRelatedCrossTrade";
			definition = "Cross trade for which the buy side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.BuySideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CrossTrade.mmObject();
		}
	};
	/**
	 * Cross trade for which the sell side information is provided.
	 */
	public static final MMBusinessAssociationEnd SellSideRelatedCrossTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideRelatedCrossTrade";
			definition = "Cross trade for which the sell side information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CrossTrade.SellSideOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CrossTrade.mmObject();
		}
	};
	/**
	 * Security for which an order is specified.
	 */
	public static final MMBusinessAssociationEnd OrderedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderedSecurity";
			definition = "Security for which an order is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Information about the booking of executions.
	 */
	public static final MMBusinessAssociationEnd BookingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookingInstructions";
			definition = "Information about the booking of executions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPostTradeBooking.mmObject();
		}
	};
	/**
	 * Conditions under which an exchange for physical trade takes place in the
	 * case of a non disclosed bid.
	 */
	public static final MMBusinessAssociationEnd ExchangeForPhysicalTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Conditions under which an exchange for physical trade takes place in the case of a non disclosed bid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExchangeForPhysicalTrade.mmObject();
		}
	};
	/**
	 * Describes how the quantity is specified, that is by quantity of units or
	 * by amount of money.
	 */
	public static final MMBusinessAttribute QuantityType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityType";
			definition = "Describes how the quantity is specified, that is by quantity of units or by amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderQuantityTypeCode.mmObject();
		}
	};
	/**
	 * Unique identifier for the order as assigned by the buy-side. Uniqueness
	 * must be guaranteed within a single trading day. Firms, particularly those
	 * that electronically submit multi-day orders, trade globally or throughout
	 * market close periods, should ensure uniqueness across days, for example
	 * by embedding a date within the ClientOrderIdentification element.
	 */
	public static final MMBusinessAttribute ClientOrderIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side.  Uniqueness must be guaranteed within a single trading day.  Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Execution instructions in which securities order parameters are defined.
	 */
	public static final MMBusinessAssociationEnd ExecutionInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionInstructions";
			definition = "Execution instructions in which securities order parameters are defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
		}
	};
	/**
	 * Indicates the type of instruction to a broker or dealer to buy or sell a
	 * financial instrument.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrder";
				definition = "Intention to transfer an ownership of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesPricing.Order,
						com.tools20022.repository.entity.SecuritiesPricing.StopPriceOrder, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.Adjustment.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder,
						com.tools20022.repository.entity.SecuritiesTrade.RelatedOrder, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder, com.tools20022.repository.entity.TradingSession.SecuritiesOrder,
						com.tools20022.repository.entity.Allocation.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesPostTradeBooking.RelatedOrder, com.tools20022.repository.entity.SecuritiesOrderPartyRole.SecuritiesOrder, com.tools20022.repository.entity.Negotiation.SecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder,
						com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder,
						com.tools20022.repository.entity.ExchangeForPhysicalTrade.SecuritiesOrder, com.tools20022.repository.entity.OrderBook.Order, com.tools20022.repository.entity.CrossTrade.BuySideOrder,
						com.tools20022.repository.entity.CrossTrade.SellSideOrder);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrder.mmObject(), CrossTrade.mmObject());
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.OrderEffectiveDate, com.tools20022.repository.entity.SecuritiesOrder.OrderExpiryDate,
						com.tools20022.repository.entity.SecuritiesOrder.Identification, com.tools20022.repository.entity.SecuritiesOrder.CashMargin, com.tools20022.repository.entity.SecuritiesOrder.Side,
						com.tools20022.repository.entity.SecuritiesOrder.SolicitedOrder, com.tools20022.repository.entity.SecuritiesOrder.CustomerCapacity, com.tools20022.repository.entity.SecuritiesOrder.PositionEffect,
						com.tools20022.repository.entity.SecuritiesOrder.ForeignExchangeExecutionRequested, com.tools20022.repository.entity.SecuritiesOrder.SettlementCurrency,
						com.tools20022.repository.entity.SecuritiesOrder.OrderOriginatorEligibility, com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.BusinessProcessType,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.SecuritiesOrder.OrderedAmount, com.tools20022.repository.entity.SecuritiesOrder.GiveUpNumberOfDays,
						com.tools20022.repository.entity.SecuritiesOrder.TradeRegulatoryConditionsType, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderPartyRole, com.tools20022.repository.entity.SecuritiesOrder.Status, com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation,
						com.tools20022.repository.entity.SecuritiesOrder.Adjustments, com.tools20022.repository.entity.SecuritiesOrder.LegalParameters, com.tools20022.repository.entity.SecuritiesOrder.OrderPrice,
						com.tools20022.repository.entity.SecuritiesOrder.StopPrice, com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation, com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesOrder.OrderExecution, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.SecuritiesOrder.Quote,
						com.tools20022.repository.entity.SecuritiesOrder.FundTransactionDirectionIndicator, com.tools20022.repository.entity.SecuritiesOrder.OrderDate, com.tools20022.repository.entity.SecuritiesOrder.PegDifference,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession, com.tools20022.repository.entity.SecuritiesOrder.RelatedOrderBook, com.tools20022.repository.entity.SecuritiesOrder.ListTrading,
						com.tools20022.repository.entity.SecuritiesOrder.BuySideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.SellSideRelatedCrossTrade,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedSecurity, com.tools20022.repository.entity.SecuritiesOrder.BookingInstructions, com.tools20022.repository.entity.SecuritiesOrder.ExchangeForPhysicalTrade,
						com.tools20022.repository.entity.SecuritiesOrder.QuantityType, com.tools20022.repository.entity.SecuritiesOrder.ClientOrderIdentification, com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions,
						com.tools20022.repository.entity.SecuritiesOrder.Type);
			}
		});
		return mmObject_lazy.get();
	}
}
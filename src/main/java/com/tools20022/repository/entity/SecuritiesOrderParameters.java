package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of the transfer of a financial instrument.
 */
public class SecuritiesOrderParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Minimum quantity of financial instrument to be bought or sold if the
	 * entire order cannot be executed.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Minimum quantity of financial instrument to be bought or sold if the entire order cannot be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Allows orders to specify a minimum quantity that applies to every
	 * execution. (one execution could be for multiple counter-orders). The
	 * order may still fill against smaller orders, but the cumulative quantity
	 * of the execution must be in multiples of the MatchIncrement.
	 */
	public static final MMBusinessAssociationEnd MatchIncrement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchIncrement";
			definition = "Allows orders to specify a minimum quantity that applies to every execution. (one execution could be for multiple counter-orders). The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the MatchIncrement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Additional instructions if the order is pegged.
	 */
	public static final MMBusinessAssociationEnd PegInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PegInstructions";
			definition = "Additional instructions if the order is pegged.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
		}
	};
	/**
	 * Previous closing price of security.
	 */
	public static final MMBusinessAssociationEnd PreviousClosingPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates whether an automatic routing system is involved.
	 */
	public static final MMBusinessAttribute AutoRouting = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoRouting";
			definition = "Indicates whether an automatic routing system is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoRoutingCode.mmObject();
		}
	};
	/**
	 * Indicates the possible options or choices available to account owner (for
	 * investment funds).
	 */
	public static final MMBusinessAttribute CorporateActionOptionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionIndicator";
			definition = "Indicates the possible options or choices available to account owner (for investment funds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}
	};
	/**
	 * Indicates from/until when an order must be executed.
	 */
	public static final MMBusinessAttribute ExecutionTimeLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionTimeLimit";
			definition = "Indicates from/until when an order must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExecutionTimeLimitCode.mmObject();
		}
	};
	/**
	 * Indicates the conditions that apply to a pre-allocation.
	 */
	public static final MMBusinessAttribute PreAllocationConditionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAllocationConditionIndicator";
			definition = "Indicates the conditions that apply to a pre-allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Indicates the execution priority of the trade.
	 */
	public static final MMBusinessAttribute PriorityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates the execution priority of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Currency in which a trade should be executed.
	 */
	public static final MMBusinessAttribute RequestedDealCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedDealCurrency";
			definition = "Currency in which a trade should be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies instructions for order handling on the broker trading floor.
	 */
	public static final MMBusinessAttribute OrderHandlingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderHandlingInstruction";
			definition = "Specifies instructions for order handling on the broker trading floor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
		}
	};
	/**
	 * Indicates whether the broker is to locate the stock in conjunction with a
	 * short sell order. This information is mandatory in case of short sales.
	 * When executed, the report will then mention the securities location.
	 */
	public static final MMBusinessAttribute StockLocateRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLocateRequired";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the order is currently being worked. For open outcry markets
	 * this indicates that the order is being worked in the crowd. For
	 * electronic markets it indicates that the order has transitioned from a
	 * contingent order to a market order.
	 */
	public static final MMBusinessAttribute WorkingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if a Cancel/Replace has caused an order to lose book priority.
	 */
	public static final MMBusinessAttribute BookPriorityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookPriorityIndicator";
			definition = "Indicates if a Cancel/Replace has caused an order to lose book priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BookPriorityIndicatorCode.mmObject();
		}
	};
	/**
	 * Allows an order to specify a maximum number of price levels to trade
	 * through.
	 */
	public static final MMBusinessAttribute MaxPriceLevels = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaxPriceLevels";
			definition = "Allows an order to specify a maximum number of price levels to trade through.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Allows trader to explicitly request anonymity or disclosure in pre-trade
	 * market data feeds. Anonymity is relevant in markets where counterparties
	 * are regularly disclosed in order depth feeds. Disclosure is relevant when
	 * counterparties are not normally visible.
	 */
	public static final MMBusinessAttribute PreTradeAnonymity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreTradeAnonymity";
			definition = "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * For partially good till orders, the specification of whether to book each
	 * execution, or to accumulate the executions.
	 */
	public static final MMBusinessAttribute GoodTillBooking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoodTillBooking";
			definition = "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GoodTillBookingInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates if the order was initially received manually (as opposed to
	 * electronically).
	 */
	public static final MMBusinessAttribute ManualOrderIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualOrderIndicator";
			definition = "Indicates if the order was initially received manually (as opposed to electronically).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the customer directed this order to a specific execution
	 * venue (Y) or not (N).
	 */
	public static final MMBusinessAttribute DirectedOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates if the customer directed this order to a specific execution venue (Y) or not (N).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the Broker / Dealer Department that first took the order.
	 */
	public static final MMBusinessAttribute ReceivedDepartment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivedDepartment";
			definition = "Identifies the Broker / Dealer Department that first took the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Codes that apply special information that the Broker / Dealer needs to
	 * report, as specified by the customer.
	 */
	public static final MMBusinessAttribute CustomerHandlingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerHandlingInstruction";
			definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
		}
	};
	/**
	 * Used to identify soft trades at order entry.
	 */
	public static final MMBusinessAttribute ProcessCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessCode";
			definition = "Used to identify soft trades at order entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}
	};
	/**
	 * Securities order for which parameters are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderParameters.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesOrder";
			definition = "Securities order for which parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderParameters";
				definition = "Parameters of the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters, com.tools20022.repository.entity.SecuritiesOrder.OrderExecutionParameters,
						com.tools20022.repository.entity.SecuritiesPegOrderInstruction.Order);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement,
						com.tools20022.repository.entity.SecuritiesOrderParameters.PegInstructions, com.tools20022.repository.entity.SecuritiesOrderParameters.PreviousClosingPrice,
						com.tools20022.repository.entity.SecuritiesOrderParameters.AutoRouting, com.tools20022.repository.entity.SecuritiesOrderParameters.CorporateActionOptionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.ExecutionTimeLimit, com.tools20022.repository.entity.SecuritiesOrderParameters.PreAllocationConditionIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.PriorityIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.RequestedDealCurrency,
						com.tools20022.repository.entity.SecuritiesOrderParameters.OrderHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.StockLocateRequired,
						com.tools20022.repository.entity.SecuritiesOrderParameters.WorkingIndicator, com.tools20022.repository.entity.SecuritiesOrderParameters.BookPriorityIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.MaxPriceLevels, com.tools20022.repository.entity.SecuritiesOrderParameters.PreTradeAnonymity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.GoodTillBooking, com.tools20022.repository.entity.SecuritiesOrderParameters.ManualOrderIndicator,
						com.tools20022.repository.entity.SecuritiesOrderParameters.DirectedOrder, com.tools20022.repository.entity.SecuritiesOrderParameters.ReceivedDepartment,
						com.tools20022.repository.entity.SecuritiesOrderParameters.CustomerHandlingInstruction, com.tools20022.repository.entity.SecuritiesOrderParameters.ProcessCode,
						com.tools20022.repository.entity.SecuritiesOrderParameters.RelatedSecuritiesOrder);
			}
		});
		return mmObject_lazy.get();
	}
}
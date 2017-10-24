package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.StayOnSideTypeCode;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the instructions for order handling
 */
public class SecuritiesOrderExecutionInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, AON orders are not
	 * treated as canceled if they are not executed as soon as represented in
	 * the Trading Crowd.
	 */
	public static final MMBusinessAttribute AllOrNone = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}
	};
	/**
	 * Refers to the client before trading in order to catch all verbal
	 * instructions on trading strategy usually because the strategy is too
	 * complex or cannot be represented in the trading application.
	 */
	public static final MMBusinessAttribute CallFirst = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Allow crossing of an order.
	 */
	public static final MMBusinessAttribute Cross = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Exchange or ECN required by the SEC to display limit orders in the public
	 * order book. A customer can choose not to have his limit order displayed
	 * to the public.
	 */
	public static final MMBusinessAttribute CustomerDisplay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the firm executing the order is held to best execution
	 * requirements and may be able to make some discretionary decisions.
	 */
	public static final MMBusinessAttribute Hold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the order is to be increased in shares on the
	 * ex-dividend date as a result of a stock dividend or distribution.
	 */
	public static final MMBusinessAttribute Increase = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies that the broker is restricted to dealing with other buy side
	 * firms.
	 */
	public static final MMBusinessAttribute InstitutionsOnly = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Qualifies an asset (usually a payment instrument) of which rights cannot
	 * be transferred to a party other then the original debtor and creditor.
	 */
	public static final MMBusinessAttribute NonNegotiable = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether to execute parts of the order over the course of the
	 * day. Usually done with large block orders.
	 */
	public static final MMBusinessAttribute OverTheDay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * An order that may participate in a transaction initiated by another
	 * party, but may not initiate a transaction.
	 */
	public static final MMBusinessAttribute ParticipateDontInitiate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the Sender does not want all of the volume on the floor.
	 */
	public static final MMBusinessAttribute PercentOfVolume = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * An order to buy (or sell) a financial instrument which specifies the
	 * total amount to be bought (or sold) and the amount to be bought (or sold)
	 * at specified price variations.
	 */
	public static final MMBusinessAttribute Scale = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the order limit based on the offer/bid at the time of the order
	 * submission.
	 */
	public static final MMBusinessAttribute StayOnSide = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StayOnSideTypeCode.mmObject();
		}
	};
	/**
	 * Make the order active until notified.
	 */
	public static final MMBusinessAttribute Work = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used for listed equity securities. Buy or sell at prices that randomly
	 * occur on the floor, participating in what trades the specialist and other
	 * players will allow.
	 */
	public static final MMBusinessAttribute GoAlong = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order to buy (sell) a security that specifies the total amount to be
	 * bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
	 */
	public static final MMBusinessAttribute TryScale = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether to buy, to stop order to sell, or to stop limit order
	 * to sell that is not to be reduced in price by the amount of an ordinary
	 * cash dividend on the ex-dividend date. A "do not reduce" order applies
	 * only to ordinary cash dividends; it should be reduced for other
	 * distributions - such as when a stock goes ex stock dividend or ex rights.
	 */
	public static final MMBusinessAttribute DoNotReduce = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * cancel this order or attempt to reinstate this order, subject to time in
	 * force limitations. Note that depending on the type and severity of the
	 * failure, this might not be possible.
	 */
	public static final MMBusinessAttribute CancelOnSystemFailure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If trading in this instrument is halted, cancel this order or reinstate
	 * this order when/if trading resumes, subject to time in force limitations.
	 */
	public static final MMBusinessAttribute CancelOnTradingHalt = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the broker has permission to handle and place the order
	 * in the market even if the broker already has its own proprietary orders
	 * for the same financial instrument placed in the market.
	 */
	public static final MMBusinessAttribute TradeAlong = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Limit order that must be traded at the exact limit price specified
	 * without any price improvement.
	 */
	public static final MMBusinessAttribute StrictLimit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Disables validity checking of price fields for an order or change
	 * request.
	 */
	public static final MMBusinessAttribute IgnorePriceValidityChecks = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * reinstate this order, subject to time in force limitations. Depending on
	 * the type and severity of the failure, this might not be possible.
	 */
	public static final MMBusinessAttribute ReinstateOnSystemFailure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If trading in this instrument is halted, reinstate this order when/if
	 * trading resumes, subject to time in force limitations.
	 */
	public static final MMBusinessAttribute ReinstateOnTradingHalt = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order should be cancelled if it is no longer the best
	 * bid if buying, or the best offer if selling.
	 */
	public static final MMBusinessAttribute CancelIfNotBest = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order sent to one market may be routed by that market
	 * to other external markets, especially in cases where the order locks or
	 * crosses the market and it can be executed against another markets
	 * superior price. The absence of this instruction does not imply that an
	 * order should not be routed externally; rather, the order receivers
	 * default will apply.
	 */
	public static final MMBusinessAttribute ExternalRoutingAllowed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that an order sent to one market may never be routed by that
	 * market to other external markets. Should the order lock or cross the
	 * market but be unable to execute due to price protection reasons, a market
	 * may have to take alternate action, which might include rejecting the
	 * order, depending on the markets rules.The absence of this instruction
	 * does not imply that an order should be routed externally; rather, the
	 * order receivers default will apply.
	 */
	public static final MMBusinessAttribute ExternalRoutingNotAllowed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
	 */
	public static final MMBusinessAttribute ImbalanceOnly = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the party sending the order has taken responsibility for
	 * price protection, and the recipient of the order should execute it, if
	 * possible, without regard to protection of other markets prices. While
	 * the term "Intermarket sweep" is specific to the United States, it may be
	 * used in other markets, where appropriate, to indicate an order that
	 * should be executed without regard to price protection.
	 */
	public static final MMBusinessAttribute IntermarketSweep = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used when sending multiple orders indicating that you would be 'netting'
	 * the F/X later.
	 */
	public static final MMBusinessAttribute Netting = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order which is executed.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Reduction of transfers of cash (resulting of a foreign exchange operation
	 * between subsidiaries or separate companies) to a net amount.
	 */
	public static final MMBusinessAttribute ForeignExchangeNetting = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeNetting";
			definition = "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order to buy (sell) a security that strictly specifies the total amount
	 * to be bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
	 */
	public static final MMBusinessAttribute StrictScale = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictScale";
			definition = "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used in specialist driven markets to direct the specialist to try to
	 * suspend the order.
	 */
	public static final MMBusinessAttribute Suspend = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspend";
			definition = "Used in specialist driven markets to direct the specialist to try to suspend the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Used in specialist driven markets to direct the specialist to try and
	 * stop the order.
	 */
	public static final MMBusinessAttribute TryToStop = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryToStop";
			definition = "Used in specialist driven markets to direct the specialist to try and stop the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Strategy used to obtain the order price.
	 */
	public static final MMBusinessAssociationEnd OrderPriceStrategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPriceStrategy";
			definition = "Strategy used to obtain the order price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Discretion.RelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Discretion.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderExecutionInstruction";
				definition = "Identifies the instructions for order handling";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ExecutionInstructions, com.tools20022.repository.entity.Discretion.RelatedOrderExecution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.AllOrNone, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CallFirst,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Cross, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CustomerDisplay,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Hold, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Increase,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.InstitutionsOnly, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.NonNegotiable,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OverTheDay, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ParticipateDontInitiate,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.PercentOfVolume, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Scale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StayOnSide, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Work,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.GoAlong, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TryScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.DoNotReduce, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelOnSystemFailure,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelOnTradingHalt, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TradeAlong,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StrictLimit, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.IgnorePriceValidityChecks,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ReinstateOnSystemFailure, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ReinstateOnTradingHalt,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.CancelIfNotBest, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ExternalRoutingAllowed,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ExternalRoutingNotAllowed, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ImbalanceOnly,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.IntermarketSweep, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Netting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.RelatedOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.ForeignExchangeNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.StrictScale, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.Suspend,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.TryToStop, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.OrderPriceStrategy);
			}
		});
		return mmObject_lazy.get();
	}
}
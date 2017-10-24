package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of instruction to a broker or dealer to buy or sell a
 * financial instrument.
 */
public class OrderTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A round-lot market or limit price order that must be executed in its
	 * entirety or not at all; unlike fill or kill orders, all or none orders
	 * are not treated as canceled if they are not executed as soon as
	 * represented in the trading crowd.
	 */
	public static final MMCode AllOrNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "A round-lot market or limit price order that must be executed in its entirety or not at all; unlike fill or kill orders, all or none orders are not treated as canceled if they are not executed as soon as represented in the trading crowd.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "ALNO";
		}
	};
	/**
	 * A buy contra short exempt.
	 */
	public static final MMCode BuyContraShortExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShortExempt";
			definition = "A buy contra short exempt.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "BCSE";
		}
	};
	/**
	 * An order to buy contra short.
	 */
	public static final MMCode BuyContraShort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShort";
			definition = "An order to buy contra short.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "BCSH";
		}
	};
	/**
	 * An order to buy at a price lower than the current market price. This is
	 * an order to buy a stated amount of a financial instrument provided that
	 * its price is not higher than the last sale if the last sale was a minus
	 * or zero minus tick, not higher than the last sale minus the minimum
	 * fractional change in the stock if the last sale was a plus or zero plus
	 * tick. The price limit indicates the highest price at which the order can
	 * be executed.
	 */
	public static final MMCode BuyMinus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			definition = "An order to buy at a price lower than the current market price. This is an order to buy a stated amount of a financial instrument provided that its price is not higher than the last sale if the last sale was a minus or zero minus tick, not higher than the last sale minus the minimum fractional change in the stock if the last sale was a plus or zero plus tick. The price limit indicates the highest price at which the order can be executed.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * An order which is not to be executed as a whole if the executing broker
	 * judges that it may disturb the price.
	 */
	public static final MMCode Carefully = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carefully";
			definition = "An order which is not to be executed as a whole if the executing broker judges that it may disturb the price.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "CARE";
		}
	};
	/**
	 * An order which is linked to another order to buy or sell and must be
	 * executed as a unit, both or none, or cancelled as a unit. The linkage
	 * sequence must be completed with a reference to the linked order.
	 */
	public static final MMCode Combination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Combination";
			definition = "An order which is linked to another order to buy or sell and must be executed as a unit, both or none, or cancelled as a unit. The linkage sequence must be completed with a reference to the linked order.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "COMB";
		}
	};
	/**
	 * An order where the executing broker or investment manager decides on the
	 * quantity or price.
	 */
	public static final MMCode Discretionary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			definition = "An order where the executing broker or investment manager decides on the quantity or price.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * An order to buy at the indicated price limit or lower or an order to sell
	 * at the indicated limit price or higher.
	 */
	public static final MMCode Limit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "LMTO";
		}
	};
	/**
	 * Indicates that if the limit conditions are not satisfied, it should not
	 * be executed.
	 */
	public static final MMCode LimitOnClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOnClose";
			definition = "Indicates that if the limit conditions are not satisfied, it should not be executed.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "LMCO";
		}
	};
	/**
	 * A trade at this specified price or better.
	 */
	public static final MMCode LimitOrBetter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrBetter";
			definition = "A trade at this specified price or better.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "LMBT";
		}
	};
	/**
	 * An order to be executed at a limit price, with a round-lot (or board-lot)
	 * sales; valid only for odd lot orders.
	 */
	public static final MMCode LimitWith = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWith";
			definition = "An order to be executed at a limit price, with a round-lot (or board-lot) sales; valid only for odd lot orders.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "LIWI";
		}
	};
	/**
	 * An order to be executed at a limit price, without a round-lot (or
	 * board-lot) sales; valid only for odd lot orders.
	 */
	public static final MMCode LimitWithout = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWithout";
			definition = "An order to be executed at a limit price, without a round-lot (or board-lot) sales; valid only for odd lot orders.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "LIWO";
		}
	};
	/**
	 * An order to buy or sell a specified amount of a financial instrument at
	 * the quoted market price or better.
	 */
	public static final MMCode Market = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			definition = "An order to buy or sell a specified amount of a financial instrument at the quoted market price or better.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "MRKT";
		}
	};
	/**
	 * An order to buy or sell a stated amount of a financial instrument at the
	 * quoted market price or better with some discretion on the price limit.
	 */
	public static final MMCode MarketNotHeld = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketNotHeld";
			definition = "An order to buy or sell a stated amount of a financial instrument at the quoted market price or better with some discretion on the price limit.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "MANH";
		}
	};
	/**
	 * An order which becomes a market order once the market price is reached.
	 */
	public static final MMCode MarketTouched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTouched";
			definition = "An order which becomes a market order once the market price is reached.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "MATH";
		}
	};
	/**
	 * An order which may be executed in partials or outside the hours of the
	 * exchange or other exchange rules.
	 */
	public static final MMCode NotHeld = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			definition = "An order which may be executed in partials or outside the hours of the exchange or other exchange rules.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "NOHE";
		}
	};
	/**
	 * An order which is related to another order where the second part may be
	 * cancelled without canceling the first. In this case, the second order is
	 * identified as the second part. Normally the sell order must be executed
	 * before the buy order. The linkage sequence must be completed with a
	 * reference to the linked order.
	 */
	public static final MMCode OrderLie = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderLie";
			definition = "An order which is related to another order where the second part may be cancelled without canceling the first. In this case, the second order is identified as the second part. Normally the sell order must be executed before the buy order. The linkage sequence must be completed with a reference to the linked order.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "ORLI";
		}
	};
	/**
	 * A price established by joint agreement of odd-lot dealers for as illiquid
	 * financial instrument.
	 */
	public static final MMCode OnBasisPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnBasisPrice";
			definition = "A price established by joint agreement of odd-lot dealers for as illiquid financial instrument.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "BAPR";
		}
	};
	/**
	 * An order to buy which becomes a market order when the financial
	 * instrument trades at or above the stop price after the order is submitted
	 * or an order to sell which becomes a market order when the financial
	 * instrument trades at or below the stop price after the order is
	 * submitted.
	 */
	public static final MMCode Stop = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stop";
			definition = "An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "STOP";
		}
	};
	/**
	 * A stop order to buy which becomes a limit order at the limit price when
	 * the financial instrument trades at or above the stop price after the
	 * order is submitted. A stop order to sell which becomes a limit order at
	 * the limit price when the financial instrument trades at or below the stop
	 * price after the order is submitted.
	 */
	public static final MMCode StopLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLimit";
			definition = "A stop order to buy which becomes a limit order at the limit price when the financial instrument trades at or above the stop price after the order is submitted. A stop order to sell which becomes a limit order at the limit price when the financial instrument trades at or below the stop price after the order is submitted.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "STLI";
		}
	};
	/**
	 * An order to sell that sets the sell price below the market price.
	 */
	public static final MMCode StopLoss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLoss";
			definition = "An order to sell that sets the sell price below the market price.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "SLOS";
		}
	};
	/**
	 * An order to sell a stated amount provided that the price is not lower
	 * than the last sale price if the last sale was a plus or zero plus tick
	 * and not lower than the last sale minus the minimum fractional change in
	 * the financial instrument if the last sale was a minus or zero minus tick.
	 */
	public static final MMCode SellPlus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			definition = "An order to sell a stated amount provided that the price is not lower than the last sale price if the last sale was a plus or zero plus tick and not lower than the last sale minus the minimum fractional change in the financial instrument if the last sale was a minus or zero minus tick.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "SPLU";
		}
	};
	/**
	 * An order to sell that the seller does not own; a sale effected by
	 * delivering a financial instrument borrowed by or for the account of the
	 * seller.
	 */
	public static final MMCode SellShort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			definition = "An order to sell that the seller does not own; a sale effected by delivering a financial instrument borrowed by or for the account of the seller.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "SSHO";
		}
	};
	/**
	 * An order to sell short which is exempt from short-sale rules.
	 */
	public static final MMCode SellShortExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			definition = "An order to sell short which is exempt from short-sale rules.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "SSEX";
		}
	};
	/**
	 * An odd lot order filled on an effective round lot transaction, or on an
	 * effective bid or offer, whichever occurs first after the specialist
	 * receives the order. (e.g. NYSE order type).
	 */
	public static final MMCode WithOrWithout = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithOrWithout";
			definition = "An odd lot order filled on an effective round lot transaction, or on an effective bid or offer, whichever occurs first after the specialist receives the order. (e.g. NYSE order type).";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "WTWO";
		}
	};
	/**
	 * An order sent in response to a Quote message.
	 */
	public static final MMCode PreviouslyQuoted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyQuoted";
			definition = "An order sent in response to a Quote message.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "PRQT";
		}
	};
	/**
	 * An order sent in response to an Indication of Interest message.
	 */
	public static final MMCode PreviouslyIndicated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyIndicated";
			definition = "An order sent in response to an Indication of Interest message.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "PRID";
		}
	};
	/**
	 * A "Swap" order for Foreign Exchange (currency trading).
	 */
	public static final MMCode ForexSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForexSwap";
			definition = "A \"Swap\" order for Foreign Exchange (currency trading).";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "FXSW";
		}
	};
	/**
	 * Japanese term for an order to buy or sell a stated amount of a security
	 * at a specified limit price. Any unexecuted (leftover) quantity becomes a
	 * Market On Close order.
	 */
	public static final MMCode Funari = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Funari";
			definition = "Japanese term for an order to buy or sell a stated amount of a security at a specified limit price. Any unexecuted (leftover) quantity becomes a Market On Close order.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "FNRI";
		}
	};
	/**
	 * Indicates an order to buy or sell a stated amount of a security at the
	 * prevailing market price with any unexecuted (leftover) quantity becoming
	 * a Limit order at the last executed price.
	 */
	public static final MMCode MarketWithLeftover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketWithLeftover";
			definition = "Indicates an order to buy or sell a stated amount of a security at the prevailing market price with any unexecuted (leftover) quantity becoming a Limit order at the last executed price.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "MKLO";
		}
	};
	/**
	 * Limit order, where the limit price fluctuates relative to another
	 * quantity, such as the last sale, midpoint, opening price, bid, offer, or
	 * VWAP (Volume Weighted Average Price).
	 */
	public static final MMCode Pegged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			definition = "Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price).";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "PGGD";
		}
	};
	/**
	 * Indicates that the order is a counter order.
	 */
	public static final MMCode CounterOrderSelection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterOrderSelection";
			definition = "Indicates that the order is a counter order.";
			owner_lazy = () -> OrderTypeCode.mmObject();
			codeName = "COSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderTypeCode";
				definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderTypeCode.AllOrNone, com.tools20022.repository.codeset.OrderTypeCode.BuyContraShortExempt,
						com.tools20022.repository.codeset.OrderTypeCode.BuyContraShort, com.tools20022.repository.codeset.OrderTypeCode.BuyMinus, com.tools20022.repository.codeset.OrderTypeCode.Carefully,
						com.tools20022.repository.codeset.OrderTypeCode.Combination, com.tools20022.repository.codeset.OrderTypeCode.Discretionary, com.tools20022.repository.codeset.OrderTypeCode.Limit,
						com.tools20022.repository.codeset.OrderTypeCode.LimitOnClose, com.tools20022.repository.codeset.OrderTypeCode.LimitOrBetter, com.tools20022.repository.codeset.OrderTypeCode.LimitWith,
						com.tools20022.repository.codeset.OrderTypeCode.LimitWithout, com.tools20022.repository.codeset.OrderTypeCode.Market, com.tools20022.repository.codeset.OrderTypeCode.MarketNotHeld,
						com.tools20022.repository.codeset.OrderTypeCode.MarketTouched, com.tools20022.repository.codeset.OrderTypeCode.NotHeld, com.tools20022.repository.codeset.OrderTypeCode.OrderLie,
						com.tools20022.repository.codeset.OrderTypeCode.OnBasisPrice, com.tools20022.repository.codeset.OrderTypeCode.Stop, com.tools20022.repository.codeset.OrderTypeCode.StopLimit,
						com.tools20022.repository.codeset.OrderTypeCode.StopLoss, com.tools20022.repository.codeset.OrderTypeCode.SellPlus, com.tools20022.repository.codeset.OrderTypeCode.SellShort,
						com.tools20022.repository.codeset.OrderTypeCode.SellShortExempt, com.tools20022.repository.codeset.OrderTypeCode.WithOrWithout, com.tools20022.repository.codeset.OrderTypeCode.PreviouslyQuoted,
						com.tools20022.repository.codeset.OrderTypeCode.PreviouslyIndicated, com.tools20022.repository.codeset.OrderTypeCode.ForexSwap, com.tools20022.repository.codeset.OrderTypeCode.Funari,
						com.tools20022.repository.codeset.OrderTypeCode.MarketWithLeftover, com.tools20022.repository.codeset.OrderTypeCode.Pegged, com.tools20022.repository.codeset.OrderTypeCode.CounterOrderSelection);
			}
		});
		return mmObject_lazy.get();
	}
}
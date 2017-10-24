package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Codes that apply special information that the Broker / Dealer needs to
 * report, as specified by the customer. Firms that are taking in orders
 * manually but routing for execution electronically and for compliance
 * reporting must capture the client's handling instructions.This is intended
 * for reporting only ( OATS = Order Audit Trail System - Phase III regulatory
 * requirement).
 */
public class CustomerHandlingInstructionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Market or limit order that is to be executed in its entirety as soon as
	 * it is submitted; if not so executed, the order is to be cancelled.
	 */
	public static final MMCode FillOrKill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			definition = "Market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "FIKI";
		}
	};
	/**
	 * Market or limit order to be executed in whole or in part as soon as it is
	 * submitted; any portion not so executed is to be cancelled.
	 */
	public static final MMCode ImmediateOrCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			definition = "Market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "IOCA";
		}
	};
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, All Or None orders
	 * are not treated as canceled if they are not executed as soon as
	 * represented in the Trading Crowd.
	 */
	public static final MMCode AllOrNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, All Or None orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "ALON";
		}
	};
	/**
	 * Order to buy (or sell) a financial instrument which specifies the total
	 * amount to be bought (or sold) and the amount to be bought (or sold) at
	 * specified price variations.
	 */
	public static final MMCode Scale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			definition = "Order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "SCAL";
		}
	};
	/**
	 * Make the order active until notified.
	 */
	public static final MMCode Work = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "WORK";
		}
	};
	/**
	 * Add on another order.
	 */
	public static final MMCode AddOnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddOnOrder";
			definition = "Add on another order.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "ADOO";
		}
	};
	/**
	 * Indicates that a position in the underlying is traded for a futures
	 * position in the physical commodity markets.
	 */
	public static final MMCode ExchangeForPhysicalTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTransaction";
			definition = "Indicates that a position in the underlying is traded for a futures position in the physical commodity markets.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "EFPH";
		}
	};
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
	 */
	public static final MMCode ImbalanceOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "IMBO";
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
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "PGGD";
		}
	};
	/**
	 * Indicates an order which may be executed in partials or outside the hours
	 * of the exchange or other exchange rules.
	 */
	public static final MMCode NotHeld = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			definition = "Indicates an order which may be executed in partials or outside the hours of the exchange or other exchange rules.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "NOHE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIKI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerHandlingInstructionsCode";
				definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Firms that are taking in orders manually but routing for execution electronically and for compliance reporting must capture the client's handling instructions.This is intended for reporting only ( OATS =  Order Audit Trail System - Phase III regulatory requirement).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.FillOrKill, com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.ImmediateOrCancel,
						com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.AllOrNone, com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.Scale,
						com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.Work, com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.AddOnOrder,
						com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.ExchangeForPhysicalTransaction, com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.ImbalanceOnly,
						com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.Pegged, com.tools20022.repository.codeset.CustomerHandlingInstructionsCode.NotHeld);
			}
		});
		return mmObject_lazy.get();
	}
}
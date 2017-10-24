package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Qualifies the use of the quote or the indication of interest.
 */
public class QualifierCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A limit order that is to be executed in its entirety or not at all (no
	 * partial transaction), and thus is testing the strength/conviction of the
	 * counterparty. Unlike a fill or kill order, all or none orders are not to
	 * be treated as cancelled if not executed as soon as it is represented in
	 * the trading crowd. Instead it remains alive until executed or cancelled.
	 * The making of "all or none" bids or offers in stocks is prohibited, and
	 * the making of "all or none" bids or offers in bonds is subject to the
	 * restrictions of Rule 61.
	 */
	public static final MMCode AllOrNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "A limit order that is to be executed in its entirety or not at all (no partial transaction), and thus is testing the strength/conviction of the counterparty.  Unlike a fill or kill order, all or none orders are not to be treated as cancelled if not executed as soon as it is represented in the trading crowd.  Instead it remains alive until executed or cancelled.  The making of \"all or none\" bids or offers in stocks is prohibited, and the making of \"all or none\" bids or offers in bonds is subject to the restrictions of Rule 61.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "ALNO";
		}
	};
	/**
	 * An order to trade stocks, options, or futures as close as possible to the
	 * market close.
	 */
	public static final MMCode MarketOnClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOnClose";
			definition = "An order to trade stocks, options, or futures as close as possible to the market close.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MOCE";
		}
	};
	/**
	 * An all or none market order that is to be executed at the closing price
	 * of the security on the exchange. If the execution cannot be made under
	 * this condition, the order is to be treated as cancelled.
	 * 
	 * Note that this attribute does not apply to trading of fixed income
	 * securities.
	 */
	public static final MMCode AtClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtClose";
			definition = "An all or none market order that is to be executed at the closing price of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.\n\nNote that this attribute does not apply to trading of fixed income securities.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * A trading benchmark particularly used in pension plans. Calculated by
	 * adding up the dollars traded for every transaction (price times shares
	 * traded) and then dividing by the total shares traded for the day for the
	 * particular security.
	 */
	public static final MMCode VolumeWeightedAveragePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "A trading benchmark particularly used in pension plans. Calculated by adding up the dollars traded for every transaction (price times shares traded) and then dividing by the total shares traded for the day for the particular security.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Having a sell inquiry in a security (not a firm customer sell order),
	 * often entailing a capital commitment.
	 */
	public static final MMCode InTouchWith = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTouchWith";
			definition = "Having a sell inquiry in a security (not a firm customer sell order), often entailing a capital commitment.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "ITOW";
		}
	};
	/**
	 * An order to buy a stock at or below a specified price, or to sell a stock
	 * at or above a specified price. The customer specifies a price, and the
	 * order can be executed only if the market reaches or betters that price. A
	 * conditional trading order designed to avoid the danger of adverse
	 * unexpected price movements.
	 */
	public static final MMCode Limit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "An order to buy a stock at or below a specified price, or to sell a stock at or above a specified price.  The customer specifies a price, and the order can be executed only if the market reaches or betters that price.  A conditional trading order designed to avoid the danger of adverse unexpected price movements.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * More security exists to be bought or sold by the same buyer or seller,
	 * respectively. Often, the buyer or seller does not disclose the full size
	 * of his buy or sell interest as not to affect the market adversely.
	 * 
	 * Information that the execution is taking place in waves/iceberg.
	 */
	public static final MMCode MoreBehind = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreBehind";
			definition = "More security exists to be bought or sold by the same buyer or seller, respectively.  Often, the buyer or seller does not disclose the full size of his buy or sell interest as not to affect the market adversely.\n\nInformation that the execution is taking place in waves/iceberg.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MOBH";
		}
	};
	/**
	 * An order that is to be executed at the opening (and corresponding price)
	 * of the security or not at all, and any such order or portion thereof not
	 * executed is to be treated as cancelled.
	 */
	public static final MMCode AtOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtOpen";
			definition = "An order that is to be executed at the opening (and corresponding price) of the security or not at all, and any such order or portion thereof not executed is to be treated as cancelled.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * A market commitment to purchase or sell securities.
	 */
	public static final MMCode TakingPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingPosition";
			definition = "A market commitment to purchase or sell securities.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "POSI";
		}
	};
	/**
	 * An order to buy or sell a security at the most advantageous price
	 * obtainable after the order is represented in the trading crowd. Other
	 * special restrictions, such as all or none (AON) or good 'til cancelled
	 * (GTC), cannot be specified on a market order.
	 */
	public static final MMCode AtMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMarket";
			definition = "An order to buy or sell a security at the most advantageous price obtainable after the order is represented in the trading crowd.  Other special restrictions, such as all or none (AON) or good 'til cancelled (GTC), cannot be specified on a market order.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MAKT";
		}
	};
	/**
	 * All of the information necessary to generate an order is present and is
	 * considered an offer.
	 */
	public static final MMCode ReadyToTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReadyToTrade";
			definition = "All of the information necessary to generate an order is present and is considered an offer.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "RTRA";
		}
	};
	/**
	 * A collection of investments, real and/or financial, with distribution by
	 * geographic region or by asset type of the portfolio's holdings.
	 */
	public static final MMCode PortfolioShown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioShown";
			definition = "A collection of investments, real and/or financial, with distribution by geographic region or by asset type of the portfolio's holdings.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "POSH";
		}
	};
	/**
	 * Working the order through the day.
	 */
	public static final MMCode ThroughDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughDay";
			definition = "Working the order through the day.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "TDAY";
		}
	};
	/**
	 * Indication sent versus the current quote.
	 */
	public static final MMCode Versus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Versus";
			definition = "Indication sent versus the current quote.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "VERS";
		}
	};
	/**
	 * Transacting with another broker/dealer.
	 */
	public static final MMCode WorkingAway = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingAway";
			definition = "Transacting with another broker/dealer.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "AWAY";
		}
	};
	/**
	 * Securities transaction in which the same broker acts as agent for both
	 * sides of the trade; a legal practice only if the broker first offers the
	 * securities publicly at a price higher than the bid.
	 */
	public static final MMCode Crossing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crossing";
			definition = "Securities transaction in which the same broker acts as agent for both sides of the trade; a legal practice only if the broker first offers the securities publicly at a price higher than the bid.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "CROS";
		}
	};
	/**
	 * An all or none market order that is to be executed at the mid price
	 * spread of the security on the exchange. If the execution cannot be made
	 * under this condition, the order is to be treated as cancelled.
	 */
	public static final MMCode AtMidpoint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMidpoint";
			definition = "An all or none market order that is to be executed at the mid price spread of the security on the exchange.  If the execution cannot be made under this condition, the order is to be treated as cancelled.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Price of security prior to a market opening.
	 */
	public static final MMCode PreOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreOpen";
			definition = "Price of security prior to a market opening.";
			owner_lazy = () -> QualifierCode.mmObject();
			codeName = "PREO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QualifierCode";
				definition = "Qualifies the use of the quote or the indication of interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualifierCode.AllOrNone, com.tools20022.repository.codeset.QualifierCode.MarketOnClose, com.tools20022.repository.codeset.QualifierCode.AtClose,
						com.tools20022.repository.codeset.QualifierCode.VolumeWeightedAveragePrice, com.tools20022.repository.codeset.QualifierCode.InTouchWith, com.tools20022.repository.codeset.QualifierCode.Limit,
						com.tools20022.repository.codeset.QualifierCode.MoreBehind, com.tools20022.repository.codeset.QualifierCode.AtOpen, com.tools20022.repository.codeset.QualifierCode.TakingPosition,
						com.tools20022.repository.codeset.QualifierCode.AtMarket, com.tools20022.repository.codeset.QualifierCode.ReadyToTrade, com.tools20022.repository.codeset.QualifierCode.PortfolioShown,
						com.tools20022.repository.codeset.QualifierCode.ThroughDay, com.tools20022.repository.codeset.QualifierCode.Versus, com.tools20022.repository.codeset.QualifierCode.WorkingAway,
						com.tools20022.repository.codeset.QualifierCode.Crossing, com.tools20022.repository.codeset.QualifierCode.AtMidpoint, com.tools20022.repository.codeset.QualifierCode.PreOpen);
			}
		});
		return mmObject_lazy.get();
	}
}
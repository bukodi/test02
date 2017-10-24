package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the conditions under which the order/trade is to be/was executed.
 */
public class TradeTransactionConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the trade is executed cum bonus.
	 */
	public static final MMCode CumBonus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumBonus";
			definition = "Indicates whether the trade is executed cum bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CBNS";
		}
	};
	/**
	 * Indicates whether the trade is executed ex bonus.
	 */
	public static final MMCode ExBonus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExBonus";
			definition = "Indicates whether the trade is executed ex bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "XBNS";
		}
	};
	/**
	 * Indicates whether the trade is executed cum coupon.
	 */
	public static final MMCode CumCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumCoupon";
			definition = "Indicates whether the trade is executed cum coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CCPN";
		}
	};
	/**
	 * Indicates whether the trade is executed ex coupon.
	 */
	public static final MMCode ExCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExCoupon";
			definition = "Indicates whether the trade is executed ex coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "XCPN";
		}
	};
	/**
	 * Indicates whether the trade is executed cum dividend.
	 */
	public static final MMCode CumDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumDividend";
			definition = "Indicates whether the trade is executed cum dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CDIV";
		}
	};
	/**
	 * Indicates whether the trade is executed ex dividend.
	 */
	public static final MMCode ExDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDividend";
			definition = "Indicates whether the trade is executed ex dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "XDIV";
		}
	};
	/**
	 * Indicates whether the trade is executed cum rights.
	 */
	public static final MMCode CumRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumRights";
			definition = "Indicates whether the trade is executed cum rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CRTS";
		}
	};
	/**
	 * Indicates whether the trade is executed ex rights.
	 */
	public static final MMCode ExRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExRights";
			definition = "Indicates whether the trade is executed ex rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "XRTS";
		}
	};
	/**
	 * Indicates whether the trade is executed cum warrant.
	 */
	public static final MMCode CumWarrant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumWarrant";
			definition = "Indicates whether the trade is executed cum warrant.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CWAR";
		}
	};
	/**
	 * Indicates whether the trade is executed ex warrant.
	 */
	public static final MMCode ExWarrant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExWarrant";
			definition = "Indicates whether the trade is executed ex warrant.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "XWAR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special cum dividend, ie,
	 * buying after the ex date and getting the dividend.
	 */
	public static final MMCode SpecialCumDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialCumDividend";
			definition = "Indicates whether the trade is executed  with a special cum \ndividend, ie, buying after the ex date and getting the dividend.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SPCU";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special ex dividend, ie,
	 * selling before the ex date without the coupon.
	 */
	public static final MMCode SpecialExDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExDividend";
			definition = "Indicates whether the trade is executed  with a special ex \ndividend, ie, selling before the ex date without the coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SPEX";
		}
	};
	/**
	 * Indicates that the trade is executed cum-dividend or cum-coupon and a due
	 * bill is required. A due bill is a contractual agreement to pay the
	 * dividend along with the delivery of the financial instrument.
	 */
	public static final MMCode BrokerDueBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerDueBill";
			definition = "Indicates that the trade is executed cum-dividend or cum-coupon and a due bill is required. \nA due bill is a contractual agreement to pay the dividend along with the delivery of \nthe financial instrument.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DUEB";
		}
	};
	/**
	 * Indicates whether the trade is sold short. When the seller does not have
	 * the financial instrument, the delivery is effected by borrowing the
	 * financial instrument by or for the account of the seller.
	 */
	public static final MMCode SoldShort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SoldShort";
			definition = "Indicates whether the trade is sold short. When the seller does not have the \nfinancial instrument, the delivery is effected by borrowing the financial instrument by or \nfor the account of the seller.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SSTI";
		}
	};
	/**
	 * Indicates that the trade is executed dirty, ie government tax must be
	 * paid on the accrued interest on the bond.
	 */
	public static final MMCode Dirty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Indicates that the trade is executed dirty, ie government tax must be paid on the accrued interest on the bond.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Indicates that the trade is executed clean, ie government tax must not be
	 * paid on the accrued interest on the bond.
	 */
	public static final MMCode Clean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Indicates that the trade is executed clean, ie government tax must not be paid on the accrued interest on the bond.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Indicates whether the trade is a block trade or not, ie, whether
	 * allocation instruction will follow or not.
	 */
	public static final MMCode Block = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Indicates whether the trade is a block trade or not, ie, whether allocation instruction will follow or not.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BLKO";
		}
	};
	/**
	 * Indicates whether the delivery of the financial instrument on settlement
	 * date is guaranteed.
	 */
	public static final MMCode GuaranteedDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDelivery";
			definition = "Indicates whether the delivery of the financial instrument on settlement date \nis guaranteed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "GTDL";
		}
	};
	/**
	 * Indicates whether fractional parts are allowed.
	 */
	public static final MMCode Fractions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fractions";
			definition = "Indicates whether fractional parts are allowed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "FRAC";
		}
	};
	/**
	 * Indicates that cross trades are allowed whereby buy and sell orders are
	 * offset without recording the trade on the exchange
	 */
	public static final MMCode CrossTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossTrade";
			definition = "Indicates that cross trades are allowed whereby buy and sell orders are offset without recording the trade on the exchange";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CRST";
		}
	};
	/**
	 * Indicates that cross trades, whereby buy and sell orders are offset
	 * without recording the trade on the exchange, are not allowed.
	 */
	public static final MMCode NoCrossTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoCrossTrade";
			definition = "Indicates that cross trades, whereby buy and sell orders are offset without recording the trade on the exchange, are not allowed.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "NCRS";
		}
	};
	/**
	 * Indicates that the order is to be executed by a trading party other than
	 * the trading party to which the order is sent. In this case, the
	 * instructing party has traded with another broker which will subsequently
	 * send an advice of execution to the executing party who received the order
	 * and which is acting as clearing broker.
	 */
	public static final MMCode DirectOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectOrder";
			definition = "Indicates that the order is to be executed by a trading party other than the trading party to which the \norder is sent. In this case, the instructing party has traded with another broker which will \nsubsequently send an advice of execution to the executing party who received the order \nand which is acting as clearing broker.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Indicates that the order must be executed with a specific trading party.
	 */
	public static final MMCode DirectedOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectedOrder";
			definition = "Indicates that the order must be executed with a specific trading party.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DIOR";
		}
	};
	/**
	 * Warehouse Trade.
	 */
	public static final MMCode WarehouseTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WarehouseTrade";
			definition = "Warehouse Trade.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "WARE";
		}
	};
	/**
	 * A limit order to buy or a stop order to sell or a stop limit order which
	 * is not to be increased in shares on the ex-dividend date as a result of a
	 * stock dividend or distribution.
	 */
	public static final MMCode NotIncrease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotIncrease";
			definition = "A limit order to buy or a stop order to sell or a stop limit order which is not to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DNIN";
		}
	};
	/**
	 * A limit order to buy or a stop order to sell, or a stop-limit order to
	 * sell which is not to be reduced in price by the amount of an ordinary
	 * cash dividend. Only applies to ordinary stock dividends; it should be
	 * reduced for other distributions. e.g. when a stock goes 'ex' stock
	 * dividend or rights.
	 */
	public static final MMCode NotReduce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotReduce";
			definition = "A limit order to buy or a stop order to sell, or a stop-limit order to sell which is not to be reduced in price by the amount of an ordinary cash dividend. Only applies to ordinary stock dividends; it should be reduced for other distributions. e.g. when a stock goes 'ex' stock dividend or rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "DNRE";
		}
	};
	/**
	 * Indicates that the order is based on a forward price.
	 */
	public static final MMCode ForwardPriceTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardPriceTrade";
			definition = "Indicates that the order is based on a forward price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Indicates that the order is based on a historic price.
	 */
	public static final MMCode HistoricPriceTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HistoricPriceTrade";
			definition = "Indicates that the order is based on a historic price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "HIST";
		}
	};
	/**
	 * Result of option when set. (UK specific)
	 */
	public static final MMCode ResultOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultOption";
			definition = "Result of option when set. (UK specific)";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCRO";
		}
	};
	/**
	 * Result of repo when set (UK specific).
	 */
	public static final MMCode ResultRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultRepo";
			definition = "Result of repo when set (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCRP";
		}
	};
	/**
	 * Place of delivery, in country of incorporation when unset (UK specific).
	 */
	public static final MMCode DeliverCountryIncorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliverCountryIncorporation";
			definition = "Place of delivery, in country of incorporation when unset (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCPD";
		}
	};
	/**
	 * Form of delivery, not for foreign registration when unset (UK specific).
	 */
	public static final MMCode DeliveryForm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryForm";
			definition = "Form of delivery, not for foreign registration when unset (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCFD";
		}
	};
	/**
	 * Board lots, not set for odd lots (UK specific).
	 */
	public static final MMCode BoardLot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLot";
			definition = "Board lots, not set for odd lots (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCBL";
		}
	};
	/**
	 * Bad names, not set for good names (UK specific).
	 */
	public static final MMCode BadName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BadName";
			definition = "Bad names, not set for good names (UK specific).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BCBN";
		}
	};
	/**
	 * Automated.
	 */
	public static final MMCode Automated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Automated";
			definition = "Automated.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Trade to be executed done at best execution.
	 */
	public static final MMCode BestExecution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Trade to be executed done at best execution.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "BTEX";
		}
	};
	/**
	 * Trade to be executed following the exercise of a call option on the
	 * security.
	 */
	public static final MMCode Call = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Call";
			definition = "Trade to be executed following the exercise of a call option on the security.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Trade to be executed for closure of a previous position before the
	 * rollover of a position (Deferred Settlement Service).
	 */
	public static final MMCode ClosureBeforeRollOver = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureBeforeRollOver";
			definition = "Trade to be executed for closure of a previous position before the rollover of a position (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CLBR";
		}
	};
	/**
	 * Trade to be executed for month-end settlement (Deferred Settlement
	 * Service).
	 */
	public static final MMCode Monthly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Trade to be executed for month-end settlement (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "MONT";
		}
	};
	/**
	 * Trade to be executed for a new trade position on the next month following
	 * the roll-over of a position (Deferred Settlement Service).
	 */
	public static final MMCode NewTradeFollowingRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewTradeFollowingRollover";
			definition = "Trade to be executed for a new trade position on the next month following the roll-over of a position (Deferred Settlement Service).";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "NBFR";
		}
	};
	/**
	 * Trade to be executed following the exercise of a put option on the
	 * security.
	 */
	public static final MMCode Putt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Putt";
			definition = "Trade to be executed following the exercise of a put option on the security.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "PUTT";
		}
	};
	/**
	 * Trade to be executed on the next month following the roll-over of
	 * positions.
	 */
	public static final MMCode TradeFollowingRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeFollowingRollover";
			definition = "Trade to be executed on the next month following the roll-over of positions.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "TRFR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special cum coupon.
	 */
	public static final MMCode SpecialCumCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCoupon";
			definition = "Indicates whether the trade is executed with a special cum coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SPCC";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special ex coupon.
	 */
	public static final MMCode SpecialExCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExCoupon";
			definition = "Indicates whether the trade is executed with a special ex coupon.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SECN";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex bonus.
	 */
	public static final MMCode SpecialExBonus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExBonus";
			definition = "Indicates whether the trade is executed special ex bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SEBN";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum bonus.
	 */
	public static final MMCode SpecialCumBonus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialCumBonus";
			definition = "Indicates whether the trade is executed special cum bonus.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SCBN";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum rights.
	 */
	public static final MMCode SpecialCumRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialCumRights";
			definition = "Indicates whether the trade is executed special cum rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SCRT";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex rights.
	 */
	public static final MMCode SpecialExRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExRights";
			definition = "Indicates whether the trade is executed special ex rights.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SERT";
		}
	};
	/**
	 * Indicates whether the trade is executed special cum capital repayments.
	 */
	public static final MMCode SpecialCumCapitalRepayments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialCumCapitalRepayments";
			definition = "Indicates whether the trade is executed special cum capital repayments.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SCCR";
		}
	};
	/**
	 * Indicates whether the trade is executed special ex capital repayments.
	 */
	public static final MMCode SpecialExCapitalRepayments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialExCapitalRepayments";
			definition = "Indicates whether the trade is executed special ex capital repayments.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * Indicates whether the trade is executed with a cash settlement.
	 */
	public static final MMCode CashSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlement";
			definition = "Indicates whether the trade is executed with a cash settlement.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "CAST";
		}
	};
	/**
	 * Indicates whether the trade is executed with a special price.
	 */
	public static final MMCode SpecialPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialPrice";
			definition = "Indicates whether the trade is executed with a special price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "SPPR";
		}
	};
	/**
	 * Trade was executed at market price.
	 */
	public static final MMCode MarketPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Trade was executed at market price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "MAPR";
		}
	};
	/**
	 * Trade for which the price is not the one quoted but an improved one, that
	 * is, the negotiated price.
	 */
	public static final MMCode NegotiatedTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Trade for which the price is not the one quoted but an improved one, that is, the negotiated price.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "NEGO";
		}
	};
	/**
	 * Trade was executed outside of normal market conditions, for example, in
	 * the case of an iceberg order.
	 */
	public static final MMCode NonMarketPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonMarketPrice";
			definition = "Trade was executed outside of normal market conditions, for example, in the case of an iceberg order.";
			owner_lazy = () -> TradeTransactionConditionCode.mmObject();
			codeName = "NMPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionConditionCode";
				definition = "Indicates the conditions under which the order/trade is to be/was executed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionConditionCode.CumBonus, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExBonus,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumCoupon, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExCoupon,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumDividend, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExDividend,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumRights, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExRights,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CumWarrant, com.tools20022.repository.codeset.TradeTransactionConditionCode.ExWarrant,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BrokerDueBill, com.tools20022.repository.codeset.TradeTransactionConditionCode.SoldShort,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.Dirty, com.tools20022.repository.codeset.TradeTransactionConditionCode.Clean, com.tools20022.repository.codeset.TradeTransactionConditionCode.Block,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.GuaranteedDelivery, com.tools20022.repository.codeset.TradeTransactionConditionCode.Fractions,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.CrossTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NoCrossTrade,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.DirectOrder, com.tools20022.repository.codeset.TradeTransactionConditionCode.DirectedOrder,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.WarehouseTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NotIncrease,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NotReduce, com.tools20022.repository.codeset.TradeTransactionConditionCode.ForwardPriceTrade,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.HistoricPriceTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.ResultOption,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.ResultRepo, com.tools20022.repository.codeset.TradeTransactionConditionCode.DeliverCountryIncorporation,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.DeliveryForm, com.tools20022.repository.codeset.TradeTransactionConditionCode.BoardLot,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BadName, com.tools20022.repository.codeset.TradeTransactionConditionCode.Automated,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.BestExecution, com.tools20022.repository.codeset.TradeTransactionConditionCode.Call,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.ClosureBeforeRollOver, com.tools20022.repository.codeset.TradeTransactionConditionCode.Monthly,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NewTradeFollowingRollover, com.tools20022.repository.codeset.TradeTransactionConditionCode.Putt,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.TradeFollowingRollover, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumCoupon,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExCoupon, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExBonus,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumBonus, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumRights,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExRights, com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialCumCapitalRepayments,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialExCapitalRepayments, com.tools20022.repository.codeset.TradeTransactionConditionCode.CashSettlement,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.SpecialPrice, com.tools20022.repository.codeset.TradeTransactionConditionCode.MarketPrice,
						com.tools20022.repository.codeset.TradeTransactionConditionCode.NegotiatedTrade, com.tools20022.repository.codeset.TradeTransactionConditionCode.NonMarketPrice);
			}
		});
		return mmObject_lazy.get();
	}
}
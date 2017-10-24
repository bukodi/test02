package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of executed order.
 */
public class TradeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * A basket trade, i.e. a unit of 15 or more financial instruments used in
	 * program trading.
	 */
	public static final MMCode Basket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 */
	public static final MMCode Index = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * A trade of a predetermined set of financial instruments.
	 */
	public static final MMCode List = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "List";
			definition = "A trade of a predetermined set of financial instruments.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LIST";
		}
	};
	/**
	 * A pre-allocated trade.
	 */
	public static final MMCode PreAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAllocation";
			definition = "A pre-allocated trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "PRAL";
		}
	};
	/**
	 * A program trade, i.e. a computer-driven trade of buying and selling of
	 * baskets of 15 or more financial instruments by index arbitrage
	 * specialists or institutional traders.
	 */
	public static final MMCode Program = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Program";
			definition = "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * An executed order.
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "An executed order.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * A trade from a broker to another broker.
	 */
	public static final MMCode BrokerToBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerToBroker";
			definition = "A trade from a broker to another broker.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BRBR";
		}
	};
	/**
	 * A trade from an investment fund to another investment fund.
	 */
	public static final MMCode FundToFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundToFund";
			definition = "A trade from an investment fund to another  investment fund.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FDFD";
		}
	};
	/**
	 * Trade involving risk
	 */
	public static final MMCode RiskTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskTrade";
			definition = "Trade involving risk";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Trade whose price is guaranteed as the weighted average of the trade
	 * prices on a specific day.
	 */
	public static final MMCode VWAPGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VWAPGuarantee";
			definition = "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Trade in which an agent intermediates between a buyer and a seller.
	 */
	public static final MMCode Agency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agency";
			definition = "Trade in which an agent intermediates between a buyer and a seller.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Trade which is guaranteed to be finalized
	 */
	public static final MMCode GuaranteedClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedClose";
			definition = "Trade which is guaranteed to be finalized";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * On order book/market trade.
	 */
	public static final MMCode OnOrderBookTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnOrderBookTrade";
			definition = "On order book/market trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OOBK";
		}
	};
	/**
	 * Trades coming from the application of a coorporate event.
	 */
	public static final MMCode LinkedTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedTrade";
			definition = "Trades coming from the application of a coorporate event.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LKTR";
		}
	};
	/**
	 * Trade generated by a give-up.
	 */
	public static final MMCode TradeGiveUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeGiveUp";
			definition = "Trade generated by a give-up.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "GUTR";
		}
	};
	/**
	 * Trade that is generated following a corporate action.
	 */
	public static final MMCode CorrectiveTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectiveTrade";
			definition = "Trade that is generated following a corporate action.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "COTR";
		}
	};
	/**
	 * Trade that is input manually in case of issue on the original trade that
	 * either was not processed or not received.
	 */
	public static final MMCode BackUpTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpTrade";
			definition = "Trade that is input manually in case of issue on the original trade that either was not processed or not received.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BKTR";
		}
	};
	/**
	 * Trade that is over the counter.
	 */
	public static final MMCode OffOrderBookTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffOrderBookTrade";
			definition = "Trade that is over the counter.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OFBK";
		}
	};
	/**
	 * Transaction relates to employee trade reporting.
	 */
	public static final MMCode EmployeeTradeReporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			definition = "Transaction relates to employee trade reporting.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Transaction is an Initial Public Offer (IPO) order.
	 */
	public static final MMCode IPO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IPO";
			definition = "Transaction is an Initial Public Offer (IPO) order.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "IPOO";
		}
	};
	/**
	 * Indicates that the trade is a Offering issue trade.
	 */
	public static final MMCode OfferingIssuingTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			definition = "Indicates that the trade is a Offering issue trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OFIT";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 */
	public static final MMCode Issuance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * The trade is a Bond repricing.
	 */
	public static final MMCode BondRepricing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondRepricing";
			definition = "The trade is a Bond repricing.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * The trade is a Bond substitution.
	 */
	public static final MMCode BondSubstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondSubstitution";
			definition = "The trade is a Bond substitution.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOSU";
		}
	};
	/**
	 * The trade is a Bond end.
	 */
	public static final MMCode BondEnd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondEnd";
			definition = "The trade is a Bond end.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOEN";
		}
	};
	/**
	 * The trade is a Bond start.
	 */
	public static final MMCode BondStart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondStart";
			definition = "The trade is a Bond start.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "BOST";
		}
	};
	/**
	 * Indicates that the trade is a Lending and borrowing.
	 */
	public static final MMCode LendingAndBorrowing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingAndBorrowing";
			definition = "Indicates that the trade is a Lending and borrowing.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "LABO";
		}
	};
	/**
	 * Indicates that the trade is a Futures contract trade.
	 */
	public static final MMCode Futures = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Indicates that the trade is a Futures contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Indicates that the trade is a Option contract trade.
	 */
	public static final MMCode Options = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			definition = "Indicates that the trade is a Option contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Indicates that the trade is a Futures option contract trade.
	 */
	public static final MMCode FuturesOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOption";
			definition = "Indicates that the trade is a Futures option contract trade.";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FUOP";
		}
	};
	/**
	 * The security will be bought back in the future..
	 */
	public static final MMCode FutureBuyBackTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureBuyBackTrade";
			definition = "The security will be bought back in the future..";
			owner_lazy = () -> TradeTypeCode.mmObject();
			codeName = "FBBT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BSKT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeTypeCode";
				definition = "Specifies the type of executed order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTypeCode.Basket, com.tools20022.repository.codeset.TradeTypeCode.Index, com.tools20022.repository.codeset.TradeTypeCode.List,
						com.tools20022.repository.codeset.TradeTypeCode.PreAllocation, com.tools20022.repository.codeset.TradeTypeCode.Program, com.tools20022.repository.codeset.TradeTypeCode.Trade,
						com.tools20022.repository.codeset.TradeTypeCode.BrokerToBroker, com.tools20022.repository.codeset.TradeTypeCode.FundToFund, com.tools20022.repository.codeset.TradeTypeCode.RiskTrade,
						com.tools20022.repository.codeset.TradeTypeCode.VWAPGuarantee, com.tools20022.repository.codeset.TradeTypeCode.Agency, com.tools20022.repository.codeset.TradeTypeCode.GuaranteedClose,
						com.tools20022.repository.codeset.TradeTypeCode.OnOrderBookTrade, com.tools20022.repository.codeset.TradeTypeCode.LinkedTrade, com.tools20022.repository.codeset.TradeTypeCode.TradeGiveUp,
						com.tools20022.repository.codeset.TradeTypeCode.CorrectiveTrade, com.tools20022.repository.codeset.TradeTypeCode.BackUpTrade, com.tools20022.repository.codeset.TradeTypeCode.OffOrderBookTrade,
						com.tools20022.repository.codeset.TradeTypeCode.EmployeeTradeReporting, com.tools20022.repository.codeset.TradeTypeCode.IPO, com.tools20022.repository.codeset.TradeTypeCode.OfferingIssuingTrade,
						com.tools20022.repository.codeset.TradeTypeCode.Issuance, com.tools20022.repository.codeset.TradeTypeCode.BondRepricing, com.tools20022.repository.codeset.TradeTypeCode.BondSubstitution,
						com.tools20022.repository.codeset.TradeTypeCode.BondEnd, com.tools20022.repository.codeset.TradeTypeCode.BondStart, com.tools20022.repository.codeset.TradeTypeCode.LendingAndBorrowing,
						com.tools20022.repository.codeset.TradeTypeCode.Futures, com.tools20022.repository.codeset.TradeTypeCode.Options, com.tools20022.repository.codeset.TradeTypeCode.FuturesOption,
						com.tools20022.repository.codeset.TradeTypeCode.FutureBuyBackTrade);
			}
		});
		return mmObject_lazy.get();
	}
}
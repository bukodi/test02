package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Represents a specific market trading session. It is used to identify a
 * portion of the session where the execution might take place ("after market",
 * "pre-market"). It is used to support order routing, quoting, and trade and
 * market data reporting. For instance, orders can be routed to one or more
 * Trading Sessions. Examples of Trading Session usage may be to facilitate
 * extended hours trading, to differentiate between concurrent electronic and
 * open-outcry trading, or to differentiate block and/or oddlot trading. It is
 * used by Exchanges, ECN's, and ATS's.
 */
public class TradeExecutionSessionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Opening Session. 8:00 AM - 9:30 AM Eastern of the Archipelago Exchange
	 * (Pacific Stock Exchange).
	 */
	public static final MMCode ArchipelagoOpeningSession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoOpeningSession";
			definition = "Opening Session. 8:00 AM - 9:30 AM Eastern of the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHO";
		}
	};
	/**
	 * Core Trading Session. 9:30 AM - 4:00 PM Eastern of the Archipelago
	 * Exchange (Pacific Stock Exchange).
	 */
	public static final MMCode ArchipelagoCoreSession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoCoreSession";
			definition = "Core Trading Session. 9:30 AM - 4:00 PM Eastern of the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHC";
		}
	};
	/**
	 * Late Trading Session. 4:00 PM - 8:00 PM Easternof the Archipelago
	 * Exchange (Pacific Stock Exchange).
	 */
	public static final MMCode ArchipelagoLateSession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArchipelagoLateSession";
			definition = "Late Trading Session. 4:00 PM - 8:00 PM Easternof the Archipelago Exchange (Pacific Stock Exchange).";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "ACHL";
		}
	};
	/**
	 * Early Morning Electronic Trading Session of the Chicago Board Options
	 * Exchange.
	 */
	public static final MMCode ChicagoBoardOptionsEarlySession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChicagoBoardOptionsEarlySession";
			definition = "Early Morning Electronic Trading Session of the Chicago Board Options Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "WAM1";
		}
	};
	/**
	 * Regular hours open outcry market of the Chicago Board Options Exchange.
	 */
	public static final MMCode ChicagoBoardOptionsRegularHours = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChicagoBoardOptionsRegularHours";
			definition = "Regular hours open outcry market of the Chicago Board Options Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "WMAI";
		}
	};
	/**
	 * An electronic communication system operated by Nagoya Securities
	 * Exchange.
	 */
	public static final MMCode NagoyaExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NagoyaExchange";
			definition = "An electronic communication system operated by Nagoya Securities Exchange.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "NNET";
		}
	};
	/**
	 * An electronic communication system by which the Osaka Securities Exchange
	 * (OSE), OSE members (Securities companies) and investors are directly
	 * connected with each other via a multi-layered computer network.
	 */
	public static final MMCode OsakaExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OsakaExchange";
			definition = "An electronic communication system by which the Osaka Securities Exchange (OSE), OSE members (Securities companies) and investors are directly connected with each other via a multi-layered computer network.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "JNET";
		}
	};
	/**
	 * An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed
	 * stocks only. For Single/List trade.
	 */
	public static final MMCode TokyoSingleListedTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TokyoSingleListedTrade";
			definition = "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For Single/List trade.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "TOS1";
		}
	};
	/**
	 * An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed
	 * stocks only. For trade based on close price of regular trading session.
	 */
	public static final MMCode TokyoClosingPriceTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TokyoClosingPriceTrade";
			definition = "An off hour trade session of Tokyo Stock Exchange (TSE) for TSE listed stocks only. For trade based on close price of regular trading session.";
			owner_lazy = () -> TradeExecutionSessionCode.mmObject();
			codeName = "TOS2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACHO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeExecutionSessionCode";
				definition = "Represents a specific market trading session. It is used to identify a portion of the session where the execution might take place (\"after market\", \"pre-market\").\nIt is used to support order routing, quoting, and trade and market data reporting. For instance, orders can be routed to one or more Trading Sessions. Examples of Trading Session usage may be to facilitate extended hours trading, to differentiate between concurrent electronic and open-outcry trading, or to differentiate block and/or oddlot trading.\nIt is used by Exchanges, ECN's, and ATS's.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeExecutionSessionCode.ArchipelagoOpeningSession, com.tools20022.repository.codeset.TradeExecutionSessionCode.ArchipelagoCoreSession,
						com.tools20022.repository.codeset.TradeExecutionSessionCode.ArchipelagoLateSession, com.tools20022.repository.codeset.TradeExecutionSessionCode.ChicagoBoardOptionsEarlySession,
						com.tools20022.repository.codeset.TradeExecutionSessionCode.ChicagoBoardOptionsRegularHours, com.tools20022.repository.codeset.TradeExecutionSessionCode.NagoyaExchange,
						com.tools20022.repository.codeset.TradeExecutionSessionCode.OsakaExchange, com.tools20022.repository.codeset.TradeExecutionSessionCode.TokyoSingleListedTrade,
						com.tools20022.repository.codeset.TradeExecutionSessionCode.TokyoClosingPriceTrade);
			}
		});
		return mmObject_lazy.get();
	}
}
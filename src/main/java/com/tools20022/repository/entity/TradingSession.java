package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TradeExecutionSessionCode;
import com.tools20022.repository.codeset.TradingSessionCode;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Established constraints under which a market operates
 */
public class TradingSession {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a specific execution time bracket code through its
	 * trading session name or description.
	 */
	public static final MMBusinessAttribute TradingSessionName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionName";
			definition = "Identification of a specific execution time bracket code through its trading session name or description.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the time bracket of a trading session in actual date and time
	 * format.
	 */
	public static final MMBusinessAssociationEnd TimeBracket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeBracket";
			definition = "Specifies the time bracket of a trading session in actual date and time format.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Market for which trading session information is specified..
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which trading session information is specified..";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Quote to which a trading session is associated.
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote to which a trading session is associated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Securities order associated with a trading session.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securities order associated with a trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Indicates the trading phase at the stock exchange, eg, opening auction
	 * phase, main trading phase, closing auction phase, etc.
	 */
	public static final MMBusinessAttribute TradingSessionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionIndicator";
			definition = "Indicates the trading phase at the stock exchange, eg, opening auction phase, main trading phase, closing auction phase, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingSessionCode.mmObject();
		}
	};
	/**
	 * Specific execution time period expressed through its trading session
	 * identifier. This identifier is for example used by exchanges, electronic
	 * communication networks (ECNs) and alternative trading systems (ATSs) to
	 * identify opening and closing hours of a trading session.
	 */
	public static final MMBusinessAttribute TradingSessionPhase = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSessionPhase";
			definition = "Specific execution time period expressed through its trading session identifier. This identifier is for example used by exchanges, electronic communication networks (ECNs) and alternative trading systems (ATSs) to identify opening and closing hours of a trading session.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeExecutionSessionCode.mmObject();
		}
	};
	/**
	 * Identification of a specific execution time bracket code, required by US
	 * regulations. This only applies to the US futures market.
	 */
	public static final MMBusinessAttribute USFuturesTradingSession = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USFuturesTradingSession";
			definition = "Identification of a specific execution time bracket code, required by US regulations. This only applies to the US futures market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * List trading process for which a trading session is specified.
	 */
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingSession.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which a trading session is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.ListTradingSession;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingSession";
				definition = "Established constraints under which a market operates";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.TradingSession, com.tools20022.repository.entity.DateTimePeriod.TradingSession,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderTradingSession, com.tools20022.repository.entity.ListTrading.ListTradingSession,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingSession.TradingSessionName, com.tools20022.repository.entity.TradingSession.TimeBracket, com.tools20022.repository.entity.TradingSession.Market,
						com.tools20022.repository.entity.TradingSession.Quote, com.tools20022.repository.entity.TradingSession.SecuritiesOrder, com.tools20022.repository.entity.TradingSession.TradingSessionIndicator,
						com.tools20022.repository.entity.TradingSession.TradingSessionPhase, com.tools20022.repository.entity.TradingSession.USFuturesTradingSession, com.tools20022.repository.entity.TradingSession.ListTrading);
			}
		});
		return mmObject_lazy.get();
	}
}
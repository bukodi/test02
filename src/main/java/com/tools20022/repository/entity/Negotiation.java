package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TradingMethodCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision making on the transfer of a financial instrument.
 */
public class Negotiation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method used by the trading parties to negotiate and/or execute a deal.
	 */
	public static final MMBusinessAttribute TradingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingMethodCode.mmObject();
		}
	};
	/**
	 * Execution of a trade as a result of a successful negotiation between two
	 * trading parties.
	 */
	public static final MMBusinessAssociationEnd TradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeExecution";
			definition = "Execution of a trade as a result of a successful negotiation between two trading parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}
	};
	/**
	 * Electronic system through which parties are able to negotiate trades.
	 */
	public static final MMBusinessAssociationEnd TradingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSystem";
			definition = "Electronic system through which parties are able to negotiate trades.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Negotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}
	};
	/**
	 * Reference of a negotiation.
	 */
	public static final MMBusinessAttribute NegotiationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiationIdentification";
			definition = "Reference of a negotiation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Quote details shown in a negotiation process.
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quote details shown in a negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	/**
	 * Indication of interest process which is the start of the negotiation.
	 */
	public static final MMBusinessAssociationEnd IndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process which is the start of the negotiation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	/**
	 * Result of a successful negotiation.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Negotiation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Result of a successful negotiation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Negotiation";
				definition = "Decision making on the transfer of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.RelatedNegotiation, com.tools20022.repository.entity.System.Negotiation,
						com.tools20022.repository.entity.SecuritiesOrder.RelatedNegotiation, com.tools20022.repository.entity.Quote.RelatedNegotiation, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Negotiation.TradingMethod, com.tools20022.repository.entity.Negotiation.TradeExecution, com.tools20022.repository.entity.Negotiation.TradingSystem,
						com.tools20022.repository.entity.Negotiation.NegotiationIdentification, com.tools20022.repository.entity.Negotiation.Quote, com.tools20022.repository.entity.Negotiation.IndicationOfInterest,
						com.tools20022.repository.entity.Negotiation.SecuritiesOrder);
			}
		});
		return mmObject_lazy.get();
	}
}
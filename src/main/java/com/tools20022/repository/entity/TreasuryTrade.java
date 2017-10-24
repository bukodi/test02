package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Trade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to treasury operations such as the exchange of
 * currencies, the lending of cash amounts and the related derivatives trades
 * (options and non deliverable trades).
 */
public class TreasuryTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the settlement status of a treasury trade.
	 */
	public static final MMBusinessAssociationEnd TreasuryTradeSettlementStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradeSettlementStatus";
			definition = "Specifies the settlement status of a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
		}
	};
	/**
	 * Party which provides prices, interest rates or exchange rates.
	 */
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provides prices, interest rates or exchange rates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of the settlement of a treasury
	 * trade.
	 */
	public static final MMBusinessAssociationEnd TreasurySettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasurySettlementPartyRole";
			definition = "Role played by a party in the context of the settlement of a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasurySettlementPartyRole.mmObject();
		}
	};
	/**
	 * Specifies each role played by a party in a treasury trade.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a treasury trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradePartyRole.TreasuryTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TreasuryTradePartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTrade";
				definition = "Specifies trades linked to treasury operations such as the exchange of currencies, the lending of cash amounts and the related derivatives trades (options and non deliverable trades).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade,
						com.tools20022.repository.entity.TreasuryTradePartyRole.TreasuryTrade, com.tools20022.repository.entity.TreasurySettlementPartyRole.TreasuryTrade);
				subType_lazy = () -> Arrays.asList(ForeignExchangeTrade.mmObject(), ForeignExchangeSwap.mmObject(), CurrencyOption.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus, com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole,
						com.tools20022.repository.entity.TreasuryTrade.TreasurySettlementPartyRole, com.tools20022.repository.entity.TreasuryTrade.PartyRole);
			}
		});
		return mmObject_lazy.get();
	}
}
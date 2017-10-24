package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.NettingEligibleCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of an order between at least two parties. A trade relates to the
 * delivery of goods and services, cash or securities.
 */
public class Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the date/time on which the trade was executed.
	 */
	public static final MMBusinessAttribute TradeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.Date);
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Commission parameters associated with a trade.
	 */
	public static final MMBusinessAssociationEnd TradeCommission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCommission";
			definition = "Commission parameters associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Commission.mmObject();
		}
	};
	/**
	 * Date on which the trade is settled, ie, the amounts are due.
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * End date of the trade, such as a treasury trade or a derivative trade.
	 */
	public static final MMBusinessAttribute EndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndDate";
			definition = "End date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the different identifications associated with a trade.
	 */
	public static final MMBusinessAssociationEnd TradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradeIdentification.mmObject();
		}
	};
	/**
	 * Specifies the type of allocation for a trade.
	 */
	public static final MMBusinessAttribute AllocationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies the type of allocation for a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of collateralisation.
	 */
	public static final MMBusinessAttribute CollateralisationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralisationType";
			definition = "Specifies the type of collateralisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates whether the trade is a block or single trade.
	 */
	public static final MMBusinessAttribute BlockIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates to the clearing member whether the trade is eligible for
	 * settlement netting or not.
	 */
	public static final MMBusinessAttribute SettlementNetting = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNetting";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligibleCode.mmObject();
		}
	};
	/**
	 * Role played by a party in relation with a trade.
	 */
	public static final MMBusinessAssociationEnd TradePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Role played by a party in relation with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	/**
	 * Negotiation process which is the source of the treasury trade.
	 */
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process which is the source of the treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.TradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}
	};
	/**
	 * Legal agreement applicable to a trade.
	 */
	public static final MMBusinessAssociationEnd GoverningDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoverningDocument";
			definition = "Legal agreement applicable to a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.GovernedTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MasterAgreement.mmObject();
		}
	};
	/**
	 * Start date of the trade, such as a treasury trade or a derivative trade.
	 */
	public static final MMBusinessAttribute StartDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Start date of the trade, such as a treasury trade or a derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * System involved in the processing of a trade such as clearing, settlement
	 * or matching system.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System involved in the processing of a trade such as clearing, settlement or matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Asset which is the object of a trade.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Asset which is the object of a trade.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	/**
	 * Market where a trade is negotiated and executed.
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market where a trade is negotiated and executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	/**
	 * Guarantee which covers a trade.
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee which covers a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.GuaranteedTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	/**
	 * Transfer of proceeds.
	 */
	public static final MMBusinessAssociationEnd Settlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Transfer of proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Settlement.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Settlement.mmObject();
		}
	};
	/**
	 * Specifies the order related to a trade.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Specifies the order related to a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Order.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
		}
	};
	/**
	 * Separate transactions which combined together form a trade.
	 */
	public static final MMBusinessAssociationEnd Leg = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Leg";
			definition = "Separate transactions which combined together form a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
		}
	};
	/**
	 * Financial transaction to which the trade belongs.
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the trade belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.ReconciledTrades;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Trade";
				definition = "Result of an order between at least two parties. A trade relates to the delivery of goods and services, cash or securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Trade, com.tools20022.repository.entity.Commission.Trade, com.tools20022.repository.entity.Obligation.Trade,
						com.tools20022.repository.entity.TradeIdentification.Trade, com.tools20022.repository.entity.TradePartyRole.Trade, com.tools20022.repository.entity.System.Trade, com.tools20022.repository.entity.Settlement.Trade,
						com.tools20022.repository.entity.Leg.Trade, com.tools20022.repository.entity.Negotiation.TradeExecution, com.tools20022.repository.entity.MasterAgreement.GovernedTrades,
						com.tools20022.repository.entity.Guarantee.GuaranteedTrade, com.tools20022.repository.entity.Reconciliation.ReconciledTrades, com.tools20022.repository.entity.Market.Trade,
						com.tools20022.repository.entity.Order.Trade, com.tools20022.repository.entity.FinancialTransaction.Trade);
				subType_lazy = () -> Arrays.asList(SecuritiesTrade.mmObject(), TreasuryTrade.mmObject(), CommercialTrade.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.TradeDateTime, com.tools20022.repository.entity.Trade.TradeCommission, com.tools20022.repository.entity.Trade.ValueDate,
						com.tools20022.repository.entity.Trade.EndDate, com.tools20022.repository.entity.Trade.TradeRelatedIdentifications, com.tools20022.repository.entity.Trade.AllocationIndicator,
						com.tools20022.repository.entity.Trade.CollateralisationType, com.tools20022.repository.entity.Trade.BlockIndicator, com.tools20022.repository.entity.Trade.SettlementNetting,
						com.tools20022.repository.entity.Trade.TradePartyRole, com.tools20022.repository.entity.Trade.Obligation, com.tools20022.repository.entity.Trade.RelatedNegotiation,
						com.tools20022.repository.entity.Trade.GoverningDocument, com.tools20022.repository.entity.Trade.StartDate, com.tools20022.repository.entity.Trade.System, com.tools20022.repository.entity.Trade.Asset,
						com.tools20022.repository.entity.Trade.Market, com.tools20022.repository.entity.Trade.Guarantee, com.tools20022.repository.entity.Trade.Settlement, com.tools20022.repository.entity.Trade.Order,
						com.tools20022.repository.entity.Trade.Leg, com.tools20022.repository.entity.Trade.FinancialTransaction, com.tools20022.repository.entity.Trade.Reconciliation);
			}
		});
		return mmObject_lazy.get();
	}
}
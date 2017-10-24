package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.MarketTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Market;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties may meet in order
 * to negotiate and execute trades among themselves. It also identifies the
 * primary market where an asset is issued.
 */
public class TradingMarket extends Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security which is traded on a specific market.
	 */
	public static final MMBusinessAssociationEnd TradedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradedSecurity";
			definition = "Security which is traded on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.TradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Nature of a market in which transactions take place.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of a market in which transactions take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketTypeCode.mmObject();
		}
	};
	/**
	 * Security whch is listed on a specific market.
	 */
	public static final MMBusinessAssociationEnd ListedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurity";
			definition = "Security whch is listed on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.PlaceOfListing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Party which provides a price on a market.
	 */
	public static final MMBusinessAssociationEnd SourceOfPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfPrice";
			definition = "Party which provides a price on a market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.MarketIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
		}
	};
	/**
	 * Specifies the number of securities that have to be traded in one lot .
	 */
	public static final MMBusinessAssociationEnd TradeLotSize = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeLotSize";
			definition = "Specifies the number of securities that have to be traded in one lot .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.TradeLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}
	};
	/**
	 * Minimum number of securities that can be traded.
	 */
	public static final MMBusinessAssociationEnd MinimumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Date/time at which the security is listed at the specific exchange.
	 */
	public static final MMBusinessAttribute ListingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Order for which a place of trade is requested.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a place of trade is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Currency of the trading.
	 */
	public static final MMBusinessAttribute TradingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Miaximum number of securities that can be traded.
	 */
	public static final MMBusinessAssociationEnd MaximumTradedNominalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Miaximum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Stock exchange which operates on a specific market.
	 */
	public static final MMBusinessAssociationEnd StockExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Stock exchange which operates on a specific market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StockExchange.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StockExchange.mmObject();
		}
	};
	/**
	 * Lot size associated with the price. Most exchanges require that pricing
	 * be quoted in round lot size. However, some exchanges have pricing quoted
	 * in many different lot sizes, for example, Latin America, some Asian
	 * markets, Turkey.
	 */
	public static final MMBusinessAssociationEnd QuoteLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteLot";
			definition = "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 */
	public static final MMBusinessAssociationEnd RoundLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.RoundLotMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}
	};
	/**
	 * Trading session associated with a market.
	 */
	public static final MMBusinessAssociationEnd TradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session associated with a market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	/**
	 * Trading identification used on this trading market.
	 */
	public static final MMBusinessAssociationEnd ListedSecurityTradingIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListedSecurityTradingIdentification";
			definition = "Trading identification used on this trading market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}
	};
	/**
	 * Default currency for the securities trading on this market.
	 */
	public static final MMBusinessAttribute DefaultCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultCurrency";
			definition = "Default currency for the securities trading on this market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * First date/time at which the security is eligible for trading.
	 */
	public static final MMBusinessAttribute FirstTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstTradingDate";
			definition = "First date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Last date/time at which the security is eligible for trading.
	 */
	public static final MMBusinessAttribute LastTradingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Last date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Issuance for which the place has been defined.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the place has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuePlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Place of settlement for which a settlement market is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPlaceOfSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradingMarket.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPlaceOfSettlement";
			definition = "Place of settlement for which a settlement market is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PlaceOfSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingMarket";
				definition = "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.TradingMarket, com.tools20022.repository.entity.Security.PlaceOfListing,
						com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.LotBreakdown.TradeLotMarket, com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket,
						com.tools20022.repository.entity.LotBreakdown.RoundLotMarket, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.SourceOfPrice.MarketIdentification,
						com.tools20022.repository.entity.SecuritiesOrder.PlaceOfTrade, com.tools20022.repository.entity.TradingSession.Market, com.tools20022.repository.entity.PlaceOfSettlement.SettlementMarket,
						com.tools20022.repository.entity.StockExchange.Market);
				superType_lazy = () -> Market.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.TradedSecurity, com.tools20022.repository.entity.TradingMarket.Type, com.tools20022.repository.entity.TradingMarket.ListedSecurity,
						com.tools20022.repository.entity.TradingMarket.SourceOfPrice, com.tools20022.repository.entity.TradingMarket.TradeLotSize, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.ListingDate, com.tools20022.repository.entity.TradingMarket.RelatedOrder, com.tools20022.repository.entity.TradingMarket.TradingCurrency,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.TradingMarket.StockExchange, com.tools20022.repository.entity.TradingMarket.QuoteLot,
						com.tools20022.repository.entity.TradingMarket.RoundLot, com.tools20022.repository.entity.TradingMarket.TradingSession, com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification,
						com.tools20022.repository.entity.TradingMarket.DefaultCurrency, com.tools20022.repository.entity.TradingMarket.FirstTradingDate, com.tools20022.repository.entity.TradingMarket.LastTradingDate,
						com.tools20022.repository.entity.TradingMarket.Issuance, com.tools20022.repository.entity.TradingMarket.RelatedPlaceOfSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}
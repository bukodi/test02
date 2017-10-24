package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio. One example is index arbitrage, which
 * consists in the purchase or sale of a basket of stocks in conjunction with
 * the sale or purchase of a derivative product (for example index futures) to
 * profit from price differences between the basket and the derivative product.
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 */
public class ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identifier for a list, as assigned by the trading party. The
	 * identifier must be unique within a single trading day.
	 */
	public static final MMBusinessAttribute ListIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Order list containing the details of the individual orders within the
	 * program.
	 */
	public static final MMBusinessAssociationEnd SecuritiesListOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Details of a specific trading session for a list trading.
	 */
	public static final MMBusinessAssociationEnd ListTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}
	};
	/**
	 * Provides the name of the order list.
	 */
	public static final MMBusinessAttribute ListName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Represents the basis price type in a bid order (list trading).
	 */
	public static final MMBusinessAttribute BasisPriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}
	};
	/**
	 * Time at which current market prices are used to determine the value of a
	 * basket.
	 */
	public static final MMBusinessAttribute StrikeTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether an amount is a gross amount (including all charges,
	 * commissions and tax), or a net amount.
	 */
	public static final MMBusinessAttribute GrossAmountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Unique identifier for a bid, as assigned by the the sell-side (broker,
	 * exchange, electronic communication network (ECN)). The identifier must be
	 * unique within a single trading day.
	 */
	public static final MMBusinessAttribute SellSideIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideIdentification";
			definition = "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identifier for a bid, as assigned by the buy-side institution. The
	 * identifier must be unique within a single trading day.
	 */
	public static final MMBusinessAttribute BuySideIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideIdentification";
			definition = "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information on the liquidity of a financial instrument.
	 */
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
		}
	};
	/**
	 * Indicates the type of bid for a list order.
	 */
	public static final MMBusinessAttribute BidType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates the type of bid for a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BidTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ListTrading, com.tools20022.repository.entity.TradingSession.ListTrading, com.tools20022.repository.entity.Liquidity.ListTrading);
				subType_lazy = () -> Arrays.asList(DisclosedListTrading.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ListTrading.ListIdentification, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder,
						com.tools20022.repository.entity.ListTrading.ListTradingSession, com.tools20022.repository.entity.ListTrading.ListName, com.tools20022.repository.entity.ListTrading.BasisPriceType,
						com.tools20022.repository.entity.ListTrading.StrikeTime, com.tools20022.repository.entity.ListTrading.GrossAmountIndicator, com.tools20022.repository.entity.ListTrading.SellSideIdentification,
						com.tools20022.repository.entity.ListTrading.BuySideIdentification, com.tools20022.repository.entity.ListTrading.Liquidity, com.tools20022.repository.entity.ListTrading.BidType);
			}
		});
		return mmObject_lazy.get();
	}
}
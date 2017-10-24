package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.ListTrading;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List trading by which the buy-side details the exact stocks and sizes to be
 * traded and the sell-side offers the buy-side a two-way price, to buy or to
 * sell the indicated stocks. All sell-side firms see all of the stocks and
 * quantities in the portfolio during the bidding phase regardless of whether or
 * not they win the business.
 */
public class DisclosedListTrading extends ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities account used for the trade of a disclosed list of securities,
	 * eg, in basket or program trading.
	 */
	public static final MMBusinessAssociationEnd DisclosedListTradingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTradingAccount";
			definition = "Securities account used for the trade of a disclosed list of securities, eg, in basket or program trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Total trade value for which a party is willing to purchase financial
	 * instruments.
	 */
	public static final MMBusinessAttribute BuyAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Total trade value for which a party is willing to purchase financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total trade value for which a party is willing to sell financial
	 * instruments.
	 */
	public static final MMBusinessAttribute SellAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Total trade value for which a party is willing to sell financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Requested date of trade settlement in coded form (eg, trade date +1).
	 */
	public static final MMBusinessAttribute RequestedSettlementDateCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DisclosedListTrading.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDateCode";
			definition = "Requested date of trade settlement in coded form (eg, trade date +1).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DisclosedListTrading";
				definition = "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading);
				superType_lazy = () -> ListTrading.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount, com.tools20022.repository.entity.DisclosedListTrading.BuyAmount,
						com.tools20022.repository.entity.DisclosedListTrading.SellAmount, com.tools20022.repository.entity.DisclosedListTrading.RequestedSettlementDateCode);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CrossTradeExecutionCode;
import com.tools20022.repository.codeset.CrossTypeCode;
import com.tools20022.repository.codeset.PrioritisationCode;
import com.tools20022.repository.entity.SecuritiesOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction where either the buy-broker and the sell-broker are the same, or
 * the buy-broker and the sell-broker belong to the same firm.
 */
public class CrossTrade extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Buyside order details.
	 */
	public static final MMBusinessAssociationEnd BuySideOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CrossTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideOrder";
			definition = "Buyside order details.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.BuySideRelatedCrossTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Sell side order details.
	 */
	public static final MMBusinessAssociationEnd SellSideOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CrossTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideOrder";
			definition = "Sell side order details.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SellSideRelatedCrossTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Identifies the type of execution of a cross trade.
	 */
	public static final MMBusinessAttribute ExecutionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CrossTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionType";
			definition = "Identifies the type of execution of a cross trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossTradeExecutionCode.mmObject();
		}
	};
	/**
	 * Type of cross being submitted to a market.
	 */
	public static final MMBusinessAttribute CrossType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CrossTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossType";
			definition = "Type of cross being submitted to a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CrossTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether one side or the other of a cross order should be
	 * prioritized.<br>
	 * The definition of prioritization depends on the market. In some markets
	 * prioritization means which side of the cross order is applied to the
	 * market first. In other markets, prioritization may mean that the
	 * prioritized side is fully executed (sometimes referred to as the side
	 * being protected).
	 */
	public static final MMBusinessAttribute Prioritisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CrossTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prioritisation";
			definition = "Indicates whether one side or the other of a cross order should be prioritized.\r\nThe definition of prioritization depends on the market. In some markets prioritization means which side of the cross order is applied to the market first. In other markets, prioritization may mean that the prioritized side is fully executed (sometimes referred to as the side being protected).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrioritisationCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CrossTrade";
				definition = "Transaction where either the buy-broker and the sell-broker are the same, or the buy-broker and the sell-broker belong to the same firm.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.BuySideRelatedCrossTrade, com.tools20022.repository.entity.SecuritiesOrder.SellSideRelatedCrossTrade);
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CrossTrade.BuySideOrder, com.tools20022.repository.entity.CrossTrade.SellSideOrder, com.tools20022.repository.entity.CrossTrade.ExecutionType,
						com.tools20022.repository.entity.CrossTrade.CrossType, com.tools20022.repository.entity.CrossTrade.Prioritisation);
			}
		});
		return mmObject_lazy.get();
	}
}
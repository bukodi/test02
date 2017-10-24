package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max16Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Record of orders to buy and sell a financial instrument.
 */
public class OrderBook {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction to a broker or dealer to buy or sell a specific security.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrderBook.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Instruction to a broker or dealer to buy or sell a specific security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.RelatedOrderBook;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Priority given to an order based on its price and/or time specification.
	 */
	public static final MMBusinessAttribute PriceTimePriority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrderBook.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceTimePriority";
			definition = "Priority given to an order based on its price and/or time specification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderBook";
				definition = "Record of orders to buy and sell a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.RelatedOrderBook);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrderBook.Order, com.tools20022.repository.entity.OrderBook.PriceTimePriority);
			}
		});
		return mmObject_lazy.get();
	}
}
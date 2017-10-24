package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Order placed by an investor to buy or sell an asset at a price specified or
 * not.
 */
public class Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement between two parties to buy and sell assets.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Order.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a group of individual orders, as
	 * assigned by the instructing party. This identifier links the individual
	 * orders together.
	 */
	public static final MMBusinessAttribute MasterIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Order.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterIdentification";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Order";
				definition = "Order placed by an investor to buy or sell an asset at a price specified or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Order);
				subType_lazy = () -> Arrays.asList(SecuritiesOrder.mmObject(), PurchaseOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Order.Trade, com.tools20022.repository.entity.Order.MasterIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}
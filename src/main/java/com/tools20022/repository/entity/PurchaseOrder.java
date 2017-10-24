package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Order;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document issued by a buyer and containing the details of a purchase,
 * including description of goods, transport information, payment terms, etc.
 */
public class PurchaseOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Line items total amount.
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Line items total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Execution of the purchase order.
	 */
	public static final MMBusinessAssociationEnd ResultingCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingCommercialTrade";
			definition = "Execution of the purchase order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}
	};
	/**
	 * Specifies the items which are sold by the seller to the buyer in a
	 * commercial trade.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the items which are sold by the seller to the buyer in a commercial trade.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.PurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Identification of the purchase order that can be used for reconciliation
	 * or to link tasks relating to the commercial trade.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PurchaseOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the purchase order that can be used for reconciliation or to link tasks relating to the commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PurchaseOrder";
				definition = "Document issued by a buyer and containing the details of a purchase, including description of goods, transport information, payment terms, etc.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder, com.tools20022.repository.entity.Product.PurchaseOrder,
						com.tools20022.repository.entity.CommercialTrade.PurchaseOrder);
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PurchaseOrder.TotalAmount, com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade, com.tools20022.repository.entity.PurchaseOrder.Product,
						com.tools20022.repository.entity.PurchaseOrder.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}
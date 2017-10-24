package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for the seller to deliver goods or services to the buyer.
 */
public class ProductDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fulfilment of a product delivery obligation through the delivery of goods
	 * and services. It is derived from the association between Obligation and
	 * Obligation fulfillment.
	 */
	public static final MMBusinessAssociationEnd ProductDeliveryOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryOffset";
			definition = "Fulfilment of a product delivery obligation through the delivery of goods and services. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a specific
	 * product.
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Specifies the trade which originates the obligation to deliver a specific product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.ProductDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductDeliveryObligation";
				definition = "Obligation for the seller  to deliver goods or services to the buyer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.ProductDeliveryObligation, com.tools20022.repository.entity.ProductDelivery.Obligation);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductDeliveryObligation.ProductDeliveryOffset, com.tools20022.repository.entity.ProductDeliveryObligation.CommercialTrade);
			}
		});
		return mmObject_lazy.get();
	}
}
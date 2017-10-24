package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Arrangements for delivery of invoiced products and/or services.
 */
public class ProductDelivery extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Actual delivery period of the products and/or services.
	 */
	public static final MMBusinessAssociationEnd DeliveryPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Information related to the conveyance of goods.
	 */
	public static final MMBusinessAssociationEnd Routing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Routing";
			definition = "Information related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}
	};
	/**
	 * Specifies the settlement operation which originates the delivery of a
	 * product.
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}
	};
	/**
	 * Specifies the obligation which is offset by the delivery of a product.
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligation which is offset by the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.ProductDeliveryOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductDeliveryObligation.mmObject();
		}
	};
	/**
	 * Formal document used to record a fact and used as proof of the fact, in
	 * the context of a commercial trade transaction.
	 */
	public static final MMBusinessAssociationEnd TradeCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
		}
	};
	/**
	 * Formal document used to record a fact and used as proof of the fact that
	 * goods have been insured under an insurance policy.
	 */
	public static final MMBusinessAssociationEnd InsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}
	};
	/**
	 * Specifies the type of goods and services linked to the quantity.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Delivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductDelivery";
				definition = "Arrangements for delivery of invoiced products and/or services.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery, com.tools20022.repository.entity.Product.Delivery,
						com.tools20022.repository.entity.InsuranceCertificate.ProductDelivery, com.tools20022.repository.entity.Transport.ProductDelivery, com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery,
						com.tools20022.repository.entity.TradeCertificate.ProductDelivery, com.tools20022.repository.entity.ProductDeliveryObligation.ProductDeliveryOffset);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod, com.tools20022.repository.entity.ProductDelivery.Routing, com.tools20022.repository.entity.ProductDelivery.TradeSettlement,
						com.tools20022.repository.entity.ProductDelivery.Obligation, com.tools20022.repository.entity.ProductDelivery.TradeCertificate, com.tools20022.repository.entity.ProductDelivery.InsuranceCertificate,
						com.tools20022.repository.entity.ProductDelivery.Product);
			}
		});
		return mmObject_lazy.get();
	}
}
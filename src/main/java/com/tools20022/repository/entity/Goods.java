package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Product;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Good is a physical product that can be delivered to a purchaser and that
 * involves the transfer of ownership from seller to customer.
 */
public class Goods extends Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the transport information related to the delivery of goods.
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Goods.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport information related to the delivery of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportedGoods;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	/**
	 * Analysis of the goods, as proven by the trade certificate.
	 */
	public static final MMBusinessAttribute Analysis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Goods.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Analysis";
			definition = "Analysis of the goods, as proven by the trade certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Indicates if the goods have passed the health check.
	 */
	public static final MMBusinessAttribute HealthCheck = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Goods.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HealthCheck";
			definition = "Indicates if the goods have passed the health check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the goods have passed the phytosanitary inspection.
	 */
	public static final MMBusinessAttribute PhytosanitaryInspection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Goods.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhytosanitaryInspection";
			definition = "Indicates if the goods have passed the phytosanitary inspection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of producing goods.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Goods.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of producing goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GoodsPartyRole.Item;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GoodsPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Goods";
				definition = "Good is a physical product that can be delivered to a purchaser and that involves the transfer of ownership from seller to customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.TransportedGoods, com.tools20022.repository.entity.GoodsPartyRole.Item);
				superType_lazy = () -> Product.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Goods.Transport, com.tools20022.repository.entity.Goods.Analysis, com.tools20022.repository.entity.Goods.HealthCheck,
						com.tools20022.repository.entity.Goods.PhytosanitaryInspection, com.tools20022.repository.entity.Goods.PartyRole);
			}
		});
		return mmObject_lazy.get();
	}
}
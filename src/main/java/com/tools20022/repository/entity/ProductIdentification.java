package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ProductIdentifierCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information used to identify a product.
 */
public class ProductIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the product identifier.
	 */
	public static final MMBusinessAttribute Identifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identifier";
			definition = "Specifies the product identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the product for which an identification is specified.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which an identification is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.ProductIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Specifies the type of product identifier by means of a code.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product identifier by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductIdentifierCode.mmObject();
		}
	};
	/**
	 * Unique global serial identifier for a product instance.
	 */
	public static final MMBusinessAttribute GlobalSerialIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalSerialIdentifier";
			definition = "Unique global serial identifier for a product instance.";
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
				name = "ProductIdentification";
				definition = "Information used to identify a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.ProductIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductIdentification.Identifier, com.tools20022.repository.entity.ProductIdentification.Product,
						com.tools20022.repository.entity.ProductIdentification.Type, com.tools20022.repository.entity.ProductIdentification.GlobalSerialIdentifier);
			}
		});
		return mmObject_lazy.get();
	}
}
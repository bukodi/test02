package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ProductCategoryCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the category of the product.
 */
public class ProductCategory {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the product for which a category is specified.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductCategory.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which a category is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.ProductCategory;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Specifies the type of product category by means of a code.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductCategory.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product category by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductCategoryCode.mmObject();
		}
	};
	/**
	 * Specifies the category of a product.
	 */
	public static final MMBusinessAttribute Category = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductCategory.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the category of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Validation process which declined a product code.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductCategory.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process which declined a product code.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.DeclinedProductCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductCategory";
				definition = "Specifies the category of the product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.ProductCategory, com.tools20022.repository.entity.CardPaymentValidation.DeclinedProductCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductCategory.Product, com.tools20022.repository.entity.ProductCategory.Type, com.tools20022.repository.entity.ProductCategory.Category,
						com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation);
			}
		});
		return mmObject_lazy.get();
	}
}
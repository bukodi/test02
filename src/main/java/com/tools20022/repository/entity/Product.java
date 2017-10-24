package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Item that is offered for sale. Products can be services or goods.
 */
public class Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card payment for which a product was specified.
	 */
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	/**
	 * Price per unit of product.
	 */
	public static final MMBusinessAssociationEnd UnitPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.UnitPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}
	};
	/**
	 * Category of the product.
	 */
	public static final MMBusinessAssociationEnd ProductCategory = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
		}
	};
	/**
	 * Specifies the line item in which the product is specified.
	 */
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.InvoicedProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	/**
	 * Identification of the product.
	 */
	public static final MMBusinessAssociationEnd ProductIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductIdentification.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
		}
	};
	/**
	 * Name of a product.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information about the goods and/or services of a trade transaction.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Country from which the product originates.
	 */
	public static final MMBusinessAssociationEnd Origin = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.ProducedProducts;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}
	};
	/**
	 * Characteristics of the product.
	 */
	public static final MMBusinessAssociationEnd Characteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCharacteristics.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductCharacteristics.mmObject();
		}
	};
	/**
	 * Net price of the goods and/or service.
	 */
	public static final MMBusinessAssociationEnd NetPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.NetPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}
	};
	/**
	 * Specifies the quantity of the product.
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Gross price of the goods and/or service.
	 */
	public static final MMBusinessAssociationEnd GrossPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.GrossPriceProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}
	};
	/**
	 * Quality of the product.
	 */
	public static final MMBusinessAttribute Quality = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Delivery process of a product
	 */
	public static final MMBusinessAssociationEnd Delivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}
	};
	/**
	 * Specifies the purchase order in which a specific product is ordered.
	 */
	public static final MMBusinessAssociationEnd PurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters linked to the value of the goods and
	 * services in a trade transaction.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Product.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Product;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.CardPayment.Product,
						com.tools20022.repository.entity.Price.UnitPriceProduct, com.tools20022.repository.entity.Price.NetPriceProduct, com.tools20022.repository.entity.Price.GrossPriceProduct,
						com.tools20022.repository.entity.ProductIdentification.Product, com.tools20022.repository.entity.ProductQuantity.Product, com.tools20022.repository.entity.ProductCategory.Product,
						com.tools20022.repository.entity.LineItem.InvoicedProduct, com.tools20022.repository.entity.ProductDelivery.Product, com.tools20022.repository.entity.ProductCharacteristics.Product,
						com.tools20022.repository.entity.PurchaseOrder.Product);
				subType_lazy = () -> Arrays.asList(Goods.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.Product.UnitPrice, com.tools20022.repository.entity.Product.ProductCategory,
						com.tools20022.repository.entity.Product.LineItem, com.tools20022.repository.entity.Product.ProductIdentification, com.tools20022.repository.entity.Product.Name, com.tools20022.repository.entity.Product.Description,
						com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Product.Characteristics, com.tools20022.repository.entity.Product.NetPrice, com.tools20022.repository.entity.Product.Quantity,
						com.tools20022.repository.entity.Product.GrossPrice, com.tools20022.repository.entity.Product.Quality, com.tools20022.repository.entity.Product.Delivery, com.tools20022.repository.entity.Product.PurchaseOrder,
						com.tools20022.repository.entity.Product.Tax);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the ordered quantity of a product.
 */
public class ProductQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the unit of measurement. For example, kilo, tons.
	 */
	public static final MMBusinessAttribute UnitOfMeasure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}
	};
	/**
	 * Quantity of a product on a line specified by a number. For example, 100
	 * (kgs), 50 (pieces).
	 */
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies the type of goods and services linked to the quantity.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Multiplication factor of measurement values. For example: goods that can
	 * be ordered by 36 pieces.
	 */
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Line item for which a net weight is specified.
	 */
	public static final MMBusinessAssociationEnd NetWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetWeightRelatedLineItem";
			definition = "Line item for which a net weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Line item which contains this quantity.
	 */
	public static final MMBusinessAssociationEnd BilledQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BilledQuantityRelatedLineItem";
			definition = "Line item which contains this quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.BilledQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Packaging for which a quantity is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPackaging = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPackaging";
			definition = "Packaging for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}
	};
	/**
	 * Packaging for which a unit quantity per package is specified.
	 */
	public static final MMBusinessAssociationEnd PackagingForUnitQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForUnitQuantity";
			definition = "Packaging for which a unit quantity per package is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}
	};
	/**
	 * Line item for which a charge free quantity of product is specified.
	 */
	public static final MMBusinessAssociationEnd ChargeFreeQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantityRelatedLineItem";
			definition = "Line item for which a charge free quantity of product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.ChargeFreeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Quantity value on which the quantity measurement started for a line item.
	 * For instance the start amount of a meter reading for an electricity
	 * supplier.
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityStart = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Quantity value on which the quantity measurement ended for a line item.
	 * For instance the end amount of a meter reading for an electricity
	 * supplier.
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityEnd = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Variance allowed in the quantity of goods.
	 */
	public static final MMBusinessAssociationEnd QuantityTolerance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tolerance.mmObject();
		}
	};
	/**
	 * Packaging for which a total consignment quantity is specified.
	 */
	public static final MMBusinessAssociationEnd PackagingForConsignmentlQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForConsignmentlQuantity";
			definition = "Packaging for which a total consignment quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}
	};
	/**
	 * Packaging for which a volume is specified.
	 */
	public static final MMBusinessAssociationEnd PackagingForVolume = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForVolume";
			definition = "Packaging for which a volume is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalVolume;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}
	};
	/**
	 * Packaging for which a weight is specified.
	 */
	public static final MMBusinessAssociationEnd PackagingForWeight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForWeight";
			definition = "Packaging for which a weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.TotalWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}
	};
	/**
	 * Line item for which gross price quantity is specified.
	 */
	public static final MMBusinessAssociationEnd GrossPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantityRelatedLineItem";
			definition = "Line item for which gross price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.GrossPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Line item for which a net price quantity is specified.
	 */
	public static final MMBusinessAssociationEnd NetPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantityRelatedLineItem";
			definition = "Line item for which a net price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};
	/**
	 * Line item for which a gross weight is specified.
	 */
	public static final MMBusinessAssociationEnd GrossWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProductQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossWeightRelatedLineItem";
			definition = "Line item for which a gross weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.GrossWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductQuantity";
				definition = "Specifies the ordered quantity of a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.Quantity, com.tools20022.repository.entity.Tolerance.Quantity, com.tools20022.repository.entity.LineItem.NetWeight,
						com.tools20022.repository.entity.LineItem.BilledQuantity, com.tools20022.repository.entity.LineItem.ChargeFreeQuantity, com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.GrossPriceQuantity, com.tools20022.repository.entity.LineItem.NetPriceQuantity,
						com.tools20022.repository.entity.LineItem.GrossWeight, com.tools20022.repository.entity.Packaging.Quantity, com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity,
						com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.TotalVolume, com.tools20022.repository.entity.Packaging.TotalWeight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.UnitOfMeasure, com.tools20022.repository.entity.ProductQuantity.Value, com.tools20022.repository.entity.ProductQuantity.Product,
						com.tools20022.repository.entity.ProductQuantity.Factor, com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.RelatedPackaging, com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity,
						com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart,
						com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.QuantityTolerance,
						com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.PackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.PackagingForWeight, com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem);
			}
		});
		return mmObject_lazy.get();
	}
}
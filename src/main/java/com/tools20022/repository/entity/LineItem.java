package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unit of information showing the related provision of products and/or services
 * and monetary summations reported as a discrete line item.
 */
public class LineItem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Modification on the value of goods and / or services taking into account
	 * discounts, allowances and charges.
	 */
	public static final MMBusinessAssociationEnd FinancialAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAdjustment";
			definition = "Modification on the value of goods and / or services taking into account discounts, allowances and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.RelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Logistics service charge for this line item.
	 */
	public static final MMBusinessAssociationEnd LogisticsCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.LogisticsChargeLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Monetary value of the line amount total being reported for this
	 * settlement.
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Uniquely identifies a line item.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the product and the quantity for which an invoice is generated.
	 */
	public static final MMBusinessAssociationEnd InvoicedProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoicedProduct";
			definition = "Specifies the product and the quantity for which an invoice is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}
	};
	/**
	 * Net weight of the physical item which is invoiced.
	 */
	public static final MMBusinessAssociationEnd NetWeight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetWeight";
			definition = "Net weight of the physical item which is invoiced.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Quantity billed for this line item.
	 */
	public static final MMBusinessAssociationEnd BilledQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BilledQuantity";
			definition = "Quantity billed for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Quantity that is free of charge for this line item.
	 */
	public static final MMBusinessAssociationEnd ChargeFreeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantity";
			definition = "Quantity that is free of charge for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Line item for which a measure quantity end is specified.
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityStartRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityStartRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Line item for which a measure quantity end is specified.
	 */
	public static final MMBusinessAssociationEnd MeasureQuantityEndRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeasureQuantityEndRelatedLineItem";
			definition = "Line item for which a measure quantity end is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Date/time on which the clock time measure started for a line item.
	 */
	public static final MMBusinessAttribute MeasureDateTimeStart = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeStart";
			definition = "Date/time on which the clock time measure started for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time on which the clock time measure ended for a line item.
	 */
	public static final MMBusinessAttribute MeasureDateTimeEnd = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureDateTimeEnd";
			definition = "Date/time on which the clock time measure ended for a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the invoice in which the line item is included.
	 */
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies the invoice in which the line item is included.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	/**
	 * Total amount resulting from the gross amount plus freight charges, tax
	 * and plus/minus Adjustments.
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Physical packaging of the product.
	 */
	public static final MMBusinessAssociationEnd Packaging = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of the product.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.RelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	/**
	 * Actual delivery date/time of the products and/or services for this line
	 * item.
	 */
	public static final MMBusinessAttribute DeliveryDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services for this line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Charges specified for this line item.
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Charges specified for this line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.LineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Allowance or charge applied to the net price. When the charge amount is
	 * added (credit)
	 */
	public static final MMBusinessAssociationEnd NetPriceCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceCharge";
			definition = "Allowance or charge applied to the net price. When the charge amount is added (credit)";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.NetPriceChargeLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Quantity and conversion factor on which the gross price is based for this
	 * line item product and/or service.
	 */
	public static final MMBusinessAssociationEnd GrossPriceQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantity";
			definition = "Quantity and conversion factor on which the gross price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Quantity and conversion factor on which the net price is based for this
	 * line item product and/or service.
	 */
	public static final MMBusinessAssociationEnd NetPriceQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantity";
			definition = "Quantity and conversion factor on which the net price is based for this line item product and/or service.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Gross weight of the physical item which is invoiced.
	 */
	public static final MMBusinessAssociationEnd GrossWeight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LineItem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossWeight";
			definition = "Gross weight of the physical item which is invoiced.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LineItem";
				definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.LineItem, com.tools20022.repository.entity.Adjustment.RelatedLineItem, com.tools20022.repository.entity.Charges.LogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.LineItem, com.tools20022.repository.entity.Charges.NetPriceChargeLineItem, com.tools20022.repository.entity.Invoice.LineItem,
						com.tools20022.repository.entity.ProductQuantity.NetWeightRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.BilledQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.ChargeFreeQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.MeasureQuantityStart,
						com.tools20022.repository.entity.ProductQuantity.MeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.GrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.NetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.GrossWeightRelatedLineItem,
						com.tools20022.repository.entity.Packaging.RelatedLineItem);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LineItem.FinancialAdjustment, com.tools20022.repository.entity.LineItem.LogisticsCharge, com.tools20022.repository.entity.LineItem.GrossAmount,
						com.tools20022.repository.entity.LineItem.Identification, com.tools20022.repository.entity.LineItem.InvoicedProduct, com.tools20022.repository.entity.LineItem.NetWeight,
						com.tools20022.repository.entity.LineItem.BilledQuantity, com.tools20022.repository.entity.LineItem.ChargeFreeQuantity, com.tools20022.repository.entity.LineItem.MeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.MeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.MeasureDateTimeStart, com.tools20022.repository.entity.LineItem.MeasureDateTimeEnd,
						com.tools20022.repository.entity.LineItem.Invoice, com.tools20022.repository.entity.LineItem.NetAmount, com.tools20022.repository.entity.LineItem.Packaging,
						com.tools20022.repository.entity.LineItem.DeliveryDateTime, com.tools20022.repository.entity.LineItem.Charges, com.tools20022.repository.entity.LineItem.NetPriceCharge,
						com.tools20022.repository.entity.LineItem.GrossPriceQuantity, com.tools20022.repository.entity.LineItem.NetPriceQuantity, com.tools20022.repository.entity.LineItem.GrossWeight);
			}
		});
		return mmObject_lazy.get();
	}
}
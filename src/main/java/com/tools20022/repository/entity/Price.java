package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money for which goods, services or assets are offered, sold, or
 * bought.
 */
public class Price {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a currency and value.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Option for which a strike price is specified.
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.StrikePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
		}
	};
	/**
	 * Product for which a unit price is specified.
	 */
	public static final MMBusinessAssociationEnd UnitPriceProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPriceProduct";
			definition = "Product for which a unit price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}
	};
	/**
	 * Product for which a net price is specified.
	 */
	public static final MMBusinessAssociationEnd NetPriceProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceProduct";
			definition = "Product for which a net price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.NetPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}
	};
	/**
	 * Variance on price for the goods and services.
	 */
	public static final MMBusinessAssociationEnd PriceAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceAdjustment";
			definition = "Variance on price for the goods and services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Product for which a gross price is specified.
	 */
	public static final MMBusinessAssociationEnd GrossPriceProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceProduct";
			definition = "Product for which a gross price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.GrossPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}
	};
	/**
	 * Specifies the unit of measurement. For example: kilo, tons.
	 */
	public static final MMBusinessAttribute UnitOfMeasure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example: kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}
	};
	/**
	 * Variance allowed on the price of goods.
	 */
	public static final MMBusinessAssociationEnd PriceTolerance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceTolerance";
			definition = "Variance allowed on the price of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tolerance.mmObject();
		}
	};
	/**
	 * Currency code in which the price is expressed.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency code in which the price is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Multiplication factor of measurement values. For example: 36 pieces.
	 */
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Netting for which an average price is specified.
	 */
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting for which an average price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.AverageDealPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};
	/**
	 * Pricing parameters for a security.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Price.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing parameters for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Price";
				definition = "Amount of money for which goods, services or assets are offered, sold, or bought.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Price, com.tools20022.repository.entity.Product.UnitPrice, com.tools20022.repository.entity.Product.NetPrice,
						com.tools20022.repository.entity.Product.GrossPrice, com.tools20022.repository.entity.Adjustment.Price, com.tools20022.repository.entity.Option.StrikePrice, com.tools20022.repository.entity.Tolerance.Price,
						com.tools20022.repository.entity.Netting.AverageDealPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.Amount, com.tools20022.repository.entity.Price.Option, com.tools20022.repository.entity.Price.UnitPriceProduct,
						com.tools20022.repository.entity.Price.NetPriceProduct, com.tools20022.repository.entity.Price.PriceAdjustment, com.tools20022.repository.entity.Price.GrossPriceProduct,
						com.tools20022.repository.entity.Price.UnitOfMeasure, com.tools20022.repository.entity.Price.PriceTolerance, com.tools20022.repository.entity.Price.Currency, com.tools20022.repository.entity.Price.Factor,
						com.tools20022.repository.entity.Price.Netting, com.tools20022.repository.entity.Price.SecuritiesPricing);
			}
		});
		return mmObject_lazy.get();
	}
}
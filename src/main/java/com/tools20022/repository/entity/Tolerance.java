package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Variance allowed on a quantity or on a price.
 */
public class Tolerance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking amount for which a tolerance is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tolerance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which a tolerance is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Tolerance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingAmount.mmObject();
		}
	};
	/**
	 * Quantity of product on which a tolerance is allowed.
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tolerance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of product on which a tolerance is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.QuantityTolerance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}
	};
	/**
	 * Variance in percentage allowed over the agreed dimension. For example,
	 * plus 10 percent.
	 */
	public static final MMBusinessAttribute PlusPercent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tolerance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlusPercent";
			definition = "Variance in percentage allowed over the agreed dimension. For example, plus 10 percent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Variance in percentage allowed below the agreed dimension. For example,
	 * minus 10 percent.
	 */
	public static final MMBusinessAttribute MinusPercent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tolerance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinusPercent";
			definition = "Variance in percentage allowed below the agreed dimension. For example, minus 10 percent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Price on which a tolerance is allowed.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tolerance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price on which a tolerance is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.PriceTolerance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Tolerance";
				definition = "Variance allowed on a quantity or on a price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.PriceTolerance, com.tools20022.repository.entity.ProductQuantity.QuantityTolerance,
						com.tools20022.repository.entity.UndertakingAmount.Tolerance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tolerance.RelatedUndertakingAmount, com.tools20022.repository.entity.Tolerance.Quantity, com.tools20022.repository.entity.Tolerance.PlusPercent,
						com.tools20022.repository.entity.Tolerance.MinusPercent, com.tools20022.repository.entity.Tolerance.Price);
			}
		});
		return mmObject_lazy.get();
	}
}
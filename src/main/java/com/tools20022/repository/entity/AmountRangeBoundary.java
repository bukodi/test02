package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Limit for an amount range.
 */
public class AmountRangeBoundary {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount range for which a lower boundary is provided.
	 */
	public static final MMBusinessAssociationEnd FromAmountRange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRangeBoundary.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromAmountRange";
			definition = "Amount range for which a lower boundary is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.FromAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}
	};
	/**
	 * Amount value of the range limit.
	 */
	public static final MMBusinessAttribute BoundaryAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRangeBoundary.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoundaryAmount";
			definition = "Amount value of the range limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the boundary amount is included in the range of amount
	 * values.
	 */
	public static final MMBusinessAttribute Included = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRangeBoundary.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Included";
			definition = "Indicates whether the boundary amount is included in the range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount range for which an upper boundary is provided.
	 */
	public static final MMBusinessAssociationEnd ToAmountRange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRangeBoundary.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToAmountRange";
			definition = "Amount range for which an upper boundary is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.ToAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountRangeBoundary";
				definition = "Limit for an amount range.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.FromAmount, com.tools20022.repository.entity.AmountRange.ToAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.FromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.BoundaryAmount,
						com.tools20022.repository.entity.AmountRangeBoundary.Included, com.tools20022.repository.entity.AmountRangeBoundary.ToAmountRange);
			}
		});
		return mmObject_lazy.get();
	}
}
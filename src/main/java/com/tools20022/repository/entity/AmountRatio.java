package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio expressed as a quotient of amounts.
 */
public class AmountRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pricing which uses the ratio as format.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses the ratio as format.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Numerator of the quotient of amounts.
	 */
	public static final MMBusinessAttribute Amount1 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount1";
			definition = "Numerator of the quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Denominator of the quotient of amounts
	 */
	public static final MMBusinessAttribute Amount2 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount2";
			definition = "Denominator of the quotient of amounts";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountRatio";
				definition = "Ratio expressed as a quotient of amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRatio.SecuritiesPricing, com.tools20022.repository.entity.AmountRatio.Amount1, com.tools20022.repository.entity.AmountRatio.Amount2);
			}
		});
		return mmObject_lazy.get();
	}
}
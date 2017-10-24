package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Value given to a price analytic.
 */
public class AnalyticsValue {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Analytics expressed as a currency and value.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsValue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Analytics expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Analytics expressed as a rate.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsValue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Analytics expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Analytics expressed as a number of years.
	 */
	public static final MMBusinessAttribute NumberOfYears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsValue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfYears";
			definition = "Analytics expressed as a number of years.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Analytics calculation for which an analytics value is specified.
	 */
	public static final MMBusinessAssociationEnd AnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsValue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Analytics calculation for which an analytics value is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.Value;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AnalyticsValue";
				definition = "Value given to a price analytic.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AnalyticsCalculation.Value);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AnalyticsValue.Amount, com.tools20022.repository.entity.AnalyticsValue.Rate, com.tools20022.repository.entity.AnalyticsValue.NumberOfYears,
						com.tools20022.repository.entity.AnalyticsValue.AnalyticsCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
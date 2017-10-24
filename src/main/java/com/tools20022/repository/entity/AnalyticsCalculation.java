package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CalculationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics related to the analytics.
 */
public class AnalyticsCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pricing for which an analytics calculation is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing for which an analytics calculation is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Result of the defined analytics calculation.
	 */
	public static final MMBusinessAssociationEnd Value = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Result of the defined analytics calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsValue.AnalyticsCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AnalyticsValue.mmObject();
		}
	};
	/**
	 * Specifies the type of calculation.
	 */
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationTypeCode.mmObject();
		}
	};
	/**
	 * Date/time on which the calculation is based. For example: valuation on
	 * October 1 (price date) based on price of September 19 ( value date).
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based. For example: valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period on which the calculation is based.
	 */
	public static final MMBusinessAttribute ValuePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Estimated per annum ratio of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
	 */
	public static final MMBusinessAttribute EstimatedInterestRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstimatedInterestRate";
			definition = "Estimated per annum ratio of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as of which the variable rate is valid.
	 */
	public static final MMBusinessAttribute VariableRateValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AnalyticsCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AnalyticsCalculation";
				definition = "Characteristics related to the analytics.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.AnalyticsCalculation, com.tools20022.repository.entity.AnalyticsValue.AnalyticsCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AnalyticsCalculation.SecuritiesPricing, com.tools20022.repository.entity.AnalyticsCalculation.Value,
						com.tools20022.repository.entity.AnalyticsCalculation.CalculationType, com.tools20022.repository.entity.AnalyticsCalculation.ValueDate, com.tools20022.repository.entity.AnalyticsCalculation.ValuePeriod,
						com.tools20022.repository.entity.AnalyticsCalculation.EstimatedInterestRate, com.tools20022.repository.entity.AnalyticsCalculation.VariableRateValueDate);
			}
		});
		return mmObject_lazy.get();
	}
}
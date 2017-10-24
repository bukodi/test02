package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.DecimalNumber;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Performance factors of the investment fund / fund class.
 */
public class PerformanceFactors {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Calculation for which the performance factors are obtained.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Calculation for which the performance factors are obtained.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Value of the NAV before all corporate events of the valuation date,
	 * divided by the value of the NAV after the corporate event.
	 */
	public static final MMBusinessAttribute CorporateActionFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFactor";
			definition = "Value of the NAV before all corporate events of the valuation date, divided by the value of the NAV after the corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Value of the NAV before a corporate event, divided by the value of the
	 * NAV after the corporate event, accumulated for a number of corporate
	 * events over the defined period of time.
	 */
	public static final MMBusinessAttribute CumulativeCorporateActionFactor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeCorporateActionFactor";
			definition = "Value of the NAV before a corporate event, divided by the value of the NAV after the corporate event, accumulated for a number of corporate events over the defined period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Period of time for the calculation of the cumulative corporate action
	 * factor.
	 */
	public static final MMBusinessAssociationEnd AccumulationPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccumulationPeriod";
			definition = "Period of time for the calculation of the cumulative corporate action factor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Normal performance value of the NAV.
	 */
	public static final MMBusinessAttribute NormalPerformance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PerformanceFactors.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NormalPerformance";
			definition = "Normal performance value of the NAV.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PerformanceFactors";
				definition = "Performance factors of the investment fund / fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.InvestmentFundPerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PerformanceFactors.NetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.CorporateActionFactor,
						com.tools20022.repository.entity.PerformanceFactors.CumulativeCorporateActionFactor, com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod,
						com.tools20022.repository.entity.PerformanceFactors.NormalPerformance);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the estimated interest rate and the parameters used for determining
 * its value.
 */
public class VariableInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the frequency of change to the variable rate of an interest
	 * bearing instrument.
	 */
	public static final MMBusinessAttribute VariableRateChangeFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date/time at which the rate determination is made, also called
	 * determination date, for instance the date the interest rate of a floating
	 * rate note will be/was calculated, according to the terms of the issue.
	 */
	public static final MMBusinessAttribute FixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date, for instance the date the interest rate of a floating rate note will be/was calculated, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Interest calculation for which a variable interest is used.
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Interest calculation for which a variable interest is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	/**
	 * Last date the new interest rate must be reported to the market.
	 */
	public static final MMBusinessAttribute ReportingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the interest rate of an interest bearing instrument
	 * will be reset, according to the terms of the issue.
	 */
	public static final MMBusinessAttribute ResetDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing instrument will be reset, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates that the rate reset will occur at the end of the payment period
	 * (True case)
	 */
	public static final MMBusinessAttribute Arrears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Arrears";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Identifies the index used for calculating the interest
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Identifies the index used for calculating the interest";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	/**
	 * Yield calculation for which a variable interest is used.
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	/**
	 * Benchmark rate against which variable rate instruments are measured to
	 * determine the interest rate, for example, LIBOR.
	 */
	public static final MMBusinessAssociationEnd BenchmarkReference = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkReference";
			definition = "Benchmark rate against which variable rate instruments are measured to determine the interest rate, for example, LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedVariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Estimated per annum ratio of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
	 */
	public static final MMBusinessAttribute EstimatedInterestRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
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
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateValueDate";
			definition = "Date/time as of which the variable rate is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Lfe calculation for which a variable interest is used.
	 */
	public static final MMBusinessAssociationEnd LifeCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Lfe calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
		}
	};
	/**
	 * Duration calculation for which a variable interest is used.
	 */
	public static final MMBusinessAssociationEnd DurationCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VariableInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Duration calculation for which a variable interest is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.VariableInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VariableInterest";
				definition = "Specifies the estimated interest rate and the parameters used for determining its value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedVariableInterest, com.tools20022.repository.entity.InterestCalculation.VariableInterest,
						com.tools20022.repository.entity.Index.VariableInterest, com.tools20022.repository.entity.YieldCalculation.VariableInterest, com.tools20022.repository.entity.DurationCalculation.VariableInterest,
						com.tools20022.repository.entity.LifeCalculation.VariableInterest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VariableInterest.VariableRateChangeFrequency, com.tools20022.repository.entity.VariableInterest.FixingDate,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.VariableInterest.ReportingDate, com.tools20022.repository.entity.VariableInterest.ResetDate,
						com.tools20022.repository.entity.VariableInterest.Arrears, com.tools20022.repository.entity.VariableInterest.Index, com.tools20022.repository.entity.VariableInterest.YieldCalculation,
						com.tools20022.repository.entity.VariableInterest.BenchmarkReference, com.tools20022.repository.entity.VariableInterest.EstimatedInterestRate, com.tools20022.repository.entity.VariableInterest.VariableRateValueDate,
						com.tools20022.repository.entity.VariableInterest.LifeCalculation, com.tools20022.repository.entity.VariableInterest.DurationCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
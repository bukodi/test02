package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of parameters used to calculate an interest amount.
 */
public class InterestCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 */
	public static final MMBusinessAttribute DayCountBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}
	};
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest resulting from the interest calculation.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Specifies the type of rate used to calculate the interest.
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}
	};
	/**
	 * Period during which the interest rate has been applied.
	 */
	public static final MMBusinessAssociationEnd InterestPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Index rate related to the interest rate of the forthcoming interest
	 * payment.
	 */
	public static final MMBusinessAttribute RelatedIndex = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the issue date and the dated date.
	 */
	public static final MMBusinessAttribute InterestAccrualDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the interest is simple or compounded.
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the parameters to be used for variable interest payments.
	 */
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	/**
	 * Specifies the type of interest.
	 */
	public static final MMBusinessAttribute InterestType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}
	};
	/**
	 * Specifies the amount range for which the interest rate is applicable.
	 */
	public static final MMBusinessAssociationEnd RateValidityRange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRange.mmObject();
		}
	};
	/**
	 * Indicates whether the interest will be settled in cash or rolled in the
	 * existing collateral balance.
	 */
	public static final MMBusinessAttribute InterestMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the periodicity of the calculation of the interest.
	 */
	public static final MMBusinessAttribute CalculationFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the calculation date of the interest amount.
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the charges on interest.
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Debt for which a next interest is specified.
	 */
	public static final MMBusinessAssociationEnd DebtInstrument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.NextInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}
	};
	/**
	 * Specifies the difference between two interests.
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.RelatedInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	/**
	 * Specifies the frequency of an interest payment.
	 */
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Interest management process which requires interest calculation.
	 */
	public static final MMBusinessAssociationEnd RelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.InterestCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation, com.tools20022.repository.entity.AmountRange.RelatedInterest,
						com.tools20022.repository.entity.Charges.RelatedInterest, com.tools20022.repository.entity.Interest.InterestCalculation, com.tools20022.repository.entity.Debt.NextInterest,
						com.tools20022.repository.entity.VariableInterest.InterestCalculation, com.tools20022.repository.entity.Spread.RelatedInterest, com.tools20022.repository.entity.InterestManagement.InterestCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.DayCountBasis, com.tools20022.repository.entity.InterestCalculation.Rate,
						com.tools20022.repository.entity.InterestCalculation.Interest, com.tools20022.repository.entity.InterestCalculation.RateType, com.tools20022.repository.entity.InterestCalculation.InterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.RelatedIndex, com.tools20022.repository.entity.InterestCalculation.InterestAccrualDate, com.tools20022.repository.entity.InterestCalculation.CalculationMethod,
						com.tools20022.repository.entity.InterestCalculation.VariableInterest, com.tools20022.repository.entity.InterestCalculation.InterestType, com.tools20022.repository.entity.InterestCalculation.RateValidityRange,
						com.tools20022.repository.entity.InterestCalculation.InterestMethod, com.tools20022.repository.entity.InterestCalculation.CalculationFrequency, com.tools20022.repository.entity.InterestCalculation.CalculationDate,
						com.tools20022.repository.entity.InterestCalculation.Charges, com.tools20022.repository.entity.InterestCalculation.DebtInstrument, com.tools20022.repository.entity.InterestCalculation.Spread,
						com.tools20022.repository.entity.InterestCalculation.PaymentFrequency, com.tools20022.repository.entity.InterestCalculation.RelatedInterestManagement);
			}
		});
		return mmObject_lazy.get();
	}
}
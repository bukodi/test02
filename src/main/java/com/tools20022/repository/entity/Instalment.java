package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InstalmentPlanCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PaymentObligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the details of each successive payment in settlement of a debt or
 * in an investment plan.
 */
public class Instalment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of pre-paid instalment periods at the time an investment plan is
	 * created.
	 */
	public static final MMBusinessAttribute InitialNumberOfInstalment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialNumberOfInstalment";
			definition = "Number of pre-paid instalment periods at the time an investment plan is created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total number of times the amount must be invested at the predefined
	 * frequency as of the start date of the investment plan.
	 */
	public static final MMBusinessAttribute TotalNumberOfInstalment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfInstalment";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Period unit between consecutive payments (for example day, month, year).
	 */
	public static final MMBusinessAttribute PeriodUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodUnit";
			definition = "Period unit between consecutive payments (for example day, month, year).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Number of period units between consecutive payments.
	 */
	public static final MMBusinessAttribute NumberOfUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfUnits";
			definition = "Number of period units between consecutive payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the progressive number of a single instalment.
	 */
	public static final MMBusinessAttribute SequenceIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceIdentification";
			definition = "Specifies the progressive number of a single instalment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Investment plan for which instalment information is provided.
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan for which instalment information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Instalment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	/**
	 * Type of instalment plan.
	 */
	public static final MMBusinessAttribute InstalmentPlanType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstalmentPlanType";
			definition = "Type of instalment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstalmentPlanCode.mmObject();
		}
	};
	/**
	 * Amount of the first payment.
	 */
	public static final MMBusinessAttribute FirstPaymentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentAmount";
			definition = "Amount of the first payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date of the first payment.
	 */
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Instalment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date of the first payment.";
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
				name = "Instalment";
				definition = "Specifies the details of each successive payment in settlement of a debt or in an investment plan.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Instalment);
				superType_lazy = () -> PaymentObligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Instalment.InitialNumberOfInstalment, com.tools20022.repository.entity.Instalment.TotalNumberOfInstalment,
						com.tools20022.repository.entity.Instalment.PeriodUnit, com.tools20022.repository.entity.Instalment.NumberOfUnits, com.tools20022.repository.entity.Instalment.SequenceIdentification,
						com.tools20022.repository.entity.Instalment.InvestmentPlan, com.tools20022.repository.entity.Instalment.InstalmentPlanType, com.tools20022.repository.entity.Instalment.FirstPaymentAmount,
						com.tools20022.repository.entity.Instalment.FirstPaymentDate);
			}
		});
		return mmObject_lazy.get();
	}
}
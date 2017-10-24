package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PaymentTimeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment terms of the obligation.
 */
public class PaymentTerms {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the payment terms apply to an amount.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Specifies that the payment terms apply to an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies that the payment conditions apply to a percentage of the amount
	 * due.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the payment conditions apply to a percentage of the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Period to which the payment terms apply.
	 */
	public static final MMBusinessAssociationEnd PaymentPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentPeriod";
			definition = "Period to which the payment terms apply.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Payment obligation for which payment terms are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentObligation";
			definition = "Payment obligation for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the time of the payment relative to an event such as product
	 * delivery or receipt of invoice.
	 */
	public static final MMBusinessAttribute PaymentTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTime";
			definition = "Specifies the time of the payment relative to an event such as product delivery or receipt of invoice. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTimeCode.mmObject();
		}
	};
	/**
	 * Related type of the payment schedule provided in the contract.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentScheduleType";
			definition = "Related type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};
	/**
	 * Schedule for the payment of the interests due on the related loan.
	 */
	public static final MMBusinessAssociationEnd RelatedLoan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentTerms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLoan";
			definition = "Schedule for the payment of the interests due on the related loan.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Loan.InterestPaymentsSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Loan.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms";
				definition = "Specifies the payment terms of the obligation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms, com.tools20022.repository.entity.PaymentObligation.PaymentTerms,
						com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType, com.tools20022.repository.entity.Loan.InterestPaymentsSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentTerms.Amount, com.tools20022.repository.entity.PaymentTerms.Percentage, com.tools20022.repository.entity.PaymentTerms.PaymentPeriod,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation, com.tools20022.repository.entity.PaymentTerms.PaymentTime, com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType,
						com.tools20022.repository.entity.PaymentTerms.RelatedLoan);
			}
		});
		return mmObject_lazy.get();
	}
}
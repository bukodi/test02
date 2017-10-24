package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Range of amount values.
 */
public class AmountRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Lower boundary of a range of amount values.
	 */
	public static final MMBusinessAssociationEnd FromAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.FromAmountRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRangeBoundary.mmObject();
		}
	};
	/**
	 * Upper boundary of a range of amount values.
	 */
	public static final MMBusinessAssociationEnd ToAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.ToAmountRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountRangeBoundary.mmObject();
		}
	};
	/**
	 * Exact value an amount must match to be considered valid.
	 */
	public static final MMBusinessAttribute EqualAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value that an amount must not match to be considered valid.
	 */
	public static final MMBusinessAttribute NotEqualAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the amount is a credited or debited amount.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Medium of exchange of value, used to qualify an amount.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Interest which applies on a specific amount range.
	 */
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AmountRange.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest which applies on a specific amount range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.RateValidityRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountRange";
				definition = "Range of amount values.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.FromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.ToAmountRange,
						com.tools20022.repository.entity.InterestCalculation.RateValidityRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.FromAmount, com.tools20022.repository.entity.AmountRange.ToAmount, com.tools20022.repository.entity.AmountRange.EqualAmount,
						com.tools20022.repository.entity.AmountRange.NotEqualAmount, com.tools20022.repository.entity.AmountRange.CreditDebitIndicator, com.tools20022.repository.entity.AmountRange.Currency,
						com.tools20022.repository.entity.AmountRange.RelatedInterest);
			}
		});
		return mmObject_lazy.get();
	}
}
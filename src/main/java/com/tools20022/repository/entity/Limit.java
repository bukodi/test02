package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FloorLimitTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.LimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Value used for risk containment in a system or towards counterparts. The
 * limit may be a current limit or a default limit.
 */
public class Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the limit.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money of the limit, expressed in a currency.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies if a limit is a debit limit or a credit limit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as an amount.
	 */
	public static final MMBusinessAttribute UsedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as a percentage.
	 */
	public static final MMBusinessAttribute UsedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Currency unit used to specify the limit amount.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Current status of the limit.
	 */
	public static final MMBusinessAssociationEnd LimitStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LimitStatus.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmObject();
		}
	};
	/**
	 * Specifies that the limit is a percentage of a related amount.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Overdraft conditions for which limit parameters are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CreditLine;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DebitCreditFacility.mmObject();
		}
	};
	/**
	 * Specifies the periodicity linked to a limit for example the periodicity
	 * can indicate that the limit can be reached daily or monthly.
	 */
	public static final MMBusinessAttribute Periodicity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies that the limit is a quantity.
	 */
	public static final MMBusinessAttribute Quantity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Period at which the limit is effective.
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Payment card for which a limit is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}
	};
	/**
	 * Remaining amount of money of the limit.
	 */
	public static final MMBusinessAttribute AvailableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Limit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedLimit, com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.LimitStatus.Limit,
						com.tools20022.repository.entity.DebitCreditFacility.CreditLine);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.Type, com.tools20022.repository.entity.Limit.Amount, com.tools20022.repository.entity.Limit.CreditDebitIndicator,
						com.tools20022.repository.entity.Limit.UsedAmount, com.tools20022.repository.entity.Limit.UsedPercentage, com.tools20022.repository.entity.Limit.Currency, com.tools20022.repository.entity.Limit.LimitStatus,
						com.tools20022.repository.entity.Limit.Percentage, com.tools20022.repository.entity.Limit.RelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.Periodicity,
						com.tools20022.repository.entity.Limit.Quantity, com.tools20022.repository.entity.Limit.ValidityPeriod, com.tools20022.repository.entity.Limit.RelatedPaymentCard,
						com.tools20022.repository.entity.Limit.AvailableAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
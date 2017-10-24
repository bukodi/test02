package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PaymentTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Distribution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of cash pay-out.
 */
public class CashDistribution extends Distribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Detailed information about the currency exchange in a distribution event.
	 */
	public static final MMBusinessAssociationEnd DistributionCurrencyExchangeInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributionCurrencyExchangeInformation";
			definition = "Detailed information about the currency exchange in a distribution event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Distribution for which the cash distribution elements are provided.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAndCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAndCashDistribution";
			definition = "Distribution for which the cash distribution elements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Rate that will be applicable as of the next factor date and defines the
	 * outstanding principal of the factored security.
	 */
	public static final MMBusinessAttribute AmortisedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisedRate";
			definition = "Rate that will be applicable as of the next factor date and defines the outstanding principal of the factored security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of cash, expressed as a percentage, disbursed per financial
	 * instrument.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Amount of cash, expressed as a percentage, disbursed per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Ratio of compensation for damage/loss versus value of insured entity
	 */
	public static final MMBusinessAttribute CashIndemnityRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIndemnityRate";
			definition = "Ratio of compensation for damage/loss versus value of insured entity";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether a cash dividend can be rolled over into shares of the
	 * issuing company.
	 */
	public static final MMBusinessAttribute DividendReinvestmentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestmentIndicator";
			definition = "Indicates whether a cash dividend can be rolled over into shares of the issuing company.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of interest paid to the principal amount of the financial
	 * instrument for a specific period of time.
	 */
	public static final MMBusinessAttribute InterestAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestAmount";
			definition = "Amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Ratio of the amount of interest paid to the principal amount of the
	 * financial instrument for a specific period of time.
	 */
	public static final MMBusinessAttribute InterestRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRate";
			definition = "Ratio of the amount of interest paid to the principal amount of the financial instrument for a specific period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether dividends, in addition to regular dividends, are
	 * payable to loyal (time, size, amount) investors.
	 */
	public static final MMBusinessAttribute LoyaltyPremiumIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoyaltyPremiumIndicator";
			definition = "Indicates whether dividends, in addition to regular dividends, are payable to loyal (time, size, amount) investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Provides information about the whether the payment will be before or
	 * after tax.
	 */
	public static final MMBusinessAttribute PaymentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentType";
			definition = "Provides information about the whether the payment will be before or after tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Date/time at which securities are selected for redemption prior to
	 * maturity.
	 */
	public static final MMBusinessAttribute SelectionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelectionDate";
			definition = "Date/time at which securities are selected for redemption prior to maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount, expressed as a percentage, of cash disbursed per financial
	 * instrument.
	 */
	public static final MMBusinessAttribute CashDistributionRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistributionRate";
			definition = "Amount, expressed as a percentage, of cash disbursed per financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of cash disbursed per financial instrument.
	 */
	public static final MMBusinessAttribute CashDistributionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDistribution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistributionAmount";
			definition = "Amount of cash disbursed per financial instrument.";
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
				name = "CashDistribution";
				definition = "Distribution of cash pay-out.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution, com.tools20022.repository.entity.SecuritiesAndCashDistribution.CashDistribution);
				superType_lazy = () -> Distribution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation, com.tools20022.repository.entity.CashDistribution.SecuritiesAndCashDistribution,
						com.tools20022.repository.entity.CashDistribution.AmortisedRate, com.tools20022.repository.entity.CashDistribution.Rate, com.tools20022.repository.entity.CashDistribution.CashIndemnityRate,
						com.tools20022.repository.entity.CashDistribution.DividendReinvestmentIndicator, com.tools20022.repository.entity.CashDistribution.InterestAmount, com.tools20022.repository.entity.CashDistribution.InterestRate,
						com.tools20022.repository.entity.CashDistribution.LoyaltyPremiumIndicator, com.tools20022.repository.entity.CashDistribution.PaymentType, com.tools20022.repository.entity.CashDistribution.SelectionDate,
						com.tools20022.repository.entity.CashDistribution.CashDistributionRate, com.tools20022.repository.entity.CashDistribution.CashDistributionAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
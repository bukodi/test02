package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
 * issue or, rarely, in kind, for example, in company products or property. The
 * dividend amount is decided by the board of directors.
 */
public class Dividend {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency with which the income is allocated to investors.
	 */
	public static final MMBusinessAttribute DividendFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Provides the annual total dividend rate.
	 */
	public static final MMBusinessAttribute AnnualTotalDividendRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnualTotalDividendRate";
			definition = "Provides the annual total dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Dividend is final.
	 */
	public static final MMBusinessAssociationEnd FinalDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Rate of a fully franked dividend paid by a company, or amount resulting
	 * from a fully franked dividend paid by a company; amount includes tax
	 * credit for companies that have made sufficient tax payments during the
	 * fiscal period.
	 */
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmount";
			definition = "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 */
	public static final MMBusinessAssociationEnd GrossDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the type of dividend rate.
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendRateTypeCode.mmObject();
		}
	};
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 */
	public static final MMBusinessAssociationEnd NetDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.NetDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Dividend is provisional.
	 */
	public static final MMBusinessAssociationEnd ProvisionalDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Date on which a security will be entitled to a dividend.
	 */
	public static final MMBusinessAttribute DividendRankingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount of money that the borrower pays to the lender as a compensation.
	 * It does not entitle the lender to reclaim any tax credit and is sometimes
	 * treated differently by the local tax authorities of the lender.
	 */
	public static final MMBusinessAttribute ManufacturedDividendAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount resulting from an unfranked dividend paid by a company; the amount
	 * does not include tax credit and is subject to withholding tax.
	 */
	public static final MMBusinessAttribute UnfrankedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of cash that would have been payable if the dividend had been
	 * taken in the form of cash rather than shares.
	 */
	public static final MMBusinessAttribute NotionalDividendPayableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Planned dividend rate, for example, for preferred shares.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Planned dividend rate, for example, for preferred shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 */
	public static final MMBusinessAttribute ExDividendDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Security for which a dividend is specified.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a dividend is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Nature of the dividend.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendTypeCode.mmObject();
		}
	};
	/**
	 * Defines the proceeds which resulted in dividends.
	 */
	public static final MMBusinessAssociationEnd CashProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceeds";
			definition = "Defines the proceeds which resulted in dividends.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}
	};
	/**
	 * Specifies the payment terms of the dividend.
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the  payment terms of the dividend.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Tax on dividend.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax on dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * Distribution for which a dividend is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDistribution";
			definition = "Distribution for which a dividend is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Specifies the cycle of dividends.
	 */
	public static final MMBusinessAttribute DividendFrequenceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequenceType";
			definition = "Specifies the cycle of dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
		}
	};
	/**
	 * Percentage of earnings paid to shareholders in dividends.
	 */
	public static final MMBusinessAttribute DividendRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date upon which the dividend is paid.
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date upon which the dividend is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the cycle of dividend payments.
	 */
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the cycle of dividend payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date upon which the dividend is reinvested.
	 */
	public static final MMBusinessAttribute ReinvestmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDate";
			definition = "Date upon which the dividend is reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Value of the dividend expressed as an amount.
	 */
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Dividend.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Value of the dividend expressed as an amount.";
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
				name = "Dividend";
				definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.PaymentObligation.Dividend,
						com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.NetDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.CashProceedsDefinition.Dividend, com.tools20022.repository.entity.Distribution.Dividend);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.DividendFrequency, com.tools20022.repository.entity.Dividend.AnnualTotalDividendRate, com.tools20022.repository.entity.Dividend.FinalDividend,
						com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount, com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.RateType,
						com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend, com.tools20022.repository.entity.Dividend.DividendRankingDate,
						com.tools20022.repository.entity.Dividend.ManufacturedDividendAmount, com.tools20022.repository.entity.Dividend.UnfrankedAmount, com.tools20022.repository.entity.Dividend.NotionalDividendPayableAmount,
						com.tools20022.repository.entity.Dividend.Rate, com.tools20022.repository.entity.Dividend.ExDividendDate, com.tools20022.repository.entity.Dividend.Security, com.tools20022.repository.entity.Dividend.Type,
						com.tools20022.repository.entity.Dividend.CashProceeds, com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.Dividend.Tax,
						com.tools20022.repository.entity.Dividend.RelatedDistribution, com.tools20022.repository.entity.Dividend.DividendFrequenceType, com.tools20022.repository.entity.Dividend.DividendRatio,
						com.tools20022.repository.entity.Dividend.PaymentDate, com.tools20022.repository.entity.Dividend.PaymentFrequency, com.tools20022.repository.entity.Dividend.ReinvestmentDate,
						com.tools20022.repository.entity.Dividend.Value);
			}
		});
		return mmObject_lazy.get();
	}
}
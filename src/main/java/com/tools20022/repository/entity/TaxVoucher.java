package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Statement showing the amount or value of a distribution and either the tax
 * credit to which the recipient is entitled in respect of that distribution; or
 * the amount of tax deducted from the distribution.
 */
public class TaxVoucher {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Requested tax rate in case of breakdown of tax rate, for example, used
	 * for adjustment of tax rate. This is the new requested applicable rate.
	 */
	public static final MMBusinessAttribute RequestedTaxationRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Applicable tax rate on the tax credit amount.
	 */
	public static final MMBusinessAttribute CreditRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies tax elements on the security which is involved in the corporate
	 * event.
	 */
	public static final MMBusinessAssociationEnd RelatedSecurityTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityTax";
			definition = "Specifies tax elements on the security which is involved in the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}
	};
	/**
	 * Amount of money related to taxable income that cannot be categorised.
	 */
	public static final MMBusinessAttribute SundryOrOtherAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
	 */
	public static final MMBusinessAttribute CreditAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAmount";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount retained from previous dividend or interest payment.
	 */
	public static final MMBusinessAttribute CashAmountBroughtForward = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount carried forward to next dividend or interest payment.
	 */
	public static final MMBusinessAttribute CashAmountCarriedForward = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Tax on the amount of cash that would have been paid when new securities
	 * are issued in lieu of a cash dividend.
	 */
	public static final MMBusinessAttribute NotionalTaxAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Corporate action distribution process for which tax voucher information
	 * is provided.
	 */
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Corporate action distribution process for which tax voucher information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification for the tax voucher.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the tax voucher.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which DRIP purchase completed.
	 */
	public static final MMBusinessAttribute BargainDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Settlement date of the DRIP purchase transaction.
	 */
	public static final MMBusinessAttribute BargainSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Distribution rate per share.
	 */
	public static final MMBusinessAttribute TaxVoucherRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Securities holding on record date.
	 */
	public static final MMBusinessAssociationEnd RecordDateHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Cost per share of new shares allotted.
	 */
	public static final MMBusinessAssociationEnd ScripDividendReinvestmentPricePerShare = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Total cash amount required to purchase shares allotted.
	 */
	public static final MMBusinessAttribute AllotedSharesCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides information about the foreign exchange transaction.
	 */
	public static final MMBusinessAssociationEnd ForeignExchangeTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxVoucher.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeTransaction";
			definition = "Provides information about the foreign exchange transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxVoucher";
				definition = "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher, com.tools20022.repository.entity.SecuritiesTax.TaxVoucher,
						com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher, com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxVoucher.RequestedTaxationRate, com.tools20022.repository.entity.TaxVoucher.CreditRate, com.tools20022.repository.entity.TaxVoucher.RelatedSecurityTax,
						com.tools20022.repository.entity.TaxVoucher.SundryOrOtherAmount, com.tools20022.repository.entity.TaxVoucher.CreditAmount, com.tools20022.repository.entity.TaxVoucher.CashAmountBroughtForward,
						com.tools20022.repository.entity.TaxVoucher.CashAmountCarriedForward, com.tools20022.repository.entity.TaxVoucher.NotionalTaxAmount, com.tools20022.repository.entity.TaxVoucher.Distribution,
						com.tools20022.repository.entity.TaxVoucher.Identification, com.tools20022.repository.entity.TaxVoucher.BargainDate, com.tools20022.repository.entity.TaxVoucher.BargainSettlementDate,
						com.tools20022.repository.entity.TaxVoucher.TaxVoucherRate, com.tools20022.repository.entity.TaxVoucher.RecordDateHolding, com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.TaxVoucher.AllotedSharesCost, com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction);
			}
		});
		return mmObject_lazy.get();
	}
}
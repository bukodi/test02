package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.TaxAmountType1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for a tax exemption.
	 */
	public static final MMBusinessAttribute ExemptionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}
	};
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd TaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Type of tax applied.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TaxAmountType1Choice.Code, com.tools20022.repository.choice.TaxAmountType1Choice.Proprietary, com.tools20022.repository.msg.TaxAmountAndType1.Type);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money resulting from the calculation of the tax.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecordDetails1.Amount, com.tools20022.repository.msg.TaxAmount1.TotalAmount, com.tools20022.repository.msg.TaxInformation3.TotalTaxAmount,
					com.tools20022.repository.msg.TaxAmountAndType1.Amount, com.tools20022.repository.msg.TaxInformation4.TotalTaxAmount, com.tools20022.repository.msg.RemittanceAmount3.TaxAmount);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate used for calculation of the tax.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAmount1.Rate);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Party which is taxable at a specific location
	 */
	public static final MMBusinessAssociationEnd TaxableParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.TaxationConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}
	};
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 */
	public static final MMBusinessAssociationEnd TaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Basis used to determine the capital gain or loss, eg, the purchase price.
	 */
	public static final MMBusinessAttribute Basis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Transfer process for which a tax is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Specifies the type of tax rate.
	 */
	public static final MMBusinessAttribute TaxRateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}
	};
	/**
	 * Account to be used for taxes.
	 */
	public static final MMBusinessAssociationEnd TaxAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Specifies other taxation conditions.
	 */
	public static final MMBusinessAttribute TaxationConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the adjustments subject to a tax.
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	/**
	 * Interest for which a tax is specified.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.ReferenceNumber, com.tools20022.repository.msg.Garnishment1.ReferenceNumber, com.tools20022.repository.msg.TaxInformation4.ReferenceNumber);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment to which the tax applies.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Amount of money on which the tax is based.
	 */
	public static final MMBusinessAttribute TaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAmount1.TaxableBaseAmount, com.tools20022.repository.msg.TaxInformation3.TotalTaxableBaseAmount,
					com.tools20022.repository.msg.TaxInformation4.TotalTaxableBaseAmount);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date by which tax is due.
	 */
	public static final MMBusinessAttribute TaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Date, com.tools20022.repository.msg.TaxInformation4.Date);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 */
	public static final MMBusinessAttribute CertificateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.CertificateIdentification);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Territorial part of a country to which the tax payment is related.
	 */
	public static final MMBusinessAttribute AdministrationZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.AdministrationZone, com.tools20022.repository.msg.TaxInformation4.AdministrationZone);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Method, com.tools20022.repository.msg.TaxInformation4.Method);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Record of tax details.
	 */
	public static final MMBusinessAssociationEnd Record = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Record, com.tools20022.repository.msg.TaxInformation4.Record);
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TaxRecord.mmObject();
		}
	};
	/**
	 * Product on which a tax is applied.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Currency exchange applicable to a tax
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Currency in which the tax must be settled.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TaxPartyRole.mmObject();
		}
	};
	/**
	 * Amount of tax that have been previously deducted.
	 */
	public static final MMBusinessAttribute TaxDeduction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution process for which a tax is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.DistributionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Date on which the tax is calculated.
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Dividend for which a tax is specified.
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	/**
	 * Type of withholding tax rate.
	 */
	public static final MMBusinessAttribute WithholdingTaxType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}
	};
	/**
	 * Event for which a transaction tax is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Type of tax identification number or identifier.
	 */
	public static final MMBusinessAttribute TaxIdentificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tax.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Dividend.Tax, com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund, com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.CashAccount.Tax,
						com.tools20022.repository.entity.Product.Tax, com.tools20022.repository.entity.Adjustment.Tax, com.tools20022.repository.entity.Payment.TaxOnPayment, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.CurrencyExchange.Tax, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax,
						com.tools20022.repository.entity.TaxPartyRole.Tax, com.tools20022.repository.entity.TaxRecord.Tax, com.tools20022.repository.entity.Distribution.DistributionTax);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.ExemptionReason, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.Type, com.tools20022.repository.entity.Tax.Amount, com.tools20022.repository.entity.Tax.Rate, com.tools20022.repository.entity.Tax.TaxableParty,
						com.tools20022.repository.entity.Tax.TaxRefundValueCalculation, com.tools20022.repository.entity.Tax.Basis, com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.Tax.TaxRateType,
						com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Tax.TaxationConditions, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Tax.Interest,
						com.tools20022.repository.entity.Tax.Identification, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Tax.TaxableBaseAmount,
						com.tools20022.repository.entity.Tax.TaxDate, com.tools20022.repository.entity.Tax.CertificateIdentification, com.tools20022.repository.entity.Tax.AdministrationZone, com.tools20022.repository.entity.Tax.Method,
						com.tools20022.repository.entity.Tax.Record, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Tax.Currency,
						com.tools20022.repository.entity.Tax.PartyRole, com.tools20022.repository.entity.Tax.TaxDeduction, com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution,
						com.tools20022.repository.entity.Tax.CalculationDate, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.Tax.WithholdingTaxType,
						com.tools20022.repository.entity.Tax.CorporateActionEvent, com.tools20022.repository.entity.Tax.TaxIdentificationType);
				derivationComponent_lazy = () -> Arrays.asList(TaxRecordDetails1.mmObject(), TaxAmount1.mmObject(), TaxInformation3.mmObject(), TaxAmountType1Choice.mmObject(), TaxAmountAndType1.mmObject(), TaxInformation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
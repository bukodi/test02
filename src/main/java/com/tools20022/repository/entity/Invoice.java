package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalBillingCompensationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information about an invoice, such as number, issue date date and
 * monetary amounts.
 */
public class Invoice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of credit/debit note related to the invoice.
	 */
	public static final MMBusinessAttribute CreditDebitNoteAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.CreditNoteAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitNoteAmount";
			definition = "Amount of credit/debit note related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of all tax amounts related to the invoice. It is derived from the
	 * association between line item and tax.
	 */
	public static final MMBusinessAttribute TotalTaxAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.TaxAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalTaxAmount";
			definition = "Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of the invoice, being the sum of total invoice lines
	 * amounts, total invoice additional amounts (allowances and charges) and
	 * total tax amounts.
	 */
	public static final MMBusinessAttribute TotalInvoiceAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalInvoiceAmount";
			definition = "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Code specifying the currency of the invoice.
	 */
	public static final MMBusinessAttribute InvoiceCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceCurrency";
			definition = "Code specifying the currency of the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the period covered by an invoice for instance for recurring
	 * services.
	 */
	public static final MMBusinessAssociationEnd PeriodCovered = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodCovered";
			definition = "Specifies the period covered by an invoice for instance for recurring services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Specifies the process which takes place to settle an invoice.
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the process which takes place to settle an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}
	};
	/**
	 * Algebraical sum of charges related to the invoice.
	 */
	public static final MMBusinessAttribute TotalCharge = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalCharge";
			definition = "Algebraical sum of charges related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monetary value of the total prepaid amount being reported for this
	 * settlement.
	 */
	public static final MMBusinessAttribute TotalPrepaidAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unit of information showing the related provision of products and/or
	 * services and monetary summations reported as a discrete line item.
	 */
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	/**
	 * Total amount after taxes, adjustments and charges.
	 */
	public static final MMBusinessAttribute TotalNetAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNetAmount";
			definition = "Total amount after taxes, adjustments and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies currency exchange information which is used when currency
	 * conversion is necessary.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies currency exchange information which is used when currency conversion is necessary.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Defines the type of billing compensation.
	 */
	public static final MMBusinessAttribute BillingCompensationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationType";
			definition = "Defines the type of billing compensation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBillingCompensationTypeCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of invoices.
	 */
	public static final MMBusinessAssociationEnd InvoicePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoicePartyRole";
			definition = "Role played by a party in the context of invoices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmObject();
		}
	};
	/**
	 * Invoice to which another invoice is associated.
	 */
	public static final MMBusinessAssociationEnd OriginalInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalInvoice";
			definition = "Invoice to which another invoice is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}
	};
	/**
	 * Specifies another invoice linked to the current one, for instance a
	 * previous invoice for which a credit note is available.
	 */
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Specifies another invoice linked to the current one, for instance a previous invoice for which a credit note is available.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.OriginalInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}
	};
	/**
	 * Financing transaction related to an invoice.
	 */
	public static final MMBusinessAssociationEnd InvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Financing transaction related to an invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}
	};
	/**
	 * Specifies the compensation amount of an incorrect billing.
	 */
	public static final MMBusinessAttribute BillingCompensationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationAmount";
			definition = "Specifies the compensation amount of an incorrect billing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Status of the invoice or of the billing process.
	 */
	public static final MMBusinessAssociationEnd InvoiceStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceStatus";
			definition = "Status of the invoice or of the billing process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmObject();
		}
	};
	/**
	 * Payment related to an invoice.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment related to an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.InvoiceReconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Indicates the direction of the invoice amount.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates the direction of the invoice amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Invoice";
				definition = "General information about an invoice, such as number, issue date date and monetary amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice, com.tools20022.repository.entity.Payment.InvoiceReconciliation,
						com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice, com.tools20022.repository.entity.Invoice.OriginalInvoice, com.tools20022.repository.entity.Invoice.RelatedInvoice,
						com.tools20022.repository.entity.InvoicePartyRole.Invoice, com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice, com.tools20022.repository.entity.LineItem.Invoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.Invoice, com.tools20022.repository.entity.InvoiceStatus.Invoice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Invoice.CreditDebitNoteAmount, com.tools20022.repository.entity.Invoice.TotalTaxAmount, com.tools20022.repository.entity.Invoice.TotalInvoiceAmount,
						com.tools20022.repository.entity.Invoice.InvoiceCurrency, com.tools20022.repository.entity.Invoice.PeriodCovered, com.tools20022.repository.entity.Invoice.TradeSettlement,
						com.tools20022.repository.entity.Invoice.TotalCharge, com.tools20022.repository.entity.Invoice.TotalPrepaidAmount, com.tools20022.repository.entity.Invoice.LineItem,
						com.tools20022.repository.entity.Invoice.TotalNetAmount, com.tools20022.repository.entity.Invoice.CurrencyExchange, com.tools20022.repository.entity.Invoice.BillingCompensationType,
						com.tools20022.repository.entity.Invoice.InvoicePartyRole, com.tools20022.repository.entity.Invoice.OriginalInvoice, com.tools20022.repository.entity.Invoice.RelatedInvoice,
						com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.BillingCompensationAmount, com.tools20022.repository.entity.Invoice.InvoiceStatus,
						com.tools20022.repository.entity.Invoice.Payment, com.tools20022.repository.entity.Invoice.CreditDebitIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}
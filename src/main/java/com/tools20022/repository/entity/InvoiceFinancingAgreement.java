package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics that unambiguously identify an invoice financing
 * agreement. An invoice financing agreement between a factor and its client
 * allows to transfer a payment obligation that exists between the client and a
 * third party from the client to the factor.
 */
public class InvoiceFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * User identification or any user key that allows to check if the financing
	 * requestor is allowed to ask for invoice financing.<br>
	 * Usage: the content is not of a technical nature, but reflects the
	 * organisational structure at the requesting side. The authorisation
	 * element can typically be used in case the financing requestor acts on
	 * behalf of one or more suppliers.
	 */
	public static final MMBusinessAttribute Authorisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\r\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side. The authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	/**
	 * Specifies the financing method related to invoice financing (eg
	 * collection mandate).
	 */
	public static final MMBusinessAttribute FinancingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingMethod";
			definition = "Specifies the financing method related to invoice financing (eg collection mandate).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Amount requested by the requestor party, related to a single invoice to
	 * be financed.
	 */
	public static final MMBusinessAttribute RequestedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedAmount";
			definition = "Amount requested by the requestor party, related to a single invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage of the amount requested by the requestor party, related to a
	 * single invoice, to be financed.
	 */
	public static final MMBusinessAttribute RequestedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPercentage";
			definition = "Percentage of the amount requested by the requestor party, related to a single invoice, to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * The percentage rate applied to calculate the amount financed.
	 */
	public static final MMBusinessAttribute AppliedPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AppliedPercentage";
			definition = "The percentage rate applied to calculate the amount financed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the amount financed which is derived from the applied
	 * percentage and the invoice amount..
	 */
	public static final MMBusinessAttribute FinancedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancedAmount";
			definition = "Specifies the amount financed which is derived from the applied percentage and the invoice amount..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identifies unambiguously the financing transaction.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies unambiguously the financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of financing an invoice.
	 */
	public static final MMBusinessAssociationEnd InvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingPartyRole";
			definition = "Role played by a party in the context of financing an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
		}
	};
	/**
	 * Status of the invoice financing transaction and of the different requests
	 * linked to it.
	 */
	public static final MMBusinessAssociationEnd InvoiceFinancingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingStatus";
			definition = "Status of the invoice financing transaction and of the different requests linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingStatus.mmObject();
		}
	};
	/**
	 * Invoice to which is referred financing request.
	 */
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Invoice to which is referred financing request.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	/**
	 * Information related to the crediting of the amount financed, such as
	 * dates, amount, charges...
	 */
	public static final MMBusinessAssociationEnd ResultingCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingCashEntry";
			definition = "Information related to the crediting of the amount financed, such as dates, amount, charges...";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}
	};
	/**
	 * Assignments resulting from an invoice financing agreement.
	 */
	public static final MMBusinessAssociationEnd Assignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assignment";
			definition = "Assignments resulting from an invoice financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.FinancingAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assignment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingAgreement";
				definition = "Set of characteristics that unambiguously identify an invoice financing agreement. An invoice financing agreement between a factor and its client allows to transfer a payment obligation that exists between the client and a third party from the client to the factor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.InvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction,
						com.tools20022.repository.entity.Assignment.FinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.Authorisation, com.tools20022.repository.entity.InvoiceFinancingAgreement.FinancingMethod,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.RequestedAmount, com.tools20022.repository.entity.InvoiceFinancingAgreement.RequestedPercentage,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.AppliedPercentage, com.tools20022.repository.entity.InvoiceFinancingAgreement.FinancedAmount,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.Identification, com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingPartyRole,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus, com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry, com.tools20022.repository.entity.InvoiceFinancingAgreement.Assignment);
			}
		});
		return mmObject_lazy.get();
	}
}
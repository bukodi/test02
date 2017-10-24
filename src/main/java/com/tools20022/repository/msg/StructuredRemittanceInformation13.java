package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Garnishment;
import com.tools20022.repository.entity.InvoiceeRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 */
public class StructuredRemittanceInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the identification and the content of the referred document.
	 */
	public static final MMMessageAssociationEnd ReferredDocumentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Provides the identification and the content of the referred document.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredDocumentInformation7.mmObject();
		}
	};
	/**
	 * Provides details on the amounts of the referred document.
	 */
	public static final MMMessageAssociationEnd ReferredDocumentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.Amount;
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceAmount2.mmObject();
		}
	};
	/**
	 * Reference information provided by the creditor to allow the
	 * identification of the underlying documents.
	 */
	public static final MMMessageAssociationEnd CreditorReferenceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.CreditorReference;
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditorReferenceInformation2.mmObject();
		}
	};
	/**
	 * Identification of the organisation issuing the invoice, when it is
	 * different from the creditor or ultimate creditor.
	 */
	public static final MMMessageAssociationEnd Invoicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Identification of the party to whom an invoice is issued, when it is
	 * different from the debtor or ultimate debtor.
	 */
	public static final MMMessageAssociationEnd Invoicee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Provides remittance information about a payment made for tax-related
	 * purposes.
	 */
	public static final MMMessageAssociationEnd TaxRemittance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "TaxRmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRemittance";
			definition = "Provides remittance information about a payment made for tax-related purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation4.mmObject();
		}
	};
	/**
	 * Provides remittance information about a payment for garnishment-related
	 * purposes.
	 */
	public static final MMMessageAssociationEnd GarnishmentRemittance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Garnishment.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtRmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentRemittance";
			definition = "Provides remittance information about a payment for garnishment-related purposes. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Garnishment1.mmObject();
		}
	};
	/**
	 * Additional information, in free text form, to complement the structured
	 * remittance information.
	 */
	public static final MMMessageAttribute AdditionalRemittanceInformation = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentAmount,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.CreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicer,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicee, com.tools20022.repository.msg.StructuredRemittanceInformation13.TaxRemittance,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.GarnishmentRemittance, com.tools20022.repository.msg.StructuredRemittanceInformation13.AdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation13";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			}
		});
		return mmObject_lazy.get();
	}
}
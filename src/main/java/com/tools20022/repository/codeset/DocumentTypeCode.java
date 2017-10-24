package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 */
public class DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Document is an invoice claiming payment for the supply of metered
	 * services, for example gas or electricity supplied to a fixed meter.
	 */
	public static final MMCode MeteredServiceInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeteredServiceInvoice";
			definition = "Document is an invoice claiming payment for the supply of metered services, for example gas or electricity supplied to a fixed meter.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "MSIN";
		}
	};
	/**
	 * Document is a credit note for the final amount settled for a commercial
	 * transaction.
	 */
	public static final MMCode CreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			definition = "Document is a credit note for the final amount settled for a commercial transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CNFA";
		}
	};
	/**
	 * Document is a debit note for the final amount settled for a commercial
	 * transaction.
	 */
	public static final MMCode DebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			definition = "Document is a debit note for the final amount settled for a commercial transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DNFA";
		}
	};
	/**
	 * Document is an invoice.
	 */
	public static final MMCode CommercialInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialInvoice";
			definition = "Document is an invoice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CINV";
		}
	};
	/**
	 * Document is a credit note.
	 */
	public static final MMCode CreditNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditNote";
			definition = "Document is a credit note.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CREN";
		}
	};
	/**
	 * Document is a debit note.
	 */
	public static final MMCode DebitNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitNote";
			definition = "Document is a debit note.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DEBN";
		}
	};
	/**
	 * Document is an invoice for the hiring of human resources or renting goods
	 * or equipment.
	 */
	public static final MMCode HireInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HireInvoice";
			definition = "Document is an invoice for the hiring of human resources or renting goods or equipment.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "HIRI";
		}
	};
	/**
	 * Document is an invoice issued by the debtor.
	 */
	public static final MMCode SelfBilledInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelfBilledInvoice";
			definition = "Document is an invoice issued by the debtor.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SBIN";
		}
	};
	/**
	 * Document is a remittance advice sent separately from the current
	 * transaction.
	 */
	public static final MMCode RemittanceAdviceMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceAdviceMessage";
			definition = "Document is a remittance advice sent separately from the current transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "RADM";
		}
	};
	/**
	 * Document is a linked payment instruction to which the current payment
	 * instruction is related, eg, in a cover scenario.
	 */
	public static final MMCode RelatedPaymentInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "Document is a linked payment instruction to which the current payment instruction is related, eg, in a cover scenario.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "RPIN";
		}
	};
	/**
	 * Document is an agreement between the parties, stipulating the terms and
	 * conditions of the delivery of goods or services.
	 */
	public static final MMCode CommercialContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialContract";
			definition = "Document is an agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "CMCN";
		}
	};
	/**
	 * Document is a pre-agreed or pre-arranged foreign exchange transaction to
	 * which the payment transaction refers.
	 */
	public static final MMCode ForeignExchangeDealReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeDealReference";
			definition = "Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "FXDR";
		}
	};
	/**
	 * Document is a statement of the transactions posted to the debtor's
	 * account at the supplier.
	 */
	public static final MMCode StatementOfAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatementOfAccount";
			definition = "Document is a statement of the transactions posted to the debtor's account at the supplier.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SOAC";
		}
	};
	/**
	 * Document is a dispatch advice.
	 */
	public static final MMCode DispatchAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DispatchAdvice";
			definition = "Document is a dispatch advice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Document is a purchase order.
	 */
	public static final MMCode PurchaseOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Document is a purchase order.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "PUOR";
		}
	};
	/**
	 * Document is a structured communication reference provided by the creditor
	 * to identify the referred transaction.
	 */
	public static final MMCode StructuredCommunicationReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StructuredCommunicationReference";
			definition = "Document is a structured communication reference provided by the creditor to identify the referred transaction.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "SCOR";
		}
	};
	/**
	 * Document is a shipping notice.
	 */
	public static final MMCode BillOfLading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillOfLading";
			definition = "Document is a shipping notice.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "BOLD";
		}
	};
	/**
	 * Document is an electronic payment document.
	 */
	public static final MMCode Voucher = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Voucher";
			definition = "Document is an electronic payment document.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "VCHR";
		}
	};
	/**
	 * Document is a payment that applies to a specific source document.
	 */
	public static final MMCode AccountReceivableOpenItem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountReceivableOpenItem";
			definition = "Document is a payment that applies to a specific source document.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "AROI";
		}
	};
	/**
	 * Document is a transaction identifier as assigned by the Trade Services
	 * Utility.
	 */
	public static final MMCode TradeServicesUtilityTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeServicesUtilityTransaction";
			definition = "Document is a transaction identifier as assigned by the Trade Services Utility.";
			owner_lazy = () -> DocumentTypeCode.mmObject();
			codeName = "TSUT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentTypeCode";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentTypeCode.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentTypeCode.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentTypeCode.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentTypeCode.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.CreditNote, com.tools20022.repository.codeset.DocumentTypeCode.DebitNote, com.tools20022.repository.codeset.DocumentTypeCode.HireInvoice,
						com.tools20022.repository.codeset.DocumentTypeCode.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentTypeCode.RemittanceAdviceMessage,
						com.tools20022.repository.codeset.DocumentTypeCode.RelatedPaymentInstruction, com.tools20022.repository.codeset.DocumentTypeCode.CommercialContract,
						com.tools20022.repository.codeset.DocumentTypeCode.ForeignExchangeDealReference, com.tools20022.repository.codeset.DocumentTypeCode.StatementOfAccount,
						com.tools20022.repository.codeset.DocumentTypeCode.DispatchAdvice, com.tools20022.repository.codeset.DocumentTypeCode.PurchaseOrder,
						com.tools20022.repository.codeset.DocumentTypeCode.StructuredCommunicationReference, com.tools20022.repository.codeset.DocumentTypeCode.BillOfLading, com.tools20022.repository.codeset.DocumentTypeCode.Voucher,
						com.tools20022.repository.codeset.DocumentTypeCode.AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentTypeCode.TradeServicesUtilityTransaction);
				derivation_lazy = () -> Arrays.asList(DocumentType3Code.mmObject(), DocumentType6Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
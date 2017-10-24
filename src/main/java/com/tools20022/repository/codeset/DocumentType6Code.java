package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.DocumentTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 */
public class DocumentType6Code extends DocumentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode MeteredServiceInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeteredServiceInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CreditNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DebitNoteRelatedToFinancialAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNoteRelatedToFinancialAdjustment";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CommercialInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CreditNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNote";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DebitNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitNote";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode HireInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HireInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SelfBilledInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfBilledInvoice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CommercialContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialContract";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode StatementOfAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementOfAccount";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DispatchAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispatchAdvice";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode BillOfLading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillOfLading";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Voucher = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Voucher";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode AccountReceivableOpenItem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReceivableOpenItem";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TradeServicesUtilityTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeServicesUtilityTransaction";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PurchaseOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrder";
			owner_lazy = () -> DocumentType6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MSIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentType6Code";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DocumentType6Code.MeteredServiceInvoice, com.tools20022.repository.codeset.DocumentType6Code.CreditNoteRelatedToFinancialAdjustment,
						com.tools20022.repository.codeset.DocumentType6Code.DebitNoteRelatedToFinancialAdjustment, com.tools20022.repository.codeset.DocumentType6Code.CommercialInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.CreditNote, com.tools20022.repository.codeset.DocumentType6Code.DebitNote, com.tools20022.repository.codeset.DocumentType6Code.HireInvoice,
						com.tools20022.repository.codeset.DocumentType6Code.SelfBilledInvoice, com.tools20022.repository.codeset.DocumentType6Code.CommercialContract, com.tools20022.repository.codeset.DocumentType6Code.StatementOfAccount,
						com.tools20022.repository.codeset.DocumentType6Code.DispatchAdvice, com.tools20022.repository.codeset.DocumentType6Code.BillOfLading, com.tools20022.repository.codeset.DocumentType6Code.Voucher,
						com.tools20022.repository.codeset.DocumentType6Code.AccountReceivableOpenItem, com.tools20022.repository.codeset.DocumentType6Code.TradeServicesUtilityTransaction,
						com.tools20022.repository.codeset.DocumentType6Code.PurchaseOrder);
				trace_lazy = () -> DocumentTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ChargeIncludedIndicator;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Entry;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 */
public class CashEntry extends Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account on which the amount of the entry is debited or credited. It
	 * is derived from the association between Entry and Account.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which the amount of the entry is debited or credited. It is derived from the association between Entry and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Amount of money in the cash entry.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account entry for which one or more cash entries are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBookEntry";
			definition = "Account entry for which one or more cash entries are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}
	};
	/**
	 * Cash amount that is the result of the sum of the cash entries from or to
	 * a cash account.
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash amount that is the result of the sum of the cash entries from or to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashBalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	/**
	 * Entry details related to currency exchange information.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Entry details related to currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Provides information on the charges included in the entry amount.
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Availability information on the entry.<br>
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Availability information on the entry.\r\nElements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAvailability.mmObject();
		}
	};
	/**
	 * Interest amount included in the entry amount.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest amount included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.CashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 */
	public static final MMBusinessAssociationEnd DebitRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.DebitEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}
	};
	/**
	 * Book entry which is the source of the cash entry.
	 */
	public static final MMBusinessAssociationEnd CreditRelatedBookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditRelatedBookEntry";
			definition = "Book entry which is the source of the cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.CreditEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BookEntry.mmObject();
		}
	};
	/**
	 * Specifies the invoice financing transaction which originates the entry.
	 */
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingTransaction";
			definition = "Specifies the invoice financing transaction which originates the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}
	};
	/**
	 * Case which is investigating a cash entry.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case which is investigating a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}
	};
	/**
	 * Payment investigation case resolution which created a correction
	 * resulting in a cash entry.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which created a correction resulting in a cash entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};
	/**
	 * Indicates whether charges have already been included in the entry amount.
	 */
	public static final MMBusinessAttribute ChargesIncluded = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesIncluded";
			definition = "Indicates whether charges have already been included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeIncludedIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashEntry";
				definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashEntry, com.tools20022.repository.entity.CashBalance.CashBalanceEntry, com.tools20022.repository.entity.Charges.CashEntry,
						com.tools20022.repository.entity.BookEntry.CashEntry, com.tools20022.repository.entity.BookEntry.DebitEntry, com.tools20022.repository.entity.BookEntry.CreditEntry,
						com.tools20022.repository.entity.Interest.CashEntry, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CashAvailability.CashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection,
						com.tools20022.repository.entity.InvoiceFinancingAgreement.ResultingCashEntry);
				superType_lazy = () -> Entry.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.CashAccount, com.tools20022.repository.entity.CashEntry.Amount, com.tools20022.repository.entity.CashEntry.RelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.CashEntry.Charges,
						com.tools20022.repository.entity.CashEntry.Availability, com.tools20022.repository.entity.CashEntry.Interest, com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry, com.tools20022.repository.entity.CashEntry.RelatedInvoiceFinancingTransaction, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase,
						com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.ChargesIncluded);
			}
		});
		return mmObject_lazy.get();
	}
}
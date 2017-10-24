package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.EntryCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Posting to an account that results in an increase or decrease to a balance.
 */
public class Entry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an entry is a credit or a debit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which an entry is posted to an account on the account
	 * servicer's books.
	 */
	public static final MMBusinessAttribute EntryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for an entry, as assigned by the
	 * account servicer.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an entry, as assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * owner (or the instructing party managing the account).
	 */
	public static final MMBusinessAttribute AccountOwnerTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * servicer.
	 */
	public static final MMBusinessAttribute AccountServicerTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction83.AccountServicerReference, com.tools20022.repository.msg.PaymentTransaction82.AccountServicerReference);
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates whether or not the entry is the result of a reversal.
	 */
	public static final MMBusinessAttribute ReversalIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Date and time assets become available to the account owner (in a credit
	 * entry), or cease to be available to the account owner (in a debit entry).
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Type of underlying transaction resulting in the entry.
	 */
	public static final MMBusinessAssociationEnd BankTransactionCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransactionCode";
			definition = "Type of underlying transaction resulting in the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction is exempt from commission or not.
	 */
	public static final MMBusinessAttribute CommissionWaiverIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party or a system in the context of an
	 * entry in an account.
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Specifies the role played by a party or a system in the context of an entry in an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	/**
	 * Posting of an item to an account, that results in an increase or a
	 * decrease to the balance of the account.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Posting of an item to an account, that results in an increase or a decrease to the balance of the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Entry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Amount that is the result of the sum of the entries from or to an
	 * account.
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Amount that is the result of the sum of the entries from or to an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.BalanceEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	/**
	 * Specifies the type of an entry in a report.
	 */
	public static final MMBusinessAttribute EntryType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryType";
			definition = "Specifies the type of an entry in a report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Entry";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Entry, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Balance.BalanceEntry,
						com.tools20022.repository.entity.BankTransaction.RelatedEntry);
				subType_lazy = () -> Arrays.asList(CashEntry.mmObject(), SecuritiesEntry.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entry.CreditDebitIndicator, com.tools20022.repository.entity.Entry.EntryDate, com.tools20022.repository.entity.Entry.Identification,
						com.tools20022.repository.entity.Entry.AccountOwnerTransactionIdentification, com.tools20022.repository.entity.Entry.AccountServicerTransactionIdentification,
						com.tools20022.repository.entity.Entry.ReversalIndicator, com.tools20022.repository.entity.Entry.ValueDate, com.tools20022.repository.entity.Entry.BankTransactionCode,
						com.tools20022.repository.entity.Entry.CommissionWaiverIndicator, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.Entry.Account, com.tools20022.repository.entity.Entry.Balance,
						com.tools20022.repository.entity.Entry.EntryType);
			}
		});
		return mmObject_lazy.get();
	}
}
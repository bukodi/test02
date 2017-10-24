package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BalanceAdjustmentTypeCode;
import com.tools20022.repository.codeset.BalanceCounterpartyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Balance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time. A cash balance is calculated from a sum of cash
 * credits minus a sum of cash debits.
 */
public class CashBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account for which a balance is calculated.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a balance is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Specifies whether the balance is calculated against one other party or
	 * against a group of parties.
	 */
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies whether the balance is calculated against one other party or against a group of parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceCounterpartyCode.mmObject();
		}
	};
	/**
	 * Party against which a balance is calculated (from the point of view of
	 * the account owner). A bilateral balance is calculated against one other
	 * party; a multilateral balance is calculated against a group of parties.
	 */
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}
	};
	/**
	 * Currency and amount of money of the cash balance.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of money of the cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAvailability.mmObject();
		}
	};
	/**
	 * Credit or debit postings used to calculate a balance.
	 */
	public static final MMBusinessAssociationEnd CashBalanceEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}
	};
	/**
	 * Defines the type of allowed balance adjustment.
	 */
	public static final MMBusinessAttribute BalanceAdjustmentCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceAdjustmentCode";
			definition = "Defines the type of allowed balance adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Validation process which verifies the balance attached to the card.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidationProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidationProcess";
			definition = "Validation process which verifies the balance attached to the card.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}
	};
	/**
	 * Predetermined date in a billing or processing cycle when account activity
	 * for the previous reporting period is summarized (when checks written
	 * against an account are collected and summarized in a monthly statement).
	 * Checks paid or deposits received after the cut-off date are included in
	 * the next month's statement.
	 */
	public static final MMBusinessAttribute CutOffDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CutOffDate";
			definition = "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Related contract balance on date of contract registration.
	 */
	public static final MMBusinessAssociationEnd RelatedRegisteredContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegisteredContract";
			definition = "Related contract balance on date of contract registration.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ContractBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashBalance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.SystemMemberRole.CashBalance,
						com.tools20022.repository.entity.CashAvailability.CashBalance, com.tools20022.repository.entity.CardPaymentValidation.Balance, com.tools20022.repository.entity.RegisteredContract.ContractBalance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.CashBalance.CalculationType, com.tools20022.repository.entity.CashBalance.Counterparty,
						com.tools20022.repository.entity.CashBalance.Amount, com.tools20022.repository.entity.CashBalance.Availability, com.tools20022.repository.entity.CashBalance.CashBalanceEntry,
						com.tools20022.repository.entity.CashBalance.BalanceAdjustmentCode, com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.CashBalance.CutOffDate,
						com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides statistical information on the number of movements and their value
 * for a particular account.
 */
public class AccountReportedMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Monthly average of the payment amounts (that is, payments going out) over
	 * a year.
	 */
	public static final MMBusinessAttribute MonthlyPaymentValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monthly average of the received amounts over a year (that is, payments
	 * coming in).
	 */
	public static final MMBusinessAttribute MonthlyReceivedValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monthly average of the number of payments (coming in and going out) over
	 * a year.
	 */
	public static final MMBusinessAttribute MonthlyTransactionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Sum of the end of day balances over a month divided by the number of
	 * business days in the month.
	 */
	public static final MMBusinessAttribute AverageBalance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash account for which reported movements are calculated.
	 */
	public static final MMBusinessAssociationEnd ReportedCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedCashAccount";
			definition = "Cash account for which reported movements are calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.ReportedMovements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountReportedMovement";
				definition = "Provides statistical information on the number of movements and their value for a particular account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.ReportedMovements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountReportedMovement.MonthlyPaymentValue, com.tools20022.repository.entity.AccountReportedMovement.MonthlyReceivedValue,
						com.tools20022.repository.entity.AccountReportedMovement.MonthlyTransactionNumber, com.tools20022.repository.entity.AccountReportedMovement.AverageBalance,
						com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}
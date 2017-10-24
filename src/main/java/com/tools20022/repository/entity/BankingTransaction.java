package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction executed by the client of a financial institution from/to the
 * account serviced by the financial institution, such as mortgage payment.
 */
public class BankingTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment obligation resulting from a banking transaction.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment obligation resulting from a banking transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.BankingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Financial transaction to which the banking transaction is associated.
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the banking transaction is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.BankingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	/**
	 * Specifies the cash which is delivered by a financial institution.
	 */
	public static final MMBusinessAssociationEnd CashDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDelivery";
			definition = "Specifies the cash which is delivered by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDelivery.RelatedBankingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDelivery.mmObject();
		}
	};
	/**
	 * Specifies the cash which is received by a financial institution.
	 */
	public static final MMBusinessAssociationEnd CashDeposit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankingTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Specifies the cash which is received by a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDeposit.RelatedBankingTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankingTransaction";
				definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.BankingTransaction, com.tools20022.repository.entity.CashDeposit.RelatedBankingTransaction,
						com.tools20022.repository.entity.CashDelivery.RelatedBankingTransaction, com.tools20022.repository.entity.FinancialTransaction.BankingTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankingTransaction.PaymentObligation, com.tools20022.repository.entity.BankingTransaction.FinancialTransaction,
						com.tools20022.repository.entity.BankingTransaction.CashDelivery, com.tools20022.repository.entity.BankingTransaction.CashDeposit);
			}
		});
		return mmObject_lazy.get();
	}
}
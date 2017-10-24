package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of buying, selling, switching or transferring fund units.
 */
public class InvestmentFundTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * An investor's instruction to either subscribe or redeem an amount of
	 * money or its equivalent, eg, other assets, into or out of an investment
	 * fund.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	/**
	 * Unique and unambiguous investor's identification of an order assigned by
	 * a client.
	 */
	public static final MMBusinessAttribute ClientReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of investment fund transaction.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Charge for the placement of an order and/or for its execution.
	 */
	public static final MMBusinessAssociationEnd TransactionCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}
	};
	/**
	 * Account related to an investment fund transaction.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	/**
	 * Investment fund class to which an investment fund order and its execution
	 * are related.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Tax applicable to an investment fund order and/or to its execution.
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.Transaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundTax.mmObject();
		}
	};
	/**
	 * Direction of the transaction, ie, securities are received (credited) or
	 * delivered (debited).
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Creation/cancellation of investment units on the books of the fund or its
	 * designated agent, as a result of executing an investment fund order.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundTax.Transaction, com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.InvestmentFundTransaction);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.ClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.Type, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.TransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.CreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution);
			}
		});
		return mmObject_lazy.get();
	}
}
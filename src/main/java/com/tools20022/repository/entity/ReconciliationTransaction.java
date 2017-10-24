package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotalsCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Reconciliation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Totals performed during the reconciliation period, for a certain type of
 * transaction.
 */
public class ReconciliationTransaction extends Reconciliation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification of the reconciliation period between the acceptor
	 * and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
	 */
	public static final MMBusinessAttribute ReconciliationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency associated with thecumulative amount.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency associated with thecumulative amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Identification of the type of transaction.
	 */
	public static final MMBusinessAttribute TransactionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Identification of the type of transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotalsCode.mmObject();
		}
	};
	/**
	 * Total number of transactions during a reconciliation period.
	 */
	public static final MMBusinessAttribute TotalNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total amount of a collection of transactions.
	 */
	public static final MMBusinessAttribute CumulativeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates if the exchange requires a closure of the reconciliation
	 * period.
	 */
	public static final MMBusinessAttribute ClosePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the exchange requires a closure of the reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Specifies the card payments which are part of the transaction
	 * reconciliation.
	 */
	public static final MMBusinessAssociationEnd CardPaymentTotal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ReconciliationTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentTotal";
			definition = "Specifies the card payments which are part of the transaction reconciliation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReconciliationTransaction";
				definition = "Totals performed during the reconciliation period, for a certain type of transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.Reconciliation);
				superType_lazy = () -> Reconciliation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReconciliationTransaction.ReconciliationIdentification, com.tools20022.repository.entity.ReconciliationTransaction.Currency,
						com.tools20022.repository.entity.ReconciliationTransaction.TransactionType, com.tools20022.repository.entity.ReconciliationTransaction.TotalNumber,
						com.tools20022.repository.entity.ReconciliationTransaction.CumulativeAmount, com.tools20022.repository.entity.ReconciliationTransaction.ClosePeriod,
						com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal);
			}
		});
		return mmObject_lazy.get();
	}
}
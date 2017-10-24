package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.codeset.TypeOfAmountCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment through an electronic money product.
 */
public class CardPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the card which is used in a payment by card.
	 */
	public static final MMBusinessAssociationEnd PaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Specifies the card which is used in a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	/**
	 * Product purchased with the transaction.
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	/**
	 * Detailed amount value.
	 */
	public static final MMBusinessAttribute DetailedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amount value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identification of the type of amount.
	 */
	public static final MMBusinessAttribute AmountQualifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountQualifier";
			definition = "Identification of the type of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmountCode.mmObject();
		}
	};
	/**
	 * Parameters of the process of acquiring a card payment.
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Parameters of the process of acquiring a card payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	/**
	 * Specifies each role played by a party in the process of a payment by
	 * card.
	 */
	public static final MMBusinessAssociationEnd PaymentCardPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCardPartyRole";
			definition = "Specifies each role played by a party in the process of a payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentPartyRole.mmObject();
		}
	};
	/**
	 * Status of the payment by card.
	 */
	public static final MMBusinessAssociationEnd CardPaymentStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentStatus";
			definition = "Status of the payment by card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
		}
	};
	/**
	 * Short description of the amount.
	 */
	public static final MMBusinessAttribute DetailedAmountLabel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DetailedAmountLabel";
			definition = "Short description of the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total of a certain type of transaction.
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Total of a certain type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ReconciliationTransaction.mmObject();
		}
	};
	/**
	 * Specifies the category to which the card transaction belongs.
	 */
	public static final MMBusinessAttribute TransactionCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCategory";
			definition = "Specifies the category to which the card transaction belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCardTransactionCategoryCode.mmObject();
		}
	};
	/**
	 * Amount added to the total price of the transaction and received in cash
	 * by the customer.
	 */
	public static final MMBusinessAttribute CashBackAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBackAmount";
			definition = "Amount added to the total price of the transaction and received in cash by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount tendered for a service performed.
	 */
	public static final MMBusinessAttribute Gratuity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Amount tendered for a service performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the direction of a payment.
	 */
	public static final MMBusinessAttribute DebitCreditDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCreditDirection";
			definition = "Specifies the direction of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Current totals of the ATM.
	 */
	public static final MMBusinessAssociationEnd ATMTotal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMTotal";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ATMTotal.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ATMTotal.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPayment";
				definition = "Payment through an electronic money product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.CardPayment, com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.CardPaymentPartyRole.CardPayment,
						com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.ReconciliationTransaction.CardPaymentTotal, com.tools20022.repository.entity.CardPaymentStatus.CardPayment,
						com.tools20022.repository.entity.ATMTotal.RelatedCardPayment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.CardPayment.Product, com.tools20022.repository.entity.CardPayment.DetailedAmount,
						com.tools20022.repository.entity.CardPayment.AmountQualifier, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring, com.tools20022.repository.entity.CardPayment.PaymentCardPartyRole,
						com.tools20022.repository.entity.CardPayment.CardPaymentStatus, com.tools20022.repository.entity.CardPayment.DetailedAmountLabel, com.tools20022.repository.entity.CardPayment.Reconciliation,
						com.tools20022.repository.entity.CardPayment.TransactionCategory, com.tools20022.repository.entity.CardPayment.CashBackAmount, com.tools20022.repository.entity.CardPayment.Gratuity,
						com.tools20022.repository.entity.CardPayment.DebitCreditDirection, com.tools20022.repository.entity.CardPayment.ATMTotal);
			}
		});
		return mmObject_lazy.get();
	}
}
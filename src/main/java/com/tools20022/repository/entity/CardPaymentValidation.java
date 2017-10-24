package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.codeset.CSCResultCode;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.OnLineReasonCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Results and parameters of the card payment verification.
 */
public class CardPaymentValidation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Outcome of the transaction at the acceptor.
	 */
	public static final MMBusinessAttribute TransactionSuccess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicate that the acceptor has forced the transaction in spite of the
	 * authorisation result (online or offline), or incident to complete the
	 * transaction.
	 */
	public static final MMBusinessAttribute MerchantOverride = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Transaction authorisation deadline to complete the related payment.
	 */
	public static final MMBusinessAttribute ValidityDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Card payment to which the validation process applies.
	 */
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment to which the validation process applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Validation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
		}
	};
	/**
	 * Response to an authorisation request.
	 */
	public static final MMBusinessAssociationEnd Response = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Response";
			definition = "Response to an authorisation request.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Response.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
		}
	};
	/**
	 * Value assigned by the authorising party.
	 */
	public static final MMBusinessAttribute AuthorisationCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};
	/**
	 * Reason to process an online authorisation.
	 */
	public static final MMBusinessAttribute OnLineReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineReasonCode.mmObject();
		}
	};
	/**
	 * Balance of the account attached to the payment card.
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account attached to the payment card.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashBalance.mmObject();
		}
	};
	/**
	 * Result of the cardholder verification address checks on the street number
	 * and the postal code.
	 */
	public static final MMBusinessAttribute CardholderAddressVerificationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
		}
	};
	/**
	 * Result of the printed CSC (Card Security Code) validation.
	 */
	public static final MMBusinessAttribute CSCResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed CSC (Card Security Code) validation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCResultCode.mmObject();
		}
	};
	/**
	 * Product code for which the payment authorisation was declined.
	 */
	public static final MMBusinessAssociationEnd DeclinedProductCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the payment authorisation was declined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductCategory.mmObject();
		}
	};
	/**
	 * Result of an e-commerce authentication process.
	 */
	public static final MMBusinessAttribute ElectronicCommerceAuthenticationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	/**
	 * Incident occuring during the transaction.
	 */
	public static final MMBusinessAttribute FailureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "Incident occuring during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}
	};
	/**
	 * Signature of the message to display or print.
	 */
	public static final MMBusinessAssociationEnd Signature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Signature of the message to display or print.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.CardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentValidation";
				definition = "Results and parameters of the card payment verification.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.Signature.CardPaymentValidation,
								com.tools20022.repository.entity.CardPaymentAcquiring.Validation, com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation,
								com.tools20022.repository.entity.Response.RelatedCardPaymentValidation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.TransactionSuccess, com.tools20022.repository.entity.CardPaymentValidation.MerchantOverride,
						com.tools20022.repository.entity.CardPaymentValidation.ValidityDate, com.tools20022.repository.entity.CardPaymentValidation.CardPayment, com.tools20022.repository.entity.CardPaymentValidation.Response,
						com.tools20022.repository.entity.CardPaymentValidation.AuthorisationCode, com.tools20022.repository.entity.CardPaymentValidation.OnLineReason, com.tools20022.repository.entity.CardPaymentValidation.Balance,
						com.tools20022.repository.entity.CardPaymentValidation.CardholderAddressVerificationResult, com.tools20022.repository.entity.CardPaymentValidation.CSCResult,
						com.tools20022.repository.entity.CardPaymentValidation.DeclinedProductCode, com.tools20022.repository.entity.CardPaymentValidation.ElectronicCommerceAuthenticationResult,
						com.tools20022.repository.entity.CardPaymentValidation.FailureReason, com.tools20022.repository.entity.CardPaymentValidation.Signature);
			}
		});
		return mmObject_lazy.get();
	}
}
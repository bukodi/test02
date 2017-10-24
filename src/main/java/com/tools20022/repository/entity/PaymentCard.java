package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CardAccountTypeCode;
import com.tools20022.repository.codeset.CardTypeCode;
import com.tools20022.repository.codeset.CSCManagementCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
 */
public class PaymentCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment for which a payment card is used.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which a payment card is used.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.PaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}
	};
	/**
	 * Type of card, eg, credit card.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardTypeCode.mmObject();
		}
	};
	/**
	 * Number embossed on a card that links the card to the account owner and
	 * account servicer (sometimes called personal account number or PAN).
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer (sometimes called personal account number or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Year and month the card is available for use.
	 */
	public static final MMBusinessAttribute StartDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Year and month the card expires.
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	/**
	 * Security code written on the card, sometimes called card security code
	 * (CSC).
	 */
	public static final MMBusinessAttribute SecurityCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on the card, sometimes called card security code (CSC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies a card inside a set of cards with the same number (or PAN).
	 */
	public static final MMBusinessAttribute SequenceNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceNumber";
			definition = "Identifies a card inside a set of cards with the same number (or PAN).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Services attached to the card.
	 */
	public static final MMBusinessAttribute ServiceCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceCode";
			definition = "Services attached to the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Card track content or equivalent.
	 */
	public static final MMBusinessAttribute TrackValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackValue";
			definition = "Card track content or equivalent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Card Security Code management associated with the transaction.
	 */
	public static final MMBusinessAttribute SecurityCodeManagement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCodeManagement";
			definition = "Card Security Code management associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCManagementCode.mmObject();
		}
	};
	/**
	 * Brand name of the card.
	 */
	public static final MMBusinessAttribute CardBrand = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Account linked to the card.
	 */
	public static final MMBusinessAssociationEnd RelatedAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccount";
			definition = "Account linked to the card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Defines a category of cards related the acceptance processing rules
	 * defined by the acquirer.
	 */
	public static final MMBusinessAttribute ProfileNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileNumber";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	/**
	 * Type of cardholder account used for the transaction.
	 */
	public static final MMBusinessAttribute RelatedAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardAccountTypeCode.mmObject();
		}
	};
	/**
	 * Monetary value of the credit available for this financial card.
	 */
	public static final MMBusinessAttribute CreditAvailableAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAvailableAmount";
			definition = "Monetary value of the credit available for this financial card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Limit specified on a payment card.
	 */
	public static final MMBusinessAssociationEnd Limit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Limit";
			definition = "Limit specified on a payment card.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
		}
	};
	/**
	 * Currency code of the card issuer.
	 */
	public static final MMBusinessAttribute CardCurrencyCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Interest applied on amounts due for credit card payments.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest applied on amounts due for credit card payments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Country code attached to the card by the card issuer.
	 */
	public static final MMBusinessAssociationEnd CardCountryCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardCountryCode";
			definition = "Country code attached to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedPaymentCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}
	};
	/**
	 * The card programme associated by a retailer to a cardholder among a
	 * series of payment programmes offered by the retailer.
	 */
	public static final MMBusinessAttribute CardProgramme = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardProgramme";
			definition = "The card programme associated by a retailer to a cardholder among a series of payment programmes offered by the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCard";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device that typically contains a microprocessor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedPaymentCard, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CardPayment.PaymentCard, com.tools20022.repository.entity.Limit.RelatedPaymentCard, com.tools20022.repository.entity.Interest.RelatedPaymentCard);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentCard.Payment, com.tools20022.repository.entity.PaymentCard.Type, com.tools20022.repository.entity.PaymentCard.Number,
						com.tools20022.repository.entity.PaymentCard.StartDate, com.tools20022.repository.entity.PaymentCard.ExpiryDate, com.tools20022.repository.entity.PaymentCard.SecurityCode,
						com.tools20022.repository.entity.PaymentCard.SequenceNumber, com.tools20022.repository.entity.PaymentCard.ServiceCode, com.tools20022.repository.entity.PaymentCard.TrackValue,
						com.tools20022.repository.entity.PaymentCard.SecurityCodeManagement, com.tools20022.repository.entity.PaymentCard.CardBrand, com.tools20022.repository.entity.PaymentCard.RelatedAccount,
						com.tools20022.repository.entity.PaymentCard.ProfileNumber, com.tools20022.repository.entity.PaymentCard.RelatedAccountType, com.tools20022.repository.entity.PaymentCard.CreditAvailableAmount,
						com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.PaymentCard.CardCurrencyCode, com.tools20022.repository.entity.PaymentCard.Interest,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.PaymentCard.CardProgramme);
			}
		});
		return mmObject_lazy.get();
	}
}
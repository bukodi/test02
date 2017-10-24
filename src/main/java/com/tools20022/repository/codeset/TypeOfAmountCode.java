package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification or qualification of the type of amount.
 */
public class TypeOfAmountCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash-back amount.
	 */
	public static final MMCode Cashback = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cashback";
			definition = "Cash-back amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "CSHB";
		}
	};
	/**
	 * Gratuity amount.
	 */
	public static final MMCode Gratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Gratuity amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "GRTY";
		}
	};
	/**
	 * Fees.
	 */
	public static final MMCode Fees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEES";
		}
	};
	/**
	 * Global rebate of the transaction. This amount is counted as a negative
	 * amount.
	 */
	public static final MMCode Rebates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rebates";
			definition = "Global rebate of the transaction. This amount is counted as a negative amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RBTS";
		}
	};
	/**
	 * Value added tax amount.
	 */
	public static final MMCode ValueAddedTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTax";
			definition = "Value added tax amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Actual amount.
	 */
	public static final MMCode Actual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual";
			definition = "Actual amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ACTL";
		}
	};
	/**
	 * Replacement amount.
	 */
	public static final MMCode Replacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Replacement";
			definition = "Replacement amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RPLT";
		}
	};
	/**
	 * Maximum amount (the final amount must be less or equal).
	 */
	public static final MMCode Maximum = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Maximum";
			definition = "Maximum amount (the final amount must be less or equal).";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Default amount.
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Default amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Estimated amount (the final amount could be above or below).
	 */
	public static final MMCode Estimated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Estimated";
			definition = "Estimated amount (the final amount could be above or below).";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ESTM";
		}
	};
	/**
	 * Original amount authorised during the real-time authorisation process.
	 */
	public static final MMCode Original = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Original";
			definition = "Original amount authorised during the real-time authorisation process.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Extra fee for a purchase or a withdrawal.
	 */
	public static final MMCode Surcharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Surcharge";
			definition = "Extra fee for a purchase or a withdrawal.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "SRCH";
		}
	};
	/**
	 * Service fee.
	 */
	public static final MMCode ServiceFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceFee";
			definition = "Service fee.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "SRVF";
		}
	};
	/**
	 * Interchange fee.
	 */
	public static final MMCode InterchangeFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterchangeFee";
			definition = "Interchange fee.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Discount, rebate or voucher, related to loyalty programs. This amount is
	 * counted as a negative amount.
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			definition = "Discount, rebate or voucher, related to loyalty programs. This amount is counted as a negative amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DCNT";
		}
	};
	/**
	 * Commission that the issuer will charge to the cardholder, which should be
	 * shown and accepted by the cardholder before the money is disbursed.
	 */
	public static final MMCode ATMCommissionFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCommissionFee";
			definition = "Commission that the issuer will charge to the cardholder, which should be shown and accepted by the cardholder before the money is disbursed.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ATMF";
		}
	};
	/**
	 * Transaction amount that has been authorised.
	 */
	public static final MMCode AuthorisedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAmount";
			definition = "Transaction amount that has been authorised.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTH";
		}
	};
	/**
	 * Remaining allowed amount for this type of transaction with this card,
	 * after the transaction, until the end of the card limit period.
	 */
	public static final MMCode CardRemainingBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRemainingBalance";
			definition = "Remaining allowed amount for this type of transaction with this card, after the transaction, until the end of the card limit period.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "CRDB";
		}
	};
	/**
	 * Maximum amount allowed for the transaction in the transaction amount
	 * currency if the transaction amount of the request was declined.
	 */
	public static final MMCode MaximumAllowedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedAmount";
			definition = "Maximum amount allowed for the transaction in the transaction amount currency if the transaction amount of the request was declined.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTX";
		}
	};
	/**
	 * Minimum amount allowed in the TransactionAmount currency if the
	 * transaction amount of the request was declined.
	 */
	public static final MMCode MinimumAllowedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAllowedAmount";
			definition = "Minimum amount allowed in the TransactionAmount currency if the transaction amount of the request was declined.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTN";
		}
	};
	/**
	 * Transaction amount that has been requested to be authorised.
	 */
	public static final MMCode RequestedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedAmount";
			definition = "Transaction amount that has been requested to be authorised.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTQ";
		}
	};
	/**
	 * Fees amount from the card issuer.
	 */
	public static final MMCode IssuerFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFees";
			definition = "Fees amount from the card issuer.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEI";
		}
	};
	/**
	 * Commission from the card issuer.
	 */
	public static final MMCode IssuerCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCommission";
			definition = "Commission from the card issuer.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "COMI";
		}
	};
	/**
	 * Interchange fees.
	 */
	public static final MMCode InterchangeFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeFees";
			definition = "Interchange fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEH";
		}
	};
	/**
	 * Processing fees.
	 */
	public static final MMCode ProcessingFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingFees";
			definition = "Processing fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEP";
		}
	};
	/**
	 * Currency conversion fees.
	 */
	public static final MMCode CurrencyConversionFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionFees";
			definition = "Currency conversion fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEC";
		}
	};
	/**
	 * International service assessment fees.
	 */
	public static final MMCode InternationalServiceAssessmentFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalServiceAssessmentFees";
			definition = "International  service assessment fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEA";
		}
	};
	/**
	 * Commission, for example for DCC (Dynamic Currency Conversion)
	 * transactions.
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Commission, for example for DCC (Dynamic Currency Conversion) transactions.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Donation amount.
	 */
	public static final MMCode Donation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Donation";
			definition = "Donation amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DONN";
		}
	};
	/**
	 * Taxes applicable to the transaction.
	 */
	public static final MMCode Tax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Taxes applicable to the transaction.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "TAXT";
		}
	};
	/**
	 * Incremental amount for reservation.
	 */
	public static final MMCode Incremental = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incremental";
			definition = "Incremental amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Decremental amount for reservation.
	 */
	public static final MMCode Decremental = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decremental";
			definition = "Decremental amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DECR";
		}
	};
	/**
	 * Reserved or updated reserved amount for reservation.
	 */
	public static final MMCode Reserved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reserved";
			definition = "Reserved or updated reserved amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RESD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CSHB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmountCode";
				definition = "Identification or qualification of the type of amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmountCode.Cashback, com.tools20022.repository.codeset.TypeOfAmountCode.Gratuity, com.tools20022.repository.codeset.TypeOfAmountCode.Fees,
						com.tools20022.repository.codeset.TypeOfAmountCode.Rebates, com.tools20022.repository.codeset.TypeOfAmountCode.ValueAddedTax, com.tools20022.repository.codeset.TypeOfAmountCode.Actual,
						com.tools20022.repository.codeset.TypeOfAmountCode.Replacement, com.tools20022.repository.codeset.TypeOfAmountCode.Maximum, com.tools20022.repository.codeset.TypeOfAmountCode.Default,
						com.tools20022.repository.codeset.TypeOfAmountCode.Estimated, com.tools20022.repository.codeset.TypeOfAmountCode.Original, com.tools20022.repository.codeset.TypeOfAmountCode.Surcharge,
						com.tools20022.repository.codeset.TypeOfAmountCode.ServiceFee, com.tools20022.repository.codeset.TypeOfAmountCode.InterchangeFee, com.tools20022.repository.codeset.TypeOfAmountCode.Discount,
						com.tools20022.repository.codeset.TypeOfAmountCode.ATMCommissionFee, com.tools20022.repository.codeset.TypeOfAmountCode.AuthorisedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.CardRemainingBalance,
						com.tools20022.repository.codeset.TypeOfAmountCode.MaximumAllowedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.MinimumAllowedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.RequestedAmount,
						com.tools20022.repository.codeset.TypeOfAmountCode.IssuerFees, com.tools20022.repository.codeset.TypeOfAmountCode.IssuerCommission, com.tools20022.repository.codeset.TypeOfAmountCode.InterchangeFees,
						com.tools20022.repository.codeset.TypeOfAmountCode.ProcessingFees, com.tools20022.repository.codeset.TypeOfAmountCode.CurrencyConversionFees,
						com.tools20022.repository.codeset.TypeOfAmountCode.InternationalServiceAssessmentFees, com.tools20022.repository.codeset.TypeOfAmountCode.Commission, com.tools20022.repository.codeset.TypeOfAmountCode.Donation,
						com.tools20022.repository.codeset.TypeOfAmountCode.Tax, com.tools20022.repository.codeset.TypeOfAmountCode.Incremental, com.tools20022.repository.codeset.TypeOfAmountCode.Decremental,
						com.tools20022.repository.codeset.TypeOfAmountCode.Reserved);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the securities or investment fund balance.
 */
public class SecuritiesBalanceTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance of financial instruments that are freely available with no
	 * specific additional status.
	 */
	public static final MMCode AvailableWithNoAdditionalStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			definition = "Balance of financial instruments that are freely available with no specific additional status.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "AWAS";
		}
	};
	/**
	 * Balance of financial instruments that are blocked.
	 */
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Balance of financial instruments that are blocked.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOK";
		}
	};
	/**
	 * Balance of financial instruments that are available.
	 */
	public static final MMCode Available = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			definition = "Balance of financial instruments that are available.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "AVAI";
		}
	};
	/**
	 * Balance of financial instrument blocked following a corporate action,
	 * including proxy activities.
	 */
	public static final MMCode BlockedCorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			definition = "Balance of financial instrument blocked following a corporate action, including proxy activities.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLCA";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for trading.
	 */
	public static final MMCode BlockedTrading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			definition = "Balance of financial instruments that are blocked for trading.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOT";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for verification of
	 * authenticity.
	 */
	public static final MMCode BlockedAuthenticity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			definition = "Balance of financial instruments that are blocked for verification of authenticity.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BLOV";
		}
	};
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 */
	public static final MMCode Borrowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a borrow transaction.
	 */
	public static final MMCode PendingBorrowedDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a borrow transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a borrow transaction.
	 */
	public static final MMCode PendingBorrowedReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a borrow transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 */
	public static final MMCode CollateralIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 */
	public static final MMCode CollateralOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Balance of securities that are eligible for use for collateral purposes.
	 */
	public static final MMCode EligibleForCollateralPurposes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			definition = "Balance of securities that are eligible for use for collateral purposes.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Loan for consumption.
	 */
	public static final MMCode OnLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			definition = "Loan for consumption.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a lending transaction.
	 */
	public static final MMCode PendingOnLoanDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a lending transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a lending transaction.
	 */
	public static final MMCode PendingOnLoanReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a lending transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "LORE";
		}
	};
	/**
	 * Account is used when financing is by the broker/dealer.
	 */
	public static final MMCode DerivativesMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			definition = "Account is used when financing is by the broker/dealer.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been matched.
	 */
	public static final MMCode PendingDeliveryMatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been matched.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PDMT";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been
	 * unmatched.
	 */
	public static final MMCode PendingDeliveryUnmatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been unmatched.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PDUM";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that have been matched.
	 */
	public static final MMCode PendingReceiptMatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptMatchedBalance";
			definition = "Balance of financial instruments pending receipt that have been matched.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PRMT";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that are unmatched.
	 */
	public static final MMCode PendingReceiptUnmatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			definition = "Balance of financial instruments pending receipt that are unmatched.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PRUM";
		}
	};
	/**
	 * Balance of financial instrument pending receipt following a corporate
	 * action.
	 */
	public static final MMCode PendingCorporateActionReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			definition = "Balance of financial instrument pending receipt following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PECA";
		}
	};
	/**
	 * Balance of financial instrument pending delivery following a corporate
	 * action.
	 */
	public static final MMCode PendingCorporateActionDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			definition = "Balance of financial instrument pending delivery following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Processing has not been completed.
	 */
	public static final MMCode PendingDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			definition = "Processing has not been completed.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * The instruction is pending receipt of securities, for example, from a
	 * purchase, loan etc.
	 */
	public static final MMCode PendingReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Balance of securities that belong to and is kept in the safekeeping
	 * account indicated within this message, and that are pledged.
	 */
	public static final MMCode Pledged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "PLED";
		}
	};
	/**
	 * Balance of financial instruments currently being processed by the
	 * institution responsible for registering the new beneficial owner (or
	 * nominee).
	 */
	public static final MMCode OutForRegistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "REGO";
		}
	};
	/**
	 * Balance of financial instruments that may only be sold under certain
	 * conditions or require legal documents.
	 */
	public static final MMCode Restricted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Balance of financial instruments that may only be sold under certain conditions or require legal documents.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Other. See Narrative.
	 */
	public static final MMCode Unclassified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			definition = "Other. See Narrative.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 */
	public static final MMCode InTransshipment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 */
	public static final MMCode Drawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 */
	public static final MMCode TaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 */
	public static final MMCode NonTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Balance of financial instruments that are registered (in nominee name or
	 * in the name of the beneficial owner).
	 */
	public static final MMCode Registered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			definition = "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 */
	public static final MMCode StreetPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "SPOS";
		}
	};
	/**
	 * Balance of securities that could not be registered due to foreign
	 * ownership limitation.
	 */
	public static final MMCode Unregistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "UNRG";
		}
	};
	/**
	 * Financial instrument is unavailable due to missing or incomplete
	 * documentation pertaining to the account, or due to a missing or
	 * incomplete order.
	 */
	public static final MMCode WaitingDocumentation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "WDOC";
		}
	};
	/**
	 * Financial instrument is unavailable as a result of a transfer order,
	 * pending movement in the shareholders' register.
	 */
	public static final MMCode BeingTransferred = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "BTRA";
		}
	};
	/**
	 * In issuer agent / depository communication, balance of issued financial
	 * instruments for which legal documentation has been received.
	 */
	public static final MMCode Issued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * In issuer agent / depository communication, balance of issued financial
	 * instruments for which legal documentation has not yet been received.
	 */
	public static final MMCode QuasiIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has not yet been received.";
			owner_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
			codeName = "QUAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWAS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTypeV2Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Blocked,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedTrading, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Borrowed, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingBorrowedDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingBorrowedReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceiptMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceiptUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.InTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Drawn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Registered, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.BeingTransferred, com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.Issued,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code.QuasiIssued);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a transaction to be rejected, returned or reversed
 * by an instructed agent or somebody acting on behalf of an instructed agent.
 */
public class TransactionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Format of the account number specified is not correct.
	 */
	public static final MMCode IncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectAccountNumber";
			definition = "Format of the account number specified is not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC01";
		}
	};
	/**
	 * Format of the account number specified is non-numeric.
	 */
	public static final MMCode NonNumericAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonNumericAccountNumber";
			definition = "Format of the account number specified is non-numeric.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC02";
		}
	};
	/**
	 * Format of the account number specified is not valid for local
	 * Sort/National Clearing Code.
	 */
	public static final MMCode InvalidAccountNumberForClearingCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberForClearingCode";
			definition = "Format of the account number specified is not valid for local Sort/National Clearing Code.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC03";
		}
	};
	/**
	 * Account number specified has been closed on the Receiver's books.
	 */
	public static final MMCode ClosedAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the Receiver's books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Account number specified is not a valid account at the Final Agent.
	 */
	public static final MMCode InvalidAccountNumberWithInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidAccountNumberWithInstitution";
			definition = "Account number specified is not a valid account at the Final Agent.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC05";
		}
	};
	/**
	 * Account specified is blocked, prohibiting posting of transactions against
	 * it.
	 */
	public static final MMCode BlockedAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedAccount";
			definition = "Account specified is blocked, prohibiting posting of transactions against it.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC06";
		}
	};
	/**
	 * Specified message amount is equal to zero.
	 */
	public static final MMCode ZeroAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ZeroAmount";
			definition = "Specified message amount is equal to zero.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM01";
		}
	};
	/**
	 * Specified transaction/message amount is greater than allowed maximum.
	 */
	public static final MMCode NotAllowedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAllowedAmount";
			definition = "Specified transaction/message amount is greater than allowed maximum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM02";
		}
	};
	/**
	 * Specified message amount is in an non processable currency outside of
	 * existing agreement.
	 */
	public static final MMCode NotAllowedCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAllowedCurrency";
			definition = "Specified message amount is in an non processable currency outside of existing agreement.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM03";
		}
	};
	/**
	 * Amount of funds available to cover specified message amount is
	 * insufficient.
	 */
	public static final MMCode InsufficientFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientFunds";
			definition = "Amount of funds available to cover specified message amount is insufficient.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM04";
		}
	};
	/**
	 * This message appears to have been duplicated.
	 */
	public static final MMCode Duplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Duplication";
			definition = "This message appears to have been duplicated.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM05";
		}
	};
	/**
	 * Specified transaction amount is less than agreed minimum.
	 */
	public static final MMCode TooLowAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLowAmount";
			definition = "Specified transaction amount is less than agreed minimum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM06";
		}
	};
	/**
	 * Amount specified in message has been blocked by regulatory authorities.
	 */
	public static final MMCode BlockedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedAmount";
			definition = "Amount specified in message has been blocked by regulatory authorities.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM07";
		}
	};
	/**
	 * Specified charges amount is not as agreed between sender and receiver.
	 */
	public static final MMCode ChargeDisagreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeDisagreement";
			definition = "Specified charges amount is not as agreed between sender and receiver.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM08";
		}
	};
	/**
	 * Identification of end customer is not consistent with associated account
	 * number. (formerly CreditorConsistency)
	 */
	public static final MMCode InconsistentWithEndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InconsistentWithEndCustomer";
			definition = "Identification of end customer is not consistent with associated account number. (formerly CreditorConsistency)";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE01";
		}
	};
	/**
	 * Creditor specified is not known at associated Sort/National Clearing
	 * code.
	 */
	public static final MMCode UnknownCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownCreditor";
			definition = "Creditor specified is not known at associated Sort/National Clearing code.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE02";
		}
	};
	/**
	 * Creditor specified no longer exists in the books.
	 */
	public static final MMCode NoLongerValidCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoLongerValidCreditor";
			definition = "Creditor specified no longer exists in the books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE03";
		}
	};
	/**
	 * Specification of creditor's address, which is required for payment, is
	 * missing/not correct (formerly IncorrectCreditorAddress).
	 */
	public static final MMCode MissingCreditorAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAddress";
			definition = "Specification of creditor's address, which is required for payment, is missing/not correct (formerly IncorrectCreditorAddress).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE04";
		}
	};
	/**
	 * Party who initiated the message is not recognised by the end customer.
	 */
	public static final MMCode UnrecognisedInitiatingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrecognisedInitiatingParty";
			definition = "Party who initiated the message is not recognised by the end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE05";
		}
	};
	/**
	 * Transaction forbidden on this type of account (formerly NoAgreement).
	 */
	public static final MMCode TransactionForbidden = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionForbidden";
			definition = "Transaction forbidden on this type of account (formerly NoAgreement).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AG01";
		}
	};
	/**
	 * Bank Operation code specified in the message is not valid for receiver.
	 */
	public static final MMCode InvalidBankOperationCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidBankOperationCode";
			definition = "Bank Operation code specified in the message is not valid for receiver.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AG02";
		}
	};
	/**
	 * Invalid date (eg, wrong settlement date).
	 */
	public static final MMCode InvalidDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidDate";
			definition = "Invalid date (eg, wrong settlement date).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "DT01";
		}
	};
	/**
	 * Reason has not been specified due to sensitivities.
	 */
	public static final MMCode NotSpecifiedReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReason";
			definition = "Reason has not been specified due to sensitivities.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS01";
		}
	};
	/**
	 * Unknown account with institution.
	 */
	public static final MMCode UnknownAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownAccount";
			definition = "Unknown account with institution.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "PY01";
		}
	};
	/**
	 * Transaction reference is not unique within the message.
	 */
	public static final MMCode NotUniqueTransactionReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotUniqueTransactionReference";
			definition = "Transaction reference is not unique within the message.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RF01";
		}
	};
	/**
	 * Bank identifier code specified in the message has an incorrect format
	 * (formerly IncorrectFormatForRoutingCode).
	 */
	public static final MMCode BankIdentifierIncorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankIdentifierIncorrect";
			definition = "Bank identifier code specified in the message has an incorrect format (formerly IncorrectFormatForRoutingCode).";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC01";
		}
	};
	/**
	 * Routing code specified in the transaction/message is not numeric.
	 */
	public static final MMCode NonNumericRoutingCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonNumericRoutingCode";
			definition = "Routing code specified in the transaction/message is not numeric.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC02";
		}
	};
	/**
	 * Routing code specified in the transaction/message is not valid for local
	 * clearing.
	 */
	public static final MMCode NotValidRoutingCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotValidRoutingCode";
			definition = "Routing code specified in the transaction/message is not valid for local clearing.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC03";
		}
	};
	/**
	 * Routing code specified in the transaction/message refers to a closed
	 * branch.
	 */
	public static final MMCode ClosedBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedBranch";
			definition = "Routing code specified in the transaction/message refers to a closed branch.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "RC04";
		}
	};
	/**
	 * Associated message was received after agreed processing cut-off time.
	 */
	public static final MMCode CutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Associated message was received after agreed processing cut-off time.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "TM01";
		}
	};
	/**
	 * Correspondent bank not possible.
	 */
	public static final MMCode CorrespondentBankNotPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorrespondentBankNotPossible";
			definition = "Correspondent bank not possible.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED01";
		}
	};
	/**
	 * Transaction reason non reportable.
	 */
	public static final MMCode TransactionReasonNonReportable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionReasonNonReportable";
			definition = "Transaction reason non reportable.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED02";
		}
	};
	/**
	 * Balance of payments complementary info is requested.
	 */
	public static final MMCode BalanceInfoRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceInfoRequested";
			definition = "Balance of payments complementary info is requested.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED03";
		}
	};
	/**
	 * Charge details not correct.
	 */
	public static final MMCode ChargeDetailsNotCorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeDetailsNotCorrect";
			definition = "Charge details not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED04";
		}
	};
	/**
	 * Reason has not been specified by agent.
	 */
	public static final MMCode NotSpecifiedReasonAgentGenerated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonAgentGenerated";
			definition = "Reason has not been specified by agent.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS03";
		}
	};
	/**
	 * Reason has not been specified by end customer.
	 */
	public static final MMCode NotSpecifiedReasonCustomerGenerated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotSpecifiedReasonCustomerGenerated";
			definition = "Reason has not been specified by end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MS02";
		}
	};
	/**
	 * End customer specified is not known at associated Sort/National Bank Code
	 * or does no longer exist in the books.
	 */
	public static final MMCode UnknownEndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownEndCustomer";
			definition = "End customer specified is not known at associated Sort/National Bank Code or does no longer exist in the books.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE06";
		}
	};
	/**
	 * Specification of debtor's address, which is required for payment, is
	 * missing/not correct.
	 */
	public static final MMCode MissingDebtorAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAddress";
			definition = "Specification of debtor's address, which is required for payment, is missing/not correct.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "BE07";
		}
	};
	/**
	 * Amount received is not the amount agreed or expected.
	 */
	public static final MMCode WrongAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrongAmount";
			definition = "Amount received is not the amount agreed or expected.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM09";
		}
	};
	/**
	 * Sum of instructed amounts does not equal the control sum.
	 */
	public static final MMCode InvalidControlSum = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidControlSum";
			definition = "Sum of instructed amounts does not equal the control sum.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AM10";
		}
	};
	/**
	 * Mandate is cancelled or invalid.
	 */
	public static final MMCode NoMandate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMandate";
			definition = "Mandate is cancelled or invalid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD01";
		}
	};
	/**
	 * Mandate related information data required by the scheme is missing.
	 */
	public static final MMCode MissingMandatoryInformationInMandate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingMandatoryInformationInMandate";
			definition = "Mandate related information data required by the scheme is missing.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD02";
		}
	};
	/**
	 * File format incomplete or invalid.
	 */
	public static final MMCode InvalidFileFormatForOtherReasonThanGroupingIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForOtherReasonThanGroupingIndicator";
			definition = "File format incomplete or invalid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD03";
		}
	};
	/**
	 * File format incorrect in terms of grouping indicator.
	 */
	public static final MMCode InvalidFileFormatForGroupingIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidFileFormatForGroupingIndicator";
			definition = "File format incorrect in terms of grouping indicator.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD04";
		}
	};
	/**
	 * Return of funds requested by end customer.
	 */
	public static final MMCode RefundRequestByEndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RefundRequestByEndCustomer";
			definition = "Return of funds requested by end customer.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD06";
		}
	};
	/**
	 * End customer is deceased.
	 */
	public static final MMCode EndCustomerDeceased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndCustomerDeceased";
			definition = "End customer is deceased.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD07";
		}
	};
	/**
	 * Creditor or creditor's agent should not have collected the direct debit.
	 */
	public static final MMCode CollectionNotDue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionNotDue";
			definition = "Creditor or creditor's agent should not have collected the direct debit.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "MD05";
		}
	};
	/**
	 * Name provided is not valid.
	 */
	public static final MMCode InvalidName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidName";
			definition = "Name provided is not valid.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "AC07";
		}
	};
	/**
	 * Settlement of the transaction has failed.
	 */
	public static final MMCode SettlementFailed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementFailed";
			definition = "Settlement of the transaction has failed.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "ED05";
		}
	};
	/**
	 * Reason is provided as narrative information in the additional reason
	 * information.
	 */
	public static final MMCode Narrative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Narrative";
			definition = "Reason is provided as narrative information in the additional reason information.";
			owner_lazy = () -> TransactionReasonCode.mmObject();
			codeName = "NARR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AC01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionReasonCode";
				definition = "Specifies the reason for a transaction to be rejected, returned or reversed by an instructed agent or somebody acting on behalf of an instructed agent.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionReasonCode.IncorrectAccountNumber, com.tools20022.repository.codeset.TransactionReasonCode.NonNumericAccountNumber,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidAccountNumberForClearingCode, com.tools20022.repository.codeset.TransactionReasonCode.ClosedAccountNumber,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidAccountNumberWithInstitution, com.tools20022.repository.codeset.TransactionReasonCode.BlockedAccount,
						com.tools20022.repository.codeset.TransactionReasonCode.ZeroAmount, com.tools20022.repository.codeset.TransactionReasonCode.NotAllowedAmount,
						com.tools20022.repository.codeset.TransactionReasonCode.NotAllowedCurrency, com.tools20022.repository.codeset.TransactionReasonCode.InsufficientFunds,
						com.tools20022.repository.codeset.TransactionReasonCode.Duplication, com.tools20022.repository.codeset.TransactionReasonCode.TooLowAmount, com.tools20022.repository.codeset.TransactionReasonCode.BlockedAmount,
						com.tools20022.repository.codeset.TransactionReasonCode.ChargeDisagreement, com.tools20022.repository.codeset.TransactionReasonCode.InconsistentWithEndCustomer,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownCreditor, com.tools20022.repository.codeset.TransactionReasonCode.NoLongerValidCreditor,
						com.tools20022.repository.codeset.TransactionReasonCode.MissingCreditorAddress, com.tools20022.repository.codeset.TransactionReasonCode.UnrecognisedInitiatingParty,
						com.tools20022.repository.codeset.TransactionReasonCode.TransactionForbidden, com.tools20022.repository.codeset.TransactionReasonCode.InvalidBankOperationCode,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidDate, com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReason,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownAccount, com.tools20022.repository.codeset.TransactionReasonCode.NotUniqueTransactionReference,
						com.tools20022.repository.codeset.TransactionReasonCode.BankIdentifierIncorrect, com.tools20022.repository.codeset.TransactionReasonCode.NonNumericRoutingCode,
						com.tools20022.repository.codeset.TransactionReasonCode.NotValidRoutingCode, com.tools20022.repository.codeset.TransactionReasonCode.ClosedBranch, com.tools20022.repository.codeset.TransactionReasonCode.CutOffTime,
						com.tools20022.repository.codeset.TransactionReasonCode.CorrespondentBankNotPossible, com.tools20022.repository.codeset.TransactionReasonCode.TransactionReasonNonReportable,
						com.tools20022.repository.codeset.TransactionReasonCode.BalanceInfoRequested, com.tools20022.repository.codeset.TransactionReasonCode.ChargeDetailsNotCorrect,
						com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReasonAgentGenerated, com.tools20022.repository.codeset.TransactionReasonCode.NotSpecifiedReasonCustomerGenerated,
						com.tools20022.repository.codeset.TransactionReasonCode.UnknownEndCustomer, com.tools20022.repository.codeset.TransactionReasonCode.MissingDebtorAddress,
						com.tools20022.repository.codeset.TransactionReasonCode.WrongAmount, com.tools20022.repository.codeset.TransactionReasonCode.InvalidControlSum, com.tools20022.repository.codeset.TransactionReasonCode.NoMandate,
						com.tools20022.repository.codeset.TransactionReasonCode.MissingMandatoryInformationInMandate, com.tools20022.repository.codeset.TransactionReasonCode.InvalidFileFormatForOtherReasonThanGroupingIndicator,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidFileFormatForGroupingIndicator, com.tools20022.repository.codeset.TransactionReasonCode.RefundRequestByEndCustomer,
						com.tools20022.repository.codeset.TransactionReasonCode.EndCustomerDeceased, com.tools20022.repository.codeset.TransactionReasonCode.CollectionNotDue,
						com.tools20022.repository.codeset.TransactionReasonCode.InvalidName, com.tools20022.repository.codeset.TransactionReasonCode.SettlementFailed, com.tools20022.repository.codeset.TransactionReasonCode.Narrative);
			}
		});
		return mmObject_lazy.get();
	}
}
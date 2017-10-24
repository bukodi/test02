package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Service provided by a card payment transaction.
 */
public class CardPaymentServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer of funds to and/or from a card account.
	 */
	public static final MMCode CardsFundTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardsFundTransfer";
			definition = "Transfer of funds to and/or from a card account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFT";
		}
	};
	/**
	 * Original credit.
	 */
	public static final MMCode OriginalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalCredit";
			definition = "Original credit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "ORCR";
		}
	};
	/**
	 * Card payment.
	 */
	public static final MMCode CardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRDP";
		}
	};
	/**
	 * Card payment with cash-back.
	 */
	public static final MMCode CashBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBack";
			definition = "Card payment with cash-back.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHB";
		}
	};
	/**
	 * Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank
	 * counter.
	 */
	public static final MMCode CashAdvance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAdvance";
			definition = "Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHW";
		}
	};
	/**
	 * Cash deposit.
	 */
	public static final MMCode CashDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDeposit";
			definition = "Cash deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSHD";
		}
	};
	/**
	 * Deferred payment.
	 */
	public static final MMCode DeferredPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeferredPayment";
			definition = "Deferred payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DEFR";
		}
	};
	/**
	 * Reservation (pre-authorisation).
	 */
	public static final MMCode Reservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation (pre-authorisation).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RESA";
		}
	};
	/**
	 * Loading or reloading non-financial account.
	 */
	public static final MMCode Loading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loading";
			definition = "Loading or reloading non-financial account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "LOAD";
		}
	};
	/**
	 * Refund transaction.
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Refund transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RFND";
		}
	};
	/**
	 * Quasi-cash.
	 */
	public static final MMCode QuasiCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuasiCash";
			definition = "Quasi-cash.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "QUCH";
		}
	};
	/**
	 * Balance enquiry.
	 */
	public static final MMCode Balance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance enquiry.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "BALC";
		}
	};
	/**
	 * Card activation.
	 */
	public static final MMCode CardActivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardActivation";
			definition = "Card activation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CACT";
		}
	};
	/**
	 * Card verification.
	 */
	public static final MMCode CardVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardVerification";
			definition = "Card verification.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAVR";
		}
	};
	/**
	 * PIN (Personal Identification Number) change.
	 */
	public static final MMCode PINChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINChange";
			definition = "PIN (Personal Identification Number) change.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PINC";
		}
	};
	/**
	 * Card validity check.
	 */
	public static final MMCode ValidityCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityCheck";
			definition = "Card validity check.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "VALC";
		}
	};
	/**
	 * Aggregation of low payments.
	 */
	public static final MMCode Aggregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Aggregation";
			definition = "Aggregation of low payments.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "AGGR";
		}
	};
	/**
	 * Dynamic currency conversion (DCC).
	 */
	public static final MMCode DCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DCC";
			definition = "Dynamic currency conversion (DCC).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DCCV";
		}
	};
	/**
	 * Card payment with gratuity.
	 */
	public static final MMCode Gratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Card payment with gratuity.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "GRTT";
		}
	};
	/**
	 * Instalment payment.
	 */
	public static final MMCode Instalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Instalment payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Loyalty services.
	 */
	public static final MMCode Loyalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loyalty";
			definition = "Loyalty services.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "LOYT";
		}
	};
	/**
	 * No show after reservation.
	 */
	public static final MMCode NoShow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoShow";
			definition = "No show after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "NRES";
		}
	};
	/**
	 * Purchase and corporate data.
	 */
	public static final MMCode PurchaseCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseCorporate";
			definition = "Purchase and corporate data.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PUCO";
		}
	};
	/**
	 * Recurring payment.
	 */
	public static final MMCode RecurringPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecurringPayment";
			definition = "Recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RECP";
		}
	};
	/**
	 * Solicited available funds.
	 */
	public static final MMCode SolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitedAvailableFunds";
			definition = "Solicited available funds.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "SOAF";
		}
	};
	/**
	 * Unsolicited available funds.
	 */
	public static final MMCode UnsolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnsolicitedAvailableFunds";
			definition = "Unsolicited available funds.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "UNAF";
		}
	};
	/**
	 * Voice authorisation.
	 */
	public static final MMCode VoiceAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoiceAuthorisation";
			definition = "Voice authorisation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "VCAU";
		}
	};
	/**
	 * Initial reservation.
	 */
	public static final MMCode InitialReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialReservation";
			definition = "Initial reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "IRES";
		}
	};
	/**
	 * Update reservation.
	 */
	public static final MMCode UpdateReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UpdateReservation";
			definition = "Update reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "URES";
		}
	};
	/**
	 * Payment after reservation.
	 */
	public static final MMCode PaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentReservation";
			definition = "Payment after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PRES";
		}
	};
	/**
	 * Additional payment after reservation.
	 */
	public static final MMCode AdditionalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalPayment";
			definition = "Additional payment after reservation.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "ARES";
		}
	};
	/**
	 * Initial recurring payment.
	 */
	public static final MMCode FirstRecurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstRecurring";
			definition = "Initial recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "FREC";
		}
	};
	/**
	 * Repeat recurring payment.
	 */
	public static final MMCode FollowingRecurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FollowingRecurring";
			definition = "Repeat recurring payment.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "RREC";
		}
	};
	/**
	 * Card payment transaction transfer from person to business.
	 */
	public static final MMCode PersonToBusiness = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonToBusiness";
			definition = "Card payment transaction transfer from person to business.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TP2B";
		}
	};
	/**
	 * Card payment transaction transfer from person to person.
	 */
	public static final MMCode PersonToPerson = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonToPerson";
			definition = "Card payment transaction transfer from person to person.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TP2P";
		}
	};
	/**
	 * Instalment payment transaction performed by the acceptor or the acquirer.
	 */
	public static final MMCode AcceptorInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			definition = "Instalment payment transaction performed by the acceptor or the acquirer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSA";
		}
	};
	/**
	 * Instalment payment transaction performed by the card issuer.
	 */
	public static final MMCode IssuerInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			definition = "Instalment payment transaction performed by the card issuer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INSI";
		}
	};
	/**
	 * Unloading non-financial account.
	 */
	public static final MMCode Unloading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			definition = "Unloading non-financial account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "UNLD";
		}
	};
	/**
	 * Transfer of funds to a card or an account.
	 */
	public static final MMCode CardsFundTransferPush = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			definition = "Transfer of funds to a card or an account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFH";
		}
	};
	/**
	 * Transfer of funds from a card or an account.
	 */
	public static final MMCode CardsFundTransferPull = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			definition = "Transfer of funds from a card or an account.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CAFL";
		}
	};
	/**
	 * Withdrawal of cash on an ATM.
	 */
	public static final MMCode CashWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Withdrawal of cash on an ATM.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CHWD";
		}
	};
	/**
	 * Unblock the cardholder PIN.
	 */
	public static final MMCode PINUnblock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the cardholder PIN.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PINU";
		}
	};
	/**
	 * Amount and notes values are chosen by the customer.
	 */
	public static final MMCode ChosenWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CSWD";
		}
	};
	/**
	 * Withdrawal transaction was pre-authorised by another channel (amount
	 * could be absent).
	 */
	public static final MMCode PreAuthorisedWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel (amount could be absent).";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "AUWS";
		}
	};
	/**
	 * Amount and Notes Values are pre-defined by the customer profile.
	 */
	public static final MMCode ProfileWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and Notes Values are pre-defined by the customer profile.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "PFWD";
		}
	};
	/**
	 * Customer pressed a button associated with a withdrawal of unique amount
	 * and notes mix.
	 */
	public static final MMCode StandardWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Customer pressed a button associated with a withdrawal of unique amount and notes mix.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "SDWD";
		}
	};
	/**
	 * Transfer for payment of bills.
	 */
	public static final MMCode TransferCardBillPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCardBillPayment";
			definition = "Transfer for payment of bills.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFBL";
		}
	};
	/**
	 * Transfer from cash deposit.
	 */
	public static final MMCode TransferFromCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCash";
			definition = "Transfer from cash deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFCS";
		}
	};
	/**
	 * Transfer from cheque deposit.
	 */
	public static final MMCode TransferFromCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFromCheque";
			definition = "Transfer from cheque deposit.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFCH";
		}
	};
	/**
	 * Transfer for general disbursement.
	 */
	public static final MMCode TransferFundsDisbursementGeneral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFundsDisbursementGeneral";
			definition = "Transfer for general disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFDB";
		}
	};
	/**
	 * Transfer for government disbursement.
	 */
	public static final MMCode TransferGovernmentDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferGovernmentDisbursement";
			definition = "Transfer for government disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFGD";
		}
	};
	/**
	 * Transfer for merchant disbursement.
	 */
	public static final MMCode TransferMerchantDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferMerchantDisbursement";
			definition = "Transfer for merchant disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFMD";
		}
	};
	/**
	 * Transfer for payroll pension disbursement.
	 */
	public static final MMCode TransferPayrollPensionDisbursement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferPayrollPensionDisbursement";
			definition = "Transfer for payroll pension disbursement.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "TFPD";
		}
	};
	/**
	 * Payment of goods or services which are not refundable, for instance low
	 * cost airline tickets.
	 */
	public static final MMCode NonRefundable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			definition = "Payment of goods or services which are not refundable, for instance low cost airline tickets.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "NRFD";
		}
	};
	/**
	 * Instant transaction
	 */
	public static final MMCode Instant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			definition = "Instant transaction";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Credit adjustment to a previous transaction.
	 */
	public static final MMCode CreditAdjustement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAdjustement";
			definition = "Credit adjustment to a previous transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CADJ";
		}
	};
	/**
	 * Debit adjustment to a previous transaction.
	 */
	public static final MMCode DebitAdjustement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAdjustement";
			definition = "Debit adjustment to a previous transaction.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "DADJ";
		}
	};
	/**
	 * Creation of an X.509 certificate with the public key and the information
	 * of the owner of the asymmetric key provided by the requestor.
	 */
	public static final MMCode CreateCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateCertificate";
			definition = "Creation of an X.509 certificate with the public key and the information of the owner of the asymmetric key provided by the requestor.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTC";
		}
	};
	/**
	 * Renewal of an X.509 certificate, protected by the certificate to renew.
	 */
	public static final MMCode RenewCerificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenewCerificate";
			definition = "Renewal of an X.509 certificate, protected by the certificate to renew.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTR";
		}
	};
	/**
	 * Revocation of an active X.509 certificate.
	 */
	public static final MMCode RevokeCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevokeCertificate";
			definition = "Revocation of an active X.509 certificate.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "CRTK";
		}
	};
	/**
	 * Add a POI in the white list of the terminal manager.
	 */
	public static final MMCode AddWhiteList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddWhiteList";
			definition = "Add a POI in the white list of the terminal manager.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "WLSA";
		}
	};
	/**
	 * Remove a POI from the white list of the terminal manager.
	 */
	public static final MMCode RemoveWhiteList = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveWhiteList";
			definition = "Remove a POI from the white list of the terminal manager.";
			owner_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			codeName = "WLSR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAFT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceTypeCode";
				definition = "Service provided by a card payment transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransfer, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashBack,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashAdvance, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Loading, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Refund, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.QuasiCash,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Balance, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINChange,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ValidityCheck, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Instalment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Loyalty,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NoShow, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PurchaseCorporate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RecurringPayment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.SolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UnsolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.VoiceAuthorisation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.InitialReservation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.UpdateReservation,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PaymentReservation, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AdditionalPayment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.FirstRecurring, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.FollowingRecurring,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PersonToBusiness, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PersonToPerson,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AcceptorInstalment, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.IssuerInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Unloading, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransferPush,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CardsFundTransferPull, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CashWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PINUnblock, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ChosenWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.PreAuthorisedWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.ProfileWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.StandardWithdrawal, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferCardBillPayment,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFromCash, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFromCheque,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferFundsDisbursementGeneral, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferGovernmentDisbursement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferMerchantDisbursement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.TransferPayrollPensionDisbursement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.NonRefundable, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.Instant,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CreditAdjustement, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.DebitAdjustement,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.CreateCertificate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RenewCerificate,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RevokeCertificate, com.tools20022.repository.codeset.CardPaymentServiceTypeCode.AddWhiteList,
						com.tools20022.repository.codeset.CardPaymentServiceTypeCode.RemoveWhiteList);
			}
		});
		return mmObject_lazy.get();
	}
}
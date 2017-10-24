package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash settlement date is not recognised or is invalid.
 */
public class RejectedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash settlement date is not recognised or is invalid.
	 */
	public static final MMCode SettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Cash settlement date is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Acquisition date is not recognised or is invalid.
	 */
	public static final MMCode AcquisitionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcquisitionDate";
			definition = "Acquisition date is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IAQD";
		}
	};
	/**
	 * Order contains funds that have different valuation points.
	 */
	public static final MMCode DifferentValuationPoints = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DifferentValuationPoints";
			definition = "Order contains funds that have different valuation points.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "POIN";
		}
	};
	/**
	 * Delivering agent is not recognised or is invalid.
	 */
	public static final MMCode DeliveringAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Direct debit account identification is not recognised or is invalid.
	 */
	public static final MMCode DirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebit";
			definition = "Direct debit account identification is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IDDB";
		}
	};
	/**
	 * Intermediary is not recognised or is invalid.
	 */
	public static final MMCode Intermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Investment account identification is not recognised or is invalid.
	 */
	public static final MMCode InvestmentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account identification is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Payment card details are incorrect.
	 */
	public static final MMCode PaymentCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCard";
			definition = "Payment card details are incorrect.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IPAY";
		}
	};
	/**
	 * Credit transfer details are incorrect.
	 */
	public static final MMCode InvalidCreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidCreditTransfer";
			definition = "Credit transfer details are incorrect.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICTR";
		}
	};
	/**
	 * Place of settlement is not recognised or is invalid.
	 */
	public static final MMCode SettlementPlace = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPlace";
			definition = "Place of settlement is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 */
	public static final MMCode ReceivingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Safekeeping place is not recognised or is invalid.
	 */
	public static final MMCode SafekeepingPlace = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISAF";
		}
	};
	/**
	 * Form of the security is wrong, eg, the form of security is registered not
	 * bearer or vice versa.
	 */
	public static final MMCode InvalidSecurityForm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidSecurityForm";
			definition = "Form of the security is wrong, eg, the form of security is registered not bearer or vice versa.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Identification of the security is not recognised or is invalid.
	 */
	public static final MMCode FinancialInstrumentIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the security is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Investment account is blocked due to a corporate action.
	 */
	public static final MMCode AccountBlockedForCorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForCorporateAction";
			definition = "Investment account is blocked due to a corporate action.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BLCA";
		}
	};
	/**
	 * Investment account is blocked due to a transfer out of investment funds.
	 */
	public static final MMCode AccountBlockedForTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedForTransfer";
			definition = "Investment account is blocked due to a transfer out of investment funds.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BLTR";
		}
	};
	/**
	 * Investment account is blocked until certain legal proceedings are
	 * completed, eg, legal documents from the successor, legal proceedings due
	 * to bankruptcy.
	 */
	public static final MMCode AccountBlockedMissingDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlockedMissingDocuments";
			definition = "Investment account is blocked until certain legal proceedings are completed, eg, legal documents from the successor, legal proceedings due to bankruptcy.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * There is not enough cash in the account to process the instruction.
	 */
	public static final MMCode NotEnoughCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEnoughCash";
			definition = "There is not enough cash in the account to process the instruction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * There are not enough securities in the account to process the
	 * instruction.
	 */
	public static final MMCode NotEnoughFinancialInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEnoughFinancialInstrument";
			definition = "There are not enough securities in the account to process the instruction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Identification of the security and the security name are not the same.
	 */
	public static final MMCode FinancialInstrumentIdentificationAndName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			definition = "Identification of the security and the security name are not the same.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IDNA";
		}
	};
	/**
	 * Percentage of commission waiving exceeds the commission percentage or
	 * commission amount.
	 */
	public static final MMCode UnacceptedCommissionWaiving = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnacceptedCommissionWaiving";
			definition = "Percentage of commission waiving exceeds the commission percentage or commission amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UWAI";
		}
	};
	/**
	 * Deal currency is not supported.
	 */
	public static final MMCode UnacceptedDealCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnacceptedDealCurrency";
			definition = "Deal currency is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UDCY";
		}
	};
	/**
	 * Net asset value currency is not supported.
	 */
	public static final MMCode UnacceptedNAVCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnacceptedNAVCurrency";
			definition = "Net asset value currency is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UNAV";
		}
	};
	/**
	 * Payment method, eg, cheque or payment card, is not accepted.
	 */
	public static final MMCode UnacceptedPaymentMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnacceptedPaymentMethod";
			definition = "Payment method, eg, cheque or payment card, is not accepted.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Settlement currency requested is not supported.
	 */
	public static final MMCode UnacceptedRequestedSettlementCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			definition = "Settlement currency requested is not supported.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "URSC";
		}
	};
	/**
	 * Quantity of units or amount of money in the order is too high for a
	 * subscription.
	 */
	public static final MMCode TooHighUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too high for a subscription.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SHIG";
		}
	};
	/**
	 * Quantity of units or amount of money in the order is too low for a
	 * subscription.
	 */
	public static final MMCode TooLowUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			definition = "Quantity of units or amount of money in the order is too low for a subscription.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SLOW";
		}
	};
	/**
	 * Linked reference is not known.
	 */
	public static final MMCode UnknownLinkagesReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownLinkagesReference";
			definition = "Linked reference is not known.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Order contains physical delivery details but the fund can not be
	 * physically delivered.
	 */
	public static final MMCode PhysicalDeliveryImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryImpossible";
			definition = "Order contains physical delivery details but the fund can not be physically delivered.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DLVY";
		}
	};
	/**
	 * Order reference is a duplicate of a previously received order.
	 */
	public static final MMCode DuplicateOrderReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateOrderReference";
			definition = "Order reference is a duplicate of a previously received order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ORRF";
		}
	};
	/**
	 * Instructing party is not allowed to instruct for this investment account.
	 */
	public static final MMCode InstructingPartyNotAllowedForAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			definition = "Instructing party is not allowed to instruct for this investment account.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IPAC";
		}
	};
	/**
	 * Order type is invalid.
	 */
	public static final MMCode InvalidOrderType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidOrderType";
			definition = "Order type is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IOTP";
		}
	};
	/**
	 * Instruction is not compliant with the service level agreement.
	 */
	public static final MMCode NotCompliantWithSLA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotCompliantWithSLA";
			definition = "Instruction is not compliant with the service level agreement.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NSLA";
		}
	};
	/**
	 * Instruction has been received after the cut-off time.
	 */
	public static final MMCode CutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CutOffTime";
			definition = "Instruction has been received after the cut-off time.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CUTO";
		}
	};
	/**
	 * Request contains an invalid or unrecognised business reference.
	 */
	public static final MMCode InvalidOrUnrecognisedReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidOrUnrecognisedReference";
			definition = "Request contains an invalid or unrecognised business reference.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Instructing party is not allowed to ask for a status for that specific
	 * order.
	 */
	public static final MMCode NotAllowedRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAllowedRequest";
			definition = "Instructing party is not allowed to ask for a status for that specific order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NALO";
		}
	};
	/**
	 * Order is already executed and confirmation has been sent.
	 */
	public static final MMCode AlreadyExecuted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Order is already executed and confirmation has been sent.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Instructing party is not allowed to request a cancellation.
	 */
	public static final MMCode NotAllowedToCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAllowedToCancel";
			definition = "Instructing party is not allowed to request a cancellation.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NALC";
		}
	};
	/**
	 * Legally impossible to cancel.
	 */
	public static final MMCode LegallyImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegallyImpossible";
			definition = "Legally impossible to cancel.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LEGL";
		}
	};
	/**
	 * Another reason for the status rejected.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status rejected.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Financial instrument quantity is invalid.
	 */
	public static final MMCode FinancialInstrumentQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Financial instrument quantity is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Certificate number is not recognised or is invalid.
	 */
	public static final MMCode CertificateNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateNumber";
			definition = "Certificate number is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ICTN";
		}
	};
	/**
	 * One or several settlement parties are not recognised or are invalid.
	 */
	public static final MMCode SettlementParties = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementParties";
			definition = "One or several settlement parties are not recognised or are invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISTP";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 */
	public static final MMCode TooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Instruction was received after the Receiver's deadline.
	 */
	public static final MMCode AfterDeadline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			definition = "Instruction was received after the Receiver's deadline.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Unrecognised or invalid trade date or requested trade date or future
	 * trade date.
	 */
	public static final MMCode TradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 */
	public static final MMCode FeeOrCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeOrCommission";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Unrecognised or invalid subscriber or redeemer.
	 */
	public static final MMCode SubscriberOrRedeemer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			definition = "Unrecognised or invalid subscriber or redeemer.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Unrecognised or invalid Settlement Amount Currency.
	 */
	public static final MMCode SettlementAmountCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			definition = "Unrecognised or invalid Settlement Amount Currency.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Physical Settlement Impossible.
	 */
	public static final MMCode PhysicalSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Physical Settlement Impossible.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Unrecognised or invalid Place of Trade.
	 */
	public static final MMCode PlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid Place of Trade.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Unrecognised or invalid Settlement Transaction.
	 */
	public static final MMCode SettlementTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Unrecognised or invalid Settlement Transaction.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Impossible to use RTGS System.
	 */
	public static final MMCode RTGSSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			definition = "Impossible to use RTGS System.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * The cancellation request has been rejected since more than one
	 * instruction match to the cancellation criteria.
	 */
	public static final MMCode NoCancellationMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			definition = "The cancellation request has been rejected since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Investor name and address is not recognised.
	 */
	public static final MMCode InvestorNameAddressUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * Investor data is insufficient. Applicable when the mandated market
	 * practice is not followed.
	 */
	public static final MMCode InsufficientInvestorData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientInvestorData";
			definition = "Investor data is insufficient. Applicable when the mandated market practice is not followed.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Account servicer is not recognised or is invalid.
	 */
	public static final MMCode InvalidAccountServicer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccountServicer";
			definition = "Account servicer is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * Nominee account is not recognised or is invalid.
	 */
	public static final MMCode InvalidNomineeAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNomineeAccount";
			definition = "Nominee account is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * New plan manager is not recognised or is invalid.
	 */
	public static final MMCode InvalidNewPlanManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNewPlanManager";
			definition = "New plan manager is not recognised or is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INPM";
		}
	};
	/**
	 * Partial transfer of current year is not allowed, ie, it is not possible
	 * to transfer one asset for the current year as other assets are held for
	 * the current year.
	 */
	public static final MMCode CurrentYearPartial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPartial";
			definition = "Partial transfer of current year is not allowed, ie, it is not possible to transfer one asset for the current year as other assets are held for the current year.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CYPA";
		}
	};
	/**
	 * Partial transfer is not supported. Applicable when tax years are rolled
	 * up and because, for example, a transfer request for tax year 2000 only is
	 * received, it is not possible to process the transfer as the investor
	 * holds other tax years as well.
	 */
	public static final MMCode PartialNotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialNotSupported";
			definition = "Partial transfer is not supported. Applicable when tax years are rolled up and because, for example, a transfer request for tax year 2000 only is received, it is not possible to process the transfer as the investor holds other tax years as well.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PTNS";
		}
	};
	/**
	 * Financial instrument is not valid for the requested tax year.
	 */
	public static final MMCode FinancialInstrumentTaxYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentTaxYear";
			definition = "Financial instrument is not valid for the requested tax year.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "FTAX";
		}
	};
	/**
	 * ISA type is not recognised or invalid.
	 */
	public static final MMCode InvalidISAType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidISAType";
			definition = "ISA type is not recognised or invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ISAT";
		}
	};
	/**
	 * Cash account is not recognised or invalid.
	 */
	public static final MMCode InvalidCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCashAccount";
			definition = "Cash account is not recognised or invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transfer reference is a duplicate of a previously received transfer.
	 */
	public static final MMCode DuplicateTransferReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransferReference";
			definition = "Transfer reference is a duplicate of a previously received transfer.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "TREF";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 */
	public static final MMCode InvalidSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSettlementAmount";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Unrecognised or invalid ordered amount.
	 */
	public static final MMCode InvalidOrderedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderedAmount";
			definition = "Unrecognised or invalid ordered amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Amount of subscription is below the minimum initial investment amount.
	 */
	public static final MMCode BelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			definition = "Amount of subscription is below the minimum initial investment amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Amount of subscription is below the minimum top-up investment.
	 */
	public static final MMCode BelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			definition = "Amount of subscription is below the minimum top-up investment.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMTO";
		}
	};
	/**
	 * Insufficient capacity.
	 */
	public static final MMCode InsufficientCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			definition = "Insufficient capacity.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Percentage holding breach, eg, PPM rules; taxation rules (ERISA).
	 */
	public static final MMCode PercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			definition = "Percentage holding breach, eg, PPM rules; taxation rules (ERISA).";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Amount is below the minimum redemption amount.
	 */
	public static final MMCode BelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			definition = "Amount is below the minimum redemption amount.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMRA";
		}
	};
	/**
	 * Holding will be below the minimum retained value.
	 */
	public static final MMCode BelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			definition = "Holding will be below the minimum retained value.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "BMRV";
		}
	};
	/**
	 * Lock-up period is in place.
	 */
	public static final MMCode LockUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			definition = "Lock-up period is in place.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "LOCK";
		}
	};
	/**
	 * Assets are illiquid.
	 */
	public static final MMCode AssetsIlliquid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			definition = "Assets are illiquid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "ILLI";
		}
	};
	/**
	 * Data in the order is invalid.
	 */
	public static final MMCode DataInvalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataInvalid";
			definition = "Data in the order is invalid.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "DINV";
		}
	};
	/**
	 * Fund is closed and will not take in any more investments.
	 */
	public static final MMCode FundClosed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			definition = "Fund is closed and will not take in any more investments.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Instruction specifies an unacceptable combination for the financial
	 * instruments in the switch order.
	 */
	public static final MMCode UnacceptableSwitchCombination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableSwitchCombination";
			definition = "Instruction specifies an unacceptable combination for the financial instruments in the switch order.";
			owner_lazy = () -> RejectedStatusReasonCode.mmObject();
			codeName = "UNSC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DDAT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReasonCode";
				definition = "Cash settlement date is not recognised or is invalid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementDate, com.tools20022.repository.codeset.RejectedStatusReasonCode.AcquisitionDate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DifferentValuationPoints, com.tools20022.repository.codeset.RejectedStatusReasonCode.DeliveringAgent,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DirectDebit, com.tools20022.repository.codeset.RejectedStatusReasonCode.Intermediary,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvestmentAccount, com.tools20022.repository.codeset.RejectedStatusReasonCode.PaymentCard,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidCreditTransfer, com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementPlace,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.ReceivingAgent, com.tools20022.repository.codeset.RejectedStatusReasonCode.SafekeepingPlace,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidSecurityForm, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentIdentification,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedForCorporateAction, com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedForTransfer,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AccountBlockedMissingDocuments, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotEnoughCash,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.NotEnoughFinancialInstrument, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedCommissionWaiving, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedDealCurrency,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedNAVCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedPaymentMethod,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptedRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.TooHighUnitsOrAmountToSubscribe,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.TooLowUnitsOrAmountToSubscribe, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PhysicalDeliveryImpossible, com.tools20022.repository.codeset.RejectedStatusReasonCode.DuplicateOrderReference,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InstructingPartyNotAllowedForAccount, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrderType,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedStatusReasonCode.CutOffTime,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrUnrecognisedReference, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotAllowedRequest,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AlreadyExecuted, com.tools20022.repository.codeset.RejectedStatusReasonCode.NotAllowedToCancel,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.LegallyImpossible, com.tools20022.repository.codeset.RejectedStatusReasonCode.Other,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentQuantity, com.tools20022.repository.codeset.RejectedStatusReasonCode.CertificateNumber,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementParties, com.tools20022.repository.codeset.RejectedStatusReasonCode.TooLate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AfterDeadline, com.tools20022.repository.codeset.RejectedStatusReasonCode.TradeDate,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FeeOrCommission, com.tools20022.repository.codeset.RejectedStatusReasonCode.SubscriberOrRedeemer,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementAmountCurrency, com.tools20022.repository.codeset.RejectedStatusReasonCode.PhysicalSettlement,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PlaceOfTrade, com.tools20022.repository.codeset.RejectedStatusReasonCode.SettlementTransaction,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.RTGSSystem, com.tools20022.repository.codeset.RejectedStatusReasonCode.NoCancellationMatch,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectedStatusReasonCode.InsufficientInvestorData,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidAccountServicer, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidNomineeAccount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidNewPlanManager, com.tools20022.repository.codeset.RejectedStatusReasonCode.CurrentYearPartial,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PartialNotSupported, com.tools20022.repository.codeset.RejectedStatusReasonCode.FinancialInstrumentTaxYear,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidISAType, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidCashAccount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.DuplicateTransferReference, com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidSettlementAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.InvalidOrderedAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumTopUpAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.InsufficientCapacity,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.PercentageHoldingBreach, com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumRedemptionAmount,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.BelowMinimumRetainedAmount, com.tools20022.repository.codeset.RejectedStatusReasonCode.LockUp,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.AssetsIlliquid, com.tools20022.repository.codeset.RejectedStatusReasonCode.DataInvalid,
						com.tools20022.repository.codeset.RejectedStatusReasonCode.FundClosed, com.tools20022.repository.codeset.RejectedStatusReasonCode.UnacceptableSwitchCombination);
			}
		});
		return mmObject_lazy.get();
	}
}
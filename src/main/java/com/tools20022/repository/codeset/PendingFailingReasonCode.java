package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction/instruction is pending or failing
 * settlement. Settlement on the instructed settlement date is still possible,
 * status is pending. Settlement on the instructed settlement date is no longer
 * possible, status is failing.
 */
public class PendingFailingReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments are delivered, but still awaiting money from
	 * counterparty.
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			definition = "Financial instruments are delivered, but still awaiting money from counterparty.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Instruction was received after the account servicer's deadline. Processed
	 * on best effort basis.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Instruction was received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Tax reclaim has been sent to the tax authorities.
	 */
	public static final MMCode SentToTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToTaxAuthorities";
			definition = "Tax reclaim has been sent to the tax authorities.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Awaiting financial instruments from a corporate action or other
	 * procedure, for example, conversion, dematerialisation, exchange,
	 * registration, stamping, splitting.
	 */
	public static final MMCode AwaitingSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting financial instruments from a corporate action or other procedure, for example, conversion, dematerialisation, exchange, registration, stamping, splitting.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Instruction has been refused or not recognised and is represented
	 * automatically.
	 */
	public static final MMCode InstructionRefusedOrNotRecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction has been refused or not recognised and is represented automatically.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Financial instruments have not yet been received from the counterparty
	 * (if receive against payment trade), the money has been delivered.
	 */
	public static final MMCode AwaitingSecuritiesFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			definition = "Financial instruments have not yet been received from the counterparty (if receive against payment trade), the money has been delivered.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Settlement is physical. Financial instruments are being delivered.
	 */
	public static final MMCode PhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical. Financial instruments are being delivered.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Trade is being amended in the market.
	 */
	public static final MMCode TradeAmendedInMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "TAMM";
		}
	};
	/**
	 * Awaiting documents or endorsements from you.
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromYou = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Awaiting documents or endorsements from counterparty.
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from counterparty.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Your account is blocked, no instruction can settle over the account.
	 */
	public static final MMCode AccountBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * A chaser/enquiry has been sent.
	 */
	public static final MMCode EnquirySent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			definition = "A chaser/enquiry has been sent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Financial instrument is a new issue and not yet available/tradable.
	 */
	public static final MMCode NewIssues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			definition = "Financial instrument is a new issue and not yet available/tradable.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NEWI";
		}
	};
	/**
	 * Insufficient deliverable financial instruments in counterparty's account
	 * or counterparty does not hold financial instruments.
	 */
	public static final MMCode CounterpartyInsufficientSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable financial instruments in counterparty's account or counterparty does not hold financial instruments.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CLAC";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 */
	public static final MMCode MultipleSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Settlement cannot be executed; financial instruments are in global form.
	 */
	public static final MMCode GlobalFormSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed; financial instruments are in global form.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Your instruction is a preadvice, that is, for matching only.
	 */
	public static final MMCode YourInstructionOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			definition = "Your instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Guaranteed delivery indicator differs in the counterparty's instruction.
	 */
	public static final MMCode GuaranteedDeliveryIndicatorDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Trade will settle in partials.
	 */
	public static final MMCode TradeSettlesInPartials = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Instruction has not been matched; matching process is not required.
	 */
	public static final MMCode NoMatchingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched; matching process is not required.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Insufficient money in counterparty's account.
	 */
	public static final MMCode CounterpartyInsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in counterparty's account.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CMON";
		}
	};
	/**
	 * Insufficient collateral in your account to execute the instruction.
	 */
	public static final MMCode CollateralShortage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			definition = "Insufficient collateral in your account to execute the instruction.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Financial instruments are not deliverable as they are pledged as
	 * collateral.
	 */
	public static final MMCode SecuritiesPledgedAsCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Financial instruments are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuing of depositary receipts has been
	 * refused. The allotment granted by the issuer is exceeded by your
	 * transaction.
	 */
	public static final MMCode RefusedDepositForIssueOfDepositaryReceipts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment granted by the issuer is exceeded by your transaction.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable financial instruments in your account as maximum
	 * foreign limit has been reached.
	 */
	public static final MMCode MaximumForeignLimitReached = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable financial instruments in your account as maximum foreign limit has been reached.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * A foreign exchange instruction from you is missing.
	 */
	public static final MMCode NoForeignExchangeInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "A foreign exchange instruction from you is missing.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Financial instruments require income adjustment, for example, dividend or
	 * interest.
	 */
	public static final MMCode IncomeAdjustementRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Financial instruments require income adjustment, for example, dividend or interest.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Your instruction is pending settlement because the instruction linked to
	 * it is pending.
	 */
	public static final MMCode PendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * Awaiting settlement date. No settlement problems to be reported.
	 */
	public static final MMCode AwaitingSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Awaiting settlement date. No settlement problems to be reported.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Insufficient financial instruments in your account.
	 */
	public static final MMCode LackOfSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient financial instruments in your account.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Financial instruments are out on loan.
	 */
	public static final MMCode SecuritiesLoanedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Financial instruments are out on loan.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LALO";
		}
	};
	/**
	 * Insufficient money in your account.
	 */
	public static final MMCode InsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Confirmation of settlement has not yet been received.
	 */
	public static final MMCode ConfirmationNotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Confirmation of settlement has not yet been received.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Delivery/receipt was refused because physical financial instruments are
	 * not in good order.
	 */
	public static final MMCode NotInGoodOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt was refused because physical financial instruments are not in good order.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Stamp duty information is missing.
	 */
	public static final MMCode LackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Stamp duty information is missing.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, for example,
	 * daytime/real-time versus overnight.
	 */
	public static final MMCode ProcessingBatchDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, for example, daytime/real-time versus overnight.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Your instruction is confirmed in the local market or is ready for
	 * settlement, awaiting next settlement cycle.
	 */
	public static final MMCode AwaitingNextSettlementCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Your instruction is confirmed in the local market or is ready for settlement, awaiting next settlement cycle.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Financial instruments are blocked due to a corporate action event,
	 * realignment, etc.
	 */
	public static final MMCode SecuritiesBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Financial instruments are blocked due to a corporate action event, realignment, etc.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty is in receivership (form of bankruptcy where a court
	 * appointed person - the receiver - manages the affairs of the business).
	 */
	public static final MMCode CounterpartyInReceivership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership (form of bankruptcy where a court appointed person - the receiver - manages the affairs of the business).";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 */
	public static final MMCode MinimumSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Payment is pending, and does not settle because the actual use of the
	 * risk management limit on the counterpart (bilateral limit) prevents
	 * settlement.
	 */
	public static final MMCode PendingCAP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PCAP";
		}
	};
	/**
	 * Pending reason being investigated.
	 */
	public static final MMCode StatusReasonInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason being investigated.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "IAAD";
		}
	};
	/**
	 * Other. See Narrative.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Physical financial instruments have been received and are being checked
	 * for authenticity.
	 */
	public static final MMCode PhysicalSecuritiesVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical financial instruments have been received and are being checked for authenticity.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PHCK";
		}
	};
	/**
	 * Information, for example, telephone number, contact person, is missing.
	 */
	public static final MMCode MissingInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MINF";
		}
	};
	/**
	 * Account must already be opened in order to process the transfer.
	 */
	public static final MMCode AccountNotOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			definition = "Account must already be opened in order to process the transfer.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ACOP";
		}
	};
	/**
	 * Intermediary is investigating the reason why the transfer is pending.
	 */
	public static final MMCode UnderInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			definition = "Intermediary is investigating the reason why the transfer is pending.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "IINV";
		}
	};
	/**
	 * Client has been informed of a problem and is investigating.
	 */
	public static final MMCode UnderClientInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			definition = "Client has been informed of a problem and is investigating.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CINV";
		}
	};
	/**
	 * Transfer agent is investigating.
	 */
	public static final MMCode UnderTransferAgentInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			definition = "Transfer agent is investigating.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "AINV";
		}
	};
	/**
	 * Transfer is being processed by the transfer agent, awaiting status from
	 * transfer agent.
	 */
	public static final MMCode AwaitingTransferAgentStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			definition = "Transfer is being processed by the transfer agent, awaiting status from transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "WTRF";
		}
	};
	/**
	 * Usual transfer agent's processing timeframe.
	 */
	public static final MMCode UsualTransactionTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			definition = "Usual transfer agent's processing timeframe.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "USUA";
		}
	};
	/**
	 * At your request, the Intermediary is checking the status of your
	 * instruction with the transfer agent.
	 */
	public static final MMCode AwaitingStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			definition = "At your request, the Intermediary is checking the status of your instruction with the transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ASTA";
		}
	};
	/**
	 * Application form has been sent to the transfer agent.
	 */
	public static final MMCode ApplicationFormSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			definition = "Application form has been sent to the transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "AFST";
		}
	};
	/**
	 * Stock transfer form has been sent to the counterparty to sign and forward
	 * to the transfer agent.
	 */
	public static final MMCode StockTransferFormSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			definition = "Stock transfer form has been sent to the counterparty to sign and forward to the transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "STST";
		}
	};
	/**
	 * Longer processing timeframe for this type of transfer, due to
	 * documentation requirements.
	 */
	public static final MMCode LongerProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			definition = "Longer processing timeframe for this type of transfer, due to documentation requirements.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LPRO";
		}
	};
	/**
	 * Additional documents have been requested by the transfer agent.
	 */
	public static final MMCode AdditionalDocumentsRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			definition = "Additional documents have been requested by the transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ADRQ";
		}
	};
	/**
	 * Additional documents have been sent.
	 */
	public static final MMCode AdditionalDocumentsSent1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			definition = "Additional documents have been sent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ADS1";
		}
	};
	/**
	 * Upon request of the transfer agent, the intermediary has sent additional
	 * documents. The transfer agent has confirmed that all the necessary
	 * information is now in place.
	 */
	public static final MMCode AdditionalDocumentsSent2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			definition = "Upon request of the transfer agent, the intermediary has sent additional documents. The transfer agent has confirmed that all the necessary information is now in place.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ADS2";
		}
	};
	/**
	 * Documents are rejected by the transfer agent.
	 */
	public static final MMCode DocumentsRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			definition = "Documents are rejected by the transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DRJC";
		}
	};
	/**
	 * Counterparty has not sent an instruction to receive. Check with
	 * counterparty.
	 */
	public static final MMCode AwaitingCounterpartyReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instruction to receive. Check with counterparty.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CYIN";
		}
	};
	/**
	 * Counterparty has not sent an instruction to deliver or delivered the
	 * shares. Check with counterparty.
	 */
	public static final MMCode AwaitingCounterpartyDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			definition = "Counterparty has not sent an instruction to deliver or delivered the shares. Check with counterparty.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CYDV";
		}
	};
	/**
	 * The instructed position exceeds the eligible balance.
	 */
	public static final MMCode NormalProcessingPeriodLapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "The instructed position exceeds the eligible balance.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Wrong counterparty account details.
	 */
	public static final MMCode WrongCounterpartyAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			definition = "Wrong counterparty account details.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "WCPA";
		}
	};
	/**
	 * Transfer is being processed by transfer agent.
	 */
	public static final MMCode TransferAgentProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			definition = "Transfer is being processed by transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "TAPR";
		}
	};
	/**
	 * Confirmation is expected from transfer agent.
	 */
	public static final MMCode ExpectedConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			definition = "Confirmation is expected from transfer agent.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "XCNF";
		}
	};
	/**
	 * Special follow-up is taking place.
	 */
	public static final MMCode Escalation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			definition = "Special follow-up is taking place.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "ESCA";
		}
	};
	/**
	 * Transfer agent claims non-receipt of physical shares.
	 */
	public static final MMCode TransferAgentNonReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			definition = "Transfer agent claims non-receipt of physical shares.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NRCP";
		}
	};
	/**
	 * Confirmed but finality is to be verified.
	 */
	public static final MMCode FinalVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			definition = "Confirmed but finality is to be verified.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "FVER";
		}
	};
	/**
	 * Disagreement in beneficial ownership.
	 */
	public static final MMCode BeneficialOwnershipDisagreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			definition = "Disagreement in beneficial ownership.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BENO";
		}
	};
	/**
	 * Counterparty's instruction and your instruction are on hold/frozen/ in a
	 * preadvice mode.
	 */
	public static final MMCode BothInstructionsOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			definition = "Counterparty's instruction and your instruction are on hold/frozen/ in a preadvice mode.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BOTH";
		}
	};
	/**
	 * Instructed settlement date does not agree with the settlement date on the
	 * clearing house trade, that is, a specific type of trade in India.
	 */
	public static final MMCode ClearingHouseTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			definition = "Instructed settlement date does not agree with the settlement date on the clearing house trade, that is, a specific type of trade in India.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CLHT";
		}
	};
	/**
	 * Prior payment credited to account based contractual income collection
	 * agreement has been collected from issuer.
	 */
	public static final MMCode ConfirmationOfPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			definition = "Prior payment credited to account based contractual income collection agreement has been collected from issuer.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PCNF";
		}
	};
	/**
	 * Quantity instructed does not match the denomination
	 * available/deliverable. Physical securities need to be obtained in
	 * deliverable denominated quantities.
	 */
	public static final MMCode UnavailableDeliverableDenominatedQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			definition = "Quantity instructed does not match the denomination available/deliverable. Physical securities need to be obtained in deliverable denominated quantities.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DENO";
		}
	};
	/**
	 * Exceptional closing of all financial institutions due to natural
	 * disaster, for example, earthquake.
	 */
	public static final MMCode NaturalDisaster = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			definition = "Exceptional closing of all financial institutions due to natural disaster, for example, earthquake.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Counterparty has returned or refuses the securities.
	 */
	public static final MMCode CounterpartyReturnedShares = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			definition = "Counterparty has returned or refuses the securities.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DKNY";
		}
	};
	/**
	 * Quantity of financial instruments does not match.
	 */
	public static final MMCode QuantityDisagreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDisagreement";
			definition = "Quantity of financial instruments does not match.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Financial instruments are blocked at the Central Security Depository
	 * (CSD) following a corporate event.
	 */
	public static final MMCode SecuritiesFrozenAtCSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			definition = "Financial instruments are blocked at the Central Security Depository (CSD) following a corporate event.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "FROZ";
		}
	};
	/**
	 * Awaiting settlement of a purchase to cover failing positions.
	 */
	public static final MMCode AwaitingOtherTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			definition = "Awaiting settlement of a purchase to cover failing positions.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LAAW";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Central bank liquidity is insufficient.
	 */
	public static final MMCode InsufficientCentralBankLiquidity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			definition = "Central bank liquidity is insufficient.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Awaiting receipt of adequate certification.
	 */
	public static final MMCode MissingCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Awaiting receipt of adequate certification.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Payment has not been made by issuer.
	 */
	public static final MMCode NoPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPayment";
			definition = "Payment has not been made by issuer.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NPAY";
		}
	};
	/**
	 * Financial instruments have not been delivered by the issuer.
	 */
	public static final MMCode NotDelivered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDelivered";
			definition = "Financial instruments have not been delivered by the issuer.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NSEC";
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
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Counterparty's instruction is a preadvice, that is, for matching only.
	 */
	public static final MMCode CounterpartyInstructionOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			definition = "Counterparty's instruction is a preadvice, that is, for matching only.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PRCY";
		}
	};
	/**
	 * Certificates have been lodged with the registrar but rejected due to
	 * incomplete documentation or foreign ownership limitation reached.
	 */
	public static final MMCode CertificatesRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			definition = "Certificates have been lodged with the registrar but rejected due to incomplete documentation or foreign ownership limitation reached.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "REGT";
		}
	};
	/**
	 * Settlement system/method has been modified at central securities
	 * depository to allow settlement.
	 */
	public static final MMCode SettlementSystemMethodModified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			definition = "Settlement system/method has been modified at central securities depository to allow settlement.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * For tax reclaim, the event is pending, the tax reclaim is valid for the
	 * tax authorities.
	 */
	public static final MMCode ValidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidForTaxAuthorities";
			definition = "For tax reclaim, the event is pending, the tax reclaim is valid for the tax authorities.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "VLDA";
		}
	};
	/**
	 * Buy-in procedure has started on the market (on your behalf if your
	 * instruction is a receipt, by the counterparty if your instruction is a
	 * delivery).
	 */
	public static final MMCode BuyInProcedure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInProcedure";
			definition = "Buy-in procedure has started on the market (on your behalf if your instruction is a receipt, by the counterparty if your instruction is a delivery).";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BYIY";
		}
	};
	/**
	 * Instruction was in suspense. Suspense period is finished so your
	 * cancellation or confirmation of instruction is required.
	 */
	public static final MMCode CancellationConfirmationRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationConfirmationRequested";
			definition = "Instruction was in suspense. Suspense period is finished so your cancellation or confirmation of instruction is required.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CANR";
		}
	};
	/**
	 * Certificate number error.
	 */
	public static final MMCode WrongCertificatesNumbers = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			definition = "Certificate number error.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Financial instruments are stolen, in dispute, under objection etc.
	 */
	public static final MMCode UnderObjection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderObjection";
			definition = "Financial instruments are stolen, in dispute, under objection etc.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "OBJT";
		}
	};
	/**
	 * Discrepancy in the settlement confirmation.
	 */
	public static final MMCode ConfirmationDiscrepency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDiscrepency";
			definition = "Discrepancy in the settlement confirmation.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "STCD";
		}
	};
	/**
	 * Counterparty's instruction was too late for settlement, that is the
	 * matching or settlement problems was solved too late.
	 */
	public static final MMCode CounterpartyTooLateForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			definition = "Counterparty's instruction was too late for settlement, that is the matching or settlement problems was solved too late.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Covering money/financial instruments were received too late for
	 * completing settlement on a same day basis.
	 */
	public static final MMCode MoneySecuritiesTooLateForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneySecuritiesTooLateForSettlement";
			definition = "Covering money/financial instruments were received too late for completing settlement on a same day basis.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "MLAT";
		}
	};
	/**
	 * Next process is launched. No processing pending problems to be reported.
	 */
	public static final MMCode NextProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextProcess";
			definition = "Next process is launched. No processing pending problems to be reported.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "NEXT";
		}
	};
	/**
	 * Awaiting confirmation from the counterparty.
	 */
	public static final MMCode AwaitingConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingConfirmation";
			definition = "Awaiting confirmation from the counterparty.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Transaction was put on hold/frozen by the system.
	 */
	public static final MMCode SystemOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			definition = "Transaction was put on hold/frozen by the system.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "PRSY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process of realignment at
	 * the issuer CSD.
	 */
	public static final MMCode ConditionalRealignement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is conditional to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * Execution is conditional to the execution of a process linked to the
	 * currency of the transaction.
	 */
	public static final MMCode ConditionalCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is conditional to the execution of a process linked to the currency of the transaction.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process at the registrar.
	 */
	public static final MMCode ConditionalRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is conditional to the execution of a process at the registrar.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDRG";
		}
	};
	/**
	 * Instruction has been processed and cannot be cancelled.
	 */
	public static final MMCode CancelNotPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelNotPossible";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "IPNC";
		}
	};
	/**
	 * Central securities depository sets the instruction in a
	 * hold/frozen/preadvice mode.
	 */
	public static final MMCode CSDHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CSDH";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditional delivery rules in the market infrastructure platform for
	 * conditional delivery.
	 */
	public static final MMCode ConditionalDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDEL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditions of a restriction processing type in the market infrastructure
	 * platform.
	 */
	public static final MMCode CSDValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CVAL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode. Market infrastructure
	 * platform is awaiting release.
	 */
	public static final MMCode ConditionalDeliveryAwaitingRelease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingRelease";
			definition = "Instruction is in a hold/frozen/preadvice mode. Market infrastructure platform is awaiting release.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDLR";
		}
	};
	/**
	 * Not all the instructions part of a pool have been received.
	 */
	public static final MMCode IncompleteNumberCount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			definition = "Not all the instructions part of a pool have been received.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "INBC";
		}
	};
	/**
	 * Awaiting cancellation of one of the party.
	 */
	public static final MMCode ConditionalDeliveryAwaitingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingCancellation";
			definition = "Awaiting cancellation of one of the party.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDAC";
		}
	};
	/**
	 * Conditional Delivery is still pending awaiting the cancellation from at
	 * least another party.
	 */
	public static final MMCode ConditionalDeliveryCancellationPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryCancellationPending";
			definition = "Conditional Delivery is still pending awaiting the cancellation from at least another party.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "CDLC";
		}
	};
	/**
	 * Pending receipt of beneficiary owner details.
	 */
	public static final MMCode PendingBeneficiaryOwnerDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBeneficiaryOwnerDetails";
			definition = "Pending receipt of beneficiary owner details.";
			owner_lazy = () -> PendingFailingReasonCode.mmObject();
			codeName = "BOIS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingFailingReasonCode";
				definition = "Specifies the reason the transaction/instruction is pending or failing settlement. Settlement on the instructed settlement date is still possible, status is pending. Settlement on the instructed settlement date is no longer possible, status is failing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingMoney, com.tools20022.repository.codeset.PendingFailingReasonCode.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.PendingFailingReasonCode.SentToTaxAuthorities, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonCode.InstructionRefusedOrNotRecognised, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingReasonCode.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingFailingReasonCode.TradeAmendedInMarket,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AccountBlocked, com.tools20022.repository.codeset.PendingFailingReasonCode.EnquirySent,
						com.tools20022.repository.codeset.PendingFailingReasonCode.NewIssues, com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MultipleSettlementAmount, com.tools20022.repository.codeset.PendingFailingReasonCode.GlobalFormSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonCode.YourInstructionOnHold, com.tools20022.repository.codeset.PendingFailingReasonCode.GuaranteedDeliveryIndicatorDifference,
						com.tools20022.repository.codeset.PendingFailingReasonCode.TradeSettlesInPartials, com.tools20022.repository.codeset.PendingFailingReasonCode.NoMatchingRequired,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyInsufficientMoney, com.tools20022.repository.codeset.PendingFailingReasonCode.CollateralShortage,
						com.tools20022.repository.codeset.PendingFailingReasonCode.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingFailingReasonCode.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MaximumForeignLimitReached, com.tools20022.repository.codeset.PendingFailingReasonCode.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingFailingReasonCode.IncomeAdjustementRequired, com.tools20022.repository.codeset.PendingFailingReasonCode.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingSettlementDate, com.tools20022.repository.codeset.PendingFailingReasonCode.LackOfSecurities,
						com.tools20022.repository.codeset.PendingFailingReasonCode.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingFailingReasonCode.InsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ConfirmationNotReceived, com.tools20022.repository.codeset.PendingFailingReasonCode.NotInGoodOrder,
						com.tools20022.repository.codeset.PendingFailingReasonCode.LackOfStampDutyInformation, com.tools20022.repository.codeset.PendingFailingReasonCode.ProcessingBatchDifference,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.PendingFailingReasonCode.SecuritiesBlocked,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyInReceivership, com.tools20022.repository.codeset.PendingFailingReasonCode.MinimumSettlementAmount,
						com.tools20022.repository.codeset.PendingFailingReasonCode.PendingCAP, com.tools20022.repository.codeset.PendingFailingReasonCode.StatusReasonInvestigation,
						com.tools20022.repository.codeset.PendingFailingReasonCode.Other, com.tools20022.repository.codeset.PendingFailingReasonCode.PhysicalSecuritiesVerification,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MissingInformation, com.tools20022.repository.codeset.PendingFailingReasonCode.AccountNotOpen,
						com.tools20022.repository.codeset.PendingFailingReasonCode.UnderInvestigation, com.tools20022.repository.codeset.PendingFailingReasonCode.UnderClientInvestigation,
						com.tools20022.repository.codeset.PendingFailingReasonCode.UnderTransferAgentInvestigation, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingTransferAgentStatus,
						com.tools20022.repository.codeset.PendingFailingReasonCode.UsualTransactionTime, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingStatus,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ApplicationFormSent, com.tools20022.repository.codeset.PendingFailingReasonCode.StockTransferFormSent,
						com.tools20022.repository.codeset.PendingFailingReasonCode.LongerProcessing, com.tools20022.repository.codeset.PendingFailingReasonCode.AdditionalDocumentsRequested,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AdditionalDocumentsSent1, com.tools20022.repository.codeset.PendingFailingReasonCode.AdditionalDocumentsSent2,
						com.tools20022.repository.codeset.PendingFailingReasonCode.DocumentsRejected, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingCounterpartyReceipt,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingCounterpartyDelivery, com.tools20022.repository.codeset.PendingFailingReasonCode.NormalProcessingPeriodLapsed,
						com.tools20022.repository.codeset.PendingFailingReasonCode.WrongCounterpartyAccount, com.tools20022.repository.codeset.PendingFailingReasonCode.TransferAgentProcessing,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ExpectedConfirmation, com.tools20022.repository.codeset.PendingFailingReasonCode.Escalation,
						com.tools20022.repository.codeset.PendingFailingReasonCode.TransferAgentNonReceipt, com.tools20022.repository.codeset.PendingFailingReasonCode.FinalVerification,
						com.tools20022.repository.codeset.PendingFailingReasonCode.BeneficialOwnershipDisagreement, com.tools20022.repository.codeset.PendingFailingReasonCode.BothInstructionsOnHold,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ClearingHouseTrade, com.tools20022.repository.codeset.PendingFailingReasonCode.ConfirmationOfPayment,
						com.tools20022.repository.codeset.PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.PendingFailingReasonCode.NaturalDisaster,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyReturnedShares, com.tools20022.repository.codeset.PendingFailingReasonCode.QuantityDisagreement,
						com.tools20022.repository.codeset.PendingFailingReasonCode.SecuritiesFrozenAtCSD, com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingOtherTransaction,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.PendingFailingReasonCode.InsufficientCentralBankLiquidity,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MissingCertification, com.tools20022.repository.codeset.PendingFailingReasonCode.NoPayment,
						com.tools20022.repository.codeset.PendingFailingReasonCode.NotDelivered, com.tools20022.repository.codeset.PendingFailingReasonCode.PendingReceipt,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyInstructionOnHold, com.tools20022.repository.codeset.PendingFailingReasonCode.CertificatesRejected,
						com.tools20022.repository.codeset.PendingFailingReasonCode.SettlementSystemMethodModified, com.tools20022.repository.codeset.PendingFailingReasonCode.ValidForTaxAuthorities,
						com.tools20022.repository.codeset.PendingFailingReasonCode.BuyInProcedure, com.tools20022.repository.codeset.PendingFailingReasonCode.CancellationConfirmationRequested,
						com.tools20022.repository.codeset.PendingFailingReasonCode.WrongCertificatesNumbers, com.tools20022.repository.codeset.PendingFailingReasonCode.UnderObjection,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ConfirmationDiscrepency, com.tools20022.repository.codeset.PendingFailingReasonCode.CounterpartyTooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingReasonCode.MoneySecuritiesTooLateForSettlement, com.tools20022.repository.codeset.PendingFailingReasonCode.NextProcess,
						com.tools20022.repository.codeset.PendingFailingReasonCode.AwaitingConfirmation, com.tools20022.repository.codeset.PendingFailingReasonCode.SystemOnHold,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalRealignement, com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalCurrency,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalRegistrar, com.tools20022.repository.codeset.PendingFailingReasonCode.CancelNotPossible,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CSDHold, com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalDelivery,
						com.tools20022.repository.codeset.PendingFailingReasonCode.CSDValidation, com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalDeliveryAwaitingRelease,
						com.tools20022.repository.codeset.PendingFailingReasonCode.IncompleteNumberCount, com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalDeliveryAwaitingCancellation,
						com.tools20022.repository.codeset.PendingFailingReasonCode.ConditionalDeliveryCancellationPending, com.tools20022.repository.codeset.PendingFailingReasonCode.PendingBeneficiaryOwnerDetails);
			}
		});
		return mmObject_lazy.get();
	}
}
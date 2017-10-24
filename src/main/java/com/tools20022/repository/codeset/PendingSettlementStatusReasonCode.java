package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction/instruction is pending settlement, ie,
 * pending delivery or receipt of the financial instrument. Settlement on the
 * instructed settlement date is still possible.
 */
public class PendingSettlementStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities have been delivered, but the settlement amount has not been
	 * received from the counterparty.
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Securities have been delivered, but the settlement amount has not been received from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Awaiting securities from corporate action issue or other procedures, eg,
	 * conversion, dematerialisation, exchange, registration, stamping,
	 * splitting, etc.
	 */
	public static final MMCode AwaitingSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting securities from corporate action issue or other procedures, eg, conversion, dematerialisation, exchange, registration, stamping, splitting, etc.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Instruction that has been refused or not recognised, and is represented
	 * automatically.
	 */
	public static final MMCode InstructionRefusedOrNotRecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			definition = "Instruction that has been refused or not recognised, and is represented automatically.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Securities have not yet been received from the counterparty.
	 */
	public static final MMCode AwaitingSharesFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			definition = "Securities have not yet been received from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Settlement is physical and securities are being delivered.
	 */
	public static final MMCode PhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical and securities are being delivered.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Trade is being amended in the market.
	 */
	public static final MMCode TradeAmendedInMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAmendedInMarket";
			definition = "Trade is being amended in the market.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "TAMM";
		}
	};
	/**
	 * Awaiting documents or endorsements from you.
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromYou = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			definition = "Awaiting documents or endorsements from you.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Awaiting documents or endorsements from the counterparty.
	 */
	public static final MMCode AwaitingDocumentsOrEndorsementsFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			definition = "Awaiting documents or endorsements from the counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Your account is blocked, no instruction can settle over the account.
	 */
	public static final MMCode AccountBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlocked";
			definition = "Your account is blocked, no instruction can settle over the account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Chaser/enquiry sent to the agent or depository.
	 */
	public static final MMCode EnquirySent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EnquirySent";
			definition = "Chaser/enquiry sent to the agent or depository.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Securities are new issues and are not yet available/tradable.
	 */
	public static final MMCode NewIssues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssues";
			definition = "Securities are new issues and are not yet available/tradable.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NEWI";
		}
	};
	/**
	 * Insufficient deliverable securities in the counterparty's account, or
	 * counterparty does not hold the securities.
	 */
	public static final MMCode CounterpartyInsufficientSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			definition = "Insufficient deliverable securities in the counterparty's account, or counterparty does not hold the securities.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CLAC";
		}
	};
	/**
	 * Securities quantity is not a multiple of an existing settlement amount
	 * lot for the instructed financial instrument.
	 */
	public static final MMCode MultipleSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Securities quantity is not a multiple of an existing settlement amount lot for the instructed financial instrument.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Settlement cannot be executed as securities are in global form.
	 */
	public static final MMCode GlobalFormSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Settlement cannot be executed as securities are in global form.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Your instruction is a preadvice, ie, matching only.
	 */
	public static final MMCode PreadviceInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreadviceInstructed";
			definition = "Your instruction is a preadvice, ie, matching only.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Guaranteed delivery indicator differs in the counterparty's instruction.
	 */
	public static final MMCode GuaranteedDeliveryIndicatorDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			definition = "Guaranteed delivery indicator differs in the counterparty's instruction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Trade will settle in partials.
	 */
	public static final MMCode TradeSettlesInPartials = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlesInPartials";
			definition = "Trade will settle in partials.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Instruction has not been matched because the matching process is not
	 * required.
	 */
	public static final MMCode NoMatchingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatchingRequired";
			definition = "Instruction has not been matched because the matching process is not required.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Insufficient money in the counterparty's account.
	 */
	public static final MMCode CounterpartyInsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in the counterparty's account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CMON";
		}
	};
	/**
	 * Not enough collateral in your account to execute the transaction.
	 */
	public static final MMCode CollateralShortage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralShortage";
			definition = "Not enough collateral in your account to execute the transaction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Securities are not deliverable as they are pledged as collateral.
	 */
	public static final MMCode SecuritiesPledgedAsCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			definition = "Securities are not deliverable as they are pledged as collateral.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuing of depositary receipts has been
	 * refused. The allotment for depositary receipts granted by the issuer is
	 * exceeded by the transaction.
	 */
	public static final MMCode RefusedDepositForIssueOfDepositaryReceipts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuing of depositary receipts has been refused. The allotment for depositary receipts granted by the issuer is exceeded by the transaction.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable securities in your account because the maximum
	 * foreign limit has been reached.
	 */
	public static final MMCode MaximumForeignLimitReached = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable securities in your account because the maximum foreign limit has been reached.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * Foreign exchange instruction is missing.
	 */
	public static final MMCode NoForeignExchangeInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "Foreign exchange instruction is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Securities require income adjustment, eg, dividend or interest.
	 */
	public static final MMCode IncomeAdjustementRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Securities require income adjustment, eg, dividend or interest.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Your instruction is pending settlement because the instruction linked to
	 * it is pending.
	 */
	public static final MMCode PendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Your instruction is pending settlement because the instruction linked to it is pending.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * Instruction is awaiting the settlement date, and no settlement problems
	 * have been reported.
	 */
	public static final MMCode AwaitingSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSettlementDate";
			definition = "Instruction is awaiting the settlement date, and no settlement problems have been reported.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Insufficient deliverable securities in your account.
	 */
	public static final MMCode LackOfSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfSecurities";
			definition = "Insufficient deliverable securities in your account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Insufficient deliverable securities in your account because securities
	 * are loaned out.
	 */
	public static final MMCode SecuritiesLoanedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Insufficient deliverable securities in your account because securities are loaned out.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "LALO";
		}
	};
	/**
	 * Insufficient money in your account.
	 */
	public static final MMCode InsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Settlement confirmation has not been received.
	 */
	public static final MMCode ConfirmationNotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Settlement confirmation has not been received.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Delivery/receipt has been refused because the physical securities are not
	 * in good order.
	 */
	public static final MMCode NotInGoodOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt has been refused because the physical securities are not in good order.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Instruction is pending as stamp duty information is missing.
	 */
	public static final MMCode LackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Instruction is pending as stamp duty information is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, eg, day
	 * time/real time versus overnight.
	 */
	public static final MMCode ProcessingBatchDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, eg, day time/real time versus overnight.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Instruction is confirmed in the local market or is ready for settlement,
	 * awaiting the next settlement cycle.
	 */
	public static final MMCode AwaitingNextSettlementCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Instruction is confirmed in the local market or is ready for settlement, awaiting the next settlement cycle.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Settlement is pending. The securities are blocked due to, for example, a
	 * corporate action event, re-alignment.
	 */
	public static final MMCode SecuritiesBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Settlement is pending. The securities are blocked due to, for example, a corporate action event, re-alignment.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty is in receivership, ie, the form of bankruptcy where a court
	 * appointed person, the receiver, manages the affairs of the business.
	 */
	public static final MMCode CounterpartyInReceivership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership, ie, the form of bankruptcy where a court appointed person, the receiver, manages the affairs of the business.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Securities amount is lower than the minimum existing settlement amount
	 * for the instructed financial instrument.
	 */
	public static final MMCode MinimumSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Securities amount is lower than the minimum existing settlement amount for the instructed financial instrument.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingCAP";
			definition = "Payment is pending, and does not settle because the actual use of the risk management limit on the counterpart (bilateral limit) prevents settlement.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PCAP";
		}
	};
	/**
	 * Pending reason is being investigated.
	 */
	public static final MMCode StatusReasonInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReasonInvestigation";
			definition = "Pending reason is being investigated.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "IAAD";
		}
	};
	/**
	 * Another settlement pending reason.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another settlement pending reason.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Physical shares have been received and are being checked for
	 * authenticity.
	 */
	public static final MMCode PhysicalSecuritiesVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalSecuritiesVerification";
			definition = "Physical shares have been received and are being checked for authenticity.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "PHCK";
		}
	};
	/**
	 * Information, for example, telephone number, contact person, is missing.
	 */
	public static final MMCode MissingInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInformation";
			definition = "Information, for example, telephone number, contact person, is missing.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "DRJC";
		}
	};
	/**
	 * Counterparty has not sent an instructon to receive. Check with
	 * counterparty.
	 */
	public static final MMCode AwaitingCounterpartyReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			definition = "Counterparty has not sent an instructon to receive. Check with counterparty.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "CYDV";
		}
	};
	/**
	 * Normal processing period for the instruction has lapsed. The transfer
	 * agent has been or will be contacted.
	 */
	public static final MMCode NormalProcessingPeriodLapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			definition = "Normal processing period for the instruction has lapsed. The transfer agent has been or will be contacted.";
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
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
			owner_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			codeName = "FVER";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusReasonCode";
				definition = "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingMoney, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.InstructionRefusedOrNotRecognised, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TradeAmendedInMarket,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AccountBlocked,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.EnquirySent, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NewIssues,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.GlobalFormSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PreadviceInstructed,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.GuaranteedDeliveryIndicatorDifference, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TradeSettlesInPartials,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NoMatchingRequired, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CollateralShortage, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesPledgedAsCollateral,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.RefusedDepositForIssueOfDepositaryReceipts, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NoForeignExchangeInstruction, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.IncomeAdjustementRequired,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PendingLinkedInstruction, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingSettlementDate,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LackOfSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesLoanedOut,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.InsufficientMoney, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ConfirmationNotReceived,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NotInGoodOrder, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LackOfStampDutyInformation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ProcessingBatchDifference, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingNextSettlementCycle,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.SecuritiesBlocked, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.CounterpartyInReceivership,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PendingCAP,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.StatusReasonInvestigation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.Other,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.MissingInformation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AccountNotOpen, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderClientInvestigation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UnderTransferAgentInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingTransferAgentStatus, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.UsualTransactionTime,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingStatus, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ApplicationFormSent,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.StockTransferFormSent, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.LongerProcessing,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsRequested, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsSent1,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AdditionalDocumentsSent2, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.DocumentsRejected,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingCounterpartyReceipt, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.AwaitingCounterpartyDelivery,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.NormalProcessingPeriodLapsed, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.WrongCounterpartyAccount,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TransferAgentProcessing, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.ExpectedConfirmation,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.Escalation, com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.TransferAgentNonReceipt,
						com.tools20022.repository.codeset.PendingSettlementStatusReasonCode.FinalVerification);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction/instruction is pending failing
 * settlement, and the settlement at the instruction settlement date is no
 * longer possible.
 */
public class PendingFailingSettlementCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities have been delivered, but the money is still expected from the
	 * counterparty.
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Securities have been delivered, but the money is still expected from the counterparty.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Securities have not yet been received from the counterparty. If the
	 * settlement instruction was a received against payment, the cash has been
	 * delivered.
	 */
	public static final MMCode AwaitingSecuritiesFromCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			definition = "Securities have not yet been received from the counterparty. If the settlement instruction was a received against payment, the cash has been delivered.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Awaiting settlement of a linked 'buy'.
	 */
	public static final MMCode AwaitingOtherTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingOtherTransaction";
			definition = "Awaiting settlement of a linked 'buy'.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "LAAW";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "DOCY";
		}
	};
	/**
	 * Counterparty's instruction was too late for settlement, (ie, received too
	 * late, matching, or settlement problems were solved too late).
	 */
	public static final MMCode CounterpartyTooLateForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			definition = "Counterparty's instruction was too late for settlement, (ie, received too late, matching, or settlement problems were solved too late).";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Certificate number error.
	 */
	public static final MMCode WrongCertificateNumbers = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrongCertificateNumbers";
			definition = "Certificate number error.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Securities quantity is lower than the minimum existing settlement
	 * quantity for the instructed financial instrument.
	 */
	public static final MMCode MinimumSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementAmount";
			definition = "Securities quantity is lower than the minimum existing settlement quantity for the instructed financial instrument.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Settlement is physical, and there is a delay in the delivery of the
	 * securities.
	 */
	public static final MMCode PhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDeliveryDelay";
			definition = "Settlement is physical, and there is a delay in the delivery of the securities.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "PHSE";
		}
	};
	/**
	 * Securities are blocked, eg, because of a corporate action event or
	 * re-alignment.
	 */
	public static final MMCode SecuritiesBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			definition = "Securities are blocked, eg, because of a corporate action event or re-alignment.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "SBLO";
		}
	};
	/**
	 * Counterparty has returned, refused, or does not recognize the securities.
	 */
	public static final MMCode CounterpartyReturnedSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReturnedSecurities";
			definition = "Counterparty has returned, refused, or does not recognize the securities.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "DKNY";
		}
	};
	/**
	 * Discrepancy in the settlement confirmation.
	 */
	public static final MMCode ConfirmationDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationDiscrepancy";
			definition = "Discrepancy in the settlement confirmation.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "STCD";
		}
	};
	/**
	 * Disagreement over beneficial ownership.
	 */
	public static final MMCode BeneficialOwnershipDisagreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			definition = "Disagreement over beneficial ownership.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "BENO";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Settlement instruction was too late for settlement, ie, received too
	 * late, matching, or settlement problems were solved too late.
	 */
	public static final MMCode TooLateForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLateForSettlement";
			definition = "Settlement instruction was too late for settlement, ie, received too late, matching, or settlement problems were solved too late.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Transaction suspended. Because the suspension period is finished, the
	 * cancellation or confirmation of instructions is required.
	 */
	public static final MMCode CancellationConfirmationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationConfirmationRequest";
			definition = "Transaction suspended. Because the suspension period is finished, the cancellation or confirmation of instructions is required.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CANR";
		}
	};
	/**
	 * Payment for a buy of securities was received after the cut-off time for
	 * completing the settlement on a same day basis.
	 */
	public static final MMCode MoneyTooLateForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyTooLateForSettlement";
			definition = "Payment for a buy of securities was received after the cut-off time for completing the settlement on a same day basis.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "MLAT";
		}
	};
	/**
	 * Securities are stolen, in dispute, and under objection.
	 */
	public static final MMCode UnderObjection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderObjection";
			definition = "Securities are stolen, in dispute, and under objection.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "OBJT";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Account is blocked, so no instruction can settle.
	 */
	public static final MMCode AccountBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountBlocked";
			definition = "Account is blocked, so no instruction can settle.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Enquiry/chaser sent to the agent or depository.
	 */
	public static final MMCode EnquirySent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EnquirySent";
			definition = "Enquiry/chaser sent to the agent or depository.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CHAS";
		}
	};
	/**
	 * Securities are new issues, and not yet available/tradeable.
	 */
	public static final MMCode NewIssues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssues";
			definition = "Securities are new issues, and not yet available/tradeable.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CLAC";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Insufficient money in counterparty's account.
	 */
	public static final MMCode CounterpartyInsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInsufficientMoney";
			definition = "Insufficient money in counterparty's account.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CMON";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Deposit of shares for the issuance of a depositary receipt has been
	 * refused. The allotment for depositary receipts granted by the issuer
	 * would be exceeded by the transaction.
	 */
	public static final MMCode RefusedDepositForIssueOfDepositaryReceipts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			definition = "Deposit of shares for the issuance of a depositary receipt has been refused. The allotment for depositary receipts granted by the issuer would be exceeded by the transaction.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "DEPO";
		}
	};
	/**
	 * Insufficient deliverable securities in your account, as maximum foreign
	 * limit has been reached.
	 */
	public static final MMCode MaximumForeignLimitReached = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumForeignLimitReached";
			definition = "Insufficient deliverable securities in your account, as maximum foreign limit has been reached.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "FLIM";
		}
	};
	/**
	 * A foreign exchange instruction from you is missing.
	 */
	public static final MMCode NoForeignExchangeInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoForeignExchangeInstruction";
			definition = "A foreign exchange instruction from you is missing.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "NOFX";
		}
	};
	/**
	 * Securities require income adjustment, ie, dividend or interest.
	 */
	public static final MMCode IncomeAdjustementRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeAdjustementRequired";
			definition = "Securities require income adjustment, ie, dividend or interest.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Linked instruction is pending/failing.
	 */
	public static final MMCode PendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingLinkedInstruction";
			definition = "Linked instruction is pending/failing.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "LINK";
		}
	};
	/**
	 * A buy-in procedure has started on the market, on your behalf, if your
	 * instruction is a receipt, or on behalf of the counterparty if the
	 * instruction is a delivery.
	 */
	public static final MMCode BuyInProcedure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyInProcedure";
			definition = "A buy-in procedure has started on the market, on your behalf, if your instruction is a receipt, or on behalf of the counterparty if the instruction is a delivery.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "BYIY";
		}
	};
	/**
	 * Awaiting securities from a corporate action issue or other procedure(s),
	 * eg, conversion, dematerialisation, exchange, registration, stamping, and
	 * splitting.
	 */
	public static final MMCode AwaitingSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingSecurities";
			definition = "Awaiting securities from a corporate action issue or other procedure(s), eg, conversion, dematerialisation, exchange, registration, stamping, and splitting.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CAIS";
		}
	};
	/**
	 * Insufficient deliverable securities in your account as securities are
	 * loaned out.
	 */
	public static final MMCode SecuritiesLoanedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLoanedOut";
			definition = "Insufficient deliverable securities in your account as securities are loaned out.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Settlement confirmation has not yet been received.
	 */
	public static final MMCode ConfirmationNotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationNotReceived";
			definition = "Settlement confirmation has not yet been received.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Not enough collateral in your account to execute the instruction.
	 */
	public static final MMCode CollateralShortage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralShortage";
			definition = "Not enough collateral in your account to execute the instruction.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "YCOL";
		}
	};
	/**
	 * Delivery/receipt is refused because the physical securities are not in
	 * good order.
	 */
	public static final MMCode NotInGoodOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotInGoodOrder";
			definition = "Delivery/receipt is refused because the physical securities are not in good order.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "REFS";
		}
	};
	/**
	 * Instruction is failing since stamp duty information is missing.
	 */
	public static final MMCode LackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfStampDutyInformation";
			definition = "Instruction is failing since stamp duty information is missing.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Your instruction is confirmed in the local market, but is ready for
	 * settlement at the next settlement cycle.
	 */
	public static final MMCode AwaitingNextSettlementCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingNextSettlementCycle";
			definition = "Your instruction is confirmed in the local market, but is ready for settlement at the next settlement cycle.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CYCL";
		}
	};
	/**
	 * Processing batch differs in the counterparty's instruction, eg, day
	 * time/real time vs overnight.
	 */
	public static final MMCode ProcessingBatchDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchDifference";
			definition = "Processing batch differs in the counterparty's instruction, eg, day time/real time vs overnight.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "BATC";
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
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "GUAD";
		}
	};
	/**
	 * Instruction is a preadvice, ie, matching only.
	 */
	public static final MMCode PreadviceInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreadviceInstructed";
			definition = "Instruction is a preadvice, ie, matching only.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Securities are in global form.
	 */
	public static final MMCode GlobalFormSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalFormSecurities";
			definition = "Securities are in global form.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "GLOB";
		}
	};
	/**
	 * Counterparty is in receivership, ie, a form of bankruptcy.
	 */
	public static final MMCode CounterpartyInReceivership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyInReceivership";
			definition = "Counterparty is in receivership, ie, a  form of bankruptcy.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "CPEC";
		}
	};
	/**
	 * Amount is not a multiple of an existing settlement amount lot for the
	 * instructed financial instrument.
	 */
	public static final MMCode MultipleSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementAmount";
			definition = "Amount is not a multiple of an existing settlement amount lot for the instructed financial instrument.";
			owner_lazy = () -> PendingFailingSettlementCode.mmObject();
			codeName = "MUNO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingFailingSettlementCode";
				definition = "Specifies the reason the transaction/instruction is pending failing settlement, and the settlement at the instruction settlement date is no longer possible.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingMoney, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingOtherTransaction, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingDocumentsOrEndorsementsFromYou,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyTooLateForSettlement, com.tools20022.repository.codeset.PendingFailingSettlementCode.WrongCertificateNumbers,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingFailingSettlementCode.PhysicalDeliveryDelay,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesBlocked, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyReturnedSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.ConfirmationDiscrepancy, com.tools20022.repository.codeset.PendingFailingSettlementCode.BeneficialOwnershipDisagreement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.LackOfSecurities, com.tools20022.repository.codeset.PendingFailingSettlementCode.TooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.CancellationConfirmationRequest, com.tools20022.repository.codeset.PendingFailingSettlementCode.MoneyTooLateForSettlement,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.UnderObjection, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AccountBlocked, com.tools20022.repository.codeset.PendingFailingSettlementCode.EnquirySent,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.NewIssues, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.TradeSettlesInPartials, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.PendingFailingSettlementCode.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MaximumForeignLimitReached, com.tools20022.repository.codeset.PendingFailingSettlementCode.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.IncomeAdjustementRequired, com.tools20022.repository.codeset.PendingFailingSettlementCode.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.BuyInProcedure, com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingFailingSettlementCode.InsufficientMoney,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.ConfirmationNotReceived, com.tools20022.repository.codeset.PendingFailingSettlementCode.CollateralShortage,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.NotInGoodOrder, com.tools20022.repository.codeset.PendingFailingSettlementCode.LackOfStampDutyInformation,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.PendingFailingSettlementCode.ProcessingBatchDifference,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.GuaranteedDeliveryIndicatorDifference, com.tools20022.repository.codeset.PendingFailingSettlementCode.PreadviceInstructed,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.GlobalFormSecurities, com.tools20022.repository.codeset.PendingFailingSettlementCode.CounterpartyInReceivership,
						com.tools20022.repository.codeset.PendingFailingSettlementCode.MultipleSettlementAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
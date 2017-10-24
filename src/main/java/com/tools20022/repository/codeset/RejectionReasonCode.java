package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 */
public class RejectionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unrecognised or invalid closing closing amount.
	 */
	public static final MMCode ClosingTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing closing amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CTRA";
		}
	};
	/**
	 * Market member executed the order exceeding the requested quantity.
	 */
	public static final MMCode TradedQuantityHigherThanOriginalOrderQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedQuantityHigherThanOriginalOrderQuantity";
			definition = "Market member executed the order exceeding the requested quantity.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TQHI";
		}
	};
	/**
	 * The combination of the Transaction Notice Reference, Market Member, and
	 * Intermediary is unknown.
	 */
	public static final MMCode TransactionNoticeIDUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeIDUnknown";
			definition = "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TNIU";
		}
	};
	/**
	 * A message with the same Transaction Notice Reference, Market Member, and
	 * Intermediary has already been processed.
	 */
	public static final MMCode TransactionNoticeAlreadyAcceptedOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeAlreadyAcceptedOrRejected";
			definition = "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TNAR";
		}
	};
	/**
	 * Order entry date is missing.
	 */
	public static final MMCode OrderDateNotProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateNotProvided";
			definition = "Order entry date is missing.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ODNP";
		}
	};
	/**
	 * Statement/status advice request cannot be executed. The message type
	 * requested is not valid for the message reference or statement period
	 * concerned.
	 */
	public static final MMCode InvalidRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidRequest";
			definition = "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Instruction is rejected since the provided certification is incorrect or
	 * incomplete.
	 */
	public static final MMCode IncorrectCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectCertification";
			definition = "Instruction is rejected since the provided certification is incorrect or incomplete.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Instruction contains an invalid message reference, reference is unknown.
	 */
	public static final MMCode InvalidReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidReference";
			definition = "Instruction contains an invalid message reference, reference is unknown.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Instruction contains an invalid or unrecognised safekeeping account.
	 */
	public static final MMCode SafekeepingAccountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccountRejection";
			definition = "Instruction contains an invalid or unrecognised safekeeping account.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Position is less than required threshold.
	 */
	public static final MMCode InsufficientTresholdPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientTresholdPosition";
			definition = "Position is less than required threshold.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Unrecognised or invalid instructed quantity.
	 */
	public static final MMCode QuantityRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityRejection";
			definition = "Unrecognised or invalid instructed quantity.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Instruction received after the account servicers specified deadline.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Instruction received after the account servicers specified deadline.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Split voting is not allowed.
	 */
	public static final MMCode SplitVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Partial voting is not allowed.
	 */
	public static final MMCode PartialVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Missing or invalid power of attorney.
	 */
	public static final MMCode MissingOrInvalidPOA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IPOA";
		}
	};
	/**
	 * Invalid proxy information.
	 */
	public static final MMCode ProxyCardDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PRXY";
		}
	};
	/**
	 * Invalid registration information.
	 */
	public static final MMCode RegistrationDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDiscrepancy";
			definition = "Invalid registration information.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IREG";
		}
	};
	/**
	 * Issuer or Registrar has rejected the instruction.
	 */
	public static final MMCode RejectedByIssuerOrRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			definition = "Issuer or Registrar has rejected the instruction.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RBIS";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 */
	public static final MMCode InvalidSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidSecurity";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * The instruction is irrevocable
	 */
	public static final MMCode InstructionIrrevocable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionIrrevocable";
			definition = "The instruction is irrevocable";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INIR";
		}
	};
	/**
	 * Option is not valid; it has been cancelled by the market or service
	 * provider, and cannot be responded to. Any responses already processed
	 * against this option are considered void and new responses will be
	 * required .
	 */
	public static final MMCode OptionCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionCancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required .";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, eg, expired
	 * option.
	 */
	public static final MMCode OptionInactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionInactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INTV";
		}
	};
	/**
	 * For tax reclaim, the reclaim is invalid for the tax authorities.
	 */
	public static final MMCode InvalidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidForTaxAuthorities";
			definition = "For tax reclaim, the reclaim is invalid for the tax authorities.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Reclaim is refused by the tax authorities.
	 */
	public static final MMCode RefusedByTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RefusedByTaxAuthorities";
			definition = "Reclaim is refused by the tax authorities.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REFT";
		}
	};
	/**
	 * Instructed position exceeds the eligible balance.
	 */
	public static final MMCode LackofSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackofSecurities";
			definition = "Instructed position exceeds the eligible balance.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Received after market deadline.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Mismatch between option number and option type.
	 */
	public static final MMCode Mismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mismatch";
			definition = "Mismatch between option number and option type.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NMTY";
		}
	};
	/**
	 * Unrecognised option number.
	 */
	public static final MMCode OptionNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionNumberRejection";
			definition = "Unrecognised option number.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "OPNM";
		}
	};
	/**
	 * Invalid option type.
	 */
	public static final MMCode InvalidOptionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidOptionType";
			definition = "Invalid option type.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "OPTY";
		}
	};
	/**
	 * Cancellation request was rejected since the instruction has already been
	 * cancelled.
	 */
	public static final MMCode RejectedSinceAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			definition = "Cancellation request was rejected since the instruction has already been cancelled.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Cancellation request has been rejected because the instruction process is
	 * in progress or has been processed.
	 */
	public static final MMCode RejectedSinceInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedSinceInProgress";
			definition = "Cancellation request has been rejected because the instruction process is in progress or has been processed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Unrecognised event number or identification (eg corporate action event
	 * number, a meeting identification)
	 */
	public static final MMCode UnrecognizedIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrecognizedIdentification";
			definition = "Unrecognised event number or identification (eg corporate action event number, a meeting identification)";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "EVNM";
		}
	};
	/**
	 * Financial instrument's symbol has not been recognized.
	 */
	public static final MMCode UnknownSymbol = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownSymbol";
			definition = "Financial instrument's symbol has not been recognized.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Exchange on which the financial instrument is traded is closed.
	 */
	public static final MMCode ClosedExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedExchange";
			definition = "Exchange on which the financial instrument is traded is closed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "EXCL";
		}
	};
	/**
	 * Countervalue of the order exceeds the allowed trading limit or quote
	 * exceeds limit.
	 */
	public static final MMCode ExceedsLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExceedsLimit";
			definition = "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "EXLI";
		}
	};
	/**
	 * Request has exceeded the allowed time frame.
	 */
	public static final MMCode TooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLate";
			definition = "Request has exceeded the allowed time frame.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TOLA";
		}
	};
	/**
	 * Price does not comply with the financial instrument's characteristics.
	 */
	public static final MMCode InvalidPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidPrice";
			definition = "Price does not comply with the financial instrument's characteristics.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Permission to be processed is not granted.
	 */
	public static final MMCode NotAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotAuthorised";
			definition = "Permission to be processed is not granted.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * No counterparty order has been identified.
	 */
	public static final MMCode NoMatchInquiry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatchInquiry";
			definition = "No counterparty order has been identified.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Referred instrument does not exist in combination with the mentioned
	 * market.
	 */
	public static final MMCode NoInstrumentMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoInstrumentMarket";
			definition = "Referred instrument does not exist in combination with the mentioned market.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NINS";
		}
	};
	/**
	 * Requested financial instrument is not available.
	 */
	public static final MMCode NoInventory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoInventory";
			definition = "Requested financial instrument is not available.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NINV";
		}
	};
	/**
	 * Counterparty is not interested in the transaction.
	 */
	public static final MMCode Pass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pass";
			definition = "Counterparty is not interested in the transaction.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Price in the execution exceeds the order price.
	 */
	public static final MMCode PriceExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceExceeds";
			definition = "Price in the execution exceeds the order price.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Quantity in the execution exceeds the ordered quantity.
	 */
	public static final MMCode QuantityExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityExceeds";
			definition = "Quantity in the execution exceeds the ordered quantity.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Order is for the wrong side.
	 */
	public static final MMCode WrongSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrongSide";
			definition = "Order is for the wrong side.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SIDE";
		}
	};
	/**
	 * This is primarily used when the Notice of Execution received by the
	 * buy-side contains fees, gross trade amount, net trade amount, etc.,
	 * values that differ from the buy-side's calculations. Buy-side may reject
	 * the trade if they feel that the difference in calculations is too high.
	 */
	public static final MMCode CalculationDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDifference";
			definition = "This is primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Requestor has no insufficient credit to make the trade.
	 */
	public static final MMCode InsufficientCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientCredit";
			definition = "Requestor has no insufficient credit to make the trade.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Agreement start date is missing or invalid.
	 */
	public static final MMCode AgreementStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgreementStartDate";
			definition = "Agreement start date is missing or invalid.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ASTM";
		}
	};
	/**
	 * Unrecognised or invalid transaction call delay.
	 */
	public static final MMCode TransactionCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Unrecognised or invalid cash account.
	 */
	public static final MMCode CashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Unrecognised or invalid deal price.
	 */
	public static final MMCode DealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid forfeit amount.
	 */
	public static final MMCode ForfeitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised or invalid delivering custodian.
	 */
	public static final MMCode DeliveringCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveringCustodian";
			definition = "Unrecognised or invalid delivering custodian.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DCUS";
		}
	};
	/**
	 * Unrecognised or invalid receiving agent.
	 */
	public static final MMCode ReceivingCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingCustodian";
			definition = "Unrecognised or invalid receiving agent.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RCUS";
		}
	};
	/**
	 * Cancellation request has been rejected since the instruction could not be
	 * found.
	 */
	public static final MMCode NotFoundRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotFoundRejection";
			definition = "Cancellation request has been rejected since the instruction could not be found.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Quantity unit type is not provided.
	 */
	public static final MMCode QuantityUnitType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityUnitType";
			definition = "Quantity unit type is not provided.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "QUNP";
		}
	};
	/**
	 * Unrecognised or invalid termination transaction amount.
	 */
	public static final MMCode TerminationTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate.
	 */
	public static final MMCode RepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Unrecognised or invalid premium amount.
	 */
	public static final MMCode PremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate type.
	 */
	public static final MMCode RepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Unrecognised or invalid spread rate.
	 */
	public static final MMCode SpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Traded securities quantity not provided.
	 */
	public static final MMCode TradedSecuritiesQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradedSecuritiesQuantity";
			definition = "Traded securities quantity not provided.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TQNP";
		}
	};
	/**
	 * Unrecognised or invalid trade date or requested trade date or future
	 * trade date.
	 */
	public static final MMCode TradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DTRD";
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
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IVAG";
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
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INTE";
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
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Unrecognised or invalid place of trade.
	 */
	public static final MMCode PlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Investor name and address is not recognised.
	 */
	public static final MMCode InvestorNameAddressUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * It is not possible to use the RTGS system instructed (NRTG or YRTG).
	 */
	public static final MMCode ImpossibleToUseTheRTGSSystemInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "It is not possible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 */
	public static final MMCode SettlementAmountCurrencyRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 */
	public static final MMCode LetterOfGuaranteeIndicatorRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuaranteeIndicatorRejection";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Missing credit authorisation (for pre-release transactions).
	 */
	public static final MMCode MissingCreditAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCreditAuthorisation";
			definition = "Missing credit authorisation (for pre-release transactions).";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MCRA";
		}
	};
	/**
	 * Address details are incorrect or cannot be recognised.
	 */
	public static final MMCode AddressDetailsRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressDetailsRejection";
			definition = "Address details are incorrect or cannot be recognised.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DADR";
		}
	};
	/**
	 * Unrecognised or invalid receiving or delivering custodian.
	 */
	public static final MMCode ReceivingOrDeliveringCustodianRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingOrDeliveringCustodianRejection";
			definition = "Unrecognised or invalid receiving or delivering custodian.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Unrecognised or invalid buyer or seller.
	 */
	public static final MMCode ReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Unrecognised or invalid buyer or seller.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Physical settlement is impossible for the instructed financial
	 * instrument.
	 */
	public static final MMCode PhysicalSettlementImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 */
	public static final MMCode ReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceRejection";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 */
	public static final MMCode SettlementAmountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmountRejection";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Missing statutes or commercial register or other legal documents.
	 */
	public static final MMCode MissingStatutes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingStatutes";
			definition = "Missing statutes or commercial register or other legal documents.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 */
	public static final MMCode NotStampedOrSigned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotStampedOrSigned";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Registration request does not have a valid signature of the owner of the
	 * financial instrument.
	 */
	public static final MMCode InvalidSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidSignature";
			definition = "Registration request does not have a valid signature of the owner of the financial instrument.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Unrecognised or invalid shareholder number.
	 */
	public static final MMCode ShareholderNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShareholderNumberRejection";
			definition = "Unrecognised or invalid shareholder number.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 */
	public static final MMCode MinimumSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Cancellation request has been rejected since more than one instruction
	 * match to the cancellation criteria.
	 */
	public static final MMCode NoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatch";
			definition = "Cancellation request has been rejected since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Missing legal power for transfer.
	 */
	public static final MMCode MissingLegalPower = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingLegalPower";
			definition = "Missing legal power for transfer.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 */
	public static final MMCode ProcessingBatchRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingBatchRejection";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Type of ownership indicated is not correct.
	 */
	public static final MMCode TypeOfOwnershipRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfOwnershipRejection";
			definition = "Type of ownership indicated is not correct.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "OWNT";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 */
	public static final MMCode MultipleSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is wrong. You have used the registration request of a
	 * different issuer/registrar.
	 */
	public static final MMCode WrongRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrongRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REQW";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 */
	public static final MMCode TaxStatusRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxStatusRejection";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Registration reason indicated is not correct.
	 */
	public static final MMCode DisagreementInRegistrationReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisagreementInRegistrationReason";
			definition = "Registration reason indicated is not correct.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RREA";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is missing.
	 */
	public static final MMCode MissingRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is missing.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REQM";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 */
	public static final MMCode SettlementSystemMethodRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethodRejection";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 */
	public static final MMCode CommonReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonReferenceRejection";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement preagreed narrative
	 * information.
	 */
	public static final MMCode NarrativeInformationRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NarrativeInformationRejection";
			definition = "Unrecognised or invalid service level agreement preagreed narrative information.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Invalid or incorrect program conversion specified.
	 */
	public static final MMCode IncorrectProgramConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectProgramConversion";
			definition = "Invalid or incorrect program conversion specified.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ICOP";
		}
	};
	/**
	 * Insufficient collateral proposed.
	 */
	public static final MMCode InsufficientCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientCollateral";
			definition = "Insufficient collateral proposed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ICOL";
		}
	};
	/**
	 * Unrecognised or invalid business partner number.
	 */
	public static final MMCode BusinessPartnerNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessPartnerNumberRejection";
			definition = "Unrecognised or invalid business partner number.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "BPAR";
		}
	};
	/**
	 * Unrecognised or invalid bank reference number.
	 */
	public static final MMCode BankReferenceNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankReferenceNumberRejection";
			definition = "Unrecognised or invalid bank reference number.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "BREF";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 */
	public static final MMCode TypeOfOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfOrderRejection";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 */
	public static final MMCode CorporateActionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionRejection";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Impossible standing arrangements override instruction for the cash
	 * settlement system.
	 */
	public static final MMCode ImpossibleCashSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognized or invalid commercialization contract.
	 */
	public static final MMCode CommercializationContractRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercializationContractRejection";
			definition = "Unrecognized or invalid commercialization contract.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Concentration limit was exceeded.
	 */
	public static final MMCode ConcentrationLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConcentrationLimitExceeded";
			definition = "Concentration limit was exceeded.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CONL";
		}
	};
	/**
	 * Deal or exposure is unknown.
	 */
	public static final MMCode UnknownDealExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownDealExposure";
			definition = "Deal or exposure is unknown.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CPTY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 */
	public static final MMCode SettlementDateRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDateRejection";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Unrecognised or invalid place of settlement.
	 */
	public static final MMCode PlaceOfSettlementRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfSettlementRejection";
			definition = "Unrecognised or invalid place of settlement.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Party A does not agree with the call amount.
	 */
	public static final MMCode DisagreeWithCallAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisagreeWithCallAmount";
			definition = "Party A does not agree with the call amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Party A does not agree with the exposure amount.
	 */
	public static final MMCode DisagreeWithExposureAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisagreeWithExposureAmount";
			definition = "Party A does not agree with the exposure amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DISE";
		}
	};
	/**
	 * Disagreement between the data on the registration request and the order.
	 */
	public static final MMCode RegistrationRequestDataAndOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			definition = "Disagreement between the data on the registration request and the order.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Unrecognized or invalid fee or commission.
	 */
	public static final MMCode FeeCommissionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FeeCommissionRejection";
			definition = "Unrecognized or invalid fee or commission.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Incorrect activity type specified, for example, pre-release conversion.
	 */
	public static final MMCode IncorrectActivityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectActivityType";
			definition = "Incorrect activity type specified, for example, pre-release conversion.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "IACT";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 */
	public static final MMCode SettlementTransactionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionRejection";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 */
	public static final MMCode ClosingDateTimeRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingDateTimeRejection";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 */
	public static final MMCode VariableRateSupportRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupportRejection";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * A second option is mandatory.
	 */
	public static final MMCode MissingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingOption";
			definition = "A second option is mandatory.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SECO";
		}
	};
	/**
	 * Party is not defined as an agent
	 */
	public static final MMCode NotDefinedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotDefinedAgent";
			definition = "Party is not defined as an agent";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "AGID";
		}
	};
	/**
	 * Period Ending Date or Code is missing.
	 */
	public static final MMCode MissingPeriodEndDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingPeriodEndDate";
			definition = "Period Ending Date or Code is missing.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ENDP";
		}
	};
	/**
	 * Period Starting Date or Code is missing
	 */
	public static final MMCode MissingPeriodStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingPeriodStartDate";
			definition = "Period Starting Date or Code is missing";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "STAR";
		}
	};
	/**
	 * Resulting amount must be filled in as Exchange rate is present.
	 */
	public static final MMCode MissingResultingAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingResultingAmount";
			definition = "Resulting amount must be filled in as Exchange rate is present.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RESU";
		}
	};
	/**
	 * Security type does not match with the type of corporate action.
	 */
	public static final MMCode WrongSecurityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrongSecurityType";
			definition = "Security type does not match with the type of corporate action.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SECT";
		}
	};
	/**
	 * The disperse security is not eligible in the I(CSD) Service Provider
	 * Owner.
	 */
	public static final MMCode NotEligibleDisperseSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleDisperseSecurity";
			definition = "The disperse security is not eligible in the I(CSD) Service Provider Owner.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * The security is not eligible.
	 */
	public static final MMCode NonEligibleSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleSecurity";
			definition = "The security is not eligible.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * There cannot be a resulting amount without an exchange rate.
	 */
	public static final MMCode MissingExchangeRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingExchangeRate";
			definition = "There cannot be a resulting amount without an exchange rate.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "XRAT";
		}
	};
	/**
	 * Value date is before payment date.
	 */
	public static final MMCode ValueDateBeforePaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDateBeforePaymentDate";
			definition = "Value date is before payment date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Accrued interest is not applicable for this type of security.
	 */
	public static final MMCode UnexpectedAccruedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnexpectedAccruedInterest";
			definition = "Accrued interest is not applicable for this type of security.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Agent has no access to the service.
	 */
	public static final MMCode NoAccessToService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAccessToService";
			definition = "Agent has no access to the service.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Certification Indicator is not filled in.
	 */
	public static final MMCode MissingCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCertification";
			definition = "Certification Indicator is not filled in.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Date is not a business day for the security market
	 */
	public static final MMCode NotBusinessDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotBusinessDay";
			definition = "Date is not a business day for the security market";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "BDAY";
		}
	};
	/**
	 * Effective date is after the payment date.
	 */
	public static final MMCode EffectiveDayAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			definition = "Effective date is after the payment date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PDAY";
		}
	};
	/**
	 * Gross amount is less than net amount.
	 */
	public static final MMCode GrossAmountLessThanNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			definition = "Gross amount is less than net amount.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "GAMN";
		}
	};
	/**
	 * One option must be marked as the default.
	 */
	public static final MMCode MissingDefaultOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingDefaultOption";
			definition = "One option must be marked as the default.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Party is not active.
	 */
	public static final MMCode NonActiveParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonActiveParty";
			definition = "Party is not active.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NPAT";
		}
	};
	/**
	 * Period Ending date is before Period Starting date.
	 */
	public static final MMCode PeriodEndDateBeforeStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			definition = "Period Ending date is before Period Starting date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PERI";
		}
	};
	/**
	 * Record date is after payment date.
	 */
	public static final MMCode RecordDateAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecordDateAfterPaymentDate";
			definition = "Record date is after payment date.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "RDTE";
		}
	};
	/**
	 * The validation of the advice/instruction/request failed.
	 */
	public static final MMCode FailedValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailedValidation";
			definition = "The validation of the advice/instruction/request failed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Rejected as the deactivation of the event is already completed.
	 */
	public static final MMCode EventAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventAlreadyDeactivated";
			definition = "Rejected as the deactivation of the event is already completed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The cancellation request is rejected as there is no pending deactivation
	 * instruction.
	 */
	public static final MMCode NoPendingDeactivationInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoPendingDeactivationInstruction";
			definition = "The cancellation request is rejected as there is no pending deactivation instruction.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PDEA";
		}
	};
	/**
	 * Amendment is not allowed.
	 */
	public static final MMCode AmendmentNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendmentNotAllowed";
			definition = "Amendment is not allowed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NAMD";
		}
	};
	/**
	 * Cancellation is not allowed.
	 */
	public static final MMCode CancellationNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationNotAllowed";
			definition = "Cancellation is not allowed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NCAN";
		}
	};
	/**
	 * Instruction/Request arrives too late.
	 */
	public static final MMCode Late = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Late";
			definition = "Instruction/Request arrives too late.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "LATT";
		}
	};
	/**
	 * The election advice is already cancelled.
	 */
	public static final MMCode ElectionAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectionAlreadyCancelled";
			definition = "The election advice is already cancelled.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * The election advice is already amended.
	 */
	public static final MMCode ElectionAlreadyAmended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectionAlreadyAmended";
			definition = "The election advice is already amended.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "ELEA";
		}
	};
	/**
	 * An Agent Corporate Action Deactivation Instruction with the same
	 * identification already exists.
	 */
	public static final MMCode SameCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SameCAIdentification";
			definition = "An Agent Corporate Action Deactivation Instruction with the same identification already exists.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SAME";
		}
	};
	/**
	 * Invalid corporate action identification supplied.
	 */
	public static final MMCode InvalidCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidCAIdentification";
			definition = "Invalid corporate action identification supplied.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "REFI";
		}
	};
	/**
	 * Invalid agent identification supplied.
	 */
	public static final MMCode InvalidAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidAgent";
			definition = "Invalid agent identification supplied.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "AGIN";
		}
	};
	/**
	 * Agent Identification specified does not correspond to the main Agent of
	 * the relating event.
	 */
	public static final MMCode NotMainAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotMainAgent";
			definition = "Agent Identification specified does not correspond to the main Agent of the relating event.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Invalid combination of CA option code and CA option number.
	 */
	public static final MMCode InvalidOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidOption";
			definition = "Invalid combination of CA option code and CA option number.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * The specified Corporate Action option already has a pending deactivation
	 * instruction
	 */
	public static final MMCode PendingDeactivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingDeactivation";
			definition = "The specified Corporate Action option already has a pending deactivation instruction";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Unable to identify cash account.
	 */
	public static final MMCode NotIdentifiedCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotIdentifiedCashAccount";
			definition = "Unable to identify cash account.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CASA";
		}
	};
	/**
	 * Unable to identify correspondent bank.
	 */
	public static final MMCode NotIdentifiedCorrespondentBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			definition = "Unable to identify correspondent bank.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Invalid standing instruction type for the specified underlying security.
	 */
	public static final MMCode InvalidStandingInstructionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidStandingInstructionType";
			definition = "Invalid standing instruction type for the specified underlying security.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * No holding for the specified underlying security.
	 */
	public static final MMCode NoHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoHolding";
			definition = "No holding for the specified underlying security.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NOHO";
		}
	};
	/**
	 * Insufficient balance.
	 */
	public static final MMCode InsufficientBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientBalance";
			definition = "Insufficient balance.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INHO";
		}
	};
	/**
	 * Several message with the same identification.
	 */
	public static final MMCode SameIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SameIdentification";
			definition = "Several message with the same identification.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "SAID";
		}
	};
	/**
	 * Rejected as the deactivation of the option is already completed.
	 */
	public static final MMCode OptionAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionAlreadyDeactivated";
			definition = "Rejected as the deactivation of the option is already completed.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "DEAO";
		}
	};
	/**
	 * CA Event Type does not correspond with the relating Corporate Action
	 */
	public static final MMCode InvalidEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidEventType";
			definition = "CA Event Type does not correspond with the relating Corporate Action";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INET";
		}
	};
	/**
	 * Underlying Security Identification does not correspond with the Corporate
	 * Action Reference supplied.
	 */
	public static final MMCode InvalidUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidUnderlyingSecurity";
			definition = "Underlying Security Identification does not correspond with the Corporate Action Reference supplied.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INUS";
		}
	};
	/**
	 * Event Processing Type does not correspond with the relating Corporate
	 * Action.
	 */
	public static final MMCode InvalidEventProcessingType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidEventProcessingType";
			definition = "Event Processing Type does not correspond with the relating Corporate Action.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INPT";
		}
	};
	/**
	 * Mandatory/Voluntary Event Type does not correspond with the relating
	 * Corporate Action.
	 */
	public static final MMCode InvalidMandatoryVoluntaryEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			definition = "Mandatory/Voluntary Event Type does not correspond with the relating Corporate Action.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INMV";
		}
	};
	/**
	 * Details specified in the Corporate Action General Information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 */
	public static final MMCode InvalidCorporateActionInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidCorporateActionInformation";
			definition = "Details specified in the Corporate Action General Information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Message details specified in the instruction/request are inconsistent
	 * with those that were specified in the relating original message.
	 */
	public static final MMCode InvalidDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidDetails";
			definition = "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INDT";
		}
	};
	/**
	 * Specified Corporate Action has no remaining options to disable.
	 */
	public static final MMCode NoRemainingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoRemainingOption";
			definition = "Specified Corporate Action has no remaining options to disable.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NORO";
		}
	};
	/**
	 * Issuer CA Identification does not correspond with the Corporate Action
	 * Identification supplied.
	 */
	public static final MMCode MismatchedCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MismatchedCAIdentification";
			definition = "Issuer CA Identification does not correspond with the Corporate Action Identification supplied.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MICA";
		}
	};
	/**
	 * This instruction type is not applicable for mandatory events.
	 */
	public static final MMCode NotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotApplicable";
			definition = "This instruction type is not applicable for mandatory events.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NOAP";
		}
	};
	/**
	 * Details specified in the MOVEMENT GENERAL INFORMATION block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 */
	public static final MMCode InvalidMovementInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidMovementInformation";
			definition = "Details specified in the MOVEMENT GENERAL INFORMATION block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INMO";
		}
	};
	/**
	 * One or more of the underlying movements have already settled.
	 */
	public static final MMCode MovementAlreadySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MovementAlreadySettled";
			definition = "One or more of the underlying movements have already settled.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "MOSE";
		}
	};
	/**
	 * A narrative reason is provided.
	 */
	public static final MMCode NarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NarrativeReason";
			definition = "A narrative reason is provided.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Instruction contains an invalid message identification, identification is
	 * unknown.
	 */
	public static final MMCode InvalidIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidIdentification";
			definition = "Instruction contains an invalid message identification, identification is unknown.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Other reason.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other reason.";
			owner_lazy = () -> RejectionReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CTRA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonCode";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonCode.ClosingTransactionAmount, com.tools20022.repository.codeset.RejectionReasonCode.TradedQuantityHigherThanOriginalOrderQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.TransactionNoticeIDUnknown, com.tools20022.repository.codeset.RejectionReasonCode.TransactionNoticeAlreadyAcceptedOrRejected,
						com.tools20022.repository.codeset.RejectionReasonCode.OrderDateNotProvided, com.tools20022.repository.codeset.RejectionReasonCode.InvalidRequest,
						com.tools20022.repository.codeset.RejectionReasonCode.IncorrectCertification, com.tools20022.repository.codeset.RejectionReasonCode.InvalidReference,
						com.tools20022.repository.codeset.RejectionReasonCode.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReasonCode.QuantityRejection, com.tools20022.repository.codeset.RejectionReasonCode.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonCode.SplitVoteNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.PartialVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReasonCode.ProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReasonCode.RegistrationDiscrepancy, com.tools20022.repository.codeset.RejectionReasonCode.RejectedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidSecurity, com.tools20022.repository.codeset.RejectionReasonCode.InstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionCancelled, com.tools20022.repository.codeset.RejectionReasonCode.OptionInactive,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReasonCode.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReasonCode.LackofSecurities, com.tools20022.repository.codeset.RejectionReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReasonCode.Mismatch,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.InvalidOptionType,
						com.tools20022.repository.codeset.RejectionReasonCode.RejectedSinceAlreadyCancelled, com.tools20022.repository.codeset.RejectionReasonCode.RejectedSinceInProgress,
						com.tools20022.repository.codeset.RejectionReasonCode.UnrecognizedIdentification, com.tools20022.repository.codeset.RejectionReasonCode.UnknownSymbol,
						com.tools20022.repository.codeset.RejectionReasonCode.ClosedExchange, com.tools20022.repository.codeset.RejectionReasonCode.ExceedsLimit, com.tools20022.repository.codeset.RejectionReasonCode.TooLate,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidPrice, com.tools20022.repository.codeset.RejectionReasonCode.NotAuthorised, com.tools20022.repository.codeset.RejectionReasonCode.NoMatchInquiry,
						com.tools20022.repository.codeset.RejectionReasonCode.NoInstrumentMarket, com.tools20022.repository.codeset.RejectionReasonCode.NoInventory, com.tools20022.repository.codeset.RejectionReasonCode.Pass,
						com.tools20022.repository.codeset.RejectionReasonCode.PriceExceeds, com.tools20022.repository.codeset.RejectionReasonCode.QuantityExceeds, com.tools20022.repository.codeset.RejectionReasonCode.WrongSide,
						com.tools20022.repository.codeset.RejectionReasonCode.CalculationDifference, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientCredit,
						com.tools20022.repository.codeset.RejectionReasonCode.AgreementStartDate, com.tools20022.repository.codeset.RejectionReasonCode.TransactionCallDelay,
						com.tools20022.repository.codeset.RejectionReasonCode.CashAccount, com.tools20022.repository.codeset.RejectionReasonCode.DealPrice, com.tools20022.repository.codeset.RejectionReasonCode.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.DeliveringCustodian, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingCustodian,
						com.tools20022.repository.codeset.RejectionReasonCode.NotFoundRejection, com.tools20022.repository.codeset.RejectionReasonCode.QuantityUnitType,
						com.tools20022.repository.codeset.RejectionReasonCode.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReasonCode.PremiumAmount, com.tools20022.repository.codeset.RejectionReasonCode.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReasonCode.SpreadRate,
						com.tools20022.repository.codeset.RejectionReasonCode.TradedSecuritiesQuantity, com.tools20022.repository.codeset.RejectionReasonCode.TradeDate, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingAgent,
						com.tools20022.repository.codeset.RejectionReasonCode.Intermediary, com.tools20022.repository.codeset.RejectionReasonCode.DeliveringAgent, com.tools20022.repository.codeset.RejectionReasonCode.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReasonCode.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectionReasonCode.ImpossibleToUseTheRTGSSystemInstructed,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementAmountCurrencyRejection, com.tools20022.repository.codeset.RejectionReasonCode.LetterOfGuaranteeIndicatorRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingCreditAuthorisation, com.tools20022.repository.codeset.RejectionReasonCode.AddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.ReceivingOrDeliveringCustodianRejection, com.tools20022.repository.codeset.RejectionReasonCode.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.RejectionReasonCode.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReasonCode.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReasonCode.MissingStatutes,
						com.tools20022.repository.codeset.RejectionReasonCode.NotStampedOrSigned, com.tools20022.repository.codeset.RejectionReasonCode.InvalidSignature,
						com.tools20022.repository.codeset.RejectionReasonCode.ShareholderNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.NoMatch, com.tools20022.repository.codeset.RejectionReasonCode.MissingLegalPower, com.tools20022.repository.codeset.RejectionReasonCode.ProcessingBatchRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.TypeOfOwnershipRejection, com.tools20022.repository.codeset.RejectionReasonCode.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonCode.WrongRegistrationRequest, com.tools20022.repository.codeset.RejectionReasonCode.TaxStatusRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.DisagreementInRegistrationReason, com.tools20022.repository.codeset.RejectionReasonCode.MissingRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementSystemMethodRejection, com.tools20022.repository.codeset.RejectionReasonCode.CommonReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.NarrativeInformationRejection, com.tools20022.repository.codeset.RejectionReasonCode.IncorrectProgramConversion,
						com.tools20022.repository.codeset.RejectionReasonCode.InsufficientCollateral, com.tools20022.repository.codeset.RejectionReasonCode.BusinessPartnerNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.BankReferenceNumberRejection, com.tools20022.repository.codeset.RejectionReasonCode.TypeOfOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.CorporateActionRejection, com.tools20022.repository.codeset.RejectionReasonCode.ImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RejectionReasonCode.CommercializationContractRejection, com.tools20022.repository.codeset.RejectionReasonCode.ConcentrationLimitExceeded,
						com.tools20022.repository.codeset.RejectionReasonCode.UnknownDealExposure, com.tools20022.repository.codeset.RejectionReasonCode.SettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.PlaceOfSettlementRejection, com.tools20022.repository.codeset.RejectionReasonCode.DisagreeWithCallAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.DisagreeWithExposureAmount, com.tools20022.repository.codeset.RejectionReasonCode.RegistrationRequestDataAndOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReasonCode.IncorrectActivityType,
						com.tools20022.repository.codeset.RejectionReasonCode.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReasonCode.ClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReasonCode.VariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReasonCode.MissingOption,
						com.tools20022.repository.codeset.RejectionReasonCode.NotDefinedAgent, com.tools20022.repository.codeset.RejectionReasonCode.MissingPeriodEndDate,
						com.tools20022.repository.codeset.RejectionReasonCode.MissingPeriodStartDate, com.tools20022.repository.codeset.RejectionReasonCode.MissingResultingAmount,
						com.tools20022.repository.codeset.RejectionReasonCode.WrongSecurityType, com.tools20022.repository.codeset.RejectionReasonCode.NotEligibleDisperseSecurity,
						com.tools20022.repository.codeset.RejectionReasonCode.NonEligibleSecurity, com.tools20022.repository.codeset.RejectionReasonCode.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReasonCode.ValueDateBeforePaymentDate, com.tools20022.repository.codeset.RejectionReasonCode.UnexpectedAccruedInterest,
						com.tools20022.repository.codeset.RejectionReasonCode.NoAccessToService, com.tools20022.repository.codeset.RejectionReasonCode.MissingCertification,
						com.tools20022.repository.codeset.RejectionReasonCode.NotBusinessDay, com.tools20022.repository.codeset.RejectionReasonCode.EffectiveDayAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReasonCode.GrossAmountLessThanNetAmount, com.tools20022.repository.codeset.RejectionReasonCode.MissingDefaultOption,
						com.tools20022.repository.codeset.RejectionReasonCode.NonActiveParty, com.tools20022.repository.codeset.RejectionReasonCode.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.RejectionReasonCode.RecordDateAfterPaymentDate, com.tools20022.repository.codeset.RejectionReasonCode.FailedValidation,
						com.tools20022.repository.codeset.RejectionReasonCode.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonCode.NoPendingDeactivationInstruction,
						com.tools20022.repository.codeset.RejectionReasonCode.AmendmentNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.CancellationNotAllowed, com.tools20022.repository.codeset.RejectionReasonCode.Late,
						com.tools20022.repository.codeset.RejectionReasonCode.ElectionAlreadyCancelled, com.tools20022.repository.codeset.RejectionReasonCode.ElectionAlreadyAmended,
						com.tools20022.repository.codeset.RejectionReasonCode.SameCAIdentification, com.tools20022.repository.codeset.RejectionReasonCode.InvalidCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidAgent, com.tools20022.repository.codeset.RejectionReasonCode.NotMainAgent, com.tools20022.repository.codeset.RejectionReasonCode.InvalidOption,
						com.tools20022.repository.codeset.RejectionReasonCode.PendingDeactivation, com.tools20022.repository.codeset.RejectionReasonCode.NotIdentifiedCashAccount,
						com.tools20022.repository.codeset.RejectionReasonCode.NotIdentifiedCorrespondentBank, com.tools20022.repository.codeset.RejectionReasonCode.InvalidStandingInstructionType,
						com.tools20022.repository.codeset.RejectionReasonCode.NoHolding, com.tools20022.repository.codeset.RejectionReasonCode.InsufficientBalance, com.tools20022.repository.codeset.RejectionReasonCode.SameIdentification,
						com.tools20022.repository.codeset.RejectionReasonCode.OptionAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonCode.InvalidEventType,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidUnderlyingSecurity, com.tools20022.repository.codeset.RejectionReasonCode.InvalidEventProcessingType,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidMandatoryVoluntaryEventType, com.tools20022.repository.codeset.RejectionReasonCode.InvalidCorporateActionInformation,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidDetails, com.tools20022.repository.codeset.RejectionReasonCode.NoRemainingOption,
						com.tools20022.repository.codeset.RejectionReasonCode.MismatchedCAIdentification, com.tools20022.repository.codeset.RejectionReasonCode.NotApplicable,
						com.tools20022.repository.codeset.RejectionReasonCode.InvalidMovementInformation, com.tools20022.repository.codeset.RejectionReasonCode.MovementAlreadySettled,
						com.tools20022.repository.codeset.RejectionReasonCode.NarrativeReason, com.tools20022.repository.codeset.RejectionReasonCode.InvalidIdentification, com.tools20022.repository.codeset.RejectionReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 */
public class RejectionReasonV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Insufficient money in your account.
	 */
	public static final MMCode InsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Linked reference is unknown.
	 */
	public static final MMCode InvalidReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			definition = "Linked reference is unknown.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Unrecognised or invalid message sender's safekeeping account.
	 */
	public static final MMCode SafekeepingAccountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			definition = "Unrecognised or invalid message sender's safekeeping account.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Position is less than required threshold.
	 */
	public static final MMCode InsufficientTresholdPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientTresholdPosition";
			definition = "Position is less than required threshold.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Unrecognised or invalid instructed quantity.
	 */
	public static final MMCode QuantityRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			definition = "Unrecognised or invalid instructed quantity.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Transaction/instruction received after the account servicer's specified
	 * deadline.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Transaction/instruction received after the account servicer's specified deadline.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Split voting is not allowed.
	 */
	public static final MMCode SplitVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Partial voting is not allowed.
	 */
	public static final MMCode PartialVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Missing or invalid power of attorney.
	 */
	public static final MMCode MissingOrInvalidPOA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IPOA";
		}
	};
	/**
	 * Invalid proxy information.
	 */
	public static final MMCode ProxyCardDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PRXY";
		}
	};
	/**
	 * Invalid registration information.
	 */
	public static final MMCode RegistrationDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDiscrepancy";
			definition = "Invalid registration information.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IREG";
		}
	};
	/**
	 * Issuer or registrar has rejected the instruction.
	 */
	public static final MMCode RejectedByIssuerOrRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			definition = "Issuer or registrar has rejected the instruction.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RBIS";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 */
	public static final MMCode InvalidSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Instruction is irrevocable
	 */
	public static final MMCode InstructionIrrevocable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			definition = "Instruction is irrevocable";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
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
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required .";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, for example,
	 * expired option.
	 */
	public static final MMCode OptionInactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INTV";
		}
	};
	/**
	 * For tax reclaim, the reclaim is invalid for the tax authorities.
	 */
	public static final MMCode InvalidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			definition = "For tax reclaim, the reclaim is invalid for the tax authorities.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Reclaim is refused by the tax authorities.
	 */
	public static final MMCode RefusedByTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			definition = "Reclaim is refused by the tax authorities.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REFT";
		}
	};
	/**
	 * Instructed position exceeds the eligible balance.
	 */
	public static final MMCode LackofSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			definition = "Instructed position exceeds the eligible balance.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Received after market deadline.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Mismatch between option number and option type.
	 */
	public static final MMCode Mismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			definition = "Mismatch between option number and option type.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NMTY";
		}
	};
	/**
	 * Unrecognised option number.
	 */
	public static final MMCode OptionNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			definition = "Unrecognised option number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "OPNM";
		}
	};
	/**
	 * Invalid option type.
	 */
	public static final MMCode InvalidOptionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			definition = "Invalid option type.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "OPTY";
		}
	};
	/**
	 * Cancellation request was rejected since the instruction has already been
	 * cancelled.
	 */
	public static final MMCode RejectedSinceAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			definition = "Cancellation request was rejected since the instruction has already been cancelled.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Cancellation request has been rejected because the instruction process is
	 * in progress or has been processed.
	 */
	public static final MMCode RejectedSinceInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			definition = "Cancellation request has been rejected because the instruction process is in progress or has been processed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Unrecognised event number.
	 */
	public static final MMCode UnrecognisedIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			definition = "Unrecognised event number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "EVNM";
		}
	};
	/**
	 * Financial instrument's symbol has not been recognized.
	 */
	public static final MMCode UnknownSymbol = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			definition = "Financial instrument's symbol has not been recognized.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Exchange on which the financial instrument is traded is closed.
	 */
	public static final MMCode ClosedExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedExchange";
			definition = "Exchange on which the financial instrument is traded is closed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "EXCL";
		}
	};
	/**
	 * Countervalue of the order exceeds the allowed trading limit or quote
	 * exceeds limit.
	 */
	public static final MMCode ExceedsLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			definition = "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "EXLI";
		}
	};
	/**
	 * Request has exceeded the allowed time frame.
	 */
	public static final MMCode TooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Request has exceeded the allowed time frame.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TOLA";
		}
	};
	/**
	 * Price does not comply with the financial instrument's characteristics.
	 */
	public static final MMCode InvalidPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			definition = "Price does not comply with the financial instrument's characteristics.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Permission to be processed is not granted.
	 */
	public static final MMCode NotAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			definition = "Permission to be processed is not granted.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * No counterparty order has been identified.
	 */
	public static final MMCode NoMatchInquiry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchInquiry";
			definition = "No counterparty order has been identified.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Referred instrument does not exist in combination with the mentioned
	 * market.
	 */
	public static final MMCode NoInstrumentMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstrumentMarket";
			definition = "Referred instrument does not exist in combination with the mentioned market.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NINS";
		}
	};
	/**
	 * Requested financial instrument is not available.
	 */
	public static final MMCode NoInventory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInventory";
			definition = "Requested financial instrument is not available.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NINV";
		}
	};
	/**
	 * Counterparty is not interested in the transaction.
	 */
	public static final MMCode Pass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Counterparty is not interested in the transaction.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Price in the execution exceeds the order price.
	 */
	public static final MMCode PriceExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			definition = "Price in the execution exceeds the order price.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Quantity in the execution exceeds the ordered quantity.
	 */
	public static final MMCode QuantityExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			definition = "Quantity in the execution exceeds the ordered quantity.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Order is for the wrong side.
	 */
	public static final MMCode WrongSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSide";
			definition = "Order is for the wrong side.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SIDE";
		}
	};
	/**
	 * Primarily used when the Notice of Execution received by the buy-side
	 * contains fees, gross trade amount, net trade amount, etc., values that
	 * differ from the buy-side's calculations. Buy-side may reject the trade if
	 * they feel that the difference in calculations is too high.
	 */
	public static final MMCode CalculationDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDifference";
			definition = "Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Requestor has no insufficient credit to make the trade.
	 */
	public static final MMCode InsufficientCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCredit";
			definition = "Requestor has no insufficient credit to make the trade.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Agreement start date is missing or invalid.
	 */
	public static final MMCode AgreementStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementStartDate";
			definition = "Agreement start date is missing or invalid.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ASTM";
		}
	};
	/**
	 * Unrecognised or invalid transaction call delay.
	 */
	public static final MMCode TransactionCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Unrecognised or invalid cash account.
	 */
	public static final MMCode CashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Unrecognised or invalid deal price.
	 */
	public static final MMCode DealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid forfeit amount.
	 */
	public static final MMCode ForfeitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised or invalid delivering custodian.
	 */
	public static final MMCode DeliveringCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringCustodian";
			definition = "Unrecognised or invalid delivering custodian.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DCUS";
		}
	};
	/**
	 * Unrecognised or invalid receiving agent.
	 */
	public static final MMCode ReceivingCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingCustodian";
			definition = "Unrecognised or invalid receiving agent.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RCUS";
		}
	};
	/**
	 * Instruction could not be found.
	 */
	public static final MMCode NotFoundRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			definition = "Instruction could not be found.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Quantity unit type is not provided.
	 */
	public static final MMCode QuantityUnitType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			definition = "Quantity unit type is not provided.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "QUNP";
		}
	};
	/**
	 * Unrecognised or invalid termination transaction amount.
	 */
	public static final MMCode TerminationTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate.
	 */
	public static final MMCode RepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Unrecognised or invalid premium amount.
	 */
	public static final MMCode PremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate type.
	 */
	public static final MMCode RepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Unrecognised or invalid spread rate.
	 */
	public static final MMCode SpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Traded securities quantity not provided.
	 */
	public static final MMCode TradedSecuritiesQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedSecuritiesQuantity";
			definition = "Traded securities quantity not provided.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TQNP";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 */
	public static final MMCode ReceivingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Intermediary is not recognised or is invalid.
	 */
	public static final MMCode Intermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Unrecognised or invalid place of trade.
	 */
	public static final MMCode PlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PLCE";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * Not possible to use the RTGS system instructed (NRTG or YRTG).
	 */
	public static final MMCode ImpossibleToUseTheRTGSSystemInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "Not possible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 */
	public static final MMCode SettlementAmountCurrencyRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 */
	public static final MMCode LetterOfGuaranteeIndicatorRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicatorRejection";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Missing credit authorisation (for pre-release transactions).
	 */
	public static final MMCode MissingCreditAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditAuthorisation";
			definition = "Missing credit authorisation (for pre-release transactions).";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MCRA";
		}
	};
	/**
	 * Address details are incorrect or cannot be recognised.
	 */
	public static final MMCode AddressDetailsRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			definition = "Address details are incorrect or cannot be recognised.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DADR";
		}
	};
	/**
	 * Physical settlement is impossible for the instructed financial
	 * instrument.
	 */
	public static final MMCode PhysicalSettlementImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 */
	public static final MMCode ReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 */
	public static final MMCode SettlementAmountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Missing statutes or commercial register or other legal documents.
	 */
	public static final MMCode MissingStatutes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingStatutes";
			definition = "Missing statutes or commercial register or other legal documents.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 */
	public static final MMCode NotStampedOrSigned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStampedOrSigned";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Registration request does not have a valid signature of the owner of the
	 * financial instrument.
	 */
	public static final MMCode InvalidSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			definition = "Registration request does not have a valid signature of the owner of the financial instrument.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Unrecognised or invalid shareholder number.
	 */
	public static final MMCode ShareholderNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareholderNumberRejection";
			definition = "Unrecognised or invalid shareholder number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 */
	public static final MMCode MinimumSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * More than one instruction match the criteria.
	 */
	public static final MMCode NoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "More than one instruction match the criteria.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Missing legal power for transfer.
	 */
	public static final MMCode MissingLegalPower = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingLegalPower";
			definition = "Missing legal power for transfer.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 */
	public static final MMCode ProcessingBatchRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Type of ownership indicated is not correct.
	 */
	public static final MMCode TypeOfOwnershipRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			definition = "Type of ownership indicated is not correct.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "OWNT";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 */
	public static final MMCode MultipleSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
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
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REQW";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 */
	public static final MMCode TaxStatusRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Registration reason indicated is not correct.
	 */
	public static final MMCode DisagreementInRegistrationReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementInRegistrationReason";
			definition = "Registration reason indicated is not correct.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RREA";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is missing.
	 */
	public static final MMCode MissingRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is missing.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REQM";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 */
	public static final MMCode SettlementSystemMethodRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 */
	public static final MMCode CommonReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement pre-agreed narrative
	 * information.
	 */
	public static final MMCode NarrativeInformationRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			definition = "Unrecognised or invalid service level agreement pre-agreed narrative information.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Invalid or incorrect programme conversion specified.
	 */
	public static final MMCode IncorrectProgramConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectProgramConversion";
			definition = "Invalid or incorrect programme conversion specified.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ICOP";
		}
	};
	/**
	 * Insufficient collateral proposed.
	 */
	public static final MMCode InsufficientCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			definition = "Insufficient collateral proposed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ICOL";
		}
	};
	/**
	 * Unrecognised or invalid business partner number.
	 */
	public static final MMCode BusinessPartnerNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			definition = "Unrecognised or invalid business partner number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BPAR";
		}
	};
	/**
	 * Unrecognised or invalid bank reference number.
	 */
	public static final MMCode BankReferenceNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			definition = "Unrecognised or invalid bank reference number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BREF";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 */
	public static final MMCode TypeOfOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 */
	public static final MMCode CorporateActionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Impossible standing arrangements override instruction for the cash
	 * settlement system.
	 */
	public static final MMCode ImpossibleCashSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognised or invalid commercialisation contract.
	 */
	public static final MMCode CommercializationContractRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			definition = "Unrecognised or invalid commercialisation contract.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Concentration limit was exceeded.
	 */
	public static final MMCode ConcentrationLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			definition = "Concentration limit was exceeded.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CONL";
		}
	};
	/**
	 * Deal or exposure is unknown.
	 */
	public static final MMCode UnknownDealExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			definition = "Deal or exposure is unknown.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CPTY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 */
	public static final MMCode SettlementDateRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Party does not agree with the call amount.
	 */
	public static final MMCode DisagreeWithCallAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			definition = "Party does not agree with the call amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Party does not agree with the exposure amount.
	 */
	public static final MMCode DisagreeWithExposureAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			definition = "Party does not agree with the exposure amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DISE";
		}
	};
	/**
	 * Disagreement between the data on the registration request and the order.
	 */
	public static final MMCode RegistrationRequestDataAndOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			definition = "Disagreement between the data on the registration request and the order.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 */
	public static final MMCode FeeCommissionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Incorrect activity type specified, for example, pre-release conversion.
	 */
	public static final MMCode IncorrectActivityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectActivityType";
			definition = "Incorrect activity type specified, for example, pre-release conversion.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IACT";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 */
	public static final MMCode SettlementTransactionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 */
	public static final MMCode ClosingDateTimeRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 */
	public static final MMCode VariableRateSupportRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Second option is mandatory.
	 */
	public static final MMCode MissingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOption";
			definition = "Second option is mandatory.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SECO";
		}
	};
	/**
	 * Party is not defined as an agent.
	 */
	public static final MMCode NotDefinedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefinedAgent";
			definition = "Party is not defined as an agent.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "AGID";
		}
	};
	/**
	 * Period ending date or code is missing.
	 */
	public static final MMCode MissingPeriodEndDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodEndDate";
			definition = "Period ending date or code is missing.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ENDP";
		}
	};
	/**
	 * Period starting date or code is missing.
	 */
	public static final MMCode MissingPeriodStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodStartDate";
			definition = "Period starting date or code is missing.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "STAR";
		}
	};
	/**
	 * Resulting amount must be filled in as exchange rate is present.
	 */
	public static final MMCode MissingResultingAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResultingAmount";
			definition = "Resulting amount must be filled in as exchange rate is present.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RESU";
		}
	};
	/**
	 * Security type does not match with the type of corporate action.
	 */
	public static final MMCode WrongSecurityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSecurityType";
			definition = "Security type does not match with the type of corporate action.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SECT";
		}
	};
	/**
	 * Disperse security is not eligible in the (ICSD) service provider owner.
	 */
	public static final MMCode NotEligibleDisperseSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleDisperseSecurity";
			definition = "Disperse security is not eligible in the (ICSD) service provider owner.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Security is not eligible.
	 */
	public static final MMCode NonEligibleSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			definition = "Security is not eligible.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Resulting amount is not allowed without an exchange rate.
	 */
	public static final MMCode MissingExchangeRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingExchangeRate";
			definition = "Resulting amount is not allowed without an exchange rate.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "XRAT";
		}
	};
	/**
	 * Value date is before payment date.
	 */
	public static final MMCode ValueDateBeforePaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateBeforePaymentDate";
			definition = "Value date is before payment date.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Accrued interest is not applicable for this type of security.
	 */
	public static final MMCode UnexpectedAccruedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedAccruedInterest";
			definition = "Accrued interest is not applicable for this type of security.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Agent has no access to the service.
	 */
	public static final MMCode NoAccessToService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccessToService";
			definition = "Agent has no access to the service.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Instruction is rejected since the provided certification is incorrect or
	 * incomplete.
	 */
	public static final MMCode IncorrectCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			definition = "Instruction is rejected since the provided certification is incorrect or incomplete.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Date is not a business day for the security market.
	 */
	public static final MMCode NotBusinessDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotBusinessDay";
			definition = "Date is not a business day for the security market.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BDAY";
		}
	};
	/**
	 * Effective date is after the payment date.
	 */
	public static final MMCode EffectiveDayAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			definition = "Effective date is after the payment date.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PDAY";
		}
	};
	/**
	 * Gross amount is less than net amount.
	 */
	public static final MMCode GrossAmountLessThanNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			definition = "Gross amount is less than net amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "GAMN";
		}
	};
	/**
	 * One option must be marked as the default.
	 */
	public static final MMCode MissingDefaultOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDefaultOption";
			definition = "One option must be marked as the default.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Party is not active.
	 */
	public static final MMCode NonActiveParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonActiveParty";
			definition = "Party is not active.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NPAT";
		}
	};
	/**
	 * Period ending date is before period starting date.
	 */
	public static final MMCode PeriodEndDateBeforeStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			definition = "Period ending date is before period starting date.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PERI";
		}
	};
	/**
	 * Record date is after payment date.
	 */
	public static final MMCode RecordDateAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateAfterPaymentDate";
			definition = "Record date is after payment date.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "RDTE";
		}
	};
	/**
	 * Validation of the advice/instruction/request failed.
	 */
	public static final MMCode FailedValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			definition = "Validation of the advice/instruction/request failed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Rejected as the deactivation of the event is already completed.
	 */
	public static final MMCode EventAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventAlreadyDeactivated";
			definition = "Rejected as the deactivation of the event is already completed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * Cancellation request is rejected as there is no pending deactivation
	 * instruction.
	 */
	public static final MMCode NoPendingDeactivationInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPendingDeactivationInstruction";
			definition = "Cancellation request is rejected as there is no pending deactivation instruction.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PDEA";
		}
	};
	/**
	 * Amendment is not allowed.
	 */
	public static final MMCode AmendmentNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentNotAllowed";
			definition = "Amendment is not allowed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NAMD";
		}
	};
	/**
	 * Cancellation is not allowed.
	 */
	public static final MMCode CancellationNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationNotAllowed";
			definition = "Cancellation is not allowed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NCAN";
		}
	};
	/**
	 * Instruction/Request arrives too late.
	 */
	public static final MMCode Late = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			definition = "Instruction/Request arrives too late.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "LATT";
		}
	};
	/**
	 * Election advice is already cancelled.
	 */
	public static final MMCode ElectionAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyCancelled";
			definition = "Election advice is already cancelled.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Election advice is already amended.
	 */
	public static final MMCode ElectionAlreadyAmended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyAmended";
			definition = "Election advice is already amended.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ELEA";
		}
	};
	/**
	 * Agent corporate action deactivation instruction with the same
	 * identification already exists.
	 */
	public static final MMCode SameCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameCAIdentification";
			definition = "Agent corporate action deactivation instruction with the same identification already exists.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SAME";
		}
	};
	/**
	 * Invalid corporate action identification supplied.
	 */
	public static final MMCode InvalidCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			definition = "Invalid corporate action identification supplied.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "REFI";
		}
	};
	/**
	 * Invalid agent identification supplied.
	 */
	public static final MMCode InvalidAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			definition = "Invalid agent identification supplied.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "AGIN";
		}
	};
	/**
	 * Agent identification specified does not correspond to the main agent of
	 * the relating event.
	 */
	public static final MMCode NotMainAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotMainAgent";
			definition = "Agent identification specified does not correspond to the main agent of the relating event.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Invalid combination of corporate action option code and corporate action
	 * option number.
	 */
	public static final MMCode InvalidOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOption";
			definition = "Invalid combination of corporate action option code and corporate action option number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * Specified corporate action option already has a pending deactivation
	 * instruction.
	 */
	public static final MMCode PendingDeactivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeactivation";
			definition = "Specified corporate action option already has a pending deactivation instruction.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Unable to identify cash account.
	 */
	public static final MMCode NotIdentifiedCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCashAccount";
			definition = "Unable to identify cash account.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CASA";
		}
	};
	/**
	 * Unable to identify correspondent bank.
	 */
	public static final MMCode NotIdentifiedCorrespondentBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			definition = "Unable to identify correspondent bank.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Invalid standing instruction type for the specified underlying security.
	 */
	public static final MMCode InvalidStandingInstructionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidStandingInstructionType";
			definition = "Invalid standing instruction type for the specified underlying security.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * No holding for the specified underlying security.
	 */
	public static final MMCode NoHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoHolding";
			definition = "No holding for the specified underlying security.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NOHO";
		}
	};
	/**
	 * Insufficient balance.
	 */
	public static final MMCode InsufficientBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientBalance";
			definition = "Insufficient balance.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INHO";
		}
	};
	/**
	 * Several messages with the same identification.
	 */
	public static final MMCode SameIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			definition = "Several messages with the same identification.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SAID";
		}
	};
	/**
	 * Rejected as the deactivation of the option is already completed.
	 */
	public static final MMCode OptionAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAlreadyDeactivated";
			definition = "Rejected as the deactivation of the option is already completed.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DEAO";
		}
	};
	/**
	 * Corporate action event type does not correspond with the relating
	 * corporate action.
	 */
	public static final MMCode InvalidEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			definition = "Corporate action event type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INET";
		}
	};
	/**
	 * Underlying security identification does not correspond with the corporate
	 * action reference supplied.
	 */
	public static final MMCode InvalidUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			definition = "Underlying security identification does not correspond with the corporate action reference supplied.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INUS";
		}
	};
	/**
	 * Event processing type does not correspond with the relating corporate
	 * action.
	 */
	public static final MMCode InvalidEventProcessingType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			definition = "Event processing type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INPT";
		}
	};
	/**
	 * Mandatory/voluntary event type does not correspond with the relating
	 * corporate action.
	 */
	public static final MMCode InvalidMandatoryVoluntaryEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			definition = "Mandatory/voluntary event type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INMV";
		}
	};
	/**
	 * Details specified in the corporate action general information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 */
	public static final MMCode InvalidCorporateActionInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCorporateActionInformation";
			definition = "Details specified in the corporate action general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Message details specified in the instruction/request are inconsistent
	 * with those that were specified in the relating original message.
	 */
	public static final MMCode InvalidDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			definition = "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INDT";
		}
	};
	/**
	 * Specified corporate action has no remaining option to disable.
	 */
	public static final MMCode NoRemainingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRemainingOption";
			definition = "Specified corporate action has no remaining option to disable.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NORO";
		}
	};
	/**
	 * Issuer corporate action identification does not correspond with the
	 * corporate action identification supplied.
	 */
	public static final MMCode MismatchedCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchedCAIdentification";
			definition = "Issuer corporate action identification does not correspond with the corporate action identification supplied.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MICA";
		}
	};
	/**
	 * Instruction type is not applicable for mandatory events.
	 */
	public static final MMCode NotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			definition = "Instruction type is not applicable for mandatory events.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NOAP";
		}
	};
	/**
	 * Details specified in the movement general information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 */
	public static final MMCode InvalidMovementInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMovementInformation";
			definition = "Details specified in the movement general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INMO";
		}
	};
	/**
	 * One or more of the underlying movements have already settled.
	 */
	public static final MMCode MovementAlreadySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementAlreadySettled";
			definition = "One or more of the underlying movements have already settled.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MOSE";
		}
	};
	/**
	 * See narrative field for reason.
	 */
	public static final MMCode NarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Instruction contains an invalid message identification, identification is
	 * unknown.
	 */
	public static final MMCode InvalidIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			definition = "Instruction contains an invalid message identification, identification is unknown.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Certification has not been filled in.
	 */
	public static final MMCode MissingCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Certification has not been filled in.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Required stamp duty information is missing.
	 */
	public static final MMCode LackOfStampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			definition = "Required stamp duty information is missing.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Statement/status advice request cannot be executed. The message type
	 * requested is not valid for the message reference or statement period
	 * concerned.
	 */
	public static final MMCode InvalidRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRequest";
			definition = "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Unrecognised, invalid or missing place of safekeeping.
	 */
	public static final MMCode PlaceOfSafekeeping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Unrecognised, invalid or missing place of safekeeping.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INPS";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Unrecognised or invalid client of delivering or receiving party 2.
	 */
	public static final MMCode ReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Unrecognised or invalid client of delivering or receiving party 2.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Unrecognised or invalid client of delivering or receiving party 1.
	 */
	public static final MMCode ReceivingDeliveringParty2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Unrecognised or invalid client of delivering or receiving party 1.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Unrecognised or invalid participant of delivering or receiving
	 * depository.
	 */
	public static final MMCode ReceivingDeliveringParty1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Unrecognised or invalid participant of delivering or receiving depository.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Unrecognised or invalid depository.
	 */
	public static final MMCode ReceivingDeliveringDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Unrecognised or invalid depository.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Invalid or unrecognized modification request.
	 */
	public static final MMCode InvalidModificationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidModificationRequest";
			definition = "Invalid or unrecognized modification request.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVM";
		}
	};
	/**
	 * Invalid or unrecognized link.
	 */
	public static final MMCode InvalidLink = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			definition = "Invalid or unrecognized link.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVL";
		}
	};
	/**
	 * Instruction aims at using an invalid balance.
	 */
	public static final MMCode InvalidBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			definition = "Instruction aims at using  an invalid balance.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVB";
		}
	};
	/**
	 * Invalid or unrecognized lot number.
	 */
	public static final MMCode InvalidLotNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			definition = "Invalid or unrecognized lot number.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVN";
		}
	};
	/**
	 * Account servicer validation rule rejection.
	 */
	public static final MMCode InvalidRule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			definition = "Account servicer validation rule rejection.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "VALR";
		}
	};
	/**
	 * Unrecognised or invalid place of listing. Used when the security
	 * identified is not listed on the market supplied.
	 */
	public static final MMCode PlaceOfListing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Unrecognised or invalid place of listing. Used when the security identified is not listed on the market supplied.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "PLIS";
		}
	};
	/**
	 * Unrecognised or invalid investor party. May be used by an executing party
	 * to reject an instruction for an investor (or portfolio) for which it is
	 * not authorised to act.
	 */
	public static final MMCode InvalidInvestorParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			definition = "Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Rejected due to missing beneficiary owner details.
	 */
	public static final MMCode MissingBeneficiaryOwnerDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			definition = "Rejected due to missing beneficiary owner details.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "BOIS";
		}
	};
	/**
	 * Unrecognised or invalid closing closing amount.
	 */
	public static final MMCode ClosingTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing closing amount.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "CTRA";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "ODNP";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TQHI";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TNAR";
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
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "TNIU";
		}
	};
	/**
	 * Reason is not available or unknown.
	 */
	public static final MMCode NotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Reason is not available or unknown.";
			owner_lazy = () -> RejectionReasonV2Code.mmObject();
			codeName = "NTAV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ULNK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonV2Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonV2Code.InsufficientMoney, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidReference,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.InsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReasonV2Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SplitVoteNotAllowed, com.tools20022.repository.codeset.RejectionReasonV2Code.PartialVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReasonV2Code.ProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReasonV2Code.RegistrationDiscrepancy, com.tools20022.repository.codeset.RejectionReasonV2Code.RejectedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReasonV2Code.InstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReasonV2Code.OptionCancelled, com.tools20022.repository.codeset.RejectionReasonV2Code.OptionInactive,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReasonV2Code.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReasonV2Code.LackofSecurities, com.tools20022.repository.codeset.RejectionReasonV2Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV2Code.Mismatch, com.tools20022.repository.codeset.RejectionReasonV2Code.OptionNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidOptionType, com.tools20022.repository.codeset.RejectionReasonV2Code.RejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReasonV2Code.RejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReasonV2Code.UnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReasonV2Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReasonV2Code.ClosedExchange, com.tools20022.repository.codeset.RejectionReasonV2Code.ExceedsLimit,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TooLate, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidPrice, com.tools20022.repository.codeset.RejectionReasonV2Code.NotAuthorised,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoMatchInquiry, com.tools20022.repository.codeset.RejectionReasonV2Code.NoInstrumentMarket,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoInventory, com.tools20022.repository.codeset.RejectionReasonV2Code.Pass, com.tools20022.repository.codeset.RejectionReasonV2Code.PriceExceeds,
						com.tools20022.repository.codeset.RejectionReasonV2Code.QuantityExceeds, com.tools20022.repository.codeset.RejectionReasonV2Code.WrongSide,
						com.tools20022.repository.codeset.RejectionReasonV2Code.CalculationDifference, com.tools20022.repository.codeset.RejectionReasonV2Code.InsufficientCredit,
						com.tools20022.repository.codeset.RejectionReasonV2Code.AgreementStartDate, com.tools20022.repository.codeset.RejectionReasonV2Code.TransactionCallDelay,
						com.tools20022.repository.codeset.RejectionReasonV2Code.CashAccount, com.tools20022.repository.codeset.RejectionReasonV2Code.DealPrice, com.tools20022.repository.codeset.RejectionReasonV2Code.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReasonV2Code.DeliveringCustodian, com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingCustodian,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotFoundRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.QuantityUnitType,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReasonV2Code.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.PremiumAmount, com.tools20022.repository.codeset.RejectionReasonV2Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReasonV2Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TradedSecuritiesQuantity, com.tools20022.repository.codeset.RejectionReasonV2Code.TradeDate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingAgent, com.tools20022.repository.codeset.RejectionReasonV2Code.Intermediary, com.tools20022.repository.codeset.RejectionReasonV2Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectionReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SettlementAmountCurrencyRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.LetterOfGuaranteeIndicatorRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MissingCreditAuthorisation, com.tools20022.repository.codeset.RejectionReasonV2Code.AddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReasonV2Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingStatutes,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotStampedOrSigned, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidSignature,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ShareholderNumberRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoMatch, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingLegalPower,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ProcessingBatchRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.TypeOfOwnershipRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RejectionReasonV2Code.WrongRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.DisagreementInRegistrationReason,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MissingRegistrationRequest, com.tools20022.repository.codeset.RejectionReasonV2Code.SettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.NarrativeInformationRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.IncorrectProgramConversion, com.tools20022.repository.codeset.RejectionReasonV2Code.InsufficientCollateral,
						com.tools20022.repository.codeset.RejectionReasonV2Code.BusinessPartnerNumberRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.BankReferenceNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TypeOfOrderRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReasonV2Code.CommercializationContractRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ConcentrationLimitExceeded, com.tools20022.repository.codeset.RejectionReasonV2Code.UnknownDealExposure,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SettlementDateRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.DisagreeWithCallAmount,
						com.tools20022.repository.codeset.RejectionReasonV2Code.DisagreeWithExposureAmount, com.tools20022.repository.codeset.RejectionReasonV2Code.RegistrationRequestDataAndOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.IncorrectActivityType,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.ClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReasonV2Code.VariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingOption,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotDefinedAgent, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingPeriodEndDate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MissingPeriodStartDate, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingResultingAmount,
						com.tools20022.repository.codeset.RejectionReasonV2Code.WrongSecurityType, com.tools20022.repository.codeset.RejectionReasonV2Code.NotEligibleDisperseSecurity,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NonEligibleSecurity, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ValueDateBeforePaymentDate, com.tools20022.repository.codeset.RejectionReasonV2Code.UnexpectedAccruedInterest,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoAccessToService, com.tools20022.repository.codeset.RejectionReasonV2Code.IncorrectCertification,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotBusinessDay, com.tools20022.repository.codeset.RejectionReasonV2Code.EffectiveDayAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.GrossAmountLessThanNetAmount, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingDefaultOption,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NonActiveParty, com.tools20022.repository.codeset.RejectionReasonV2Code.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.RejectionReasonV2Code.RecordDateAfterPaymentDate, com.tools20022.repository.codeset.RejectionReasonV2Code.FailedValidation,
						com.tools20022.repository.codeset.RejectionReasonV2Code.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonV2Code.NoPendingDeactivationInstruction,
						com.tools20022.repository.codeset.RejectionReasonV2Code.AmendmentNotAllowed, com.tools20022.repository.codeset.RejectionReasonV2Code.CancellationNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV2Code.Late, com.tools20022.repository.codeset.RejectionReasonV2Code.ElectionAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ElectionAlreadyAmended, com.tools20022.repository.codeset.RejectionReasonV2Code.SameCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidCAIdentification, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidAgent,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotMainAgent, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidOption,
						com.tools20022.repository.codeset.RejectionReasonV2Code.PendingDeactivation, com.tools20022.repository.codeset.RejectionReasonV2Code.NotIdentifiedCashAccount,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotIdentifiedCorrespondentBank, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidStandingInstructionType,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoHolding, com.tools20022.repository.codeset.RejectionReasonV2Code.InsufficientBalance,
						com.tools20022.repository.codeset.RejectionReasonV2Code.SameIdentification, com.tools20022.repository.codeset.RejectionReasonV2Code.OptionAlreadyDeactivated,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidEventType, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidUnderlyingSecurity,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidEventProcessingType, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidMandatoryVoluntaryEventType,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidCorporateActionInformation, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidDetails,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NoRemainingOption, com.tools20022.repository.codeset.RejectionReasonV2Code.MismatchedCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotApplicable, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidMovementInformation,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MovementAlreadySettled, com.tools20022.repository.codeset.RejectionReasonV2Code.NarrativeReason,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidIdentification, com.tools20022.repository.codeset.RejectionReasonV2Code.MissingCertification,
						com.tools20022.repository.codeset.RejectionReasonV2Code.LackOfStampDuty, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidRequest,
						com.tools20022.repository.codeset.RejectionReasonV2Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RejectionReasonV2Code.Other,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RejectionReasonV2Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidModificationRequest, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidLink,
						com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidBalance, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidLotNumber, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidRule,
						com.tools20022.repository.codeset.RejectionReasonV2Code.PlaceOfListing, com.tools20022.repository.codeset.RejectionReasonV2Code.InvalidInvestorParty,
						com.tools20022.repository.codeset.RejectionReasonV2Code.MissingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.RejectionReasonV2Code.ClosingTransactionAmount,
						com.tools20022.repository.codeset.RejectionReasonV2Code.OrderDateNotProvided, com.tools20022.repository.codeset.RejectionReasonV2Code.TradedQuantityHigherThanOriginalOrderQuantity,
						com.tools20022.repository.codeset.RejectionReasonV2Code.TransactionNoticeAlreadyAcceptedOrRejected, com.tools20022.repository.codeset.RejectionReasonV2Code.TransactionNoticeIDUnknown,
						com.tools20022.repository.codeset.RejectionReasonV2Code.NotAvailable);
			}
		});
		return mmObject_lazy.get();
	}
}
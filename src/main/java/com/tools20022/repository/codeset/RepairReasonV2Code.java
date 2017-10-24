package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction is in repair.
 */
public class RepairReasonV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unrecognised or invalid closing transaction amount.
	 */
	public static final MMCode ClosingTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing transaction amount.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "CTRA";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 */
	public static final MMCode ProcessingBatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatch";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "BATC";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 */
	public static final MMCode CorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "CAEV";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "CASH";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 */
	public static final MMCode SettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DDAT";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 */
	public static final MMCode SettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Unrecognised or invalid settlement quantity.
	 */
	public static final MMCode Quantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Unrecognised or invalid settlement quantity.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Unrecognised or invalid trade date.
	 */
	public static final MMCode TradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DTRD";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 */
	public static final MMCode CommonReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 */
	public static final MMCode LetterOfGuaranteeIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicator";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "LEOG";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "MINO";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 */
	public static final MMCode SettlementAmountCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "NCRR";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "PHYS";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 */
	public static final MMCode Reference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "REFE";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Impossible to use the RTGS system instructed (NRTG or YRTG).
	 */
	public static final MMCode ImpossibleToUseTheRTGSSystemInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "Impossible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid message sender's safekeeping account.
	 */
	public static final MMCode SafekeepingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Unrecognised or invalid message sender's safekeeping account.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 */
	public static final MMCode SettlementTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 */
	public static final MMCode SettlementSystemMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 */
	public static final MMCode ClosingDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 */
	public static final MMCode TaxStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 */
	public static final MMCode VariableRateSupport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 */
	public static final MMCode TypeOfOrderRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRepair";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Unrecognized or invalid commercialization contract.
	 */
	public static final MMCode CommercializationContractRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRepair";
			definition = "Unrecognized or invalid commercialization contract.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 */
	public static final MMCode FeeCommissionRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRepair";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement pre-agreed narrative
	 * information.
	 */
	public static final MMCode NarrativeInformationRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRepair";
			definition = "Unrecognised or invalid service level agreement pre-agreed narrative information.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Cancellation request is in repair since more than one instruction match
	 * to the cancellation criteria.
	 */
	public static final MMCode NoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "Cancellation request is in repair since more than one instruction match to the cancellation criteria.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Cancellation request is in repair since the instruction could not be
	 * found.
	 */
	public static final MMCode NotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFound";
			definition = "Cancellation request is in repair since the instruction could not be found.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Message was not recognised. Unknown linked reference.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Message was not recognised. Unknown linked reference.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Unrecognised, invalid or missing Place of Safekeeping.
	 */
	public static final MMCode PlaceOfSafekeeping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Unrecognised, invalid or missing Place of Safekeeping.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "INPS";
		}
	};
	/**
	 * Required stamp duty information is missing.
	 */
	public static final MMCode StampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Required stamp duty information is missing.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "SDUT";
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
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Depository mismatch.
	 */
	public static final MMCode ReceivingDeliveringDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Depository mismatch.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Client of delivering or receiving party 2 mismatch.
	 */
	public static final MMCode ReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Client of delivering or receiving party 2 mismatch.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Client of delivering or receiving party 1 mismatch.
	 */
	public static final MMCode ReceivingDeliveringParty2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Client of delivering or receiving party 1 mismatch.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Participant of delivering or receiving depository mismatch.
	 */
	public static final MMCode ReceivingDeliveringParty1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Participant of delivering or receiving depository mismatch.";
			owner_lazy = () -> RepairReasonV2Code.mmObject();
			codeName = "ICAG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CTRA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepairReasonV2Code";
				definition = "Specifies the reason why the instruction is in repair.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepairReasonV2Code.ClosingTransactionAmount, com.tools20022.repository.codeset.RepairReasonV2Code.NarrativeReason,
						com.tools20022.repository.codeset.RepairReasonV2Code.ProcessingBatch, com.tools20022.repository.codeset.RepairReasonV2Code.TransactionCallDelay, com.tools20022.repository.codeset.RepairReasonV2Code.CorporateAction,
						com.tools20022.repository.codeset.RepairReasonV2Code.CashAccount, com.tools20022.repository.codeset.RepairReasonV2Code.ImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RepairReasonV2Code.SettlementDate, com.tools20022.repository.codeset.RepairReasonV2Code.DealPrice, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementAmount,
						com.tools20022.repository.codeset.RepairReasonV2Code.Quantity, com.tools20022.repository.codeset.RepairReasonV2Code.Security, com.tools20022.repository.codeset.RepairReasonV2Code.TradeDate,
						com.tools20022.repository.codeset.RepairReasonV2Code.ForfeitAmount, com.tools20022.repository.codeset.RepairReasonV2Code.CommonReference,
						com.tools20022.repository.codeset.RepairReasonV2Code.LetterOfGuaranteeIndicator, com.tools20022.repository.codeset.RepairReasonV2Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RepairReasonV2Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementAmountCurrency,
						com.tools20022.repository.codeset.RepairReasonV2Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RepairReasonV2Code.PlaceOfTrade, com.tools20022.repository.codeset.RepairReasonV2Code.Reference,
						com.tools20022.repository.codeset.RepairReasonV2Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RepairReasonV2Code.RepurchaseRate,
						com.tools20022.repository.codeset.RepairReasonV2Code.PremiumAmount, com.tools20022.repository.codeset.RepairReasonV2Code.RepurchaseRateType, com.tools20022.repository.codeset.RepairReasonV2Code.SpreadRate,
						com.tools20022.repository.codeset.RepairReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RepairReasonV2Code.SafekeepingAccount,
						com.tools20022.repository.codeset.RepairReasonV2Code.SettlementTransaction, com.tools20022.repository.codeset.RepairReasonV2Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.RepairReasonV2Code.ClosingDateTime, com.tools20022.repository.codeset.RepairReasonV2Code.TaxStatus, com.tools20022.repository.codeset.RepairReasonV2Code.VariableRateSupport,
						com.tools20022.repository.codeset.RepairReasonV2Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepairReasonV2Code.TypeOfOrderRepair,
						com.tools20022.repository.codeset.RepairReasonV2Code.CommercializationContractRepair, com.tools20022.repository.codeset.RepairReasonV2Code.FeeCommissionRepair,
						com.tools20022.repository.codeset.RepairReasonV2Code.NarrativeInformationRepair, com.tools20022.repository.codeset.RepairReasonV2Code.NoMatch, com.tools20022.repository.codeset.RepairReasonV2Code.NotFound,
						com.tools20022.repository.codeset.RepairReasonV2Code.Unknown, com.tools20022.repository.codeset.RepairReasonV2Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RepairReasonV2Code.StampDuty,
						com.tools20022.repository.codeset.RepairReasonV2Code.Other, com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RepairReasonV2Code.ReceivingDeliveringParty1);
			}
		});
		return mmObject_lazy.get();
	}
}
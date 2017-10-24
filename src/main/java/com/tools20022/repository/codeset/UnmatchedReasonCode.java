package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction, transfer or settlement instruction is
 * unmatched.
 */
public class UnmatchedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * OtherIdentification of financial instrument identification does not
	 * match.
	 */
	public static final MMCode OtherFinancialInstrumentIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstrumentIdentification";
			definition = "OtherIdentification of financial instrument identification does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "OTHI";
		}
	};
	/**
	 * LendingWithCollateral does not match.
	 */
	public static final MMCode LendingWithCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingWithCollateral";
			definition = "LendingWithCollateral does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "LWCO";
		}
	};
	/**
	 * Lending transaction method does not match.
	 */
	public static final MMCode LendingTransactionMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Lending transaction method does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "LTME";
		}
	};
	/**
	 * CallableTradeIndicator does not match.
	 */
	public static final MMCode CallableTradeIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableTradeIndicator";
			definition = "CallableTradeIndicator does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CATI";
		}
	};
	/**
	 * Position effect does not match.
	 */
	public static final MMCode PositionEffect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Position effect does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "POSE";
		}
	};
	/**
	 * Type of financing closing does not match.
	 */
	public static final MMCode TypeOfFinancingClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfFinancingClosing";
			definition = "Type of financing closing does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TRTE";
		}
	};
	/**
	 * Settlement date in the second leg does not match.
	 */
	public static final MMCode SettlementDate2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate2";
			definition = "Settlement date in the second leg does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SDAT";
		}
	};
	/**
	 * Borrowing rate does not match.
	 */
	public static final MMCode BorrowingRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingRate";
			definition = "Borrowing rate does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "BORT";
		}
	};
	/**
	 * ClientOrderLinkIdentification does not match.
	 */
	public static final MMCode ClientOrderLinkIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "ClientOrderLinkIdentification does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "OLID";
		}
	};
	/**
	 * OpeningLegIdentification does not match.
	 */
	public static final MMCode OpeningLegIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningLegIdentification";
			definition = "OpeningLegIdentification does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "OPLI";
		}
	};
	/**
	 * End factor does not match.
	 */
	public static final MMCode EndFactor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndFactor";
			definition = "End factor does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ENFC";
		}
	};
	/**
	 * Current factor does not match.
	 */
	public static final MMCode CurrentFactor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			definition = "Current factor does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CUFC";
		}
	};
	/**
	 * Maturity date does not match.
	 */
	public static final MMCode MaturityDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Maturity date does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "MADA";
		}
	};
	/**
	 * Closing settlement amount does not match.
	 */
	public static final MMCode ClosingSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingSettlementAmount";
			definition = "Closing settlement amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TRSA";
		}
	};
	/**
	 * Accrued interest amount in the second leg does not match.
	 */
	public static final MMCode AccruedInterestAmount2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount2";
			definition = "Accrued interest amount in the second leg does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ACRS";
		}
	};
	/**
	 * Deal amount in the second leg does not match.
	 */
	public static final MMCode DealAmount2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount2";
			definition = "Deal amount in the second leg does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DEAS";
		}
	};
	/**
	 * Borrowing fee does not match.
	 */
	public static final MMCode BorrowingFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingFee";
			definition = "Borrowing fee does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "BOFE";
		}
	};
	/**
	 * Borrowing interest amount does not match.
	 */
	public static final MMCode BorrowingInterestAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingInterestAmount";
			definition = "Borrowing interest amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "BOIA";
		}
	};
	/**
	 * Securities haircut rate does not match.
	 */
	public static final MMCode SecuritiesHaircut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Securities haircut rate does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SHAI";
		}
	};
	/**
	 * Standard collateral ratio does not match.
	 */
	public static final MMCode StandardCollateralRatio = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralRatio";
			definition = "Standard collateral ratio does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SCRA";
		}
	};
	/**
	 * Accrued interest tax indicator in the second leg does not match.
	 */
	public static final MMCode AccruedInterestTax2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax2";
			definition = "Accrued interest tax indicator in the second leg does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TACS";
		}
	};
	/**
	 * Interest type does not match.
	 */
	public static final MMCode InterestType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Interest type does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "INTT";
		}
	};
	/**
	 * See narrative field for the reason.
	 */
	public static final MMCode NarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for the reason.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Counterparty's instruction is for settlement through clearing segment,
	 * your instruction is not, or vice versa.
	 */
	public static final MMCode ClearingSegment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Counterparty's instruction is for settlement through clearing segment, your instruction is not, or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CLSE";
		}
	};
	/**
	 * Counterparty's instruction is for settlement through standing settlement
	 * instruction, your instruction is not, or vice versa.
	 */
	public static final MMCode StandingSettlementInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Counterparty's instruction is for settlement through standing settlement instruction, your instruction is not, or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DBNM";
		}
	};
	/**
	 * Accrued interest tax indicator does not match.
	 */
	public static final MMCode AccruedInterestTax1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax1";
			definition = "Accrued interest tax indicator does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TACR";
		}
	};
	/**
	 * Trade transaction type does not match.
	 */
	public static final MMCode TradeTransactionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionType";
			definition = "Trade transaction type does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TRTR";
		}
	};
	/**
	 * CommonIdentification does not match.
	 */
	public static final MMCode CommonIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "CommonIdentification does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "COID";
		}
	};
	/**
	 * Accrued interest amount does not match.
	 */
	public static final MMCode AccruedInterestAmount1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount1";
			definition = "Accrued interest amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Consumption tax amount does not match.
	 */
	public static final MMCode ConsumptionTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			definition = "Consumption tax amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "COAX";
		}
	};
	/**
	 * A matching instruction from your counterparty could not be found.
	 */
	public static final MMCode NoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "A matching instruction from your counterparty could not be found.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CMIS";
		}
	};
	/**
	 * Settlement date/time does not match.
	 */
	public static final MMCode SettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date/time does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Direction of the trade does not match. Counterparty expects a delivery
	 * from you, not a receipt or vice versa.
	 */
	public static final MMCode TransactionDirection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			definition = "Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DELN";
		}
	};
	/**
	 * Deal amount does not match.
	 */
	public static final MMCode TransactionDealAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDealAmount";
			definition = "Deal amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DEAL";
		}
	};
	/**
	 * Depository does not match.
	 */
	public static final MMCode ReceivingDeliveringDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Depository does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Settlement amount does not match
	 */
	public static final MMCode SettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement amount does not match";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Deal price does not match.
	 */
	public static final MMCode DealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Deal price does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Quantity of financial instruments does not match.
	 */
	public static final MMCode FinancialInstrumentQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instruments does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Transaction call delay does not match.
	 */
	public static final MMCode RepurchaseCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCallDelay";
			definition = "Transaction call delay does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CADE";
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
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Settlement transaction type does not match (relates to the settlement
	 * transaction type codes available for field :22F::SETR.)
	 */
	public static final MMCode SettlementTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Settlement transaction type does not match (relates to the settlement transaction type codes available for field :22F::SETR.)";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Settlement system/method does not match (for example, instruction is to
	 * settle using settlement system/method A. Counterparty expects settlement
	 * to occur using settlement system/method B).
	 */
	public static final MMCode SettlementSystemMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B).";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Financial instrument identification does not match, for example, ISIN,
	 * financial instrument attributes differs...
	 */
	public static final MMCode FinancialInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs...";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Variable rate support does not match (repo).
	 */
	public static final MMCode VariableRateSupport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Variable rate support does not match (repo).";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Counterparty has been contacted or contacted us, and does not recognise
	 * the transaction.
	 */
	public static final MMCode NotRecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty has been contacted or contacted us, and does not recognise the transaction.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Spread rate does not match.
	 */
	public static final MMCode RepurchaseSpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseSpreadRate";
			definition = "Spread rate does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Repurchase rate does not match.
	 */
	public static final MMCode RepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Counterparty's instruction was too late for matching
	 */
	public static final MMCode CounterpartyTooLateForMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late for matching";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Repurchase rate type does not match.
	 */
	public static final MMCode RepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Termination transaction amount does not match.
	 */
	public static final MMCode RepurchaseAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAmount";
			definition = "Termination transaction amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Premium amount does not match.
	 */
	public static final MMCode RepurchasePremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchasePremiumAmount";
			definition = "Premium amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Counterparty's instruction is physical settlement, your instruction is
	 * not, or vice versa.
	 */
	public static final MMCode PhysicalSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			definition = "Counterparty's instruction is physical settlement, your instruction is not, or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Common reference does not match.
	 */
	public static final MMCode CommonReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Common reference does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Payment type does not match: your instruction is free of payment, your
	 * counterparty's instruction is against payment or vice versa.
	 */
	public static final MMCode PaymentCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "FRAP";
		}
	};
	/**
	 * Place of trade does not match.
	 */
	public static final MMCode PlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has not been matched. It is a possible duplicate instruction.
	 */
	public static final MMCode PossibleDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Instruction has not been matched. It is a possible duplicate instruction.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "PODU";
		}
	};
	/**
	 * Forfeit amount does not match.
	 */
	public static final MMCode ForfeitRepurchaseAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Forfeit amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Executing broker's commission does not match.
	 */
	public static final MMCode ExecutionBrokerCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionBrokerCommission";
			definition = "Executing broker's commission does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Registration details linked to the transaction are incorrect.
	 */
	public static final MMCode RegistrationDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Registration details linked to the transaction are incorrect.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * Counterparty is for Real Time Gross Settlement (RTGS) system, you are for
	 * non-RTGS or vice versa.
	 */
	public static final MMCode RTGSSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			definition = "Counterparty is for Real Time Gross Settlement (RTGS) system, you are for non-RTGS or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Participant of delivering or receiving depository does not match.
	 */
	public static final MMCode ReceivingDeliveringParty1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Participant of delivering or receiving depository does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Counterparty cancelled their instruction.
	 */
	public static final MMCode CounterpartyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			definition = "Counterparty cancelled their instruction.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CPCA";
		}
	};
	/**
	 * Charges amount does not match.
	 */
	public static final MMCode ChargesAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Charges amount does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Client of delivering or receiving party 2 does not match.
	 */
	public static final MMCode ReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Client of delivering or receiving party 2 does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Settlement amount currency does not match.
	 */
	public static final MMCode CurrencySettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencySettlementAmount";
			definition = "Settlement amount currency does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Corresponding matching record has been cancelled.
	 */
	public static final MMCode MatchingRecordCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingRecordCancelled";
			definition = "Corresponding matching record has been cancelled.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "MCAN";
		}
	};
	/**
	 * Counterparty is for settlement through letter of guarantee, your
	 * instruction is not, or vice versa.
	 */
	public static final MMCode LetterOfGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Matching process has not yet started.
	 */
	public static final MMCode NoMatchingStarted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Safekeeping account used as matching criteria on the market concerned
	 * does not match. This includes Buyer/seller's account, direct client's
	 * account at the receiving/delivering agent, or receiving/delivering
	 * agent's account at the CSD.
	 */
	public static final MMCode SafekeepingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping account used as matching criteria on the market concerned does not match. This includes Buyer/seller's account, direct client's account at the receiving/delivering agent, or receiving/delivering agent's account at the CSD.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Trade date does not match.
	 */
	public static final MMCode TradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Trade date does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Your instruction was too late for matching.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Your instruction was too late for matching.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Closing date/time does not match.
	 */
	public static final MMCode ClosingDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Disagreement on the tax status of the financial instruments to be
	 * settled.
	 */
	public static final MMCode TaxStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			definition = "Disagreement on the tax status of the financial instruments to be settled.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Client of delivering or receiving party 1 does not match.
	 */
	public static final MMCode ReceivingDeliveringParty2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Client of delivering or receiving party 1 does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Proprietary unmatched reason code described in a narrative field.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Proprietary unmatched reason code described in a narrative field.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Missing market execution details.
	 */
	public static final MMCode MissingMarketSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMarketSide";
			definition = "Missing market execution details.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "MIME";
		}
	};
	/**
	 * Market side trade is unmatched.
	 */
	public static final MMCode UnmatchedMarketSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedMarketSide";
			definition = "Market side trade is unmatched.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "UNBR";
		}
	};
	/**
	 * Place of safekeeping information does not allow matching to take place.
	 */
	public static final MMCode PlaceOfSafekeeping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Place of safekeeping information does not allow matching to take place.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "INPS";
		}
	};
	/**
	 * Investor party does not match.
	 */
	public static final MMCode InvestorParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorParty";
			definition = "Investor party does not match.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Place of listing does not match
	 */
	public static final MMCode PlaceOfListing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place of listing does not match";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "PLIS";
		}
	};
	/**
	 * Disagreement if trade was executed cum or ex.
	 */
	public static final MMCode CumEx = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumEx";
			definition = "Disagreement if trade was executed cum or ex.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DCMX";
		}
	};
	/**
	 * Disagreement on automatic generation of market claim or transformation.
	 */
	public static final MMCode AutomaticGeneration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticGeneration";
			definition = "Disagreement on automatic generation of market claim or transformation.";
			owner_lazy = () -> UnmatchedReasonCode.mmObject();
			codeName = "DMCT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OTHI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReasonCode";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReasonCode.OtherFinancialInstrumentIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.LendingWithCollateral,
						com.tools20022.repository.codeset.UnmatchedReasonCode.LendingTransactionMethod, com.tools20022.repository.codeset.UnmatchedReasonCode.CallableTradeIndicator,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PositionEffect, com.tools20022.repository.codeset.UnmatchedReasonCode.TypeOfFinancingClosing,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementDate2, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingRate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClientOrderLinkIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.OpeningLegIdentification,
						com.tools20022.repository.codeset.UnmatchedReasonCode.EndFactor, com.tools20022.repository.codeset.UnmatchedReasonCode.CurrentFactor, com.tools20022.repository.codeset.UnmatchedReasonCode.MaturityDate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClosingSettlementAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestAmount2,
						com.tools20022.repository.codeset.UnmatchedReasonCode.DealAmount2, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingFee, com.tools20022.repository.codeset.UnmatchedReasonCode.BorrowingInterestAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SecuritiesHaircut, com.tools20022.repository.codeset.UnmatchedReasonCode.StandardCollateralRatio,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestTax2, com.tools20022.repository.codeset.UnmatchedReasonCode.InterestType, com.tools20022.repository.codeset.UnmatchedReasonCode.NarrativeReason,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClearingSegment, com.tools20022.repository.codeset.UnmatchedReasonCode.StandingSettlementInstruction,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestTax1, com.tools20022.repository.codeset.UnmatchedReasonCode.TradeTransactionType,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CommonIdentification, com.tools20022.repository.codeset.UnmatchedReasonCode.AccruedInterestAmount1,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ConsumptionTax, com.tools20022.repository.codeset.UnmatchedReasonCode.NoMatch, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReasonCode.TransactionDealAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringDepository, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.DealPrice, com.tools20022.repository.codeset.UnmatchedReasonCode.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseCallDelay, com.tools20022.repository.codeset.UnmatchedReasonCode.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReasonCode.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReasonCode.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReasonCode.VariableRateSupport,
						com.tools20022.repository.codeset.UnmatchedReasonCode.NotRecognised, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseSpreadRate, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseRateType,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchaseAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PhysicalSettlement, com.tools20022.repository.codeset.UnmatchedReasonCode.CommonReference, com.tools20022.repository.codeset.UnmatchedReasonCode.PaymentCode,
						com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfTrade, com.tools20022.repository.codeset.UnmatchedReasonCode.PossibleDuplicate,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ForfeitRepurchaseAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.ExecutionBrokerCommission,
						com.tools20022.repository.codeset.UnmatchedReasonCode.RegistrationDetails, com.tools20022.repository.codeset.UnmatchedReasonCode.RTGSSystem,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty1, com.tools20022.repository.codeset.UnmatchedReasonCode.CounterpartyCancelled,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ChargesAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.UnmatchedReasonCode.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedReasonCode.MatchingRecordCancelled,
						com.tools20022.repository.codeset.UnmatchedReasonCode.LetterOfGuarantee, com.tools20022.repository.codeset.UnmatchedReasonCode.NoMatchingStarted,
						com.tools20022.repository.codeset.UnmatchedReasonCode.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedReasonCode.TradeDate, com.tools20022.repository.codeset.UnmatchedReasonCode.MarketDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ClosingDateTime, com.tools20022.repository.codeset.UnmatchedReasonCode.TaxStatus,
						com.tools20022.repository.codeset.UnmatchedReasonCode.ReceivingDeliveringParty2, com.tools20022.repository.codeset.UnmatchedReasonCode.Other, com.tools20022.repository.codeset.UnmatchedReasonCode.MissingMarketSide,
						com.tools20022.repository.codeset.UnmatchedReasonCode.UnmatchedMarketSide, com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.UnmatchedReasonCode.InvestorParty, com.tools20022.repository.codeset.UnmatchedReasonCode.PlaceOfListing, com.tools20022.repository.codeset.UnmatchedReasonCode.CumEx,
						com.tools20022.repository.codeset.UnmatchedReasonCode.AutomaticGeneration);
			}
		});
		return mmObject_lazy.get();
	}
}
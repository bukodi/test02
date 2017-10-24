package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction, transfer or settlement instruction is
 * unmatched.
 */
public class UnmatchedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No potential match has been found.
	 */
	public static final MMCode NoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatch";
			definition = "No potential match has been found.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "CMIS";
		}
	};
	/**
	 * Settlement date or transfer date does not match.
	 */
	public static final MMCode SettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date or transfer date does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Direction of transaction does not match: delivery instead of receipt or
	 * vice versa.
	 */
	public static final MMCode TransactionDirection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionDirection";
			definition = "Direction of transaction does not match: delivery instead of receipt or vice versa.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DELN";
		}
	};
	/**
	 * Place of settlement does not match.
	 */
	public static final MMCode SettlementPlace = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPlace";
			definition = "Place of settlement does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Settlement amount does not match.
	 */
	public static final MMCode SettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Deal price does not match.
	 */
	public static final MMCode DealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Deal price does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Financial instrument quantity does not match.
	 */
	public static final MMCode FinancialInstrumentQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Financial instrument quantity does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Repurchase call delay does not match.
	 */
	public static final MMCode RepurchaseCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseCallDelay";
			definition = "Repurchase call delay does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Settlement transaction type does not match.
	 */
	public static final MMCode SettlementTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransaction";
			definition = "Settlement transaction type does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Financial instrument identification does not match or a financial
	 * instrument attribute differs.
	 */
	public static final MMCode FinancialInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrument";
			definition = "Financial instrument identification does not match or a financial instrument attribute differs.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Variable rate support does not match.
	 */
	public static final MMCode VariableRateSupport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Variable rate support does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Counterparty does not recognise the transaction.
	 */
	public static final MMCode NotRecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty does not recognise the transaction.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Repurchase spread rate does not match.
	 */
	public static final MMCode RepurchaseSpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpreadRate";
			definition = "Repurchase spread rate does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Repurchase rate does not match.
	 */
	public static final MMCode RepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Counterparty's instruction was too late for matching.
	 */
	public static final MMCode CounterpartyTooLateForMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late for matching.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "CLAT";
		}
	};
	/**
	 * Repurchase rate type does not match.
	 */
	public static final MMCode RepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Repurchase amount does not match.
	 */
	public static final MMCode RepurchaseAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAmount";
			definition = "Repurchase amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Repurchase premium amount does not match.
	 */
	public static final MMCode RepurchasePremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchasePremiumAmount";
			definition = "Repurchase premium amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Settlement does not match: counterparty's instruction is for physical
	 * settlement, your instruction is not, or vice versa.
	 */
	public static final MMCode PhysicalSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalSettlement";
			definition = "Settlement does not match: counterparty's instruction is for physical settlement, your instruction is not, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Common reference does not match.
	 */
	public static final MMCode CommonReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonReference";
			definition = "Common reference does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Payment code does not match. The counterparty's instruction is for free
	 * settlement, and yours is for settlement against payment, or vice versa.
	 */
	public static final MMCode PaymentCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCode";
			definition = "Payment code does not match. The counterparty's instruction is for free settlement, and yours is for settlement against payment, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "FRAP";
		}
	};
	/**
	 * Place of trade does not match.
	 */
	public static final MMCode PlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Instruction has not been matched: it is a possible duplicate instruction.
	 */
	public static final MMCode Duplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Duplicate";
			definition = "Instruction has not been matched: it is a possible duplicate instruction.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "PODU";
		}
	};
	/**
	 * Repurchase forfeit amount does not match.
	 */
	public static final MMCode ForfeitRepurchaseAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Repurchase forfeit amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Registration details do not match. A discrepancy exists in the
	 * registration details linked to the transaction.
	 */
	public static final MMCode RegistrationDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDetails";
			definition = "Registration details do not match. A discrepancy exists in the registration details linked to the transaction.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * RTGS system does not match. Counterparty indicates a settlement via RTGS
	 * system and you indicate non-RTGS settlement, or vice versa.
	 */
	public static final MMCode RTGSSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGSSystem";
			definition = "RTGS system does not match. Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Delivery or receiving agent does not match.
	 */
	public static final MMCode IncorrectAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectAgent";
			definition = "Delivery or receiving agent does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Counterparty has cancelled the transaction/instruction.
	 */
	public static final MMCode CounterpartyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterpartyCancelled";
			definition = "Counterparty has cancelled the transaction/instruction.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "CPCA";
		}
	};
	/**
	 * Charges amount does not match.
	 */
	public static final MMCode ChargesAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesAmount";
			definition = "Charges amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Buyer (receiver) or seller (deliverer) does not match.
	 */
	public static final MMCode BuyerOrSeller = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Buyer (receiver) or seller (deliverer) does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Currency of settlement amount does not match.
	 */
	public static final MMCode CurrencySettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencySettlementAmount";
			definition = "Currency of settlement amount does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Matching process has not yet started.
	 */
	public static final MMCode NoMatchingStarted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "NMAS";
		}
	};
	/**
	 * Safekeeping account used as a matching criteria on the market concerned
	 * does not match.
	 */
	public static final MMCode SafekeepingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping account used as a matching criteria on the market concerned does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Trade date does not match.
	 */
	public static final MMCode TradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeDate";
			definition = "Trade date does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Instruction received too late for matching.
	 */
	public static final MMCode TooLateForMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLateForMatching";
			definition = "Instruction received too late for matching.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Closing date/time does not match.
	 */
	public static final MMCode ClosingDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Delivering or receiving custodian does not match.
	 */
	public static final MMCode ReceivingOrDeliveringCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingOrDeliveringCustodian";
			definition = "Delivering or receiving custodian does not match.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Another unmatched reason.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another unmatched reason.";
			owner_lazy = () -> UnmatchedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnmatchedStatusReasonCode";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NoMatch, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TransactionDirection, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementPlace,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.DealPrice,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.FinancialInstrumentQuantity, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseCallDelay,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.FinancialInstrument,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.VariableRateSupport, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NotRecognised,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseSpreadRate, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseRate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseRateType,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchaseAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PhysicalSettlement, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CommonReference,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PaymentCode, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.PlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.Duplicate, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ForfeitRepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RegistrationDetails, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.RTGSSystem,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.IncorrectAgent, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CounterpartyCancelled,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ChargesAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.BuyerOrSeller,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.NoMatchingStarted,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TradeDate,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.TooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ClosingDateTime,
						com.tools20022.repository.codeset.UnmatchedStatusReasonCode.ReceivingOrDeliveringCustodian, com.tools20022.repository.codeset.UnmatchedStatusReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}
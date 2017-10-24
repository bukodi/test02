package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Collateral position is available for other purposes (for example, onwards
 * delivery).
 */
public class SettlementTransactionConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Partial settlement is allowed.
	 */
	public static final MMCode PartialAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialAllowed";
			definition = "Partial settlement is allowed.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Partial settlement is not allowed.
	 */
	public static final MMCode PartialNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialNotAllowed";
			definition = "Partial settlement is not allowed.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NPAR";
		}
	};
	/**
	 * Partial settlement is allowed but must satisfy a cash value minimum
	 * (value defined in static data).
	 */
	public static final MMCode PartialSettlementCashThresholdAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementCashThresholdAllowed";
			definition = "Partial settlement is  allowed but must satisfy a cash value minimum (value defined in static data).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PARC";
		}
	};
	/**
	 * Partial settlement is allowed but must satisfy a minimum quantity of
	 * securities (quantity defined in static data).
	 */
	public static final MMCode PartialSettlementQuantityThresholdAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementQuantityThresholdAllowed";
			definition = "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PARQ";
		}
	};
	/**
	 * Transfer of ownership of the asset to another party during the closing of
	 * an option.
	 */
	public static final MMCode Assignement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assignement";
			definition = "Transfer of ownership of the asset to another party during the closing of an option.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * Transaction is a buy to cover.
	 */
	public static final MMCode BuytoCover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuytoCover";
			definition = "Transaction is a buy to cover.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "BUTC";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 */
	public static final MMCode Clean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 */
	public static final MMCode Dirty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Matching receipt instruction not required (only for concerned
	 * international or national central securities depositories).
	 */
	public static final MMCode DeliveryWithoutMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryWithoutMatching";
			definition = "Matching receipt instruction not required (only for concerned international or national central securities depositories).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DLWM";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 */
	public static final MMCode Drawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are exercised.
	 */
	public static final MMCode Exercised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Delivery will be made free of payment but a clean payment order will be
	 * sent.
	 */
	public static final MMCode FreeCleanSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeCleanSettlement";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "FRCL";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are expired worthless.
	 */
	public static final MMCode KnockedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "KNOC";
		}
	};
	/**
	 * Securities are to be physically settled.
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Relates to transaction on a security that is not eligible at the Central
	 * Security Depository (CSD) but for which the payment will be enacted by
	 * the central securities depository.
	 */
	public static final MMCode Residual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residual";
			definition = "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RESI";
		}
	};
	/**
	 * Account is used for short sale orders.
	 */
	public static final MMCode ShortSell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortSell";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Settlement is in two different currencies.
	 */
	public static final MMCode SplitCurrencySettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitCurrencySettlement";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPCS";
		}
	};
	/**
	 * Settlement transactions to be settled with special delivery.
	 */
	public static final MMCode SpecialDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPDL";
		}
	};
	/**
	 * Money and financial instruments settle in different locations.
	 */
	public static final MMCode SplitSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitSettlement";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPST";
		}
	};
	/**
	 * Delivery cannot be performed until money is received.
	 */
	public static final MMCode Unexposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "UNEX";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * have expired.
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "Settlement transaction relates to options, futures or derivatives that have expired.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Position to cover the pending sale will be available by contractual
	 * settlement date (accounting information).
	 */
	public static final MMCode PendingSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSale";
			definition = "Position to cover the pending sale will be available by contractual settlement date (accounting information).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Securities are not be delivered but segregated following triparty
	 * collateral transaction.
	 */
	public static final MMCode TripartySegregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartySegregation";
			definition = "Securities are not be delivered but segregated following triparty collateral transaction.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * No market claim should be automatically generated.
	 */
	public static final MMCode NoAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAutomaticMarketClaim";
			definition = "No market claim should be automatically generated.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NOMC";
		}
	};
	/**
	 * Transaction resulting from a transformation.
	 */
	public static final MMCode Transformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transformation";
			definition = "Transaction resulting from a transformation.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Collateral position is available for other purposes (for example, onwards
	 * delivery).
	 */
	public static final MMCode Rehypothecation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rehypothecation";
			definition = "Collateral position is available for other purposes (for example, onwards delivery).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RHYP";
		}
	};
	/**
	 * Settlement is on a bilaterally accepted transaction that is to be
	 * accepted beyond the regular settlement deadline.
	 */
	public static final MMCode AcceptAfterRegularSettlementDeadline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptAfterRegularSettlementDeadline";
			definition = "Settlement is on a bilaterally accepted transaction that is to be accepted beyond the regular settlement deadline.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 */
	public static final MMCode Reporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Security transaction is not for accounting.
	 */
	public static final MMCode NotAccountingRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAccountingRelated";
			definition = "Security transaction is not for accounting.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NACT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PART");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionConditionCode";
				definition = "Collateral position is available for other purposes (for example, onwards delivery).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialNotAllowed,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialSettlementCashThresholdAllowed,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialSettlementQuantityThresholdAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Assignement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.BuytoCover, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Clean,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Dirty, com.tools20022.repository.codeset.SettlementTransactionConditionCode.DeliveryWithoutMatching,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Drawn, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Exercised,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.FreeCleanSettlement, com.tools20022.repository.codeset.SettlementTransactionConditionCode.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Physical, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Residual,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.ShortSell, com.tools20022.repository.codeset.SettlementTransactionConditionCode.SplitCurrencySettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionConditionCode.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Unexposed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Expired,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PendingSale, com.tools20022.repository.codeset.SettlementTransactionConditionCode.TripartySegregation,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.NoAutomaticMarketClaim, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Transformation,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Rehypothecation, com.tools20022.repository.codeset.SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Reporting, com.tools20022.repository.codeset.SettlementTransactionConditionCode.NotAccountingRelated);
			}
		});
		return mmObject_lazy.get();
	}
}
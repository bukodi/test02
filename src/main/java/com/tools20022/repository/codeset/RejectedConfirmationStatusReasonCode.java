package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a confirmation rejected status.
 */
public class RejectedConfirmationStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment account information not the same as instructed.
	 */
	public static final MMCode DifferentInvestmentAccountDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentInvestmentAccountDetails";
			definition = "Investment account information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSAF";
		}
	};
	/**
	 * Financial instrument information not the same as instructed.
	 */
	public static final MMCode DifferentFinancialInstrumentDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentFinancialInstrumentDetails";
			definition = "Financial instrument information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DFIN";
		}
	};
	/**
	 * Beneficiary details is not the same as instructed.
	 */
	public static final MMCode DifferentBeneficiaryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentBeneficiaryDetails";
			definition = "Beneficiary details is not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DBEN";
		}
	};
	/**
	 * Place of trade not the same as instructed.
	 */
	public static final MMCode DifferentPlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPlaceOfTrade";
			definition = "Place of trade not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPTD";
		}
	};
	/**
	 * Order date time not the same as instructed.
	 */
	public static final MMCode DifferentOrderDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderDateTime";
			definition = "Order date time not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Cancellation right not the same as instructed.
	 */
	public static final MMCode DifferentCancellationRight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCancellationRight";
			definition = "Cancellation right not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DCXR";
		}
	};
	/**
	 * Units number information not the same as instructed.
	 */
	public static final MMCode DifferentUnitsNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentUnitsNumber";
			definition = "Units number information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DUNB";
		}
	};
	/**
	 * Order type information not the same as instructed.
	 */
	public static final MMCode DifferentOrderType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderType";
			definition = "Order type information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORT";
		}
	};
	/**
	 * Rounding information not the same as instructed.
	 */
	public static final MMCode DifferentRounding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRounding";
			definition = "Rounding information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DROU";
		}
	};
	/**
	 * Net amount information not the same as instructed.
	 */
	public static final MMCode DifferentNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentNetAmount";
			definition = "Net amount information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DNAM";
		}
	};
	/**
	 * Gross amount information not the same as instructed.
	 */
	public static final MMCode DifferentGrossAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGrossAmount";
			definition = "Gross amount information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DGAM";
		}
	};
	/**
	 * Holdings redemption rate not the same as instructed.
	 */
	public static final MMCode DifferentHoldingsRedemptionRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentHoldingsRedemptionRate";
			definition = "Holdings redemption rate not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DHRR";
		}
	};
	/**
	 * Group 1 or 2 units not the same as instructed.
	 */
	public static final MMCode DifferentGroup1Or2Units = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentGroup1Or2Units";
			definition = "Group 1 or 2 units not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DGRP";
		}
	};
	/**
	 * Income preference information not the same as instructed.
	 */
	public static final MMCode DifferentIncomePreference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIncomePreference";
			definition = "Income preference information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DINP";
		}
	};
	/**
	 * Letter Intent reference information not the same as instructed.
	 */
	public static final MMCode DifferentLetterIntentReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLetterIntentReference";
			definition = "Letter Intent reference information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DLIR";
		}
	};
	/**
	 * Accumulation right reference information not the same as instructed.
	 */
	public static final MMCode DifferentAccumulationRightReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAccumulationRightReference";
			definition = "Accumulation right reference information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DARR";
		}
	};
	/**
	 * Physical delivery indicator information not the same as instructed.
	 */
	public static final MMCode DifferentPhysicalDeliveryIndicator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryIndicator";
			definition = "Physical delivery indicator information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPDI";
		}
	};
	/**
	 * Requested settlement currency information not the same as instructed.
	 */
	public static final MMCode DifferentRequestedSettlementCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedSettlementCurrency";
			definition = "Requested settlement currency information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DRSC";
		}
	};
	/**
	 * Requested NAV currency information not the same as instructed.
	 */
	public static final MMCode DifferentRequestedNAVCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentRequestedNAVCurrency";
			definition = "Requested NAV currency information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DNAV";
		}
	};
	/**
	 * Foreign exchange details information not the same as instructed.
	 */
	public static final MMCode DifferentForeignExchangeDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentForeignExchangeDetails";
			definition = "Foreign exchange details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DFXD";
		}
	};
	/**
	 * Charge details information not the same as instructed.
	 */
	public static final MMCode DifferentChargeDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentChargeDetails";
			definition = "Charge details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DCHD";
		}
	};
	/**
	 * Commission details information not the same as instructed.
	 */
	public static final MMCode DifferentCommissionDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentCommissionDetails";
			definition = "Commission details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DXOD";
		}
	};
	/**
	 * Tax details information not the same as instructed.
	 */
	public static final MMCode DifferentTaxDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTaxDetails";
			definition = "Tax details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTAD";
		}
	};
	/**
	 * Physical delivery details information not the same as instructed.
	 */
	public static final MMCode DifferentPhysicalDeliveryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPhysicalDeliveryDetails";
			definition = "Physical delivery details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPDD";
		}
	};
	/**
	 * Settlement and custody details information not the same as instructed.
	 */
	public static final MMCode DifferentSettlementAndCustodyDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAndCustodyDetails";
			definition = "Settlement and custody details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSCA";
		}
	};
	/**
	 * Payment Instrument details information not the same as instructed.
	 */
	public static final MMCode DifferentPaymentInstrumentDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPaymentInstrumentDetails";
			definition = "Payment Instrument details information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPID";
		}
	};
	/**
	 * Settlement amount not the same as instructed.
	 */
	public static final MMCode DifferentSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementAmount";
			definition = "Settlement amount not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSAM";
		}
	};
	/**
	 * Settlement date not the same as instructed.
	 */
	public static final MMCode DifferentSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentSettlementDate";
			definition = "Settlement date not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DSDT";
		}
	};
	/**
	 * Extension information not the same as instructed.
	 */
	public static final MMCode DifferentExtensionDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentExtensionDetails";
			definition = "Extension information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DEXD";
		}
	};
	/**
	 * Intermediary information not the same as instructed.
	 */
	public static final MMCode DifferentIntermediaryDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentIntermediaryDetails";
			definition = "Intermediary information not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DIMD";
		}
	};
	/**
	 * Total redemption amount not the same as instructed.
	 */
	public static final MMCode DifferentTotalRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalRedemptionAmount";
			definition = "Total redemption amount not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTRA";
		}
	};
	/**
	 * Total subscription amount not the same as instructed.
	 */
	public static final MMCode DifferentTotalSubscriptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentTotalSubscriptionAmount";
			definition = "Total subscription amount not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DTSA";
		}
	};
	/**
	 * Additional cash in not the same as instructed.
	 */
	public static final MMCode DifferentAdditionalCashIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentAdditionalCashIn";
			definition = "Additional cash in not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DACI";
		}
	};
	/**
	 * Resulting cash out not the same as instructed.
	 */
	public static final MMCode DifferentResultingCashOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentResultingCashOut";
			definition = "Resulting cash out not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DACO";
		}
	};
	/**
	 * Percentage of total subscription amount not the same as instructed.
	 */
	public static final MMCode DifferentPercentageOfTotalSubscriptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalSubscriptionAmount";
			definition = "Percentage of total subscription amount not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPSA";
		}
	};
	/**
	 * Percentage of total redemption amount not the same as instructed.
	 */
	public static final MMCode DifferentPercentageOfTotalRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentPercentageOfTotalRedemptionAmount";
			definition = "Percentage of total redemption amount not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DPRA";
		}
	};
	/**
	 * Leg Identification not the same as instructed.
	 */
	public static final MMCode DifferentLegIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentLegIdentification";
			definition = "Leg Identification not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DLID";
		}
	};
	/**
	 * Confirmation is recognised by the Receiver because the message reference
	 * is identified, but the order reference is not the same as instructed.
	 */
	public static final MMCode DifferentOrderReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentOrderReference";
			definition = "Confirmation is recognised by the Receiver because the message reference is identified, but the order reference is not the same as instructed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DORF";
		}
	};
	/**
	 * Linked reference is not known.
	 */
	public static final MMCode UnknownLinkagesReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			definition = "Linked reference is not known.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Deal reference is a duplicate of a previously received deal reference.
	 */
	public static final MMCode DuplicateDealReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateDealReference";
			definition = "Deal reference is a duplicate of a previously received deal reference.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DREF";
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
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Receiver's Custodian is not recognised or is invalid.
	 */
	public static final MMCode ReceiversCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodian";
			definition = "Receiver's Custodian is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IRCU";
		}
	};
	/**
	 * Receiver's Intermediary is not recognised or is invalid.
	 */
	public static final MMCode ReceiversIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary";
			definition = "Receiver's Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IRIN";
		}
	};
	/**
	 * Delivering agent is not recognised or is invalid.
	 */
	public static final MMCode DeliveringAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			definition = "Delivering agent is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Deliverer's Custodian is not recognised or is invalid.
	 */
	public static final MMCode DeliverersCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodian";
			definition = "Deliverer's Custodian is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IDCU";
		}
	};
	/**
	 * Deliverer's Intermediary is not recognised or is invalid.
	 */
	public static final MMCode DeliverersIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary";
			definition = "Deliverer's Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "IDIN";
		}
	};
	/**
	 * Credit transfer details are incorrect.
	 */
	public static final MMCode InvalidCreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCreditTransfer";
			definition = "Credit transfer details are incorrect.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ICTR";
		}
	};
	/**
	 * Settlement Amount is invalid.
	 */
	public static final MMCode SettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Settlement Amount is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Settlement date or transfer date is not recognised or is invalid.
	 */
	public static final MMCode SettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Settlement date or transfer date is not recognised or is invalid.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Confirmation is not compliant with the service level agreement.
	 */
	public static final MMCode NotCompliantWithSLA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			definition = "Confirmation is not compliant with the service level agreement.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "NSLA";
		}
	};
	/**
	 * EU tax information is missing.
	 */
	public static final MMCode MissingEUTaxInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingEUTaxInformation";
			definition = "EU tax information is missing.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MEUT";
		}
	};
	/**
	 * Commission information is missing.
	 */
	public static final MMCode MissingCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCommission";
			definition = "Commission information is missing.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MCOM";
		}
	};
	/**
	 * Charge information is missing.
	 */
	public static final MMCode MissingCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCharge";
			definition = "Charge information is missing.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MCHA";
		}
	};
	/**
	 * Tax information is missing.
	 */
	public static final MMCode MissingTaxInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingTaxInformation";
			definition = "Tax information is missing.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "MTAX";
		}
	};
	/**
	 * Amendment of order confirmation not allowed.
	 */
	public static final MMCode NotAllowedtoAmend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedtoAmend";
			definition = "Amendment of order confirmation not allowed.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "NATA";
		}
	};
	/**
	 * Amendment of order confirmation too late.
	 */
	public static final MMCode AmendmentTooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentTooLate";
			definition = "Amendment of order confirmation too late.";
			owner_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
			codeName = "ALAT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DSAF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectedConfirmationStatusReasonCode";
				definition = "Specifies the reason for a confirmation rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentInvestmentAccountDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentFinancialInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentBeneficiaryDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPlaceOfTrade, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderDateTime,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentCancellationRight, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentUnitsNumber,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderType, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRounding,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentNetAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentGrossAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentHoldingsRedemptionRate, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentGroup1Or2Units,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentIncomePreference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentLetterIntentReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentAccumulationRightReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryIndicator,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRequestedSettlementCurrency, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentRequestedNAVCurrency,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentForeignExchangeDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentChargeDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentCommissionDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTaxDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPhysicalDeliveryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementAndCustodyDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPaymentInstrumentDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentSettlementDate, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentExtensionDetails,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentIntermediaryDetails, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTotalRedemptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentTotalSubscriptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentAdditionalCashIn,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentResultingCashOut, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalSubscriptionAmount,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentPercentageOfTotalRedemptionAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentLegIdentification,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DifferentOrderReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.UnknownLinkagesReference,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DuplicateDealReference, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceivingAgent,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceiversCustodian, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.ReceiversIntermediary,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliveringAgent, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliverersCustodian,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.DeliverersIntermediary, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.InvalidCreditTransfer,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.SettlementAmount, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.SettlementDate,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingEUTaxInformation,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingCommission, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingCharge,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.MissingTaxInformation, com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.NotAllowedtoAmend,
						com.tools20022.repository.codeset.RejectedConfirmationStatusReasonCode.AmendmentTooLate);
			}
		});
		return mmObject_lazy.get();
	}
}
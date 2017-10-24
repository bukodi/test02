package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.DirectDebit;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics that apply to the credit side of the payment transactions
 * included in the direct debit initiation.
 */
public class PaymentInstruction21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by a sending party, to unambiguously
	 * identify the payment information group within the message.
	 */
	public static final MMMessageAttribute PaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the means of payment that will be used to move the amount of
	 * money.
	 */
	public static final MMMessageAttribute PaymentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CreditInstrument.Method;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod2Code.mmObject();
		}
	};
	/**
	 * Identifies whether a single entry per individual transaction or a batch
	 * entry for the sum of the amounts of all transactions within the group of
	 * a message is requested. Usage: Batch booking is used to request and not
	 * order a possible batch booking.
	 */
	public static final MMMessageAttribute BatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	/**
	 * Number of individual transactions contained in the payment information
	 * group.
	 */
	public static final MMMessageAttribute NumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the payment information group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the group, irrespective of
	 * currencies.
	 */
	public static final MMMessageAttribute ControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the group, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Set of elements used to further specify the type of transaction.
	 */
	public static final MMMessageAssociationEnd PaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTypeInformation24.mmObject();
		}
	};
	/**
	 * Date and time at which the creditor requests that the amount of money is
	 * to be collected from the debtor.
	 */
	public static final MMMessageAttribute RequestedCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "ReqdColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedCollectionDate";
			definition = "Date and time at which the creditor requests that the amount of money is to be collected from the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Party to which an amount of money is due.
	 */
	public static final MMMessageAssociationEnd Creditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the creditor to which a
	 * credit entry will be posted as a result of the payment transaction.
	 */
	public static final MMMessageAssociationEnd CreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the creditor.
	 */
	public static final MMMessageAssociationEnd CreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the creditor agent at its
	 * servicing agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd CreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Ultimate party to which an amount of money is due.
	 */
	public static final MMMessageAssociationEnd UltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 */
	public static final MMMessageAttribute ChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.BearerType;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * Account used to process charges associated with a transaction.
	 * 
	 * Usage: Charges account should be used when charges have to be booked to
	 * an account different from the account identified in debtor's account.
	 */
	public static final MMMessageAssociationEnd ChargesAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.ChargesDebitAccount;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Agent that services a charges account.
	 * 
	 * Usage: Charges account agent should only be used when the charges account
	 * agent is different from the creditor agent.
	 */
	public static final MMMessageAssociationEnd ChargesAccountAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcctAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccountAgent";
			definition = "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Credit party that signs the mandate.
	 */
	public static final MMMessageAssociationEnd CreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Provides information on the individual transaction(s) included in the
	 * message.
	 */
	public static final MMMessageAssociationEnd DirectDebitTransactionInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> PaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtTxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransactionInformation";
			definition = "Provides information on the individual transaction(s) included in the message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DirectDebitTransactionInformation22.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.PaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction21.PaymentMethod,
						com.tools20022.repository.msg.PaymentInstruction21.BatchBooking, com.tools20022.repository.msg.PaymentInstruction21.NumberOfTransactions, com.tools20022.repository.msg.PaymentInstruction21.ControlSum,
						com.tools20022.repository.msg.PaymentInstruction21.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction21.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction21.Creditor,
						com.tools20022.repository.msg.PaymentInstruction21.CreditorAccount, com.tools20022.repository.msg.PaymentInstruction21.CreditorAgent, com.tools20022.repository.msg.PaymentInstruction21.CreditorAgentAccount,
						com.tools20022.repository.msg.PaymentInstruction21.UltimateCreditor, com.tools20022.repository.msg.PaymentInstruction21.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction21.ChargesAccount,
						com.tools20022.repository.msg.PaymentInstruction21.ChargesAccountAgent, com.tools20022.repository.msg.PaymentInstruction21.CreditorSchemeIdentification,
						com.tools20022.repository.msg.PaymentInstruction21.DirectDebitTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.PaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction21";
				definition = "Characteristics that apply to the credit side of the payment transactions included in the direct debit initiation.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.AmountType4Choice;
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.MandateClassification1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the obligation which created the payment.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the currency of the amount to be transferred which may be
	 * different from the currency of the debtor's account.
	 */
	public static final MMBusinessAttribute CurrencyOfTransfer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount2.CurrencyOfTransfer);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the transfer method to be used for the credit.
	 */
	public static final MMBusinessAssociationEnd CreditMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference26.PaymentMethod);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditInstrument.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CreditInstrument.mmObject();
		}
	};
	/**
	 * Type, or nature, of the payment, eg, express payment.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 */
	public static final MMBusinessAttribute InstructedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AmountType4Choice.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction26.Amount,
					com.tools20022.repository.msg.CreditTransferTransaction22.Amount, com.tools20022.repository.msg.OriginalTransactionReference24.Amount, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction77.ReversedInstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructedAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment to apply to its processing.
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.InstructionPriority);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Date on which a payment must be executed
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the status of a payment at a specified time.
	 */
	public static final MMBusinessAssociationEnd PaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader3.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction83.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransaction82.TransactionStatus);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a payment and played by a party at that
	 * step in a payment flow.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentPartyRole.mmObject();
		}
	};
	/**
	 * Payment levy tax.
	 */
	public static final MMBusinessAssociationEnd TaxOnPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.Tax, com.tools20022.repository.msg.StructuredRemittanceInformation13.TaxRemittance,
					com.tools20022.repository.msg.CreditTransferTransaction22.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation22.Tax);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.RelatedPaymentSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Describes the processes necessary to execute a payment.
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentTypeInformation);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
	 */
	public static final MMBusinessAttribute PoolingAdjustmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction22.PoolingAdjustmentDate);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money to be transferred between debtor and creditor, before
	 * deduction of charges, expressed in the currency of the debtor's account,
	 * and to be transferred in a different currency.
	 */
	public static final MMBusinessAttribute EquivalentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount2.Amount, com.tools20022.repository.choice.AmountType4Choice.EquivalentAmount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Information on the exchange rate and amounts used in the payment
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.ExchangeRateInformation);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the creditor agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the creditor's agent, or can be information required by the
	 * creditor's agent to process the instruction.
	 */
	public static final MMBusinessAttribute InstructionForCreditorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForCreditorAgent1.Code, com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction22.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructionForCreditorAgent);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the debtor's agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the debtor's agent, or can be information required by the
	 * debtor's agent to process the instruction.
	 */
	public static final MMBusinessAttribute InstructionForDebtorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.InstructionForDebtorAgent);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Identifications provided to identify a payment at different processing
	 * levels.
	 */
	public static final MMBusinessAssociationEnd PaymentRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction22.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentIdentification);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentIdentification.mmObject();
		}
	};
	/**
	 * Investigation case assigned to the payment.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}
	};
	/**
	 * Information on the requested settlement time of the instruction.
	 */
	public static final MMBusinessAssociationEnd SettlementTimeRequest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
		}
	};
	/**
	 * Amount of the payment.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference26.Amount);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the settlement operation which originates the payment.
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}
	};
	/**
	 * Identifies the standard settlement instructions.
	 */
	public static final MMBusinessAttribute StandardSettlementInstructions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Payment which is the result of the debit authorisation
	 */
	public static final MMBusinessAssociationEnd RelatedDebitAuthorisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DebitAuthorisation.mmObject();
		}
	};
	/**
	 * Case resolution related to a specific payment.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};
	/**
	 * Original payment which is returned.
	 */
	public static final MMBusinessAssociationEnd OriginalPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.ReturnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Payment which offsets an original payment.
	 */
	public static final MMBusinessAssociationEnd ReturnPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.OriginalPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Securities settlement process which is the source of the payment.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Reconciliation of the amounts of an invoice with the amounts included in
	 * one or more payments.
	 */
	public static final MMBusinessAssociationEnd InvoiceReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}
	};
	/**
	 * Payment type at the origin of the cash entry eg, a cheque.
	 */
	public static final MMBusinessAttribute PaymentInstrument = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}
	};
	/**
	 * Account debited for the payment.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Specifies the charges or the allowance related to a payment.
	 */
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.AdjustmentAmountAndReason);
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Provides the payment of the registered contract.
	 */
	public static final MMBusinessAssociationEnd ContractRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Payment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Payment, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Adjustment.Payment,
						com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.Payment.OriginalPayment, com.tools20022.repository.entity.Payment.ReturnPayment,
						com.tools20022.repository.entity.CreditInstrument.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentIdentification.Payment,
						com.tools20022.repository.entity.PaymentPartyRole.Payment, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.SecuritiesSettlement.Payment,
						com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.Invoice.Payment, com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment,
						com.tools20022.repository.entity.SettlementTimeRequest.Payment, com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection, com.tools20022.repository.entity.CommercialTradeSettlement.Payment,
						com.tools20022.repository.entity.RegisteredContract.RelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction23.TransactionInformationAndStatus, com.tools20022.repository.msg.OriginalPaymentInstruction21.TransactionInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction24.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction83.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction77.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction82.OriginalTransactionReference);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.Payment.CurrencyOfTransfer, com.tools20022.repository.entity.Payment.CreditMethod,
						com.tools20022.repository.entity.Payment.Type, com.tools20022.repository.entity.Payment.InstructedAmount, com.tools20022.repository.entity.Payment.Priority, com.tools20022.repository.entity.Payment.ValueDate,
						com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.Payment.PartyRole, com.tools20022.repository.entity.Payment.TaxOnPayment,
						com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.Payment.PoolingAdjustmentDate, com.tools20022.repository.entity.Payment.EquivalentAmount,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.Payment.InstructionForCreditorAgent, com.tools20022.repository.entity.Payment.InstructionForDebtorAgent,
						com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications, com.tools20022.repository.entity.Payment.RelatedInvestigationCase, com.tools20022.repository.entity.Payment.SettlementTimeRequest,
						com.tools20022.repository.entity.Payment.Amount, com.tools20022.repository.entity.Payment.TradeSettlement, com.tools20022.repository.entity.Payment.StandardSettlementInstructions,
						com.tools20022.repository.entity.Payment.RelatedDebitAuthorisation, com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.Payment.OriginalPayment,
						com.tools20022.repository.entity.Payment.ReturnPayment, com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement, com.tools20022.repository.entity.Payment.InvoiceReconciliation,
						com.tools20022.repository.entity.Payment.PaymentInstrument, com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Payment.ContractRegistration);
				derivationComponent_lazy = () -> Arrays.asList(InstructionForCreditorAgent1.mmObject(), CategoryPurpose1Choice.mmObject(), EquivalentAmount2.mmObject(), GroupHeader48.mmObject(), GroupHeader55.mmObject(),
						GroupHeader56.mmObject(), GroupHeader52.mmObject(), GroupHeader47.mmObject(), GroupHeader46.mmObject(), GroupHeader45.mmObject(), AmountType4Choice.mmObject(), OriginalPaymentInstruction23.mmObject(),
						OriginalPaymentInstruction21.mmObject(), OriginalPaymentInstruction24.mmObject(), OriginalGroupInformation28.mmObject(), MandateClassification1Choice.mmObject(), OriginalTransactionReference24.mmObject(),
						PaymentTransaction83.mmObject(), OriginalTransactionReference26.mmObject(), PaymentTransaction77.mmObject(), PaymentTransaction82.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
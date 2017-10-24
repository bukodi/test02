package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.DirectDebit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
public class DirectDebitTransactionInformation22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of elements used to reference a payment instruction.
	 */
	public static final MMMessageAssociationEnd PaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements used to reference a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentIdentification1.mmObject();
		}
	};
	/**
	 * Set of elements used to further specify the type of transaction.
	 */
	public static final MMMessageAssociationEnd PaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
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
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.<br>
	 * Usage: This amount has to be transported unchanged through the
	 * transaction chain.
	 */
	public static final MMMessageAttribute InstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructedAmount;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.\r\nUsage: This amount has to be transported unchanged through the transaction chain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 */
	public static final MMMessageAttribute ChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.BearerType;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
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
	 * Provides information specific to the direct debit mandate.
	 */
	public static final MMMessageAssociationEnd DirectDebitTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransaction";
			definition = "Provides information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DirectDebitTransaction9.mmObject();
		}
	};
	/**
	 * Ultimate party to which an amount of money is due.
	 */
	public static final MMMessageAssociationEnd UltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
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
	 * Financial institution servicing an account for the debtor.
	 */
	public static final MMMessageAssociationEnd DebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor agent at its
	 * servicing agent in the payment chain.
	 */
	public static final MMMessageAssociationEnd DebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Party that owes an amount of money to the (ultimate) creditor.
	 */
	public static final MMMessageAssociationEnd Debtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor to which a debit
	 * entry will be made as a result of the transaction.
	 */
	public static final MMMessageAssociationEnd DebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 */
	public static final MMMessageAssociationEnd UltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Further information, related to the processing of the payment
	 * instruction, that may need to be acted upon by the creditor agent,
	 * depending on agreement between creditor and the creditor agent.
	 */
	public static final MMMessageAttribute InstructionForCreditorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructionForCreditorAgent;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information, related to the processing of the payment instruction, that may need to be acted upon by the creditor agent, depending on agreement between creditor and the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Underlying reason for the payment transaction. Usage: Purpose is used by
	 * the end-customers, that is initiating party, (ultimate) debtor,
	 * (ultimate) creditor to provide information concerning the nature of the
	 * payment. Purpose is a content element, which is not used for processing
	 * by any of the agents involved in the payment chain.
	 */
	public static final MMMessageAssociationEnd Purpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose2Choice.mmObject();
		}
	};
	/**
	 * Information needed due to regulatory and statutory requirements.
	 */
	public static final MMMessageAssociationEnd RegulatoryReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "RgltryRptg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information needed due to regulatory and statutory requirements.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegulatoryReporting3.mmObject();
		}
	};
	/**
	 * Provides details on the tax.
	 */
	public static final MMMessageAssociationEnd Tax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation3.mmObject();
		}
	};
	/**
	 * Provides information related to the handling of the remittance
	 * information by any of the agents in the transaction processing chain.
	 */
	public static final MMMessageAssociationEnd RelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfStorage;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceLocation4.mmObject();
		}
	};
	/**
	 * Information supplied to enable the matching of an entry with the items
	 * that the transfer is intended to settle, such as commercial invoices in
	 * an accounts' receivable system.
	 */
	public static final MMMessageAssociationEnd RemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.AssociatedDocument;
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation11.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 */
	public static final MMMessageAttribute SupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DirectDebitTransactionInformation22.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentTypeInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.ChargeBearer,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.DirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateCreditor,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgentAccount,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.Debtor, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAccount,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateDebtor, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructionForCreditorAgent,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.Purpose, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RegulatoryReporting,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RelatedRemittanceInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation22.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.SupplementaryData);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitTransactionInformation22";
				definition = "Provides further details specific to the individual direct debit transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}
}
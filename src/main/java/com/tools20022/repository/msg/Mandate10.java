package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that serves as a basis to debit an account.
 */
public class Mandate10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the responsible party (such as the
	 * creditor) or agent (such as the debtor agent), to unambiguously identify
	 * the mandate.
	 */
	public static final MMMessageAttribute MandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the mandate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification for the mandate request, as assigned by the initiating
	 * party.
	 */
	public static final MMMessageAttribute MandateRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "MndtReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRequestIdentification";
			definition = "Identification for the mandate request, as assigned by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 */
	public static final MMMessageAssociationEnd Authentication = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Authentication;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateAuthentication1.mmObject();
		}
	};
	/**
	 * Specifies the type of mandate, such as paper, electronic or scheme.
	 */
	public static final MMMessageAssociationEnd Type = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of mandate, such as paper, electronic or scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateTypeInformation2.mmObject();
		}
	};
	/**
	 * Provides details of the duration of the mandate and occurrence of the
	 * underlying transactions.
	 */
	public static final MMMessageAssociationEnd Occurrences = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Ocrncs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Occurrences";
			definition = "Provides details of the duration of the mandate and occurrence of the underlying transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateOccurrences4.mmObject();
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically
	 * re-submitted periodically when bilaterally agreed.
	 */
	public static final MMMessageAttribute TrackingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.TrackingIndicator;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "TrckgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Amount different from the collection amount, as it includes the costs
	 * associated with the first debited amount.
	 */
	public static final MMMessageAttribute FirstCollectionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionAmount";
			definition = "Amount different from the collection amount, as it includes the costs associated with the first debited amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Fixed amount to be collected from the debtor's account.
	 */
	public static final MMMessageAttribute CollectionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "ColltnAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount to be collected from the debtor's account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per
	 * instruction.
	 */
	public static final MMMessageAttribute MaximumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MaximumAmount;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the characteristics of the adjustment applied to the collection
	 * amount of a direct debit instruction.
	 */
	public static final MMMessageAssociationEnd Adjustment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Amendment;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Specifies the characteristics of the adjustment applied to the collection amount of a direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateAdjustment1.mmObject();
		}
	};
	/**
	 * Provides the reason for the setup of the mandate.
	 */
	public static final MMMessageAssociationEnd Reason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Provides the reason for the setup of the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}
	};
	/**
	 * Credit party that signs the mandate.
	 */
	public static final MMMessageAssociationEnd CreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
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
	 * Party that signs the mandate and to whom an amount of money is due.
	 */
	public static final MMMessageAssociationEnd Creditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that signs the mandate and to whom an amount of money is due.";
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
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the creditor.
	 */
	public static final MMMessageAssociationEnd CreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Ultimate party to which an amount of money is due.
	 */
	public static final MMMessageAssociationEnd UltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
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
	 * Party that signs the mandate and owes an amount of money to the
	 * (ultimate) creditor.
	 */
	public static final MMMessageAssociationEnd Debtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that signs the mandate and owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the account of the debtor, to which a debit
	 * entry will be made as a result of the transaction.
	 */
	public static final MMMessageAssociationEnd DebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor, to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Financial institution servicing an account for the debtor.
	 */
	public static final MMMessageAssociationEnd DebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> Mandate10.mmObject();
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
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 */
	public static final MMMessageAssociationEnd UltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Mandate10.mmObject();
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
	 * Reference assigned by a creditor or ultimate creditor for internal usage
	 * for the mandate.
	 */
	public static final MMMessageAttribute MandateReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "MndtRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateReference";
			definition = "Reference assigned by a creditor or ultimate creditor for internal usage for the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides information to identify the underlying documents associated with
	 * the mandate.
	 */
	public static final MMMessageAssociationEnd ReferredDocument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "RfrdDoc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocument";
			definition = "Provides information to identify the underlying documents associated with the mandate.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredMandateDocument1.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * within the message component.
	 */
	public static final MMMessageAttribute SupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Mandate10.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements within the message component.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.MandateIdentification, com.tools20022.repository.msg.Mandate10.MandateRequestIdentification,
						com.tools20022.repository.msg.Mandate10.Authentication, com.tools20022.repository.msg.Mandate10.Type, com.tools20022.repository.msg.Mandate10.Occurrences, com.tools20022.repository.msg.Mandate10.TrackingIndicator,
						com.tools20022.repository.msg.Mandate10.FirstCollectionAmount, com.tools20022.repository.msg.Mandate10.CollectionAmount, com.tools20022.repository.msg.Mandate10.MaximumAmount,
						com.tools20022.repository.msg.Mandate10.Adjustment, com.tools20022.repository.msg.Mandate10.Reason, com.tools20022.repository.msg.Mandate10.CreditorSchemeIdentification,
						com.tools20022.repository.msg.Mandate10.Creditor, com.tools20022.repository.msg.Mandate10.CreditorAccount, com.tools20022.repository.msg.Mandate10.CreditorAgent,
						com.tools20022.repository.msg.Mandate10.UltimateCreditor, com.tools20022.repository.msg.Mandate10.Debtor, com.tools20022.repository.msg.Mandate10.DebtorAccount, com.tools20022.repository.msg.Mandate10.DebtorAgent,
						com.tools20022.repository.msg.Mandate10.UltimateDebtor, com.tools20022.repository.msg.Mandate10.MandateReference, com.tools20022.repository.msg.Mandate10.ReferredDocument,
						com.tools20022.repository.msg.Mandate10.SupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateInitiationRequestV05.Mandate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Mandate10";
				definition = "Information that serves as a basis to debit an account.";
			}
		});
		return mmObject_lazy.get();
	}
}
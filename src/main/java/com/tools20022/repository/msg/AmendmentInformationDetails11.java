package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Frequency36Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.Exact2NumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details on the list of direct debit mandate elements that
 * have been modified when the amendment indicator has been set.
 */
public class AmendmentInformationDetails11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the creditor, to unambiguously
	 * identify the original mandate.
	 */
	public static final MMMessageAttribute OriginalMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.MandateIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Original creditor scheme identification that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Original creditor agent that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Original creditor agent account that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Original debtor that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Original debtor account that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Original debtor agent that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	/**
	 * Original debtor agent account that has been modified.
	 */
	public static final MMMessageAssociationEnd OriginalDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}
	};
	/**
	 * Original final collection date that has been modified.
	 */
	public static final MMMessageAttribute OriginalFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Original frequency that has been modified.
	 */
	public static final MMMessageAttribute OriginalFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Frequency;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency36Choice.mmObject();
		}
	};
	/**
	 * Original reason for the mandate to allow the user to distinguish between
	 * different mandates for the same creditor.
	 */
	public static final MMMessageAssociationEnd OriginalReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReason";
			definition = "Original reason for the mandate to allow the user to distinguish between different mandates for the same creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}
	};
	/**
	 * Original number of tracking days that has been modified.
	 */
	public static final MMMessageAttribute OriginalTrackingDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.TrackingDays;
			componentContext_lazy = () -> AmendmentInformationDetails11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTrckgDays";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTrackingDays";
			definition = "Original number of tracking days that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFrequency, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalReason,
						com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalTrackingDays);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails11";
				definition = "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
			}
		});
		return mmObject_lazy.get();
	}
}
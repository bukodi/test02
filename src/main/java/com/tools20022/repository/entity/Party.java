package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number, physical or virtual address, used for communication.
	 */
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification43.ContactDetails);
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	/**
	 * Specific identification assigned to a party.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader48.InitiatingParty, com.tools20022.repository.msg.Cheque7.ChequeFrom, com.tools20022.repository.msg.GroupHeader55.InitiatingParty,
					com.tools20022.repository.msg.SettlementInstruction4.ThirdReimbursementAgent, com.tools20022.repository.msg.GroupHeader56.InitiatingParty, com.tools20022.repository.msg.PaymentReversalReason7.Originator,
					com.tools20022.repository.msg.GroupHeader52.InitiatingParty, com.tools20022.repository.msg.StatusReasonInformation9.Originator, com.tools20022.repository.msg.GroupHeader47.InitiatingParty,
					com.tools20022.repository.msg.MandateAmendmentReason1.Originator, com.tools20022.repository.msg.PaymentCancellationReason1.Originator, com.tools20022.repository.msg.GroupHeader46.InitiatingParty,
					com.tools20022.repository.msg.GroupHeader45.InitiatingParty, com.tools20022.repository.msg.Garnishment1.GarnishmentAdministrator, com.tools20022.repository.msg.TaxInformation4.UltimateDebtor,
					com.tools20022.repository.msg.CreditTransferTransaction26.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction26.Creditor, com.tools20022.repository.msg.CreditTransferTransaction26.UltimateCreditor,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicer, com.tools20022.repository.msg.CreditTransferTransaction22.UltimateDebtor, com.tools20022.repository.msg.CreditTransferTransaction22.Creditor,
					com.tools20022.repository.msg.CreditTransferTransaction22.UltimateCreditor, com.tools20022.repository.msg.PaymentInstruction21.Creditor, com.tools20022.repository.msg.PaymentInstruction21.CreditorAgent,
					com.tools20022.repository.msg.PaymentInstruction21.UltimateCreditor, com.tools20022.repository.msg.PaymentInstruction21.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate10.CreditorSchemeIdentification,
					com.tools20022.repository.msg.Mandate10.Creditor, com.tools20022.repository.msg.Mandate10.UltimateCreditor, com.tools20022.repository.msg.Mandate10.Debtor, com.tools20022.repository.msg.Mandate10.UltimateDebtor,
					com.tools20022.repository.msg.PaymentInstruction23.Debtor, com.tools20022.repository.msg.PaymentInstruction23.UltimateDebtor, com.tools20022.repository.msg.PaymentInstruction22.Debtor,
					com.tools20022.repository.msg.PaymentInstruction22.UltimateDebtor, com.tools20022.repository.msg.Mandate9.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate9.Creditor,
					com.tools20022.repository.msg.Mandate9.UltimateCreditor, com.tools20022.repository.msg.Mandate9.Debtor, com.tools20022.repository.msg.Mandate9.UltimateDebtor,
					com.tools20022.repository.msg.OriginalTransactionReference24.CreditorSchemeIdentification, com.tools20022.repository.msg.OriginalTransactionReference24.UltimateDebtor,
					com.tools20022.repository.msg.OriginalTransactionReference24.Debtor, com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAgent, com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAgent,
					com.tools20022.repository.msg.OriginalTransactionReference24.Creditor, com.tools20022.repository.msg.OriginalTransactionReference24.UltimateCreditor,
					com.tools20022.repository.msg.OriginalTransactionReference26.UltimateDebtor, com.tools20022.repository.msg.OriginalTransactionReference26.Debtor,
					com.tools20022.repository.msg.OriginalTransactionReference26.CreditorAgent, com.tools20022.repository.msg.OriginalTransactionReference26.Creditor,
					com.tools20022.repository.msg.OriginalTransactionReference26.UltimateCreditor, com.tools20022.repository.msg.Mandate11.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate11.Creditor,
					com.tools20022.repository.msg.Mandate11.UltimateCreditor, com.tools20022.repository.msg.Mandate11.Debtor, com.tools20022.repository.msg.Mandate11.UltimateDebtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateCreditor, com.tools20022.repository.msg.DirectDebitTransactionInformation22.Debtor,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.UltimateDebtor, com.tools20022.repository.msg.DirectDebitTransaction9.CreditorSchemeIdentification,
					com.tools20022.repository.msg.Mandate8.CreditorSchemeIdentification, com.tools20022.repository.msg.Mandate8.Creditor, com.tools20022.repository.msg.Mandate8.UltimateCreditor,
					com.tools20022.repository.msg.Mandate8.Debtor, com.tools20022.repository.msg.Mandate8.UltimateDebtor, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorSchemeIdentification,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtor);
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}
	};
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 */
	public static final MMBusinessAttribute MoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}
	};
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 */
	public static final MMBusinessAssociationEnd TaxationConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}
	};
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 */
	public static final MMBusinessAssociationEnd Domicile = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DomiciledParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 */
	public static final MMBusinessAssociationEnd Residence = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Power of attorney which is held by the party.
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	/**
	 * Location of the taxable party.
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Security for which a close link with a party is identified.
	 */
	public static final MMBusinessAssociationEnd CloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Party.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CloseLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CloseLink, com.tools20022.repository.entity.ContactPoint.RelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty, com.tools20022.repository.entity.Location.DomiciledParty, com.tools20022.repository.entity.Location.Party,
						com.tools20022.repository.entity.Location.TaxableParty, com.tools20022.repository.entity.Tax.TaxableParty, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.ContactPoint, com.tools20022.repository.entity.Party.Identification, com.tools20022.repository.entity.Party.MoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.Party.Domicile, com.tools20022.repository.entity.Party.Residence, com.tools20022.repository.entity.Party.PowerOfAttorney,
						com.tools20022.repository.entity.Party.Location, com.tools20022.repository.entity.Party.CloseLinkSecurity);
			}
		});
		return mmObject_lazy.get();
	}
}
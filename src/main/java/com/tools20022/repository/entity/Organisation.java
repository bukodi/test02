package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LegalStructureCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 */
public class Organisation extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the organisation, eg, charity.
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which a given organisation was officially registered.
	 */
	public static final MMBusinessAttribute RegistrationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specific identification assigned to an organisation. It is derived from
	 * the association between Party and PartyIdentification.
	 */
	public static final MMBusinessAssociationEnd OrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.FinancialInstitutionIdentification,
					com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.BranchIdentification, com.tools20022.repository.msg.GroupHeader48.ForwardingAgent, com.tools20022.repository.msg.GroupHeader55.ForwardingAgent,
					com.tools20022.repository.msg.SettlementInstruction4.InstructingReimbursementAgent, com.tools20022.repository.msg.GroupHeader56.ForwardingAgent, com.tools20022.repository.msg.GroupHeader56.DebtorAgent,
					com.tools20022.repository.msg.GroupHeader56.CreditorAgent, com.tools20022.repository.msg.GroupHeader52.ForwardingAgent, com.tools20022.repository.msg.GroupHeader52.DebtorAgent,
					com.tools20022.repository.msg.GroupHeader52.CreditorAgent, com.tools20022.repository.msg.GroupHeader47.InstructingAgent, com.tools20022.repository.msg.GroupHeader47.InstructedAgent,
					com.tools20022.repository.msg.GroupHeader46.DebtorAgent, com.tools20022.repository.msg.GroupHeader46.CreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent1,
					com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent3,
					com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent1,
					com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransaction22.IntermediaryAgent3,
					com.tools20022.repository.msg.CreditTransferTransaction22.CreditorAgent, com.tools20022.repository.msg.PaymentInstruction21.ChargesAccountAgent, com.tools20022.repository.msg.Mandate10.CreditorAgent,
					com.tools20022.repository.msg.Mandate10.DebtorAgent, com.tools20022.repository.msg.PaymentInstruction23.DebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.DebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction22.ChargesAccountAgent, com.tools20022.repository.msg.Mandate9.CreditorAgent, com.tools20022.repository.msg.Mandate9.DebtorAgent,
					com.tools20022.repository.msg.OriginalTransactionReference26.DebtorAgent, com.tools20022.repository.msg.Mandate11.CreditorAgent, com.tools20022.repository.msg.Mandate11.DebtorAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgent, com.tools20022.repository.msg.Mandate8.CreditorAgent, com.tools20022.repository.msg.Mandate8.DebtorAgent,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgent, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgent);
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationIdentification";
			definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	/**
	 * Organisation which is divided in branches.
	 */
	public static final MMBusinessAssociationEnd ParentOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentOrganisation";
			definition = "Organisation which is divided in branches.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.Branch;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Specifies an organisation which is not a head office.
	 */
	public static final MMBusinessAssociationEnd Branch = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Branch";
			definition = "Specifies an organisation which is not a head office.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.ParentOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Specifies the process which originates the changes to an organisation.
	 */
	public static final MMBusinessAssociationEnd SecuritiesModification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesModification";
			definition = "Specifies the process which originates the changes to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
		}
	};
	/**
	 * Place (including country) in which the organisation has its business
	 * activity.
	 */
	public static final MMBusinessAssociationEnd PlaceOfOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfOperation";
			definition = "Place (including country) in which the organisation has its business activity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.OperatingOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Place (including country) in which the organisation is registered.
	 */
	public static final MMBusinessAssociationEnd PlaceOfRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfRegistration";
			definition = "Place (including country) in which the organisation is registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RegisteredOrganisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Description of an organisation.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Legal standing of the organisation.
	 */
	public static final MMBusinessAttribute LegalStructure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalStructure";
			definition = "Legal standing of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalStructureCode.mmObject();
		}
	};
	/**
	 * Sector of business of the organisation, for example, pharmaceutical.
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Sector of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	/**
	 * Indication of interest process for which a list of organisations is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a list of organisations is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	/**
	 * Strategy related to an organisation.
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationStrategy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> OrganisationStrategy.mmObject();
		}
	};
	/**
	 * Description of the structure of a company.
	 */
	public static final MMBusinessAssociationEnd OrganisationHierarchy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationHierarchy";
			definition = "Description of the structure of a company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationHierarchy.mmObject();
		}
	};
	/**
	 * Officer who has some rights to represent a given organisation. In account
	 * management, it is the person to be contacted by the account servicer.
	 */
	public static final MMBusinessAssociationEnd RepresentativeOfficer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Officer who has some rights to represent a given organisation. In account management, it is the person to be contacted by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepresentativeOfficer.mmObject();
		}
	};
	/**
	 * Date when the organisation was established.
	 */
	public static final MMBusinessAttribute EstablishmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Organisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EstablishmentDate";
			definition = "Date when the organisation was established.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation";
				definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.OrganisationIdentification.Organisation, com.tools20022.repository.entity.Location.OperatingOrganisation, com.tools20022.repository.entity.Location.RegisteredOrganisation,
						com.tools20022.repository.entity.SecuritiesModification.NewOrganisationInformation, com.tools20022.repository.entity.Sector.Organisation, com.tools20022.repository.entity.RepresentativeOfficer.Organisation,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations, com.tools20022.repository.entity.OrganisationStrategy.Organisation, com.tools20022.repository.entity.OrganisationHierarchy.Organisation);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.Purpose, com.tools20022.repository.entity.Organisation.RegistrationDate,
						com.tools20022.repository.entity.Organisation.OrganisationIdentification, com.tools20022.repository.entity.Organisation.ParentOrganisation, com.tools20022.repository.entity.Organisation.Branch,
						com.tools20022.repository.entity.Organisation.SecuritiesModification, com.tools20022.repository.entity.Organisation.PlaceOfOperation, com.tools20022.repository.entity.Organisation.PlaceOfRegistration,
						com.tools20022.repository.entity.Organisation.Description, com.tools20022.repository.entity.Organisation.LegalStructure, com.tools20022.repository.entity.Organisation.Sector,
						com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest, com.tools20022.repository.entity.Organisation.Strategy, com.tools20022.repository.entity.Organisation.OrganisationHierarchy,
						com.tools20022.repository.entity.Organisation.RepresentativeOfficer, com.tools20022.repository.entity.Organisation.EstablishmentDate);
				derivationComponent_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
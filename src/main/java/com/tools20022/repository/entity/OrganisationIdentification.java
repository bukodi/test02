package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify an organisation.
 */
public class OrganisationIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 */
	public static final MMBusinessAttribute BICFI = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.BICFI);
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 */
	public static final MMBusinessAttribute AnyBIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrganisationIdentification8.AnyBIC);
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Name by which an organisation is known and which is usually used to
	 * identify that organisation. It is derived from the association between
	 * PartyIdentificationInformation and PartyName.
	 */
	public static final MMBusinessAssociationEnd OrganisationName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationName.Organisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
		}
	};
	/**
	 * Organisation which is identified
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is identified";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.OrganisationIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.ClearingSystemMemberIdentification);
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}
	};
	/**
	 * Code allocated to a non-financial institution by the ISO 9362
	 * Registration Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 */
	public static final MMBusinessAttribute BICNonFI = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BICNonFI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	/**
	 * Global Location Number. A non-significant reference number used to
	 * identify legal entities, functional entities, or physical entities
	 * according to the European Association for Numbering (EAN) numbering
	 * scheme rules. The number is used to retrieve detailed information that is
	 * linked to it.
	 */
	public static final MMBusinessAttribute EANGLN = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}
	};
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID). Identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 */
	public static final MMBusinessAttribute CHIPSUniversalIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentifier";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.CHIPSUniversalIdentifier.mmObject();
		}
	};
	/**
	 * Data Universal Numbering System. A unique identification number provided
	 * by Dun &amp; Bradstreet to identify an organization.
	 */
	public static final MMBusinessAttribute DUNS = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}
	};
	/**
	 * Unique and unambiguous assignment made by a specific bank to identify a
	 * relationship as defined between the bank and its client.
	 */
	public static final MMBusinessAttribute BankPartyIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Market Identifier Code. Identification of a financial market, as
	 * stipulated in the norm ISO 10383
	 * "Codes for exchanges and market identifications".
	 */
	public static final MMBusinessAttribute MIC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MIC";
			definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification";
				definition = "Unique and unambiguous way to identify an organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.OrganisationIdentification, com.tools20022.repository.entity.OrganisationName.Organisation,
						com.tools20022.repository.entity.CashClearingSystemMember.OrganisationIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.Other, com.tools20022.repository.choice.Party11Choice.OrganisationIdentification,
						com.tools20022.repository.msg.Charges2.Agent);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.BICFI, com.tools20022.repository.entity.OrganisationIdentification.AnyBIC,
						com.tools20022.repository.entity.OrganisationIdentification.OrganisationName, com.tools20022.repository.entity.OrganisationIdentification.Organisation,
						com.tools20022.repository.entity.OrganisationIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.OrganisationIdentification.BICNonFI,
						com.tools20022.repository.entity.OrganisationIdentification.EANGLN, com.tools20022.repository.entity.OrganisationIdentification.CHIPSUniversalIdentifier,
						com.tools20022.repository.entity.OrganisationIdentification.DUNS, com.tools20022.repository.entity.OrganisationIdentification.BankPartyIdentification, com.tools20022.repository.entity.OrganisationIdentification.MIC);
				derivationComponent_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmObject(), FinancialInstitutionIdentification8.mmObject(), BranchData2.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(),
						GenericOrganisationIdentification1.mmObject(), OrganisationIdentification8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
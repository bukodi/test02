package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.Party11Choice;
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.NameAndAddress10;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a party
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifier issued to a party for which no specific identifier has been
	 * defined.
	 */
	public static final MMBusinessAssociationEnd OtherIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification5.Other, com.tools20022.repository.msg.ContactDetails2.Other, com.tools20022.repository.msg.OrganisationIdentification8.Other);
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Party for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd IdentifiedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 */
	public static final MMBusinessAttribute TaxIdentificationNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty1.TaxIdentification, com.tools20022.repository.msg.TaxParty1.RegistrationIdentification, com.tools20022.repository.msg.TaxParty2.TaxIdentification,
					com.tools20022.repository.msg.TaxParty2.RegistrationIdentification);
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a national registration authority to an entity. In
	 * Singapore this is known as the NRIC.
	 */
	public static final MMBusinessAttribute NationalRegistrationNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of alternate identification which can be used to
	 * identify a party.
	 */
	public static final MMBusinessAttribute TypeOfIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}
	};
	/**
	 * Provides declaration details relative to the party.
	 */
	public static final MMBusinessAttribute Declaration = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the type of party in different business contexts.
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 */
	public static final MMBusinessAssociationEnd PartyName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyName.PartyIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
		}
	};
	/**
	 * Specifies the period during which an identification is valid
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Market for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd IdentifiedMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}
	};
	/**
	 * Legal Entity Identifier is a code allocated to a party as described in
	 * ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
	 */
	public static final MMBusinessAttribute LEI = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyIdentificationInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification, com.tools20022.repository.entity.Party.Identification,
						com.tools20022.repository.entity.PartyName.PartyIdentification, com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification, com.tools20022.repository.entity.Market.Identification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification43.Identification);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.NationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.TypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.Declaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.PartyType, com.tools20022.repository.entity.PartyIdentificationInformation.PartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.LEI);
				derivationComponent_lazy = () -> Arrays.asList(Party11Choice.mmObject(), PartyIdentification43.mmObject(), NameAndAddress10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CivilStatusCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ResidentialStatusCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 */
public class Person extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the gender of the person.
	 */
	public static final MMBusinessAttribute Gender = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
	/**
	 * Language in which a person communicates.
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Date on which a person is born.
	 */
	public static final MMBusinessAttribute BirthDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndPlaceOfBirth.BirthDate);
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Place (for instance Country and City) where a person was born.
	 */
	public static final MMBusinessAssociationEnd PlaceOfBirth = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfBirth";
			definition = "Place (for instance Country and City) where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.NativePerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Name of the occupation or job of a person.
	 */
	public static final MMBusinessAttribute Profession = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Residential status of an individual, for example, non-permanent resident.
	 */
	public static final MMBusinessAttribute ResidentialStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the country where a person was born or is legally accepted as
	 * belonging to the country.
	 */
	public static final MMBusinessAssociationEnd Nationality = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Citizen;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}
	};
	/**
	 * Indicates whether the person is a legal minor. It may depend on the
	 * nationality, the domicile country or the transaction in which the person
	 * is involved.
	 */
	public static final MMBusinessAttribute MinorIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Title of the function in an organisation.
	 */
	public static final MMBusinessAttribute BusinessFunctionTitle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAuthorisation1.Title);
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessFunctionTitle";
			definition = "Title of the function in an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specific identification assigned to a person. It is derived from the
	 * association between Party and PartyIdentification.
	 */
	public static final MMBusinessAssociationEnd PersonIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonIdentification";
			definition = "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
		}
	};
	/**
	 * Party which is the employer of a person.
	 */
	public static final MMBusinessAssociationEnd EmployingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.Employee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> EmployingPartyRole.mmObject();
		}
	};
	/**
	 * Specifies the meeting attendee which is an individual person.
	 */
	public static final MMBusinessAssociationEnd MeetingAttendee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingAttendeeRole.mmObject();
		}
	};
	/**
	 * Role performed by the person for the proxy voting process.
	 */
	public static final MMBusinessAssociationEnd RelatedRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssignedProxyRole.mmObject();
		}
	};
	/**
	 * Specifies the person who is the pre-assigned proxy for a meeting.
	 */
	public static final MMBusinessAssociationEnd PreAssignedProxyPerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssignedProxyRole.mmObject();
		}
	};
	/**
	 * Information to support the Know Your Customer processes.
	 */
	public static final MMBusinessAssociationEnd PersonProfile = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonProfile";
			definition = "Information to support the Know Your Customer processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
		}
	};
	/**
	 * Contact role played by a person.
	 */
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact role played by a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	/**
	 * Specifies the members of a household in relation with the ownership of an
	 * account.
	 */
	public static final MMBusinessAssociationEnd Household = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Household";
			definition = "Specifies the members of a household in relation with the ownership of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Household.Member;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Household.mmObject();
		}
	};
	/**
	 * Specifies the civil status of a person.
	 */
	public static final MMBusinessAttribute CivilStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CivilStatus";
			definition = "Specifies the civil status of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CivilStatusCode.mmObject();
		}
	};
	/**
	 * Date on which a person is dead.
	 */
	public static final MMBusinessAttribute DeathDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Person.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeathDate";
			definition = "Date on which a person is dead.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Citizen, com.tools20022.repository.entity.Location.NativePerson, com.tools20022.repository.entity.PersonIdentification.Person,
						com.tools20022.repository.entity.EmployingPartyRole.Employee, com.tools20022.repository.entity.ContactPersonRole.Person, com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson,
						com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole, com.tools20022.repository.entity.MeetingAttendeeRole.Person, com.tools20022.repository.entity.PersonProfile.Person,
						com.tools20022.repository.entity.Household.Member);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.Gender, com.tools20022.repository.entity.Person.Language, com.tools20022.repository.entity.Person.BirthDate,
						com.tools20022.repository.entity.Person.PlaceOfBirth, com.tools20022.repository.entity.Person.Profession, com.tools20022.repository.entity.Person.ResidentialStatus,
						com.tools20022.repository.entity.Person.Nationality, com.tools20022.repository.entity.Person.MinorIndicator, com.tools20022.repository.entity.Person.BusinessFunctionTitle,
						com.tools20022.repository.entity.Person.PersonIdentification, com.tools20022.repository.entity.Person.EmployingParty, com.tools20022.repository.entity.Person.MeetingAttendee,
						com.tools20022.repository.entity.Person.RelatedRole, com.tools20022.repository.entity.Person.PreAssignedProxyPerson, com.tools20022.repository.entity.Person.PersonProfile,
						com.tools20022.repository.entity.Person.ContactPersonRole, com.tools20022.repository.entity.Person.Household, com.tools20022.repository.entity.Person.CivilStatus, com.tools20022.repository.entity.Person.DeathDate);
				derivationComponent_lazy = () -> Arrays.asList(DateAndPlaceOfBirth.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
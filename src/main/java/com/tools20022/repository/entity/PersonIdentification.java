package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.ContactDetails2;
import com.tools20022.repository.msg.GenericPersonIdentification1;
import com.tools20022.repository.msg.PersonIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a person.
 */
public class PersonIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a social security agency.
	 */
	public static final MMBusinessAttribute SocialSecurityNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Person for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification5.DateAndPlaceOfBirth);
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PersonIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	/**
	 * Name by which a person is known and which is usually used to identify
	 * that person. It is derived from PartyName (association between
	 * PartyIdentificationInformation and PartyName).
	 */
	public static final MMBusinessAssociationEnd PersonName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonName";
			definition = "Name by which a person is known and which is usually used to identify that person. It is derived from PartyName (association between PartyIdentificationInformation and PartyName).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonName.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonName.mmObject();
		}
	};
	/**
	 * Number assigned by a license authority to a driver's license.
	 */
	public static final MMBusinessAttribute DriversLicenseNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 */
	public static final MMBusinessAttribute AlienRegistrationNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a passport authority to a passport.
	 */
	public static final MMBusinessAttribute PassportNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned by a national authority to an identity card.
	 */
	public static final MMBusinessAttribute IdentityCardNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number assigned to an employer by a registration authority.
	 */
	public static final MMBusinessAttribute EmployerIdentificationNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification";
				definition = "Unique and unambiguous way to identify a person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.Identification, com.tools20022.repository.entity.Person.PersonIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Party11Choice.PrivateIdentification);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.SocialSecurityNumber, com.tools20022.repository.entity.PersonIdentification.Person,
						com.tools20022.repository.entity.PersonIdentification.PersonName, com.tools20022.repository.entity.PersonIdentification.DriversLicenseNumber,
						com.tools20022.repository.entity.PersonIdentification.AlienRegistrationNumber, com.tools20022.repository.entity.PersonIdentification.PassportNumber,
						com.tools20022.repository.entity.PersonIdentification.IdentityCardNumber, com.tools20022.repository.entity.PersonIdentification.EmployerIdentificationNumber);
				derivationComponent_lazy = () -> Arrays.asList(PersonIdentificationSchemeName1Choice.mmObject(), GenericPersonIdentification1.mmObject(), PersonIdentification5.mmObject(), ContactDetails2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which a person is known and that is usually used to identify that
 * person.
 */
public class PersonName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name received at birth, eg, maiden name.
	 */
	public static final MMBusinessAttribute BirthName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthName";
			definition = "Name received at birth, eg, maiden name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the terms used to formally address a person.
	 */
	public static final MMBusinessAttribute NamePrefix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.NamePrefix);
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	/**
	 * First name of a person.
	 */
	public static final MMBusinessAttribute GivenName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Second name of a person.
	 */
	public static final MMBusinessAttribute MiddleName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiddleName";
			definition = "Second name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Additional information about a person that follows a person's name, eg,
	 * qualification such as Doctor of Philosophy (PhD).
	 */
	public static final MMBusinessAttribute NameSuffix = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Person identification which contains a name.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Person identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.PersonName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PersonIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonName";
				definition = "Name by which a person is known and that is usually used to identify that person.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonIdentification.PersonName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonName.BirthName, com.tools20022.repository.entity.PersonName.NamePrefix, com.tools20022.repository.entity.PersonName.GivenName,
						com.tools20022.repository.entity.PersonName.MiddleName, com.tools20022.repository.entity.PersonName.NameSuffix, com.tools20022.repository.entity.PersonName.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}
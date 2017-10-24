package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Person to be contacted in a given organisation. In the corporate action
 * domain (including meeting notifications) , it is the contact person at the
 * party organising the meeting, at the issuer or at an intermediary.
 */
public class ContactPersonRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Role for which a contact person is specified.
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role for which a contact person is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.ContactPersonRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	/**
	 * Meeting for which a person is the contact.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a person is the contact.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * Identifies the person which plays the role of contact.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identifies the person which plays the role of contact.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.ContactPersonRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContactPersonRole";
				definition = "Person to be contacted in a given organisation. In the corporate action domain (including meeting notifications) , it is the contact person at the party organising the meeting, at the issuer or at an intermediary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.ContactPersonRole, com.tools20022.repository.entity.Person.ContactPersonRole, com.tools20022.repository.entity.Meeting.Person);
				superType_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPersonRole.Role, com.tools20022.repository.entity.ContactPersonRole.Meeting, com.tools20022.repository.entity.ContactPersonRole.Person);
			}
		});
		return mmObject_lazy.get();
	}
}
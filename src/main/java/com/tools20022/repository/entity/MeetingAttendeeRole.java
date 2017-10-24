package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.MeetingPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security holder who will attend and vote at the meeting in person and/or a
 * person assigned by the security holder to attend the meeting without having
 * any voting rights or taking any action.
 */
public class MeetingAttendeeRole extends MeetingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the person who is registered to attend a meeting.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingAttendeeRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is registered to attend a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.MeetingAttendee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingAttendeeRole";
				definition = "Security holder who will attend and vote at the meeting in person and/or a person assigned by the security holder to attend the meeting without having any voting rights or taking any action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.MeetingAttendee);
				superType_lazy = () -> MeetingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingAttendeeRole.Person);
			}
		});
		return mmObject_lazy.get();
	}
}
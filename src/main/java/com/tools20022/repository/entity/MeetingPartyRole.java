package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CorporateActionPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of a meeting.
 */
public class MeetingPartyRole extends CorporateActionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the meeting for which a party plays a role.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Specifies the meeting for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingPartyRole";
				definition = "Role played by a party in the context of a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.PartyRole);
				subType_lazy = () -> Arrays.asList(AssignedProxyRole.mmObject(), MeetingAttendeeRole.mmObject());
				superType_lazy = () -> CorporateActionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingPartyRole.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}
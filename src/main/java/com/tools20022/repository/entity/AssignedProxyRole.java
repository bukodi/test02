package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.MeetingPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party appointed by the rights holder to attend a meeting and vote in its
 * name. The proxy can be the chairman of the meeting or another party selected
 * by the issuer. The proxy can also be a third party selected by the rights
 * holder.<br>
 * The proxy can be assigned by a specific instruction or pre-assigned by the
 * issuer of the meeting.
 */
public class AssignedProxyRole extends MeetingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the person who is the assigned proxy for a meeting.
	 */
	public static final MMBusinessAssociationEnd ProxyPerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssignedProxyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyPerson";
			definition = "Specifies the person who is the assigned proxy for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.RelatedRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};
	/**
	 * Identifies a proxy that has been assigned by the issuer of the meeting.
	 */
	public static final MMBusinessAssociationEnd PreAssignedProxyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssignedProxyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyRole";
			definition = "Identifies a proxy that has been assigned by the issuer of the meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PreAssignedProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssignedProxyRole";
				definition = "Party appointed by the rights holder to attend a meeting and vote in its name. The proxy can be the chairman of the meeting or another party selected by the issuer. The proxy can also be a third party selected by the rights holder.\r\nThe proxy can be assigned by a specific instruction or pre-assigned by the issuer of the meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.RelatedRole, com.tools20022.repository.entity.Person.PreAssignedProxyPerson);
				superType_lazy = () -> MeetingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson, com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole);
			}
		});
		return mmObject_lazy.get();
	}
}
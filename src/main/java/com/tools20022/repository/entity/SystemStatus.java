package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MemberStatusCode;
import com.tools20022.repository.codeset.SystemStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a system and the period of time during which the status is valid.
 */
public class SystemStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Current status of a system.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Current status of a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemStatusCode.mmObject();
		}
	};
	/**
	 * Status of a member in a system, eg, enabled or deleted.
	 */
	public static final MMBusinessAttribute MemberStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Status of a member in a system, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemberStatusCode.mmObject();
		}
	};
	/**
	 * System for which a status is specified.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * System member role for which a member status is specified.
	 */
	public static final MMBusinessAssociationEnd SystemMemberRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemMemberRole";
			definition = "System member role for which a member status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.MemberStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemStatus";
				definition = "Status of a system and the period of time during which the status is valid.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.Status, com.tools20022.repository.entity.SystemMemberRole.MemberStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemStatus.Status, com.tools20022.repository.entity.SystemStatus.MemberStatus, com.tools20022.repository.entity.SystemStatus.System,
						com.tools20022.repository.entity.SystemStatus.SystemMemberRole);
			}
		});
		return mmObject_lazy.get();
	}
}
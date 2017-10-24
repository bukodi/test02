package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of entity that plays a specific role in a specific context.
 */
public class RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Role of the entity in the activity.
	 */
	public static final MMBusinessAssociationEnd Role = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RolePlayer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role of the entity in the activity.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.Player;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}
	};
	/**
	 * Specifies the period during which a role player is valid
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RolePlayer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a role player is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RolePlayer";
				definition = "Type of entity that plays a specific role in a specific context.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Player, com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer);
				subType_lazy = () -> Arrays.asList(Party.mmObject(), System.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.Role, com.tools20022.repository.entity.RolePlayer.ValidityPeriod);
			}
		});
		return mmObject_lazy.get();
	}
}
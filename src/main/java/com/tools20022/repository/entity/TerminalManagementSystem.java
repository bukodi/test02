package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TMSContactLevelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.System;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Terminal management system (TMS), has in charge the maintenance of the
 * terminal, including monitoring, software update, configuration parameters
 * management.
 */
public class TerminalManagementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acceptor parameters to be downloaded from the terminal management system.
	 */
	public static final MMBusinessAssociationEnd AcceptorConfiguration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor parameters to be downloaded from the terminal management system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
		}
	};
	/**
	 * Parameters used to access a network.
	 */
	public static final MMBusinessAssociationEnd NetworkAccess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Parameters used to access a network.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
		}
	};
	/**
	 * Process for which a TMS trigger is specified.
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process for which a TMS trigger is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	/**
	 * Level of urgency in contacting the maintenance.
	 */
	public static final MMBusinessAttribute ContactLevel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactLevel";
			definition = "Level of urgency in contacting the maintenance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TMSContactLevelCode.mmObject();
		}
	};
	/**
	 * Date and time for calling the maintenance.
	 */
	public static final MMBusinessAttribute ContactDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactDateTime";
			definition = "Date and time for calling the maintenance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the party which is the terminal manager (TM) to contact for
	 * the maintenance.
	 */
	public static final MMBusinessAssociationEnd TerminalManagerRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagerRole";
			definition = "Identifies the party which is the terminal manager (TM) to contact for the maintenance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.mmObject();
		}
	};
	/**
	 * Specifies each point of interaction controlled by a TMS.
	 */
	public static final MMBusinessAssociationEnd ControlledPointOfInteraction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControlledPointOfInteraction";
			definition = "Specifies each point of interaction controlled by a TMS.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PointOfInteraction.mmObject();
		}
	};
	/**
	 * Terminal management action to be performed by the point of interaction.
	 */
	public static final MMBusinessAssociationEnd Action = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Action";
			definition = "Terminal management action to be performed by the point of interaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TerminalManagementAction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementSystem";
				definition = "Terminal management system (TMS), has in charge the maintenance of the terminal, including monitoring, software update, configuration parameters management.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger, com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem, com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem,
						com.tools20022.repository.entity.NetworkAccess.TerminalManagementSystem, com.tools20022.repository.entity.TerminalManagerRole.TerminalManagementSystem);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration, com.tools20022.repository.entity.TerminalManagementSystem.NetworkAccess,
						com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.ContactLevel,
						com.tools20022.repository.entity.TerminalManagementSystem.ContactDateTime, com.tools20022.repository.entity.TerminalManagementSystem.TerminalManagerRole,
						com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.Action);
			}
		});
		return mmObject_lazy.get();
	}
}
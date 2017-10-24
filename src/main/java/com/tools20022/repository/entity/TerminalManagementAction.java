package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Terminal management action to be performed by the point of interaction.
 */
public class TerminalManagementAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Types of terminal management action to be performed by a point of
	 * interaction.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Types of terminal management action to be performed by a point of interaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionCode.mmObject();
		}
	};
	/**
	 * Event to start the terminal management action by the point of interaction
	 * (POI).
	 */
	public static final MMBusinessAttribute Trigger = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Event to start the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTriggerCode.mmObject();
		}
	};
	/**
	 * Additional process to perform before starting or after the terminal
	 * management action by the point of interaction (POI).
	 */
	public static final MMBusinessAttribute AdditionalProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after the terminal management action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
		}
	};
	/**
	 * List of action result codes.
	 */
	public static final MMBusinessAttribute ActionResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionResult";
			definition = "List of action result codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResultCode.mmObject();
		}
	};
	/**
	 * Action to be processed.
	 */
	public static final MMBusinessAttribute ActionToProcess = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorActionCode.mmObject();
		}
	};
	/**
	 * Terminal management system from which an action took place
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TerminalManagementAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system from which an action took place";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.Action;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction";
				definition = "Terminal management action to be performed by the point of interaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.Action);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementAction.Type, com.tools20022.repository.entity.TerminalManagementAction.Trigger,
						com.tools20022.repository.entity.TerminalManagementAction.AdditionalProcess, com.tools20022.repository.entity.TerminalManagementAction.ActionResult,
						com.tools20022.repository.entity.TerminalManagementAction.ActionToProcess, com.tools20022.repository.entity.TerminalManagementAction.TerminalManagementSystem);
			}
		});
		return mmObject_lazy.get();
	}
}
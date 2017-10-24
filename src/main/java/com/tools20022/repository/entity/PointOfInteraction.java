package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.System;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Point of interaction (POI) is the entry point to a card payment system. It
 * could be a physical or logical card payment terminal containing software and
 * hardware components, it could be a payment system including a set of card
 * payment terminals linked to a local or remote server, or it could be just an
 * interface to make payments as telephone or Internet browser.
 */
public class PointOfInteraction extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Process which uses the point of interaction.
	 */
	public static final MMBusinessAssociationEnd CardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process which uses the point of interaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	/**
	 * Card reading capabilities of the POI performing the transaction.
	 */
	public static final MMBusinessAttribute CardReadingCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardReadingCapabilities";
			definition = "Card reading capabilities of the POI performing the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	/**
	 * Type of cardholder verification that could be performed during a
	 * transaction.
	 */
	public static final MMBusinessAttribute CardholderVerificationCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderVerificationCapabilities";
			definition = "Type of cardholder verification that could be performed during a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
		}
	};
	/**
	 * On-line and off-line capabilities of the POI.
	 */
	public static final MMBusinessAttribute OnLineCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineCapabilities";
			definition = "On-line and off-line capabilities of the POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineCapabilityCode.mmObject();
		}
	};
	/**
	 * Display interfaces components.
	 */
	public static final MMBusinessAttribute DisplayCapabilities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisplayCapabilities";
			definition = "Display interfaces components.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterfaceCode.mmObject();
		}
	};
	/**
	 * Number of columns of the printer component.
	 */
	public static final MMBusinessAttribute PrintLineWidth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrintLineWidth";
			definition = "Number of columns of the printer component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Type of components belonging to a POI.
	 */
	public static final MMBusinessAttribute Component = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Component";
			definition = "Type of components belonging to a POI.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the POI component assigned by its provider.
	 */
	public static final MMBusinessAttribute ComponentIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentIdentification";
			definition = "Identification of the POI component assigned by its provider.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier assigned by the merchant identifying a set of POI terminals
	 * performing some categories of transactions.
	 */
	public static final MMBusinessAttribute GroupIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GroupIdentifier";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number of columns of the display component.
	 */
	public static final MMBusinessAttribute LineWidth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Number of lines of the display component.
	 */
	public static final MMBusinessAttribute NumberOfLines = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}
	};
	/**
	 * Error logging transferred by the point of interaction to the terminal
	 * management system.
	 */
	public static final MMBusinessAttribute ErrorLog = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ErrorLog";
			definition = "Error logging transferred by the point of interaction to the terminal management system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Identification of a version of component belonging to a given model.
	 */
	public static final MMBusinessAttribute ComponentVersionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentVersionNumber";
			definition = "Identification of a version of component belonging to a given model.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Terminal management system for which a point of interaction is specified.
	 */
	public static final MMBusinessAssociationEnd ControllingTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PointOfInteraction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControllingTerminalManagementSystem";
			definition = "Terminal management system for which a point of interaction is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction";
				definition = "Point of interaction (POI) is the entry point to a card payment system. It could be a physical or logical card payment terminal containing software and hardware components, it could be a payment system including a set of card payment terminals linked to a local or remote server, or it could be just an interface to make payments as telephone or Internet browser.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.ControlledPointOfInteraction);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring, com.tools20022.repository.entity.PointOfInteraction.CardReadingCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.CardholderVerificationCapabilities, com.tools20022.repository.entity.PointOfInteraction.OnLineCapabilities,
						com.tools20022.repository.entity.PointOfInteraction.DisplayCapabilities, com.tools20022.repository.entity.PointOfInteraction.PrintLineWidth, com.tools20022.repository.entity.PointOfInteraction.Component,
						com.tools20022.repository.entity.PointOfInteraction.ComponentIdentification, com.tools20022.repository.entity.PointOfInteraction.GroupIdentifier, com.tools20022.repository.entity.PointOfInteraction.LineWidth,
						com.tools20022.repository.entity.PointOfInteraction.NumberOfLines, com.tools20022.repository.entity.PointOfInteraction.ErrorLog, com.tools20022.repository.entity.PointOfInteraction.ComponentVersionNumber,
						com.tools20022.repository.entity.PointOfInteraction.ControllingTerminalManagementSystem);
			}
		});
		return mmObject_lazy.get();
	}
}
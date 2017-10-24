package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.RolePlayer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 */
public class System extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the system.
	 */
	public static final MMBusinessAssociationEnd SystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};
	/**
	 * Location, address and country in which the system is located.
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location, address and country in which the system is located.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Reconciliation process provided by the system.
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process provided by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	/**
	 * Information about the activity or non-activity of the system.
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Information about the activity or non-activity of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemAvailability.mmObject();
		}
	};
	/**
	 * Specific point in time associated with the system's processing cycle.
	 * Operations of a system are composed of a series of processes, the
	 * closing, or completion, of which constitutes an event with an associated
	 * time stamp. An event may have a series of time stamps associated with it,
	 * such as the scheduled and effective completion times.
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemEventInformation.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a system.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.RelatedSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemPartyRole.mmObject();
		}
	};
	/**
	 * Status of the system.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemStatus.mmObject();
		}
	};
	/**
	 * Business details provided for an information system.
	 */
	public static final MMBusinessAssociationEnd SystemGeneratedInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemGeneratedInformation";
			definition = "Business details provided for an information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemBusinessInformation.mmObject();
		}
	};
	/**
	 * Date at, or period of time during which, the stipulated version is in
	 * effect.
	 */
	public static final MMBusinessAssociationEnd VersionValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VersionValidityPeriod";
			definition = "Date at, or period of time during which, the stipulated version is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Date time of a system performing a task.
	 */
	public static final MMBusinessAttribute SystemDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemDateTime";
			definition = "Date time of a system performing a task.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Negotiation process which uses a ssystem.
	 */
	public static final MMBusinessAssociationEnd Negotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Negotiation";
			definition = "Negotiation process which uses a ssystem.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.TradingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	/**
	 * Account managed by a system and held by a system member.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account managed by a system and held by a system member.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Trade processed by a system.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade processed by a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Assessment associated with a system.
	 */
	public static final MMBusinessAssociationEnd Assessment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assessment";
			definition = "Assessment associated with a system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Assessment.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
		}
	};
	/**
	 * Specifies the status of trades and their value inside a system.
	 */
	public static final MMBusinessAssociationEnd TradesPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesPosition";
			definition = "Specifies the status of trades and their value inside a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Position.mmObject();
		}
	};
	/**
	 * Specifies the language used by the system.
	 */
	public static final MMBusinessAttribute SystemLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> System.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemLanguage";
			definition = "Specifies the language used by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "System";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Location.System, com.tools20022.repository.entity.Trade.System,
						com.tools20022.repository.entity.DateTimePeriod.System, com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem, com.tools20022.repository.entity.SystemPartyRole.RelatedSystem,
						com.tools20022.repository.entity.SystemEventInformation.System, com.tools20022.repository.entity.SystemStatus.System, com.tools20022.repository.entity.SystemAvailability.System,
						com.tools20022.repository.entity.SystemBusinessInformation.System, com.tools20022.repository.entity.Negotiation.TradingSystem, com.tools20022.repository.entity.Reconciliation.System,
						com.tools20022.repository.entity.Assessment.System, com.tools20022.repository.entity.Position.System);
				subType_lazy = () -> Arrays.asList(ClearingSystem.mmObject(), SecuritiesSettlementSystem.mmObject(), PointOfInteraction.mmObject(), TerminalManagementSystem.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.SystemIdentification, com.tools20022.repository.entity.System.Location, com.tools20022.repository.entity.System.Reconciliation,
						com.tools20022.repository.entity.System.Availability, com.tools20022.repository.entity.System.Event, com.tools20022.repository.entity.System.PartyRole, com.tools20022.repository.entity.System.Status,
						com.tools20022.repository.entity.System.SystemGeneratedInformation, com.tools20022.repository.entity.System.VersionValidityPeriod, com.tools20022.repository.entity.System.SystemDateTime,
						com.tools20022.repository.entity.System.Negotiation, com.tools20022.repository.entity.System.Account, com.tools20022.repository.entity.System.Trade, com.tools20022.repository.entity.System.Assessment,
						com.tools20022.repository.entity.System.TradesPosition, com.tools20022.repository.entity.System.SystemLanguage);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the corporate action process.
 */
public class CorporateActionStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the state or the condition.
	 */
	public static final MMBusinessAttribute AgentStandingInstructionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgentStandingInstructionStatus";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the status of the details of the event.
	 */
	public static final MMBusinessAttribute ProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Processing status of the corporate action event.
	 */
	public static final MMBusinessAttribute EventProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventProcessingStatus";
			definition = "Processing status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reasons for the status. It is derived from the relationship
	 * between Status and Status Reason.
	 */
	public static final MMBusinessAssociationEnd CorporateActionStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStatusReason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionStatusReason.mmObject();
		}
	};
	/**
	 * Status of the instruction cancellation process.
	 */
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the instruction cancellation process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of the corporate action instruction process.
	 */
	public static final MMBusinessAttribute CorporateActionInstructionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionInstructionProcessingStatus";
			definition = "Status of the corporate action instruction process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies whether the rate is indicative or actual.
	 */
	public static final MMBusinessAttribute RateStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateStatus";
			definition = "Specifies whether the rate is indicative or actual.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateStatusCode.mmObject();
		}
	};
	/**
	 * Availability status of the option.
	 */
	public static final MMBusinessAttribute OptionAvailabilityStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Availability status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionAvailabilityStatusCode.mmObject();
		}
	};
	/**
	 * Corporate event for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Status of the corporate action event.
	 */
	public static final MMBusinessAttribute EventStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventStatus";
			definition = "Status of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventStatusCode.mmObject();
		}
	};
	/**
	 * Information on the status of the processing of an instruction related to
	 * a corporate action.
	 */
	public static final MMBusinessAttribute RelatedInstructionProcessedStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInstructionProcessedStatus";
			definition = "Information on the status of the processing of an instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
		}
	};
	/**
	 * Date and time at which the the corporate action event or the option is
	 * deactivated.
	 */
	public static final MMBusinessAttribute DeactivationDateAndTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the the corporate action event or the option is deactivated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the status of the occurrence of an event.
	 */
	public static final MMBusinessAttribute EventConfirmationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventConfirmationStatus";
			definition = "Indicates the status of the occurrence of an event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventConfirmationStatusCode.mmObject();
		}
	};
	/**
	 * Indicates whether the details provided about an event are complete or
	 * incomplete.
	 */
	public static final MMBusinessAttribute EventCompletenessStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventCompletenessStatus";
			definition = "Indicates whether the details provided about an event are complete or incomplete.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventCompletenessStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatus";
				definition = "Status of the corporate action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatusReason.CorporateActionStatus, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionStatus.AgentStandingInstructionStatus, com.tools20022.repository.entity.CorporateActionStatus.ProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.EventProcessingStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionStatusReason,
						com.tools20022.repository.entity.CorporateActionStatus.InstructionCancellationStatus, com.tools20022.repository.entity.CorporateActionStatus.CorporateActionInstructionProcessingStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RateStatus, com.tools20022.repository.entity.CorporateActionStatus.OptionAvailabilityStatus,
						com.tools20022.repository.entity.CorporateActionStatus.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionStatus.EventStatus,
						com.tools20022.repository.entity.CorporateActionStatus.RelatedInstructionProcessedStatus, com.tools20022.repository.entity.CorporateActionStatus.DeactivationDateAndTime,
						com.tools20022.repository.entity.CorporateActionStatus.EventConfirmationStatus, com.tools20022.repository.entity.CorporateActionStatus.EventCompletenessStatus);
			}
		});
		return mmObject_lazy.get();
	}
}
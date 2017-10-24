package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CancellationStatusCode;
import com.tools20022.repository.codeset.NotificationStatusCode;
import com.tools20022.repository.codeset.ResolutionStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the instructions related to a meeting.
 */
public class MeetingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the resolution is active or withdrawn.
	 */
	public static final MMBusinessAttribute MeetingResolutionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingResolutionStatus";
			definition = "Indicates whether the resolution is active or withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatusCode.mmObject();
		}
	};
	/**
	 * Status of the request for cancellation of an instruction.
	 */
	public static final MMBusinessAttribute InstructionCancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionCancellationStatus";
			definition = "Status of the request for cancellation of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the underlying reason for a status of a meeting or related
	 * instructions.
	 */
	public static final MMBusinessAssociationEnd Reason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingStatusReason.mmObject();
		}
	};
	/**
	 * Specifies the status of the related notification.
	 */
	public static final MMBusinessAttribute NotificationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationStatus";
			definition = "Specifies the status of the related notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationStatusCode.mmObject();
		}
	};
	/**
	 * Meeting for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingStatus";
				definition = "Status of the instructions related to a meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.MeetingResolutionStatus, com.tools20022.repository.entity.MeetingStatus.InstructionCancellationStatus,
						com.tools20022.repository.entity.MeetingStatus.Reason, com.tools20022.repository.entity.MeetingStatus.NotificationStatus, com.tools20022.repository.entity.MeetingStatus.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}
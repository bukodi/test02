package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MeetingCancellationReasonCode;
import com.tools20022.repository.codeset.RejectionReasonCode;
import com.tools20022.repository.entity.StatusReason;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a meeting or related
 * instructions.
 */
public class MeetingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason for cancelling a meeting.
	 */
	public static final MMBusinessAttribute MeetingCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingCancellationReason";
			definition = "Specifies the reason for cancelling a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 */
	public static final MMBusinessAssociationEnd MeetingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.Reason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
		}
	};
	/**
	 * Reason of the rejection of the instruction or of the cancellation
	 * request.
	 */
	public static final MMBusinessAttribute InstructionRejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionRejectionReason";
			definition = "Reason of the rejection of the instruction or of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingStatusReason";
				definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.Reason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatusReason.MeetingCancellationReason, com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus,
						com.tools20022.repository.entity.MeetingStatusReason.InstructionRejectionReason);
			}
		});
		return mmObject_lazy.get();
	}
}
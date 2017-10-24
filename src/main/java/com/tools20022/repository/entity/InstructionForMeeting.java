package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the position of the instructing party and the actions that it
 * wants to take in relation with the meeting.
 */
public class InstructionForMeeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request to cast detailed voting instructions.
	 */
	public static final MMBusinessAssociationEnd VoteInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteInstruction";
			definition = "Request to cast detailed voting instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VoteInstructionRequest.mmObject();
		}
	};
	/**
	 * Date at which the instruction must be executed.
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting servicing process which comprises the management of meeting
	 * instructions.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the management of meeting instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}
	};
	/**
	 * Instruction containing the information on the participation of the
	 * security holder or of its assigned representative.
	 */
	public static final MMBusinessAssociationEnd MeetingAttendance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Instruction containing the information on the participation of the security holder or of its assigned representative.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
		}
	};
	/**
	 * Request to assign a proxy for participation to the meeting.
	 */
	public static final MMBusinessAssociationEnd ProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointment";
			definition = "Request to assign a proxy for participation to the meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.RelatedMeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.mmObject();
		}
	};
	/**
	 * Identification assigned to a general meeting by the party which has
	 * notified the meeting.
	 */
	public static final MMBusinessAttribute MeetingIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party which has notified the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Request to register the securities for the meeting.
	 */
	public static final MMBusinessAttribute SecuritiesRegistration = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRegistration";
			definition = "Request to register the securities for the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Request to block the securities
	 */
	public static final MMBusinessAttribute BlockingSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingSecurities";
			definition = "Request to block the securities";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Request to register for participation to the meeting.
	 */
	public static final MMBusinessAttribute ParticipationRegistration = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParticipationRegistration";
			definition = "Request to register for participation to the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Account and balance for which the instruction is specified.
	 */
	public static final MMBusinessAssociationEnd SafekeepingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InstructionForMeeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account and balance for which the instruction is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionForMeeting";
				definition = "Identifies the position of the instructing party and the actions that it wants to take in relation with the meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction, com.tools20022.repository.entity.ProxyAppointment.RelatedMeetingInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction, com.tools20022.repository.entity.MeetingAttendance.RelatedMeeting, com.tools20022.repository.entity.MeetingServicing.MeetingInstruction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction, com.tools20022.repository.entity.InstructionForMeeting.RequestedExecutionDate,
						com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.MeetingAttendance,
						com.tools20022.repository.entity.InstructionForMeeting.ProxyAppointment, com.tools20022.repository.entity.InstructionForMeeting.MeetingIdentification,
						com.tools20022.repository.entity.InstructionForMeeting.SecuritiesRegistration, com.tools20022.repository.entity.InstructionForMeeting.BlockingSecurities,
						com.tools20022.repository.entity.InstructionForMeeting.ParticipationRegistration, com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount);
			}
		});
		return mmObject_lazy.get();
	}
}
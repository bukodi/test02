package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MeetingDateStatusCode;
import com.tools20022.repository.codeset.MeetingTypeClassificationCode;
import com.tools20022.repository.codeset.MeetingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the physical parameters of a general meeting. Several dates and
 * places can be defined for a meeting.
 */
public class Meeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which the meeting will take place.
	 */
	public static final MMBusinessAttribute DateAndTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the status of a meeting date.
	 */
	public static final MMBusinessAttribute DateStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatusCode.mmObject();
		}
	};
	/**
	 * Place of the company meeting for the scheduled meeting date.
	 */
	public static final MMBusinessAssociationEnd MeetingLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Identification assigned to a general meeting by the party notifying the
	 * meeting. It must be unique for the party notifying the meeting.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines available for the different processes
	 * related to meeting attendance, proxy voting and entitlement assessment.
	 */
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	/**
	 * Servicing processes related to the organisation of a meeting.
	 */
	public static final MMBusinessAssociationEnd MeetingServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	/**
	 * Specifies the person who is the contact for a meeting.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPersonRole.mmObject();
		}
	};
	/**
	 * Specifies the role played by a party in the context of a meeting.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingPartyRole.mmObject();
		}
	};
	/**
	 * Status of the imeeting and of the related nstructions.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingStatus.mmObject();
		}
	};
	/**
	 * Corporate event for which a meeting is organised.
	 */
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Specifies whether a quorum is required or not together with the quorum
	 * parameters.
	 */
	public static final MMBusinessAssociationEnd Quorum = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quorum.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
		}
	};
	/**
	 * Specifies the different voting types, channels and premium.
	 */
	public static final MMBusinessAssociationEnd VotingCondition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
		}
	};
	/**
	 * Indicates whether physical participation to a meeting is required in
	 * order to be allowed to vote.
	 */
	public static final MMBusinessAttribute AttendanceRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how to order the attendance card or to give notice of
	 * attendance.
	 */
	public static final MMBusinessAttribute AttendanceConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceConfirmation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 */
	public static final MMBusinessAssociationEnd IncentivePremium = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	/**
	 * Potential participation to the voting process.
	 */
	public static final MMBusinessAssociationEnd Participation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingParticipation.mmObject();
		}
	};
	/**
	 * Specifies the conditions to fulfill in order to be able to propose a
	 * resolution.
	 */
	public static final MMBusinessAssociationEnd ResolutionProposalConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ResolutionProposal.mmObject();
		}
	};
	/**
	 * Item proposed for the vote or presented for information only.
	 */
	public static final MMBusinessAssociationEnd AgendaItem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Resolution.mmObject();
		}
	};
	/**
	 * Information on how to appoint proxy.
	 */
	public static final MMBusinessAssociationEnd ProxyAppointmentConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
		}
	};
	/**
	 * Specifies how the additional rights can be granted to the shareholder.
	 * These rights can be exercised at shareholders meetings (for example, the
	 * right to ask questions, the right to add items to the agenda or table
	 * draft resolutions).
	 */
	public static final MMBusinessAssociationEnd AdditionalRight = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AdditionalRight.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
		}
	};
	/**
	 * Specifies the type of meeting for which an invitation is sent.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which an invitation is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the conditions to be filled in to obtain a valid power of
	 * attorney.
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
		}
	};
	/**
	 * Classifies the meeting.
	 */
	public static final MMBusinessAttribute MeetingEventClassification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Meeting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEventClassification";
			definition = "Classifies the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeClassificationCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting, com.tools20022.repository.entity.ContactPersonRole.Meeting,
						com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting, com.tools20022.repository.entity.Deadline.RelatedMeeting, com.tools20022.repository.entity.MeetingPartyRole.Meeting,
						com.tools20022.repository.entity.ResolutionProposal.Meeting, com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting, com.tools20022.repository.entity.MeetingParticipation.Meeting,
						com.tools20022.repository.entity.Quorum.Meeting, com.tools20022.repository.entity.Resolution.Meeting, com.tools20022.repository.entity.MeetingStatus.Meeting, com.tools20022.repository.entity.VotingCondition.Meeting,
						com.tools20022.repository.entity.IncentivePremium.Meeting, com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting, com.tools20022.repository.entity.AdditionalRight.Meeting,
						com.tools20022.repository.entity.MeetingServicing.MeetingSpecification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.DateAndTime, com.tools20022.repository.entity.Meeting.DateStatus, com.tools20022.repository.entity.Meeting.MeetingLocation,
						com.tools20022.repository.entity.Meeting.Identification, com.tools20022.repository.entity.Meeting.Deadline, com.tools20022.repository.entity.Meeting.MeetingServicing, com.tools20022.repository.entity.Meeting.Person,
						com.tools20022.repository.entity.Meeting.PartyRole, com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.Meeting.Quorum,
						com.tools20022.repository.entity.Meeting.VotingCondition, com.tools20022.repository.entity.Meeting.AttendanceRequired, com.tools20022.repository.entity.Meeting.AttendanceConfirmation,
						com.tools20022.repository.entity.Meeting.IncentivePremium, com.tools20022.repository.entity.Meeting.Participation, com.tools20022.repository.entity.Meeting.ResolutionProposalConditions,
						com.tools20022.repository.entity.Meeting.AgendaItem, com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions, com.tools20022.repository.entity.Meeting.AdditionalRight,
						com.tools20022.repository.entity.Meeting.Type, com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements, com.tools20022.repository.entity.Meeting.MeetingEventClassification);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 */
public class VoteInstructionRequest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting instruction which contains a vote instruction.
	 */
	public static final MMBusinessAssociationEnd MeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Meeting instruction which contains a vote instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}
	};
	/**
	 * Specifies the number of votes to be cast for a specific resolution.
	 */
	public static final MMBusinessAssociationEnd VotePerResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotePerResolution";
			definition = "Specifies the number of votes to be cast for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.VoteRequest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Vote.mmObject();
		}
	};
	/**
	 * Number of votes for which decision is left to the party that will
	 * exercise the voting right.
	 */
	public static final MMBusinessAttribute Discretionary = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Vote instruction per resolution is cast for the entire entitlement.
	 */
	public static final MMBusinessAttribute GlobalVoteInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Vote instruction per resolution is cast for the entire entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Specifies the vote recommendation for resolutions added during the
	 * meeting.
	 */
	public static final MMBusinessAttribute VoteForMeetingResolution = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteForMeetingResolution";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates that a Vote execution confirmation is requested.
	 */
	public static final MMBusinessAttribute VoteExecutionConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteExecutionConfirmation";
			definition = "Indicates that a Vote execution confirmation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Proxy appointment to which instructions are attached.
	 */
	public static final MMBusinessAssociationEnd RelatedProxyAppointment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteInstructionRequest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProxyAppointment";
			definition = "Proxy appointment to which instructions are attached.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointment.Vote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProxyAppointment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionRequest";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.Vote, com.tools20022.repository.entity.InstructionForMeeting.VoteInstruction, com.tools20022.repository.entity.Vote.VoteRequest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.MeetingInstruction, com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution,
						com.tools20022.repository.entity.VoteInstructionRequest.Discretionary, com.tools20022.repository.entity.VoteInstructionRequest.GlobalVoteInstruction,
						com.tools20022.repository.entity.VoteInstructionRequest.VoteForMeetingResolution, com.tools20022.repository.entity.VoteInstructionRequest.VoteExecutionConfirmation,
						com.tools20022.repository.entity.VoteInstructionRequest.RelatedProxyAppointment);
			}
		});
		return mmObject_lazy.get();
	}
}
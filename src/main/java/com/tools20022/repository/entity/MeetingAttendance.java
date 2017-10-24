package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information on the participation of the security holder or of its assigned
 * representative.
 */
public class MeetingAttendance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies details linked to the attendance card.
	 */
	public static final MMBusinessAssociationEnd AttendanceCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingAttendance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceCard";
			definition = "Specifies details linked to the attendance card.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AttendanceCard.MeetingAttendance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AttendanceCard.mmObject();
		}
	};
	/**
	 * Percentage of rights participating to the vote versus total voting
	 * rights.
	 */
	public static final MMBusinessAttribute PercentageOfVotingRights = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingAttendance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfVotingRights";
			definition = "Percentage of rights participating to the vote versus total voting rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Instruction in which the meeting attendance conditions are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingAttendance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Instruction in which the meeting attendance conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.MeetingAttendance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingAttendance";
				definition = "Information on the participation of the security holder or of its assigned representative.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InstructionForMeeting.MeetingAttendance, com.tools20022.repository.entity.AttendanceCard.MeetingAttendance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingAttendance.AttendanceCard, com.tools20022.repository.entity.MeetingAttendance.PercentageOfVotingRights,
						com.tools20022.repository.entity.MeetingAttendance.RelatedMeeting);
			}
		});
		return mmObject_lazy.get();
	}
}
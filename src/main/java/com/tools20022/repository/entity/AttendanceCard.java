package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DeliveryPlaceCode;
import com.tools20022.repository.datatype.Max105Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about the attendance card which is issued for the requestor, for
 * its underlying client or for the appointed proxy person or meeting attendee
 * when an attendance request is included in the meeting instruction. <br>
 * The instructing party can specify which information must be indicated on the
 * attendance card and to which location the attendance card must be delivered.
 */
public class AttendanceCard {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Information to be indicated on the attendance card.
	 */
	public static final MMBusinessAttribute AttendanceCardLabelling = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AttendanceCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceCardLabelling";
			definition = "Information to be indicated on the attendance card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Attendance card which is required to attend the meeting.
	 */
	public static final MMBusinessAssociationEnd MeetingAttendance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AttendanceCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendance";
			definition = "Attendance card which is required to attend the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.AttendanceCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendance.mmObject();
		}
	};
	/**
	 * Specifies where the attendance card must be delivered.
	 */
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AttendanceCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies where the attendance card must be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryPlaceCode.mmObject();
		}
	};
	/**
	 * Address where the attendance card should be delivered.
	 */
	public static final MMBusinessAssociationEnd DeliveryPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AttendanceCard.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryPlace";
			definition = "Address where the attendance card should be delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AttendanceCard";
				definition = "Information about the attendance card which is issued for the requestor, for its underlying client or for the appointed proxy person or meeting attendee when an attendance request is included in the meeting instruction. \r\nThe instructing party can specify which information must be indicated on the attendance card and to which location the attendance card must be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.DeliveredAttendanceCard, com.tools20022.repository.entity.MeetingAttendance.AttendanceCard);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AttendanceCard.AttendanceCardLabelling, com.tools20022.repository.entity.AttendanceCard.MeetingAttendance,
						com.tools20022.repository.entity.AttendanceCard.DeliveryMethod, com.tools20022.repository.entity.AttendanceCard.DeliveryPlace);
			}
		});
		return mmObject_lazy.get();
	}
}
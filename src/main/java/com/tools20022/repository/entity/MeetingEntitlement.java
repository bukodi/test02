package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Notification of the entitlement that one party has in relation with a
 * specific meeting.
 */
public class MeetingEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement, e.g. record date, book close date...
	 */
	public static final MMBusinessAttribute EntitlementFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementFixingDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement, e.g. record date, book close date...";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of votes assigned to one security.
	 */
	public static final MMBusinessAttribute EntitlementRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementRatio";
			definition = "Number of votes assigned to one security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Amount of securities that are eligible for the vote.
	 */
	public static final MMBusinessAssociationEnd EligiblePosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligiblePosition";
			definition = "Amount of securities that are eligible for the vote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Services which include the entitlement calculation.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Services which include the entitlement calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}
	};
	/**
	 * Date at which the positions are calculated.
	 */
	public static final MMBusinessAttribute EntitlementCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingEntitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntitlementCalculationDate";
			definition = "Date at which the positions are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingEntitlement";
				definition = "Notification of the entitlement that one party has in relation with a specific meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingEntitlement.EntitlementFixingDate, com.tools20022.repository.entity.MeetingEntitlement.EntitlementRatio,
						com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition, com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.EntitlementCalculationDate);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CorporateActionServicing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services which consists in notifying the investor or its agent of a meeting,
 * in validating and relaying its instructions and in calculating its
 * entitlement based on its holdings.
 */
public class MeetingServicing extends CorporateActionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting for which services are provided.
	 */
	public static final MMBusinessAssociationEnd MeetingSpecification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingSpecification";
			definition = "Meeting for which services are provided.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.MeetingServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}
	};
	/**
	 * Service which consists in notifying the investor of a meeting. It may
	 * contain details of the meeting as defined by the agent in addition to the
	 * details defined by the issuer.
	 */
	public static final MMBusinessAssociationEnd MeetingNotice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingNotice";
			definition = "Service which consists in notifying the investor of a meeting. It may contain details of the meeting as defined by the agent in addition to the details defined by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingNotice.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmObject();
		}
	};
	/**
	 * Calculation of the entitlementbased on the balance in the account.
	 */
	public static final MMBusinessAssociationEnd MeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEntitlement";
			definition = "Calculation of the entitlementbased on the balance in the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.mmObject();
		}
	};
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 */
	public static final MMBusinessAssociationEnd MeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingInstruction";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}
	};
	/**
	 * Service which consists in distributing the results of the meeting to the
	 * investor.
	 */
	public static final MMBusinessAssociationEnd MeetingResultDissemination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingResultDissemination";
			definition = "Service which consists in distributing the results of the meeting to the investor.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingServicing";
				definition = "Services which consists in notifying the investor or its agent of a meeting, in validating and relaying its instructions and in calculating its entitlement based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.MeetingServicing, com.tools20022.repository.entity.MeetingNotice.RelatedServicing,
						com.tools20022.repository.entity.MeetingEntitlement.RelatedServicing, com.tools20022.repository.entity.InstructionForMeeting.RelatedServicing,
						com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing);
				superType_lazy = () -> CorporateActionServicing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingServicing.MeetingSpecification, com.tools20022.repository.entity.MeetingServicing.MeetingNotice,
						com.tools20022.repository.entity.MeetingServicing.MeetingEntitlement, com.tools20022.repository.entity.MeetingServicing.MeetingInstruction,
						com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination);
			}
		});
		return mmObject_lazy.get();
	}
}
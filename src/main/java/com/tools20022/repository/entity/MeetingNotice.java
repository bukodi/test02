package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about the general meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 */
public class MeetingNotice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting servicing process which comprises the notification of a meeting.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingNotice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the notification of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingNotice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}
	};
	/**
	 * Indicates that only the beneficial owner may participate in the event, ie
	 * no proxy or nominee voting is allowed.
	 */
	public static final MMBusinessAttribute BeneficialOwnerExclusiveIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingNotice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerExclusiveIndicator";
			definition = "Indicates that only the beneficial owner may participate in the event, ie no proxy or nominee voting is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingNotice";
				definition = "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingServicing.MeetingNotice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingNotice.RelatedServicing, com.tools20022.repository.entity.MeetingNotice.BeneficialOwnerExclusiveIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}
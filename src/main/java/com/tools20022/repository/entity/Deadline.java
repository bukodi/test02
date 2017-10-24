package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 */
public class Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related corporate action event.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deadline.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Deadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer.
	 */
	public static final MMBusinessAttribute MarketDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deadline.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed.  This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by an intermediary.
	 */
	public static final MMBusinessAttribute IntermediaryDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deadline.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer. (STP or Electronic mode)
	 */
	public static final MMBusinessAttribute STPDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deadline.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting for which deadlines are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Deadline.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Deadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.Deadline, com.tools20022.repository.entity.Meeting.Deadline);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.MarketDeadline,
						com.tools20022.repository.entity.Deadline.IntermediaryDeadline, com.tools20022.repository.entity.Deadline.STPDeadline, com.tools20022.repository.entity.Deadline.RelatedMeeting);
			}
		});
		return mmObject_lazy.get();
	}
}
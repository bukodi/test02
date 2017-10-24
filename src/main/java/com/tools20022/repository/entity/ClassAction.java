package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Form of lawsuit in which a group of shareholders collectively bring a claim
 * to court, mainly because it would be too expensive for each individual
 * shareholder to launch their own lawsuit.
 */
public class ClassAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference assigned by a court to a class action.
	 */
	public static final MMBusinessAttribute ClassActionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassActionNumber";
			definition = "Reference assigned by a court to a class action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Last day an investor can become a lead plaintiff.
	 */
	public static final MMBusinessAttribute LeadPlaintiffDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date upon which the High Court provided approval.
	 */
	public static final MMBusinessAttribute CourtApprovalDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the High Court provided approval.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period assigned by the court in a class action. It determines the
	 * client's eligible transactions that will be included in the class action
	 * and used to determine the resulting entitlement.
	 */
	public static final MMBusinessAssociationEnd ClaimPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClaimPeriod";
			definition = "Period assigned by the court in a class action. It determines the client's eligible transactions that will be included in the class action and used to determine the resulting entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ClassAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Date on which the action was filed at the applicable court.
	 */
	public static final MMBusinessAttribute FilingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date for the hearing between the plaintiff and defendant, as set by the
	 * court.
	 */
	public static final MMBusinessAttribute HearingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Corporate event for which class action is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClassAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which class action is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClassAction";
				definition = "Form of lawsuit in which a group of shareholders collectively bring a claim to court, mainly because it would be too expensive for each individual shareholder to launch their own lawsuit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ClassAction, com.tools20022.repository.entity.CorporateActionEvent.RelatedClassAction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClassAction.ClassActionNumber, com.tools20022.repository.entity.ClassAction.LeadPlaintiffDeadline,
						com.tools20022.repository.entity.ClassAction.CourtApprovalDate, com.tools20022.repository.entity.ClassAction.ClaimPeriod, com.tools20022.repository.entity.ClassAction.FilingDate,
						com.tools20022.repository.entity.ClassAction.HearingDate, com.tools20022.repository.entity.ClassAction.CorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}
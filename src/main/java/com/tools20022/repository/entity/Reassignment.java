package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CaseForwardingNotificationCode;
import com.tools20022.repository.entity.InvestigationResolution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Action that consists in forwarding an investigation case assignment to
 * another party which becomes the new assignee.
 */
public class Reassignment extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Justification for the forward action.
	 */
	public static final MMBusinessAttribute Justification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reassignment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Justification";
			definition = "Justification for the forward action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseForwardingNotificationCode.mmObject();
		}
	};
	/**
	 * Specifies the investigation case that is assigned.
	 */
	public static final MMBusinessAssociationEnd ReassignedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reassignment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReassignedCase";
			definition = "Specifies the investigation case that is assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.Reassignment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reassignment";
				definition = "Action that consists in forwarding an investigation case assignment to another party which becomes the new assignee.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.Reassignment);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reassignment.Justification, com.tools20022.repository.entity.Reassignment.ReassignedCase);
			}
		});
		return mmObject_lazy.get();
	}
}
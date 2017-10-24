package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CaseStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of an investigation case.
 */
public class InvestigationCaseStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the case.
	 */
	public static final MMBusinessAttribute CaseStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCaseStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaseStatus";
			definition = "Status of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseStatusCode.mmObject();
		}
	};
	/**
	 * Case for which a status is reported.
	 */
	public static final MMBusinessAssociationEnd InvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationCaseStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationCase";
			definition = "Case for which a status is reported.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationCaseStatus";
				definition = "Status of an investigation case.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.Status);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCaseStatus.CaseStatus, com.tools20022.repository.entity.InvestigationCaseStatus.InvestigationCase);
			}
		});
		return mmObject_lazy.get();
	}
}
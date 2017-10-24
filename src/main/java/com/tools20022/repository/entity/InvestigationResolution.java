package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the actions taken as a result of an investigation.
 */
public class InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Case for which a resolution is provided.
	 */
	public static final MMBusinessAssociationEnd InvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationCase";
			definition = "Case for which a resolution is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.InvestigationResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	/**
	 * Identifies the case for which a resolution is provided.
	 */
	public static final MMBusinessAttribute InvestigationCaseReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestigationResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseReference";
			definition = "Identifies the case for which a resolution is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationResolution";
				definition = "Specifies the actions taken as a result of an investigation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.InvestigationResolution);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCaseResolution.mmObject(), Reassignment.mmObject(), DuplicateCase.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationResolution.InvestigationCase, com.tools20022.repository.entity.InvestigationResolution.InvestigationCaseReference);
			}
		});
		return mmObject_lazy.get();
	}
}
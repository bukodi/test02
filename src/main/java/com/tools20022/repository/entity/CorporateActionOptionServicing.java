package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Option servicing process which calculates the entitlement based on a
 * corporate action option.
 */
public class CorporateActionOptionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the option for which an entitlement is calculated
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOptionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Specifies the option for which an entitlement is calculated";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.CorporateActionOptionServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionOption.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOptionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionOptionServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionServicing";
				definition = "Option servicing process which calculates the entitlement based on a corporate action option.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.CorporateActionOptionServicing, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionOptionServicing);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption, com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedServicing);
			}
		});
		return mmObject_lazy.get();
	}
}
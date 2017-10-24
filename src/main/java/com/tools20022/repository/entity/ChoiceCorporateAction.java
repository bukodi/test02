package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Mandatory with choice corporate action event that involves a choice on behalf
 * of the owner of the securities. The shareholders are given a chance to choose
 * among several options.
 */
public class ChoiceCorporateAction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Definition of the option of a corporate event.
	 */
	public static final MMBusinessAssociationEnd CorporateActionOptionDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ChoiceCorporateAction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionDefinition";
			definition = "Definition of the option of a corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionOption.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChoiceCorporateAction";
				definition = "Mandatory with choice corporate action event that involves a choice on behalf of the owner of the securities. The shareholders are given a chance to choose among several options.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition);
			}
		});
		return mmObject_lazy.get();
	}
}
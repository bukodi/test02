package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Element such as signature that can be used to prove a fact.
 */
public class Evidence {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Document which is used as a proof of evidence.
	 */
	public static final MMBusinessAssociationEnd RelatedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Evidence.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDocument";
			definition = "Document which is used as a proof of evidence.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Evidence;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Evidence";
				definition = "Element such as signature that can be used to prove a fact.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.Evidence);
				subType_lazy = () -> Arrays.asList(Signature.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Evidence.RelatedDocument);
			}
		});
		return mmObject_lazy.get();
	}
}
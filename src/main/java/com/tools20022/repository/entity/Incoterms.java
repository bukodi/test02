package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.IncotermsCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * International commerce terms are a series of international sales terms,
 * published by International Chamber of Commerce (ICC) and widely used in
 * international commercial transactions. These are accepted by governments,
 * legal authorities and practitioners worldwide for the interpretation of most
 * commonly used terms in international trade. Scope of this is limited to
 * matters relating to rights and obligations of the parties to the contract of
 * sale with respect to the delivery of goods sold. They are used to divide
 * transaction costs and responsibilities between buyer and seller and reflect
 * state-of-the-art transportation practices.
 */
public class Incoterms {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the transport information to which the incoterms apply.
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Incoterms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport information to which the incoterms apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.Incoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	/**
	 * Specifies the applicable Incoterm by means of a code.
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Incoterms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the applicable Incoterm by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncotermsCode.mmObject();
		}
	};
	/**
	 * Location where the Incoterms are actioned.
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Incoterms.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location where the Incoterms are actioned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Incoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Incoterms";
				definition = "International commerce terms are a series of international sales terms, published by International Chamber of Commerce (ICC) and widely used in international commercial transactions. These are accepted by governments, legal authorities and practitioners worldwide for the interpretation of most commonly used terms in international trade. Scope of this is limited to matters relating to rights and obligations of the parties to the contract of sale with respect to the delivery of goods sold. They are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.Incoterms, com.tools20022.repository.entity.Transport.Incoterms);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Incoterms.Transport, com.tools20022.repository.entity.Incoterms.Code, com.tools20022.repository.entity.Incoterms.Location);
			}
		});
		return mmObject_lazy.get();
	}
}
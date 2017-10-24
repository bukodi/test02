package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.NovationStatusCode;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Act of either replacing an obligation to perform with a new obligation, or
 * replacing a party to an agreement with a new party.
 */
public class Novation extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Clearing process to which the novation is related.
	 */
	public static final MMBusinessAssociationEnd SecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Novation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process to which the novation is related.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.Novation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	/**
	 * Provides the novation status for the transaction.
	 */
	public static final MMBusinessAttribute NovationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Novation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NovationStatus";
			definition = "Provides the novation status for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NovationStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Novation";
				definition = "Act of either replacing an obligation to perform with a new obligation, or replacing a party to an agreement with a new party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesClearing.Novation);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Novation.SecuritiesClearing, com.tools20022.repository.entity.Novation.NovationStatus);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment made by drawing a cheque in order to settle a debt.
 */
public class ChequePayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the characteristics of the cheque which was drawn to settle a
	 * debt.
	 */
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ChequePayment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Specifies the characteristics of the cheque which was drawn to settle a debt.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequePayment";
				definition = "Payment made by drawing a cheque in order to settle a debt.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.RelatedPayment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChequePayment.Cheque);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transfer by one party to a third party of its receivables.
 */
public class Assignment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment obligations included in an assignment.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assignment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment obligations included in an assignment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedAssignment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Invoice financing agreement which creates a payment obligation.
	 */
	public static final MMBusinessAssociationEnd FinancingAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Assignment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingAgreement";
			definition = "Invoice financing agreement which creates a payment obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.Assignment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Assignment";
				definition = "Transfer by one party to a third party of its receivables.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.RelatedAssignment, com.tools20022.repository.entity.InvoiceFinancingAgreement.Assignment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Assignment.PaymentObligation, com.tools20022.repository.entity.Assignment.FinancingAgreement);
			}
		});
		return mmObject_lazy.get();
	}
}
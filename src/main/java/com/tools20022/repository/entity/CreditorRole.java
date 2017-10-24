package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PaymentPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party to which an amount of money is due.
 */
public class CreditorRole extends PaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit party that signs a direct debit mandate.
	 */
	public static final MMBusinessAssociationEnd SchemeIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditorRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SchemeIdentification";
			definition = "Credit party that signs a direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.CreditorRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditorRole";
				definition = "Party to which an amount of money is due.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Scheme.CreditorRole);
				superType_lazy = () -> PaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditorRole.SchemeIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document that contains the information of the contract agreed between both
 * parties.
 */
public class Contract extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement that governs a contract agreed between parties.
	 */
	public static final MMBusinessAssociationEnd MasterAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Contract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterAgreement";
			definition = "Agreement that governs a contract agreed between  parties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.GovernedContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Contract";
				definition = "Document that contains the information of the contract agreed between both parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MasterAgreement.GovernedContract);
				subType_lazy = () -> Arrays.asList(AccountContract.mmObject(), Mandate.mmObject(), RegisteredContract.mmObject());
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Contract.MasterAgreement);
			}
		});
		return mmObject_lazy.get();
	}
}
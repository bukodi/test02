package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Mandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation given to a mandate holder to perform some operation on an
 * account.
 */
public class CashAccountMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Services that the holder of an account mandate can exercise.
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services that the holder of an account mandate can exercise.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccountMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}
	};
	/**
	 * Contract to which a mandate applies.
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract to which a mandate applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccountMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountMandate";
				definition = "Authorisation given to a mandate holder to perform some operation on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.CashAccountMandate, com.tools20022.repository.entity.CashAccountService.CashAccountMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountMandate.Services, com.tools20022.repository.entity.CashAccountMandate.CashAccountContract);
			}
		});
		return mmObject_lazy.get();
	}
}
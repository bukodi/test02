package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Product which provides guidance to investors to manage their portfolios.
 */
public class ManagedAccountProduct {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account which is the object of the managed account product.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ManagedAccountProduct.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account which is the object of the managed account product.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ManagedAccountProduct;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Contract which manages the investment account that is related to the
	 * products offered.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ManagedAccountProduct.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which manages the investment account that is related to the products offered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.ModeledAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ManagedAccountProduct";
				definition = "Product which provides guidance to investors to manage their portfolios.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.ManagedAccountProduct, com.tools20022.repository.entity.InvestmentAccountContract.ModeledAccount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ManagedAccountProduct.Account, com.tools20022.repository.entity.ManagedAccountProduct.InvestmentAccountContract);
			}
		});
		return mmObject_lazy.get();
	}
}
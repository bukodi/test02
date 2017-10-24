package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate.
 */
public class AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account contract which specifies the services linked to an account.
	 */
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountContract";
			definition = "Account contract which specifies the services linked to an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.AccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	/**
	 * Reservation information included in the services related to an account.
	 */
	public static final MMBusinessAssociationEnd Reservation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation information included in the services related to an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.AccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};
	/**
	 * Account for which services are specified.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account for which services are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.AccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Charge applied for the administration of an account.
	 */
	public static final MMBusinessAssociationEnd AccountAdministrationCharge = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountAdministrationCharge";
			definition = "Charge applied for the administration of an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.AccountService, com.tools20022.repository.entity.AccountContract.AccountService,
						com.tools20022.repository.entity.Reservation.AccountService, com.tools20022.repository.entity.Charges.Services);
				subType_lazy = () -> Arrays.asList(ReportingService.mmObject(), CashAccountService.mmObject(), InvestmentAccountService.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.AccountContract, com.tools20022.repository.entity.AccountService.Reservation, com.tools20022.repository.entity.AccountService.Account,
						com.tools20022.repository.entity.AccountService.AccountAdministrationCharge);
			}
		});
		return mmObject_lazy.get();
	}
}
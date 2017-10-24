package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.AccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account contract established between the organisation or the group to which
 * the organisation belongs, and the account servicer.
 */
public class CashAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the account which is managed by the stipulations of the
	 * contract. it is derived from the association between AccountContract and
	 * Account.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Identification of the account to/from which the balance of the account
	 * must be transferred.
	 */
	public static final MMBusinessAssociationEnd TransferCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCashAccount";
			definition = "Identification of the account to/from which the balance of the account must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.ClosedAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account. It is derived from the
	 * association between AccountContract and AccountService.
	 */
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}
	};
	/**
	 * Specifies the transfer of a positive balance (fully or partially) or the
	 * transfer of cash to compensate a negative balance. This transfer occurs
	 * at the closing of the account. It contains the identification of the
	 * account to which or from which the amount must be transferred.
	 */
	public static final MMBusinessAssociationEnd BalanceTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceTransfer";
			definition = "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Mandate associated with a cash account contract.
	 */
	public static final MMBusinessAssociationEnd CashAccountMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate associated with a cash account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.CashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountContract";
				definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashAccountContract, com.tools20022.repository.entity.CashAccount.ClosedAccountContract,
						com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms, com.tools20022.repository.entity.CashAccountService.CashAccountContract,
						com.tools20022.repository.entity.CashAccountMandate.CashAccountContract);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.CashAccount, com.tools20022.repository.entity.CashAccountContract.TransferCashAccount,
						com.tools20022.repository.entity.CashAccountContract.Services, com.tools20022.repository.entity.CashAccountContract.BalanceTransfer, com.tools20022.repository.entity.CashAccountContract.CashAccountMandate);
			}
		});
		return mmObject_lazy.get();
	}
}
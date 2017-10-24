package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BillingChargeMethodCode;
import com.tools20022.repository.codeset.BillingCurrencyTypeCode;
import com.tools20022.repository.codeset.CompensationMethodCode;
import com.tools20022.repository.codeset.ServicePaymentMethodCode;
import com.tools20022.repository.entity.AccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 */
public class CashAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Mandate which specifies the services that can be operated by the mandate
	 * holder.
	 */
	public static final MMBusinessAssociationEnd CashAccountMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate which specifies the services that can be operated by the mandate holder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}
	};
	/**
	 * Defines if and how charges and taxes due are paid to the account
	 * servicer.
	 */
	public static final MMBusinessAttribute CompensationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CompensationMethodCode.mmObject();
		}
	};
	/**
	 * Currency used for billing the services related to the account.
	 */
	public static final MMBusinessAttribute BillingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCurrency";
			definition = "Currency used for billing the services related to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingCurrencyTypeCode.mmObject();
		}
	};
	/**
	 * Defines how the billing charge is calculated.
	 */
	public static final MMBusinessAttribute BillingChargeMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingChargeMethod";
			definition = "Defines how the billing charge is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingChargeMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the different payment methods for an account service.
	 */
	public static final MMBusinessAttribute PaymentMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the different payment methods for an account service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethodCode.mmObject();
		}
	};
	/**
	 * Cash account contract which specifies the services linked to a cash
	 * account. It is derived from the association between AccountService and
	 * AccountContract.
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	/**
	 * Identifies the bank operation.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the bank operation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Cash account for which services are specified. It is derived from the
	 * association between AccountService and Account.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which services are specified. It is derived from the association between AccountService and Account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService, com.tools20022.repository.entity.CashAccount.CashAccountService,
						com.tools20022.repository.entity.CashAccountContract.Services, com.tools20022.repository.entity.CashAccountMandate.Services);
				subType_lazy = () -> Arrays.asList(CashManagementService.mmObject(), BankOperation.mmObject(), DebitCreditFacility.mmObject());
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountService.CashAccountMandate, com.tools20022.repository.entity.CashAccountService.CompensationMethod,
						com.tools20022.repository.entity.CashAccountService.BillingCurrency, com.tools20022.repository.entity.CashAccountService.BillingChargeMethod, com.tools20022.repository.entity.CashAccountService.PaymentMethod,
						com.tools20022.repository.entity.CashAccountService.CashAccountContract, com.tools20022.repository.entity.CashAccountService.Identification, com.tools20022.repository.entity.CashAccountService.CashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}
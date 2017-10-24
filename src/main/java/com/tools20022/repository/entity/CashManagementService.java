package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CallInCode;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of applications that provides services which facilitate the management of
 * cash positions on an account.
 */
public class CashManagementService extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Maximum amount value applied to or by a party versus a specific
	 * counterparty or a set of counterparts. The limit can be expressed as a
	 * debit limit or a credit limit.
	 */
	public static final MMBusinessAssociationEnd RiskManagementLimit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashManagementService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskManagementLimit";
			definition = "Maximum amount value applied to or by a party versus a specific counterparty or a set of counterparts. The limit can be expressed as a debit limit or a credit limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.CashManagementService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
		}
	};
	/**
	 * Specifies standing orders that must be executed in the context of cash
	 * management. This service may be offered by a transaction administrator.
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashManagementService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Specifies standing orders that must be executed in the context of cash management. This service may be offered by a transaction administrator.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.RelatedCashServices;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashStandingOrder.mmObject();
		}
	};
	/**
	 * Transaction administrator of a cash management service.
	 */
	public static final MMBusinessAssociationEnd RelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashManagementService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator of a cash management service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CashManagementService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TransactionAdministrator.mmObject();
		}
	};
	/**
	 * Cash management feature limiting the amount of liquidity needed to
	 * perform clearing and settlement operations. At any point in time during
	 * the process, the limit imposes the maximum amount of liquidity available
	 * for operations concerning the system or other managed elements, eg,
	 * transaction amount or counterparty.
	 */
	public static final MMBusinessAssociationEnd LiquidityManagementLimit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashManagementService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityManagementLimit";
			definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
		}
	};
	/**
	 * Type of call when additional funding from a settlement member is
	 * requested by a central settlement system.
	 */
	public static final MMBusinessAttribute CallInType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashManagementService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallInType";
			definition = "Type of call when additional funding from a settlement member is requested by a central settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CallInCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashManagementService";
				definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.CashManagementService, com.tools20022.repository.entity.TransactionAdministrator.CashManagementService,
						com.tools20022.repository.entity.CashStandingOrder.RelatedCashServices, com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.RiskManagementLimit, com.tools20022.repository.entity.CashManagementService.StandingOrder,
						com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator, com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit,
						com.tools20022.repository.entity.CashManagementService.CallInType);
			}
		});
		return mmObject_lazy.get();
	}
}
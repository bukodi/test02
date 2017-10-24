package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing and settlement.
 */
public class TransactionAdministrator extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * System where the clearing takes place.
	 */
	public static final MMBusinessAssociationEnd CashClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashClearingSystem";
			definition = "System where the clearing takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
		}
	};
	/**
	 * Currency which may be processed by the system. A system may process
	 * transactions in a single currency or in multiple currencies.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Static data maintained by the transaction administrator and related to
	 * currency exchange details as maintained for system operations.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Set of applications that provides services which facilitate the
	 * management of cash positions on an account.
	 */
	public static final MMBusinessAssociationEnd CashManagementService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Set of applications that provides services which facilitate the management of cash positions on an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}
	};
	/**
	 * Specifies the settlement instruction managed by the transaction
	 * administrator.
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionAdministrator.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the settlement instruction managed by the transaction administrator.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionAdministrator";
				definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator, com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator,
						com.tools20022.repository.entity.CashManagementService.RelatedTransactionAdministrator, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem, com.tools20022.repository.entity.TransactionAdministrator.Currency,
						com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.CashManagementService,
						com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}
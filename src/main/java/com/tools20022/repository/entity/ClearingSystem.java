package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.System;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the system which plays a role in the clearing process.
 */
public class ClearingSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the clearing process for which a clearing system is used.
	 */
	public static final MMBusinessAssociationEnd Clearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clearing";
			definition = "Specifies the clearing process for which a clearing system is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Clearing.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
		}
	};
	/**
	 * Central counterparty which is related to a clearing system.
	 */
	public static final MMBusinessAssociationEnd CentralClearingCounterparty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralClearingCounterparty";
			definition = "Central counterparty which is related to a clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CentralClearingCounterpartyRole.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CentralClearingCounterpartyRole.mmObject();
		}
	};
	/**
	 * Assets posted by participants in a clearing fund that can be used in the
	 * event of a default by a participant to compensate non-defaulting
	 * participants for losses they suffer due to this default.
	 */
	public static final MMBusinessAssociationEnd DefaultFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFund.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFund.mmObject();
		}
	};
	/**
	 * Collateral activities related to a clearing system.
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Collateral activities related to a clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.ClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingSystem";
				definition = "Specifies the system which plays a role in the clearing process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.ClearingSystem, com.tools20022.repository.entity.CollateralManagement.ClearingSystem,
						com.tools20022.repository.entity.DefaultFund.ClearingSystem, com.tools20022.repository.entity.CentralClearingCounterpartyRole.System);
				subType_lazy = () -> Arrays.asList(CashClearingSystem.mmObject());
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.Clearing, com.tools20022.repository.entity.ClearingSystem.CentralClearingCounterparty,
						com.tools20022.repository.entity.ClearingSystem.DefaultFund, com.tools20022.repository.entity.ClearingSystem.CollateralManagement);
			}
		});
		return mmObject_lazy.get();
	}
}
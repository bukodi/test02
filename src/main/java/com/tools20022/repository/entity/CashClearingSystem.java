package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.CashClearingSystemCode;
import com.tools20022.repository.codeset.CashSettlementSystemCode;
import com.tools20022.repository.codeset.CashSystemTypeCode;
import com.tools20022.repository.entity.ClearingSystem;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Clearing system that processes only cash transfers.
 */
public class CashClearingSystem extends ClearingSystem {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Information used to identify a cash clearing system.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemIdentification3Choice.Code, com.tools20022.repository.choice.ClearingSystemIdentification3Choice.Proprietary,
					com.tools20022.repository.choice.ClearingSystemIdentification2Choice.Code, com.tools20022.repository.choice.ClearingSystemIdentification2Choice.Proprietary,
					com.tools20022.repository.msg.ClearingSystemMemberIdentification2.ClearingSystemIdentification);
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Information used to identify a cash clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashClearingSystemCode.mmObject();
		}
	};
	/**
	 * Set of integrated applications that provides centralised services such as
	 * clearing and settlement.
	 */
	public static final MMBusinessAssociationEnd TransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionAdministrator";
			definition = "Set of integrated applications that provides centralised services such as clearing and settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	/**
	 * Specifies the role played by the cash clearing system.
	 */
	public static final MMBusinessAssociationEnd SystemRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemRole";
			definition = "Specifies the role played by the cash clearing system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SettlementInstructionSystemRole.mmObject();
		}
	};
	/**
	 * Specifies the category of cash clearing system, eg, cheque clearing.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the category of cash clearing system, eg, cheque clearing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashSystemTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the cash settlement system used.
	 */
	public static final MMBusinessAttribute CashSettlementSystem = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashClearingSystem.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementSystem";
			definition = "Specifies the cash settlement system used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashSettlementSystemCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystem";
				definition = "Clearing system that processes only cash transfers.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionAdministrator.CashClearingSystem, com.tools20022.repository.entity.SettlementInstructionSystemRole.System);
				superType_lazy = () -> ClearingSystem.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.Identification, com.tools20022.repository.entity.CashClearingSystem.TransactionAdministrator,
						com.tools20022.repository.entity.CashClearingSystem.SystemRole, com.tools20022.repository.entity.CashClearingSystem.Type, com.tools20022.repository.entity.CashClearingSystem.CashSettlementSystem);
				derivationComponent_lazy = () -> Arrays.asList(ClearingSystemIdentification3Choice.mmObject(), ClearingSystemIdentification2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
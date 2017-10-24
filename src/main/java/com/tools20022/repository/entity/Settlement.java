package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process which consists in transferring the proceeds related to a trade from
 * one party to the next one.
 */
public class Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 */
	public static final MMBusinessAttribute CentralCounterpartyEligibilityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Settlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyEligibilityIndicator";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Settlement Standing Instruction database to be used for settlement.
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Settlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Settlement Standing Instruction database to be used for settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};
	/**
	 * Specifies roles played by a party in the settlement process.
	 */
	public static final MMBusinessAssociationEnd SettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Settlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies roles played by a party in the settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
		}
	};
	/**
	 * Trade for which settlement information is provided.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Settlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which settlement information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Settlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Settlement";
				definition = "Process which consists in transferring the proceeds related to a trade from one party to the next one.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Settlement, com.tools20022.repository.entity.SettlementPartyRole.Settlement,
						com.tools20022.repository.entity.StandingSettlementInstruction.Settlement);
				subType_lazy = () -> Arrays.asList(CashSettlement.mmObject(), SecuritiesSettlement.mmObject(), CommercialTradeSettlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Settlement.CentralCounterpartyEligibilityIndicator, com.tools20022.repository.entity.Settlement.StandingSettlementInstruction,
						com.tools20022.repository.entity.Settlement.SettlementPartyRole, com.tools20022.repository.entity.Settlement.Trade);
			}
		});
		return mmObject_lazy.get();
	}
}
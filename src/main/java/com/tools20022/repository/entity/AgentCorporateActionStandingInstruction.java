package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.StandingInstructionGrossNetCode;
import com.tools20022.repository.codeset.StandingInstructionTypeCode;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set-up at the issuer (agent) of a standing instruction originating from the
 * CSD Participants. These standing instructions allow the participant to
 * indicate details for the distribution of the outturn resources of a CA event
 * outside of the CSD. A standing instruction can be accepted or rejected by the
 * issuer (agent) and a CSD participant can amend or cancel a standing
 * instruction.
 */
public class AgentCorporateActionStandingInstruction extends StandingSettlementInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of standing instruction.
	 */
	public static final MMBusinessAttribute StandingInstructionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingInstructionType";
			definition = "Type of standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the payments must always be gross or net.
	 */
	public static final MMBusinessAttribute GrossOrNetIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossOrNetIndicator";
			definition = "Indicates whether the payments must always be gross or net.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionGrossNetCode.mmObject();
		}
	};
	/**
	 * Corporate action delivery instructions which contain settlement standing
	 * instructions.
	 */
	public static final MMBusinessAssociationEnd RelatedDeliveryInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDeliveryInstructions";
			definition = "Corporate action delivery instructions which contain settlement standing instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	/**
	 * Financial instrument to which the standing instruction applies.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Financial instrument to which the standing instruction applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CorporateActionStandingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgentCorporateActionStandingInstruction";
				definition = "Set-up at the issuer (agent) of a standing instruction originating from the CSD Participants. These standing instructions allow the participant to indicate details for the distribution of the outturn resources of a CA event outside of the CSD. A standing instruction can be accepted or rejected by the issuer (agent) and a CSD participant can amend or cancel a standing instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CorporateActionStandingInstructions,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction);
				superType_lazy = () -> StandingSettlementInstruction.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.StandingInstructionType,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.GrossOrNetIndicator, com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.Security);
			}
		});
		return mmObject_lazy.get();
	}
}
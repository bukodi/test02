package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provider of a standing settlement instruction (SSI) database.
 */
public class SSIDatabaseProvider extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement instruction database information which is provided.
	 */
	public static final MMBusinessAssociationEnd StandingSettlementDatabase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SSIDatabaseProvider.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementDatabase";
			definition = "Settlement instruction database information which is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseProvider;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SSIDatabaseProvider";
				definition = "Provider of a standing settlement instruction (SSI) database.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingSettlementInstruction.SSIDatabaseProvider);
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SSIDatabaseProvider.StandingSettlementDatabase);
			}
		});
		return mmObject_lazy.get();
	}
}
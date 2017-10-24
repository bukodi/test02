package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CollateralProposalResponseCode;
import com.tools20022.repository.codeset.ProposalTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies collateral proposed to the counterparty.
 */
public class CollateralProposal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Details the movement of collateral that is proposed to be delivered or
	 * returned by one of the collateral parties.
	 */
	public static final MMBusinessAssociationEnd ProposedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedCollateralMovement";
			definition = "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralMovement.mmObject();
		}
	};
	/**
	 * Indicates whether the collateral proposal is an initial or a counter
	 * proposal.
	 */
	public static final MMBusinessAttribute ResponseType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponseCode.mmObject();
		}
	};
	/**
	 * Indicates whether this is an initial or counter proposal.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether this is an initial or counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProposalTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.CollateralProposal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralProposal";
				definition = "Specifies collateral proposed to the counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal, com.tools20022.repository.entity.CollateralManagement.CollateralProposal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement, com.tools20022.repository.entity.CollateralProposal.ResponseType,
						com.tools20022.repository.entity.CollateralProposal.Type, com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conditions that must be met to propose a resolution.
 */
public class ResolutionProposal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the minimum stake in share capital or cash value or number of
	 * security holders required to table resolutions.
	 */
	public static final MMBusinessAttribute ResolutionProposalThreshold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ResolutionProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalThreshold";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the minimum stake in share capital or cash value or number of
	 * security holders required to table resolutions. This minimum is expressed
	 * as a percentage.
	 */
	public static final MMBusinessAttribute ResolutionProposalThresholdPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ResolutionProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalThresholdPercentage";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Meeting for which conditions for proposing a resolution are specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ResolutionProposal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which conditions for proposing a resolution are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.ResolutionProposalConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResolutionProposal";
				definition = "Conditions that must be met to propose a resolution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.ResolutionProposalConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ResolutionProposal.ResolutionProposalThreshold, com.tools20022.repository.entity.ResolutionProposal.ResolutionProposalThresholdPercentage,
						com.tools20022.repository.entity.ResolutionProposal.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}
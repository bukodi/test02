package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of votes assigned to each voting option.
 */
public class Vote {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Request which contains the vote instructions.
	 */
	public static final MMBusinessAssociationEnd VoteRequest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteRequest";
			definition = "Request which contains the vote instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VoteInstructionRequest.mmObject();
		}
	};
	/**
	 * Number of votes in favour of one resolution
	 */
	public static final MMBusinessAttribute For = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes against one resolution
	 */
	public static final MMBusinessAttribute Against = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes declared abstained for one resolution.
	 */
	public static final MMBusinessAttribute Abstain = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Number of votes declared abstained for one resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes withheld for one resolution
	 */
	public static final MMBusinessAttribute Withhold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withhold";
			definition = "Number of votes withheld for one resolution";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes in line with the votes of the management.
	 */
	public static final MMBusinessAttribute WithManagement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithManagement";
			definition = "Number of votes in line with the votes of the management.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes against the voting recommendation of the management.
	 */
	public static final MMBusinessAttribute AgainstManagement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgainstManagement";
			definition = "Number of votes against the voting recommendation of the management.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the agenda item on which a vote is/was cast.
	 */
	public static final MMBusinessAssociationEnd Resolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Resolution";
			definition = "Specifies the agenda item on which a vote is/was cast.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.CastVotes;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
		}
	};
	/**
	 * Number of votes for which no action has been taken.
	 */
	public static final MMBusinessAttribute NoAction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Information on the vote result for a specific resolution.
	 */
	public static final MMBusinessAssociationEnd Result = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Result";
			definition = "Information on the vote result for a specific resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteResult.Vote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VoteResult.mmObject();
		}
	};
	/**
	 * Number of votes in favour of two years for "say on pay" type of
	 * resolution.
	 */
	public static final MMBusinessAttribute TwoYears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes in favour for one year for "say on pay" type of
	 * resolution.
	 */
	public static final MMBusinessAttribute OneYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Resolution withdrawn at the meeting.
	 */
	public static final MMBusinessAttribute Withdrawn = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Resolution withdrawn at the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Number of votes in favour of three years for "say on pay" type of
	 * resolution.
	 */
	public static final MMBusinessAttribute ThreeYears = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Vote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Vote";
				definition = "Number of votes assigned to each voting option.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Resolution.CastVotes, com.tools20022.repository.entity.VoteInstructionRequest.VotePerResolution, com.tools20022.repository.entity.VoteResult.Vote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Vote.VoteRequest, com.tools20022.repository.entity.Vote.For, com.tools20022.repository.entity.Vote.Against, com.tools20022.repository.entity.Vote.Abstain,
						com.tools20022.repository.entity.Vote.Withhold, com.tools20022.repository.entity.Vote.WithManagement, com.tools20022.repository.entity.Vote.AgainstManagement, com.tools20022.repository.entity.Vote.Resolution,
						com.tools20022.repository.entity.Vote.NoAction, com.tools20022.repository.entity.Vote.Result, com.tools20022.repository.entity.Vote.TwoYears, com.tools20022.repository.entity.Vote.OneYear,
						com.tools20022.repository.entity.Vote.Withdrawn, com.tools20022.repository.entity.Vote.ThreeYears);
			}
		});
		return mmObject_lazy.get();
	}
}
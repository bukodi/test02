package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether an agenda item of a general meeting has been accepted or
 * rejected, together with the number of votes.
 */
public class VoteResult {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of votes per type of vote and per resolution.
	 */
	public static final MMBusinessAssociationEnd Vote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteResult.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Vote";
			definition = "Number of votes per type of vote and per resolution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.Result;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Vote.mmObject();
		}
	};
	/**
	 * Specifies whether a resolution is accepted or not.
	 */
	public static final MMBusinessAttribute Accepted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteResult.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Specifies whether a resolution is accepted or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Disemination process through which the results are propagated.
	 */
	public static final MMBusinessAssociationEnd VoteDissemination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteResult.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteDissemination";
			definition = "Disemination process through which the results are propagated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingResultDissemination.VoteResult;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingResultDissemination.mmObject();
		}
	};
	/**
	 * Total number of votes cast per resolution.
	 */
	public static final MMBusinessAttribute TotalVotesCast = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VoteResult.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalVotesCast";
			definition = "Total number of votes cast per resolution.";
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
				name = "VoteResult";
				definition = "Specifies whether an agenda item of a general meeting has been accepted or rejected, together with the number of votes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Vote.Result, com.tools20022.repository.entity.MeetingResultDissemination.VoteResult);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteResult.Vote, com.tools20022.repository.entity.VoteResult.Accepted, com.tools20022.repository.entity.VoteResult.VoteDissemination,
						com.tools20022.repository.entity.VoteResult.TotalVotesCast);
			}
		});
		return mmObject_lazy.get();
	}
}
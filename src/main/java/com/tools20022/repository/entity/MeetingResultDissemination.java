package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the voting results of a shareholders meeting.
 */
public class MeetingResultDissemination {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting servicing process which comprises the dissemination of the
	 * results.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingResultDissemination.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the dissemination of the results.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}
	};
	/**
	 * Specifies whether a resolution is accepted and the number of votes which
	 * were cast.
	 */
	public static final MMBusinessAssociationEnd VoteResult = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingResultDissemination.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteResult";
			definition = "Specifies whether a resolution is accepted and the number of votes which were cast.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteResult.VoteDissemination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VoteResult.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDissemination";
				definition = "Provides information on the voting results of a shareholders meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteResult.VoteDissemination, com.tools20022.repository.entity.MeetingServicing.MeetingResultDissemination);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingResultDissemination.RelatedServicing, com.tools20022.repository.entity.MeetingResultDissemination.VoteResult);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ResolutionTypeCode;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 */
public class Resolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Numbering of the resolution as specified by the issuer or its agent.
	 */
	public static final MMBusinessAttribute IssuerLabel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or  its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Free text description of the resolution.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Abbreviated description of the resolution.
	 */
	public static final MMBusinessAttribute Title = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether a resolution is ordinary, extraordinary or special.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates whether a resolution is ordinary, extraordinary or special.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the resolution is listed for information or for voting.
	 */
	public static final MMBusinessAttribute ForInformationOnly = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the resolution has been submitted by the security
	 * holder.
	 */
	public static final MMBusinessAttribute SubmittedBySecurityHolder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how the management of the issuing company wishes the security
	 * holders to vote.
	 */
	public static final MMBusinessAttribute ManagementRecommendation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementRecommendation";
			definition = "Indicates how the management of the issuing company wishes the security holders to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates how the notifying party recommends that the security holders
	 * vote.
	 */
	public static final MMBusinessAttribute NotifyingPartyRecommendation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Specifies whether a resolution is accepted or not and details the number
	 * of votes and their status.
	 */
	public static final MMBusinessAssociationEnd CastVotes = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CastVotes";
			definition = "Specifies whether a resolution is accepted or not and details the number of votes and their status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Vote.Resolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Vote.mmObject();
		}
	};
	/**
	 * Meeting for which an agenda item is specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an agenda item is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.AgendaItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * Vote options allowed at the resolution level. When specified, it
	 * supersedes the vote options given for the meeting.
	 */
	public static final MMBusinessAttribute VoteOptions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Resolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteOptions";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Resolution";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.AgendaItem, com.tools20022.repository.entity.Vote.Resolution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Resolution.IssuerLabel, com.tools20022.repository.entity.Resolution.Description, com.tools20022.repository.entity.Resolution.Title,
						com.tools20022.repository.entity.Resolution.Type, com.tools20022.repository.entity.Resolution.ForInformationOnly, com.tools20022.repository.entity.Resolution.SubmittedBySecurityHolder,
						com.tools20022.repository.entity.Resolution.ManagementRecommendation, com.tools20022.repository.entity.Resolution.NotifyingPartyRecommendation, com.tools20022.repository.entity.Resolution.CastVotes,
						com.tools20022.repository.entity.Resolution.Meeting, com.tools20022.repository.entity.Resolution.VoteOptions);
			}
		});
		return mmObject_lazy.get();
	}
}
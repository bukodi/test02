package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.VoteInstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different voting types, channels and premium.
 */
public class VotingCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of holdings required for a vote.
	 */
	public static final MMBusinessAttribute SecuritiesQuantityRequiredToVote = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantityRequiredToVote";
			definition = "Number of holdings required for a vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies whether it is allowed to only vote on a part of the entire
	 * entitled holding, leaving part of the position un-voted.
	 */
	public static final MMBusinessAttribute PartialVoteAllowed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialVoteAllowed";
			definition = "Specifies whether it is allowed to only vote on a part of the entire entitled holding, leaving part of the position un-voted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the option to give a split instruction, for example, a
	 * split voting instruction on a meeting, is allowed.
	 */
	public static final MMBusinessAttribute SplitVoteAllowed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitVoteAllowed";
			definition = "Indicates that the option to give a split instruction, for example, a split voting instruction on a meeting, is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Electronic address, e-mail or website where a voting ballot can be
	 * obtained and/or where a security holder can vote.
	 */
	public static final MMBusinessAssociationEnd VoteLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteLocation";
			definition = "Electronic address, e-mail or website where a voting ballot can be obtained and/or where a security holder can vote.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ContactPointForVote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Indicates whether beneficiary details (eg name and address) must be
	 * supplied in order to take part to a meeting.
	 */
	public static final MMBusinessAttribute BeneficialOwnerDisclosure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerDisclosure";
			definition = "Indicates whether beneficiary details (eg name and address) must be supplied in order to take part to a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event.
	 */
	public static final MMBusinessAttribute IncentivePremium = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available if the securities holder consents or participates to an event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	/**
	 * Identifies the possible types of voting instructions.
	 */
	public static final MMBusinessAttribute VoteInstructionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteInstructionType";
			definition = "Identifies the possible types of voting instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionCode.mmObject();
		}
	};
	/**
	 * Indicates whether standing instructions have been defined or not. In this
	 * case, the intermediary should cast the votes according to these
	 * instructions.
	 */
	public static final MMBusinessAttribute StandingVotingInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingVotingInstruction";
			definition = "Indicates whether standing instructions have been defined or not. In this case, the intermediary should cast the votes according to these instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of additional weight applied to the votes of long term
	 * shareholders.
	 */
	public static final MMBusinessAttribute VotingPremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumAmount";
			definition = "Amount of additional weight applied to the votes of long term shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate of additional weight applied to the votes of long term shareholders.
	 */
	public static final MMBusinessAttribute VotingPremiumRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingPremiumRate";
			definition = "Rate of additional weight applied to the votes of long term shareholders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Meeting for which voting conditions are specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which voting conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.VotingCondition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * Indicates whether the previously sent instructions becomes invalid after
	 * a market deadline extension.
	 */
	public static final MMBusinessAttribute PreviousInstructionInvalidity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> VotingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousInstructionInvalidity";
			definition = "Indicates whether the previously sent instructions becomes invalid after a market deadline extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VotingCondition";
				definition = "Specifies the different voting types, channels and premium.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.ContactPointForVote, com.tools20022.repository.entity.Meeting.VotingCondition);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VotingCondition.SecuritiesQuantityRequiredToVote, com.tools20022.repository.entity.VotingCondition.PartialVoteAllowed,
						com.tools20022.repository.entity.VotingCondition.SplitVoteAllowed, com.tools20022.repository.entity.VotingCondition.VoteLocation, com.tools20022.repository.entity.VotingCondition.BeneficialOwnerDisclosure,
						com.tools20022.repository.entity.VotingCondition.IncentivePremium, com.tools20022.repository.entity.VotingCondition.VoteInstructionType, com.tools20022.repository.entity.VotingCondition.StandingVotingInstruction,
						com.tools20022.repository.entity.VotingCondition.VotingPremiumAmount, com.tools20022.repository.entity.VotingCondition.VotingPremiumRate, com.tools20022.repository.entity.VotingCondition.Meeting,
						com.tools20022.repository.entity.VotingCondition.PreviousInstructionInvalidity);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies additional information about the processed instruction.
 */
public class AcknowledgementReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Instruction is accepted but does not comply with the market practice rule
	 * published for the concerned market or process.
	 */
	public static final MMCode MarketPracticeRuleDiscrepency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeRuleDiscrepency";
			definition = "Instruction is accepted but does not comply with the market practice rule published for the concerned market or process.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "SMPG";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Instruction was not straight through processing and had to be processed
	 * manually.
	 */
	public static final MMCode NotStraightThroughProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStraightThroughProcessing";
			definition = "Instruction was not straight through processing and had to be processed manually.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "NSTP";
		}
	};
	/**
	 * Instruction registration is accepted but the registration is not in full,
	 * that is, not with voting rights.
	 */
	public static final MMCode AcceptedWithoutVotingRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithoutVotingRights";
			definition = "Instruction registration is accepted but the registration is not in full, that is, not with voting rights.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "RQWV";
		}
	};
	/**
	 * Other. See Narrative.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Execution is conditional to the execution of a process linked to the
	 * currency of the transaction.
	 */
	public static final MMCode ConditionalCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is conditional to the execution of a process linked to the currency of the transaction.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process at the registrar.
	 */
	public static final MMCode ConditionalRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is conditional to the execution of a process at the registrar.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "CDRG";
		}
	};
	/**
	 * Execution is conditional to the execution of a process of realignment at
	 * the issuer CSD.
	 */
	public static final MMCode ConditionalRealignement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is conditional to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * See narrative field for reason.
	 */
	public static final MMCode NarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> AcknowledgementReasonCode.mmObject();
			codeName = "NARR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcknowledgementReasonCode";
				definition = "Specifies additional information about the processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcknowledgementReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReasonCode.MarketPracticeRuleDiscrepency,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReasonCode.NotStraightThroughProcessing,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.AcceptedWithoutVotingRights, com.tools20022.repository.codeset.AcknowledgementReasonCode.Other,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalCurrency, com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalRegistrar,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalRealignement, com.tools20022.repository.codeset.AcknowledgementReasonCode.NarrativeReason);
			}
		});
		return mmObject_lazy.get();
	}
}
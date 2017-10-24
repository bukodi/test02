package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * See narrative field for reason.
 */
public class CancelledStatusReasonV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is cancelled by yourself.
	 */
	public static final MMCode CancelledByYourself = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByYourself";
			definition = "Transaction is cancelled by yourself.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANI";
		}
	};
	/**
	 * Transaction is cancelled by the system.
	 */
	public static final MMCode CancelledBySystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledBySystem";
			definition = "Transaction is cancelled by the system.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANS";
		}
	};
	/**
	 * Instruction has been cancelled by the agent due to an event deadline
	 * extension.
	 */
	public static final MMCode CancelledByAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByAgent";
			definition = "Instruction has been cancelled by the agent due to an event deadline extension.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CSUB";
		}
	};
	/**
	 * Transaction is cancelled by the hub.
	 */
	public static final MMCode CancelledByHub = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByHub";
			definition = "Transaction is cancelled by the hub.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANH";
		}
	};
	/**
	 * Transaction is cancelled by the instructing party.
	 */
	public static final MMCode CancelledByInstructingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByInstructingParty";
			definition = "Transaction is cancelled by the instructing party.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transaction is rejected by the executing party, the rejection is final
	 * therefore the order is cancelled in the system.
	 */
	public static final MMCode EndOfLife = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfLife";
			definition = "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CXLR";
		}
	};
	/**
	 * Transaction is cancelled by a party other than the instructing party, for
	 * example, a market infrastructure such as a stock exchange.
	 */
	public static final MMCode CancelledByOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByOther";
			definition = "Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Transaction is cancelled by the transfer agent.
	 */
	public static final MMCode CancelledByTransferAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByTransferAgent";
			definition = "Transaction is cancelled by the transfer agent.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CNTA";
		}
	};
	/**
	 * Transaction is cancelled by the client.
	 */
	public static final MMCode CancelledByClient = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByClient";
			definition = "Transaction is cancelled by the client.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Transaction is cancelled by the intermediary.
	 */
	public static final MMCode CancelledByIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByIntermediary";
			definition = "Transaction is cancelled by the intermediary.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CNIN";
		}
	};
	/**
	 * Original transaction has been cancelled and replaced due to a corporate
	 * action.
	 */
	public static final MMCode CancelledDueToTransformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToTransformation";
			definition = "Original transaction has been cancelled and replaced due to a corporate action.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANT";
		}
	};
	/**
	 * Original transaction has been cancelled and replaced to allow a partial
	 * or split settlement.
	 */
	public static final MMCode CancelledSplitPartialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledSplitPartialSettlement";
			definition = "Original transaction has been cancelled and replaced to allow a partial or split settlement.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CANZ";
		}
	};
	/**
	 * Transaction has been cancelled due to a corporate action.
	 */
	public static final MMCode CancelledDueToCorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToCorporateAction";
			definition = "Transaction has been cancelled due to a corporate action.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Transaction has been cancelled by the issuer/registrar.
	 */
	public static final MMCode CancelledByIssuerRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelledByIssuerRegistrar";
			definition = "Transaction has been cancelled by the issuer/registrar.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CREG";
		}
	};
	/**
	 * Transaction has been cancelled; the security no longer exists or is no
	 * longer eligible on the market instructed. For corporate action related
	 * cancellation, CORP should be used.
	 */
	public static final MMCode SecuritiesNoLongerEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesNoLongerEligible";
			definition = "Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "SCEX";
		}
	};
	/**
	 * See narrative field for reason.
	 */
	public static final MMCode NarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "NARR";
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
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Instruction is cancelled by a Third party.
	 */
	public static final MMCode CancelledByThirdParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByThirdParty";
			definition = "Instruction is cancelled by a Third party.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CTHP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReasonV2Code";
				definition = "See narrative field for reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByHub,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByInstructingParty, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.EndOfLife,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByOther, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByTransferAgent,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByClient, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByIntermediary,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledDueToTransformation, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledSplitPartialSettlement,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByIssuerRegistrar,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.SecuritiesNoLongerEligible, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.NarrativeReason,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.Other, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByThirdParty);
			}
		});
		return mmObject_lazy.get();
	}
}
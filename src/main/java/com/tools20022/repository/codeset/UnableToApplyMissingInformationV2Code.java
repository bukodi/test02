package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason of an unable to apply due to missing information.
 */
public class UnableToApplyMissingInformationV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * RemittanceInformation is missing.
	 */
	public static final MMCode MissingRemittanceInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingRemittanceInformation";
			definition = "RemittanceInformation is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS01";
		}
	};
	/**
	 * Instruction for next agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 */
	public static final MMCode MissingInstructionForNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForNextAgent";
			definition = "Instruction for next agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS02";
		}
	};
	/**
	 * Debtor is missing.
	 */
	public static final MMCode MissingDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingDebtor";
			definition = "Debtor is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS03";
		}
	};
	/**
	 * DebtorAccount is missing.
	 */
	public static final MMCode MissingDebtorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAccount";
			definition = "DebtorAccount is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS04";
		}
	};
	/**
	 * DebtorAgent is missing (former MissingFirstAgent for credit transfers).
	 */
	public static final MMCode MissingDebtorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingDebtorAgent";
			definition = "DebtorAgent is missing (former MissingFirstAgent for credit transfers).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS05";
		}
	};
	/**
	 * Amount is missing.
	 */
	public static final MMCode MissingAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingAmount";
			definition = "Amount is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS06";
		}
	};
	/**
	 * SettlementAccount is missing. (former MissingNostroVostroAccount)
	 */
	public static final MMCode MissingSettlementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingSettlementAccount";
			definition = "SettlementAccount is missing. (former MissingNostroVostroAccount)";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS07";
		}
	};
	/**
	 * Intermediary is missing.
	 */
	public static final MMCode MissingIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingIntermediary";
			definition = "Intermediary is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS08";
		}
	};
	/**
	 * InstructingReimbursementAgent is missing (former
	 * MissingReimbursementAgent1).
	 */
	public static final MMCode MissingInstructingReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstructingReimbursementAgent";
			definition = "InstructingReimbursementAgent is missing (former MissingReimbursementAgent1).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS09";
		}
	};
	/**
	 * InstructedReimbursementAgent is missing (former
	 * MissingReimbursementAgent2).
	 */
	public static final MMCode MissingInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent is missing (former MissingReimbursementAgent2).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS10";
		}
	};
	/**
	 * Third reimbursement agent is missing (former MissingReimbursementAgent).
	 */
	public static final MMCode MissingThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingThirdReimbursementAgent";
			definition = "Third reimbursement agent is missing (former MissingReimbursementAgent).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS11";
		}
	};
	/**
	 * Creditor is missing.
	 */
	public static final MMCode MissingCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCreditor";
			definition = "Creditor is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS12";
		}
	};
	/**
	 * CreditorAccount is missing.
	 */
	public static final MMCode MissingCreditorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAccount";
			definition = "CreditorAccount is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS13";
		}
	};
	/**
	 * Indicates the payment instruction is missing.
	 */
	public static final MMCode MissingInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstruction";
			definition = "Indicates the payment instruction is missing.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS14";
		}
	};
	/**
	 * Creditor agent is missing (former MissingFirstAgent for direct debits).
	 */
	public static final MMCode MissingCreditorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCreditorAgent";
			definition = "Creditor agent is missing (former MissingFirstAgent for direct debits).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS15";
		}
	};
	/**
	 * Instruction for creditor agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 */
	public static final MMCode MissingInstructionForCreditorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForCreditorAgent";
			definition = "Instruction for creditor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS16";
		}
	};
	/**
	 * Instruction for debtor agent is missing (former
	 * MissingSenderToReceiverInformation split into debtor, credit and next
	 * agent information).
	 */
	public static final MMCode MissingInstructionForDebtorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInstructionForDebtorAgent";
			definition = "Instruction for debtor agent is missing (former MissingSenderToReceiverInformation split into debtor, credit and next agent information).";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "MS17";
		}
	};
	/**
	 * See narrative field for additional information.
	 */
	public static final MMCode Narrative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "See narrative field for additional information.";
			owner_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
			codeName = "NARR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MS01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyMissingInformationV2Code";
				definition = "Specifies the reason of an unable to apply due to missing information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForNextAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtor,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtorAccount, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingAmount, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingSettlementAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingIntermediary, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructedReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingThirdReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditor, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstruction, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingCreditorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.MissingInstructionForDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code.Narrative);
			}
		});
		return mmObject_lazy.get();
	}
}
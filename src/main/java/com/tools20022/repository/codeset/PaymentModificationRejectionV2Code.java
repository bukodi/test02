package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the reject of a modification request.
 */
public class PaymentModificationRejectionV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related transaction reference cannot be modified.
	 */
	public static final MMCode UnableToModifyRelatedReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRelatedReference";
			definition = "Related transaction reference cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM01";
		}
	};
	/**
	 * Service level element of payment type cannot be modified(former
	 * UnableToModifyBankOperationCode).
	 */
	public static final MMCode UnableToModifyPaymentServiceLevel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentServiceLevel";
			definition = "Service level element of payment type cannot be modified(former UnableToModifyBankOperationCode).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM02";
		}
	};
	/**
	 * Category purpose element of payment type cannot be modified (former
	 * UnableToModifyInstructionCode).
	 */
	public static final MMCode UnableToModifyCategoryPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCategoryPurpose";
			definition = "Category purpose element of payment type cannot be modified (former UnableToModifyInstructionCode).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM03";
		}
	};
	/**
	 * RequestedExecutionDate cannot be modified.
	 */
	public static final MMCode UnableToModifyRequestedExecutionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedExecutionDate";
			definition = "RequestedExecutionDate cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM04";
		}
	};
	/**
	 * InterbankSettlementDate cannot be modified (former
	 * UnableToModifyValueDate).
	 */
	public static final MMCode UnableToModifyInterbankSettlementDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementDate";
			definition = "InterbankSettlementDate cannot be modified (former UnableToModifyValueDate).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM05";
		}
	};
	/**
	 * SettlementAccount cannot be modified (former
	 * UnableToModifyInterbankSettlementAccount).
	 */
	public static final MMCode UnableToModifyInterbankSettlementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAccount";
			definition = "SettlementAccount cannot be modified (former UnableToModifyInterbankSettlementAccount).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM06";
		}
	};
	/**
	 * Debtor cannot be modified.
	 */
	public static final MMCode UnableToModifyDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtor";
			definition = "Debtor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM07";
		}
	};
	/**
	 * DebtorAccount cannot be modified.
	 */
	public static final MMCode UnableToModifyDebtorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAccount";
			definition = "DebtorAccount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM08";
		}
	};
	/**
	 * InstructedReimbursementAgent cannot be modified (former
	 * UnableToModifyReceiverCorrespondent).
	 */
	public static final MMCode UnableToModifyInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedReimbursementAgent";
			definition = "InstructedReimbursementAgent cannot be modified (former UnableToModifyReceiverCorrespondent).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM09";
		}
	};
	/**
	 * ThirdReimbursementAgent cannot be modified (former
	 * UnableToModifyThirdReimbursementInstitution).
	 */
	public static final MMCode UnableToModifyThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyThirdReimbursementAgent";
			definition = "ThirdReimbursementAgent cannot be modified (former UnableToModifyThirdReimbursementInstitution).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM10";
		}
	};
	/**
	 * Clearing Channel element of payment type cannot be modified (former
	 * UnableToModifyPaymentScheme)
	 */
	public static final MMCode UnableToModifyPaymentClearingChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentClearingChannel";
			definition = "Clearing Channel element of payment type cannot be modified (former UnableToModifyPaymentScheme)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM11";
		}
	};
	/**
	 * Creditor agent account cannot be modified (former
	 * UnableToModifyAccountOfBeneficiaryInstitution)
	 */
	public static final MMCode UnableToModifyCreditorAgentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAgentAccount";
			definition = "Creditor agent account cannot be modified (former UnableToModifyAccountOfBeneficiaryInstitution)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM12";
		}
	};
	/**
	 * Creditor cannot be modified.
	 */
	public static final MMCode UnableToModifyCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditor";
			definition = "Creditor cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM13";
		}
	};
	/**
	 * Creditor account cannot be modified.
	 */
	public static final MMCode UnableToModifyCreditorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyCreditorAccount";
			definition = "Creditor account cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM14";
		}
	};
	/**
	 * Remittance information cannot be modified.
	 */
	public static final MMCode UnableToModifyRemittanceInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRemittanceInformation";
			definition = "Remittance information cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM15";
		}
	};
	/**
	 * PaymentPurpose cannot be modified.
	 */
	public static final MMCode UnableToModifyPaymentPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentPurpose";
			definition = "PaymentPurpose cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM16";
		}
	};
	/**
	 * Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).
	 */
	public static final MMCode UnableToModifyChargeBearer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyChargeBearer";
			definition = "Charge bearer cannot be modified (former UnableToModifyDetailsOfCharges).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM17";
		}
	};
	/**
	 * Instruction for next agent cannot be modified (former
	 * UnableToModifySenderToReceiver).
	 */
	public static final MMCode UnableToModifyInstructionForNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForNextAgent";
			definition = "Instruction for next agent cannot be modified (former UnableToModifySenderToReceiver).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM18";
		}
	};
	/**
	 * Instruction for creditor agent cannot be modified. (former
	 * UnableToModifyInstructionForFinalAgent).
	 */
	public static final MMCode UnableToModifyInstructionForCreditorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForCreditorAgent";
			definition = "Instruction for creditor agent cannot be modified. (former UnableToModifyInstructionForFinalAgent).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM19";
		}
	};
	/**
	 * Used to inform of cancellation and request a new payment instruction.
	 * This should only be used if an agent does not want to modify a pending
	 * payment.
	 */
	public static final MMCode InstructionCancelledSubmitNewInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancelledSubmitNewInstruction";
			definition = "Used to inform of cancellation and request a new payment instruction. This should only be used if an agent does not want to modify a pending payment.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM20";
		}
	};
	/**
	 * Modification is not possible and the cancellation is requested.
	 */
	public static final MMCode UnableToModifySubmitCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifySubmitCancellation";
			definition = "Modification is not possible and the cancellation is requested.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM21";
		}
	};
	/**
	 * Debtor agent account cannot be modified (applicable for direct debits).
	 */
	public static final MMCode UnableToModifyDebtorAgentAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyDebtorAgentAccount";
			definition = "Debtor agent account cannot be modified (applicable for direct debits).";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM22";
		}
	};
	/**
	 * Interbank settlement amount cannot be modified.
	 */
	public static final MMCode UnableToModifyInterbankSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInterbankSettlementAmount";
			definition = "Interbank settlement amount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM23";
		}
	};
	/**
	 * Instruction for debtor agent cannot be modified (applicable for direct
	 * debits)
	 */
	public static final MMCode UnableToModifyInstructionForDebtorAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructionForDebtorAgent";
			definition = "Instruction for debtor agent cannot be modified (applicable for direct debits)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM24";
		}
	};
	/**
	 * Requested collection date cannot be modified (applicable for direct
	 * debits)
	 */
	public static final MMCode UnableToModifyRequestedCollectionDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyRequestedCollectionDate";
			definition = "Requested collection date cannot be modified (applicable for direct debits)";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM25";
		}
	};
	/**
	 * Payment type cannot be modified.
	 */
	public static final MMCode UnableToModifyPaymentType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyPaymentType";
			definition = "Payment type cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM26";
		}
	};
	/**
	 * Instructed or equivalent amount cannot be modified.
	 */
	public static final MMCode UnableToModifyInstructedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToModifyInstructedAmount";
			definition = "Instructed or equivalent amount cannot be modified.";
			owner_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
			codeName = "UM27";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UM01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentModificationRejectionV2Code";
				definition = "Specifies the reason for the reject of a modification request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRelatedReference,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentServiceLevel, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCategoryPurpose,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRequestedExecutionDate, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementDate,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtor,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtorAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructedReimbursementAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyThirdReimbursementAgent, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentClearingChannel,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditorAgentAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditor,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyCreditorAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRemittanceInformation,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentPurpose, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyChargeBearer,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForNextAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForCreditorAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.InstructionCancelledSubmitNewInstruction, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifySubmitCancellation,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyDebtorAgentAccount, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInterbankSettlementAmount,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructionForDebtorAgent,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyRequestedCollectionDate, com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyPaymentType,
						com.tools20022.repository.codeset.PaymentModificationRejectionV2Code.UnableToModifyInstructedAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
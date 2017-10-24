package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the result of an investigation.
 */
public class InvestigationExecutionConfirmationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Used when a requested cancellation is successful.
	 */
	public static final MMCode CancelledAsPerRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledAsPerRequest";
			definition = "Used when a requested cancellation is successful.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Used when a requested modification is successful.
	 */
	public static final MMCode ModifiedAsPerRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAsPerRequest";
			definition = "Used when a requested modification is successful.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Used when a creditor accepts the debit authorisation.
	 */
	public static final MMCode AcceptedDebitAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedDebitAuthorisation";
			definition = "Used when a creditor accepts the debit authorisation.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "ACDA";
		}
	};
	/**
	 * Used when the result of an investigation is, or will be, the initiation
	 * of a payment instruction.
	 */
	public static final MMCode PaymentInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInitiated";
			definition = "Used when the result of an investigation is, or will be, the initiation of a payment instruction.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IPAY";
		}
	};
	/**
	 * Used when a transfer of funds has been initiated (a cover payment) to
	 * resolve a case.
	 */
	public static final MMCode CoverInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverInitiated";
			definition = "Used when a transfer of funds has been initiated (a cover payment) to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "ICOV";
		}
	};
	/**
	 * Used when a transfer of funds has been modified (a cover payment) to
	 * resolve a case.
	 */
	public static final MMCode CoverModified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverModified";
			definition = "Used when a transfer of funds has been modified (a cover payment) to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MCOV";
		}
	};
	/**
	 * Used when a payment instruction (eg. MT103) has been initiated to resolve
	 * a case.
	 */
	public static final MMCode PaymentInstructionInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionInitiated";
			definition = "Used when a payment instruction (eg. MT103) has been initiated to resolve a case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IPYI";
		}
	};
	/**
	 * Used when additional information has been sent to the beneficiary of a
	 * payment.
	 */
	public static final MMCode AdditionalInformationSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationSent";
			definition = "Used when additional information has been sent to the beneficiary of a payment.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Used when a payment has been checked and was correctly executed without
	 * any intervention.
	 */
	public static final MMCode ConfirmationOfPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationOfPayment";
			definition = "Used when a payment has been checked and was correctly executed without any intervention.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Used when a payment will be cancelled to solve an investigation case.
	 */
	public static final MMCode CancellationWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationWillFollow";
			definition = "Used when a payment will be cancelled to solve an investigation case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CWFW";
		}
	};
	/**
	 * Used when the payment will be modified to solve an investigation case.
	 */
	public static final MMCode ModificationWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationWillFollow";
			definition = "Used when the payment will be modified to solve an investigation case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "MWFW";
		}
	};
	/**
	 * Used when sender wants to respond to an assignment with an Unable To
	 * Apply workflow.
	 */
	public static final MMCode UnableToApplyWillFollow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToApplyWillFollow";
			definition = "Used when sender wants to respond to an assignment with an Unable To Apply workflow.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "UWFW";
		}
	};
	/**
	 * Used when a requested cancellation has been partially executed.
	 */
	public static final MMCode PartiallyExecutedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedCancellationRequest";
			definition = "Used when a requested cancellation has been partially executed.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PECR";
		}
	};
	/**
	 * Used when a requested cancellation has been rejected.
	 */
	public static final MMCode RejectedCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedCancellationRequest";
			definition = "Used when a requested cancellation has been rejected.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "RJCR";
		}
	};
	/**
	 * Used when a requested cancellation is pending.
	 */
	public static final MMCode PendingCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationRequest";
			definition = "Used when a requested cancellation is pending.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PDCR";
		}
	};
	/**
	 * Used when the entry in the statement is correct.
	 */
	public static final MMCode StatementEntryCorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryCorrect";
			definition = "Used when the entry in the statement is correct.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "SMTC";
		}
	};
	/**
	 * Used when the entry in the statement is incorrect and further information
	 * is provided with the resolution.
	 */
	public static final MMCode StatementEntryIncorrect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementEntryIncorrect";
			definition = "Used when the entry in the statement is incorrect and further information is provided with the resolution.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "SMTI";
		}
	};
	/**
	 * Further charges details are provided to resolve the case.
	 */
	public static final MMCode ChargesDetailsProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesDetailsProvided";
			definition = "Further charges details are provided to resolve the case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "CHRG";
		}
	};
	/**
	 * Further purpose details are provided to resolve the case.
	 */
	public static final MMCode PurposeDetailsProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeDetailsProvided";
			definition = "Further purpose details are provided to resolve the case.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "PURP";
		}
	};
	/**
	 * Used when the requested check for a possible duplicate instruction is
	 * confirmed.
	 */
	public static final MMCode InstructionIsDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIsDuplicate";
			definition = "Used when the requested check for a possible duplicate instruction is confirmed.";
			owner_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
			codeName = "IDUP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CNCL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationExecutionConfirmationCode";
				definition = "Indicates the result of an investigation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CancelledAsPerRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ModifiedAsPerRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.AcceptedDebitAuthorisation, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PaymentInitiated,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CoverInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CoverModified,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PaymentInstructionInitiated, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.AdditionalInformationSent,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ConfirmationOfPayment, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.CancellationWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ModificationWillFollow, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.UnableToApplyWillFollow,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PartiallyExecutedCancellationRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.RejectedCancellationRequest,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PendingCancellationRequest, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.StatementEntryCorrect,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.StatementEntryIncorrect, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.ChargesDetailsProvided,
						com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.PurposeDetailsProvided, com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode.InstructionIsDuplicate);
			}
		});
		return mmObject_lazy.get();
	}
}
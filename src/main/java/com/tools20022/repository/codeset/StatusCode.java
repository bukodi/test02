package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an instruction.
 */
public class StatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Processing of the instruction is pending.
	 */
	public static final MMCode PendingProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction is pending.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "PPRC";
		}
	};
	/**
	 * Instruction has been acknowledged and accepted and is validated for
	 * further processing.
	 */
	public static final MMCode AcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged and accepted and is validated for further processing.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "PAAC";
		}
	};
	/**
	 * Instruction has been rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Instruction has been accepted and is validated for further processing
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Instruction has been accepted and is validated for further processing";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Processing has been completed.
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Completed";
			definition = "Processing has been completed.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * No instruction has been received (to be used in a reminder).
	 */
	public static final MMCode NotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotReceived";
			definition = "No instruction has been received (to be used in a reminder).";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Instruction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancel request is being processed.
	 */
	public static final MMCode BeingCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeingCancelled";
			definition = "Cancel request is being processed.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Instruction has been received by Issuer.
	 */
	public static final MMCode ReceivedByIssuerOrRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivedByIssuerOrRegistrar";
			definition = "Instruction has been received by Issuer.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "RCIS";
		}
	};
	/**
	 * Instruction is pending.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Instruction is pending.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Standing instruction is applied.
	 */
	public static final MMCode StandingInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction is applied.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Instruction is queued.
	 */
	public static final MMCode Queued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Queued";
			definition = "Instruction is queued.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "QUED";
		}
	};
	/**
	 * Instruction has been cancelled by the agent, for example, due to an event
	 * deadline extension.
	 */
	public static final MMCode CancelledBySubcustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySubcustodian";
			definition = "Instruction has been cancelled by the agent, for example, due to an event deadline extension.";
			owner_lazy = () -> StatusCode.mmObject();
			codeName = "CSUB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PPRC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusCode";
				definition = "Specifies the status of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusCode.PendingProcessing, com.tools20022.repository.codeset.StatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.StatusCode.Rejected,
						com.tools20022.repository.codeset.StatusCode.Accepted, com.tools20022.repository.codeset.StatusCode.Completed, com.tools20022.repository.codeset.StatusCode.NotReceived,
						com.tools20022.repository.codeset.StatusCode.Cancelled, com.tools20022.repository.codeset.StatusCode.BeingCancelled, com.tools20022.repository.codeset.StatusCode.ReceivedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.StatusCode.Pending, com.tools20022.repository.codeset.StatusCode.StandingInstruction, com.tools20022.repository.codeset.StatusCode.Queued,
						com.tools20022.repository.codeset.StatusCode.CancelledBySubcustodian);
			}
		});
		return mmObject_lazy.get();
	}
}
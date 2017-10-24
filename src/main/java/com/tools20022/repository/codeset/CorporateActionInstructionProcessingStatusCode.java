package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a corporate action instruction.
 */
public class CorporateActionInstructionProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Default action is taken.
	 */
	public static final MMCode DefaultAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "DFLA";
		}
	};
	/**
	 * Instruction has been acknowledged/accepted for further processing. In
	 * other words, this means that the instruction has been received, is
	 * processable and has been validated for further processing.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Instruction has been acknowledged/accepted for further processing. In other words, this means that the instruction has been received, is processable and has been validated for further processing.";
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Instruction's processing is pending.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Instruction's processing is pending.";
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Instruction has been rejected for further processing due to system
	 * reasons.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing due to system reasons.";
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "REJT";
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
			owner_lazy = () -> CorporateActionInstructionProcessingStatusCode.mmObject();
			codeName = "STIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionProcessingStatusCode";
				definition = "Specifies the status of a corporate action instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Cancelled, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.DefaultAction,
						com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Accepted, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.Rejected, com.tools20022.repository.codeset.CorporateActionInstructionProcessingStatusCode.StandingInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}
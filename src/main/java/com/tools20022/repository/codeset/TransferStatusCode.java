package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transfer or settlement instruction status.
 */
public class TransferStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer or settlement instruction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transfer or settlement instruction has been cancelled.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Transfer or settlement instruction has been sent to the next party, ie,
	 * the next intermediary.
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SentToNextParty";
			definition = "Transfer or settlement instruction has been sent to the next party, ie, the next intermediary.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Transfer or settlement instruction has been acknowledged / accepted for
	 * further processing.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Transfer or settlement instruction has been acknowledged / accepted for further processing.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Transfer or settlement instruction has been executed, confirmed and then
	 * the confirmation has been reversed.
	 */
	public static final MMCode Reversed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversed";
			definition = "Transfer or settlement instruction has been executed, confirmed and then the confirmation has been reversed.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "RVSD";
		}
	};
	/**
	 * Transfer or settlement instruction is matched.
	 */
	public static final MMCode Matched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Matched";
			definition = "Transfer or settlement instruction is matched.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "MACH";
		}
	};
	/**
	 * Transfer or settlement instruction is fully executed and the confirmation
	 * is sent.
	 */
	public static final MMCode AlreadyExecuted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlreadyExecuted";
			definition = "Transfer or settlement instruction is fully executed and the confirmation is sent.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Transfer or settlement instruction is in repair.
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InRepair";
			definition = "Transfer or settlement instruction is in repair.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	/**
	 * Transfer or settlement instruction is unmatched.
	 */
	public static final MMCode Unmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unmatched";
			definition = "Transfer or settlement instruction is unmatched.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Transfer or settlement instruction has been rejected for further
	 * processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Transfer or settlement  instruction  has been rejected for further processing.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Transfer cancellation instruction or settlement cancellation instruction
	 * is pending.
	 */
	public static final MMCode CancellationPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationPending";
			definition = "Transfer cancellation instruction or settlement cancellation instruction is pending.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transfer or settlement instruction is settled.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Transfer or settlement instruction is settled.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Instruction has been received, that is, technical validation of the
	 * message is ok, and the message is now at the receiving side.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Instruction has been received, that is, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Portfolio transfer is complete.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Portfolio transfer is complete.";
			owner_lazy = () -> TransferStatusCode.mmObject();
			codeName = "COMP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransferStatusCode";
				definition = "Specifies the transfer or settlement instruction status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferStatusCode.Cancelled, com.tools20022.repository.codeset.TransferStatusCode.SentToNextParty,
						com.tools20022.repository.codeset.TransferStatusCode.Accepted, com.tools20022.repository.codeset.TransferStatusCode.Reversed, com.tools20022.repository.codeset.TransferStatusCode.Matched,
						com.tools20022.repository.codeset.TransferStatusCode.AlreadyExecuted, com.tools20022.repository.codeset.TransferStatusCode.InRepair, com.tools20022.repository.codeset.TransferStatusCode.Unmatched,
						com.tools20022.repository.codeset.TransferStatusCode.Rejected, com.tools20022.repository.codeset.TransferStatusCode.CancellationPending, com.tools20022.repository.codeset.TransferStatusCode.Settled,
						com.tools20022.repository.codeset.TransferStatusCode.Received, com.tools20022.repository.codeset.TransferStatusCode.Complete);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an instruction.
 */
public class InstructionProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pending cancellation; only one side has been input and a cancellation
	 * request has been sent.
	 */
	public static final MMCode Cancellation1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation1";
			definition = "Pending cancellation; only one side has been input and a cancellation request has been sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN1";
		}
	};
	/**
	 * Pending cancellation; both sides have been input, the trade has not yet
	 * been matched, and one side has sent a cancellation request.
	 */
	public static final MMCode Cancellation2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2";
			definition = "Pending cancellation; both sides have been input, the trade has not yet been matched, and one side has sent a cancellation request.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN2";
		}
	};
	/**
	 * Pending cancellation; both sides have been input, the trade is matched,
	 * and one side has sent a cancellation request.
	 */
	public static final MMCode Cancellation3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3";
			definition = "Pending cancellation; both sides have been input, the trade is matched, and one side has sent a cancellation request.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAN3";
		}
	};
	/**
	 * Instruction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Instruction has been cancelled by another party than the instructing
	 * party, for example, market infrastructure such as a stock exchange.
	 */
	public static final MMCode CancelledByAnotherParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			definition = "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Cancellation request from yourself for this instruction is pending
	 * waiting for further processing.
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request from yourself for this instruction is pending waiting for further processing.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Account servicer or third party created the transaction. It was not
	 * instructed directly by the account owner.
	 */
	public static final MMCode Generated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Account servicer or third party created the transaction. It was not instructed directly by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CGEN";
		}
	};
	/**
	 * Order is fully executed and the confirmation was sent.
	 */
	public static final MMCode FullyExecutedConfirmationSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedConfirmationSent";
			definition = "Order is fully executed and the confirmation was sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "COSE";
		}
	};
	/**
	 * Cancellation request from the counterparty is awaiting for your
	 * cancellation request or your concent.
	 */
	public static final MMCode CancellationRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from the counterparty is awaiting for your cancellation request or your concent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "CPRC";
		}
	};
	/**
	 * Default action is taken.
	 */
	public static final MMCode DefaultAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DFLA";
		}
	};
	/**
	 * Order is partially filled and no further executions forthcoming for the
	 * trading day.
	 */
	public static final MMCode Done = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Done";
			definition = "Order is partially filled and no further executions forthcoming for the trading day.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DONE";
		}
	};
	/**
	 * Order is partially filled and no further executions will take place.
	 */
	public static final MMCode PartiallyFilledOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilledOrder";
			definition = "Order is partially filled and no further executions will take place.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "DONF";
		}
	};
	/**
	 * Order has been received at the stock exchange.
	 */
	public static final MMCode ReceivedAtStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Order has been received at the stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Order was fully executed and the execution sent.
	 */
	public static final MMCode FullyExecutedExecutionSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedExecutionSent";
			definition = "Order was fully executed and the execution sent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "EXSE";
		}
	};
	/**
	 * Message has been sent automatically by the service provider to notify
	 * that settlement will not take place.
	 */
	public static final MMCode ForcedRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedRejection";
			definition = "Message has been sent automatically by the service provider to notify that settlement will not take place.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * All checks relative to the instruction (except collateral) are
	 * successful.
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "All checks relative to the instruction (except collateral) are successful.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Order has been received at the intermediary.
	 */
	public static final MMCode ReceivedAtIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Order has been received at the intermediary.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * No/incomplete instruction was received for the corporate action event. No
	 * further processing has been carried out.
	 */
	public static final MMCode NoInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstruction";
			definition = "No/incomplete instruction was received for the corporate action event. No further processing has been carried out.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "NOIN";
		}
	};
	/**
	 * Instruction cannot be cancelled as it has already been matched and
	 * affirmed.
	 */
	public static final MMCode AlreadyMatchedAndAffirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyMatchedAndAffirmed";
			definition = "Instruction cannot be cancelled as it has already been matched and affirmed.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "NOTC";
		}
	};
	/**
	 * Order is open.
	 */
	public static final MMCode OpenOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOrder";
			definition = "Order is open.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "OPOD";
		}
	};
	/**
	 * Quantity of financial instrument of the block trade has been
	 * overallocated.
	 */
	public static final MMCode OverAllocated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllocated";
			definition = "Quantity of financial instrument of the block trade has been overallocated.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Instruction has been acknowledged/accepted for further processing by the
	 * account servicer.
	 */
	public static final MMCode AcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged/accepted for further processing by the account servicer.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order has been partially filled and the remaining quantity is warehoused.
	 */
	public static final MMCode PartialFill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFill";
			definition = "Order has been partially filled and the remaining quantity is warehoused.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PAFI";
		}
	};
	/**
	 * Order has been partially cancelled as requested.
	 */
	public static final MMCode PartialCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			definition = "Order has been partially cancelled as requested.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Processing of the instruction is pending.
	 */
	public static final MMCode PendingProcessing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction is pending.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "PPRC";
		}
	};
	/**
	 * Instruction has been rejected for further processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction has been rejected for further processing.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Instruction is accepted but in repair.
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Instruction is accepted but in repair.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};
	/**
	 * Settlement instruction has been sent to your custodian.
	 */
	public static final MMCode SettlementInstructionSent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionSent";
			definition = "Settlement instruction has been sent to your custodian.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "SESE";
		}
	};
	/**
	 * Standing instruction has been applied.
	 */
	public static final MMCode StandingInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Trading is suspended by the stock exchange.
	 */
	public static final MMCode TradingSuspendedByStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedByStockExchange";
			definition = "Trading is suspended by the stock exchange.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Transaction has been treated (triparty collateral status).
	 */
	public static final MMCode Treated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treated";
			definition = "Transaction has been treated (triparty collateral status).";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Quantity of financial instrument of the block trade has been under
	 * allocated.
	 */
	public static final MMCode UnderAllocated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderAllocated";
			definition = "Quantity of financial instrument of the block trade has been under allocated.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "UNDE";
		}
	};
	/**
	 * Modification request from the counterparty is awaiting for your
	 * modification request or your concent.
	 */
	public static final MMCode ModificationRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from the counterparty is awaiting for your modification request or your concent.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "MPRC";
		}
	};
	/**
	 * Transaction terms communicated have been acknowledged/accepted for
	 * further processing by the account owner.
	 */
	public static final MMCode AcknowledgedAcceptedByAccountOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedByAccountOwner";
			definition = "Transaction terms communicated have been acknowledged/accepted for further processing by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "ACAO";
		}
	};
	/**
	 * Transaction terms communicated have been rejected for further processing
	 * by the account owner.
	 */
	public static final MMCode RejectedByAccountOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByAccountOwner";
			definition = "Transaction terms communicated have been rejected for further processing by the account owner.";
			owner_lazy = () -> InstructionProcessingStatusCode.mmObject();
			codeName = "RJAO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAN1");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatusCode";
				definition = "Specifies the status of an instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation1, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation2,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancellation3, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Cancelled,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.CancelledByAnotherParty, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Generated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.FullyExecutedConfirmationSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.CancellationRequested, com.tools20022.repository.codeset.InstructionProcessingStatusCode.DefaultAction,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Done, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartiallyFilledOrder,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ReceivedAtStockExchange, com.tools20022.repository.codeset.InstructionProcessingStatusCode.FullyExecutedExecutionSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ForcedRejection, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Future,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.InstructionProcessingStatusCode.NoInstruction,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.AlreadyMatchedAndAffirmed, com.tools20022.repository.codeset.InstructionProcessingStatusCode.OpenOrder,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.OverAllocated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.AcknowledgedAccepted,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartialFill, com.tools20022.repository.codeset.InstructionProcessingStatusCode.PartialCancel,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.PendingProcessing, com.tools20022.repository.codeset.InstructionProcessingStatusCode.Rejected,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.InRepair, com.tools20022.repository.codeset.InstructionProcessingStatusCode.SettlementInstructionSent,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.StandingInstruction, com.tools20022.repository.codeset.InstructionProcessingStatusCode.TradingSuspendedByStockExchange,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.Treated, com.tools20022.repository.codeset.InstructionProcessingStatusCode.UnderAllocated,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.ModificationRequested, com.tools20022.repository.codeset.InstructionProcessingStatusCode.AcknowledgedAcceptedByAccountOwner,
						com.tools20022.repository.codeset.InstructionProcessingStatusCode.RejectedByAccountOwner);
			}
		});
		return mmObject_lazy.get();
	}
}
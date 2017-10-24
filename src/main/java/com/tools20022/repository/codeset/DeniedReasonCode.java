package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the denied reason.
 */
public class DeniedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Repo call request was denied since another call already applies.
	 */
	public static final MMCode CallDeniedSinceAlreadyApplied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			definition = "Repo call request was denied since another call already applies.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DCAL";
		}
	};
	/**
	 * Cancellation request was denied since the instruction has already been
	 * cancelled.
	 */
	public static final MMCode DeniedSinceAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadyCancelled";
			definition = "Cancellation request was denied since the instruction has already been cancelled.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Repo call request was denied. Call not allowed on the concerned repo, for
	 * example, out of delay.
	 */
	public static final MMCode DeniedSinceNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			definition = "Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DFOR";
		}
	};
	/**
	 * Cancellation request was denied because the process of settlement is in
	 * progress.
	 */
	public static final MMCode DeniedSinceInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			definition = "Cancellation request was denied because the process of settlement is in progress.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Cancellation request was denied because the repo was cancelled.
	 */
	public static final MMCode DeniedSinceRepoEnded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			definition = "Cancellation request was denied because the repo was cancelled.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DREP";
		}
	};
	/**
	 * Cancellation request was denied because the instruction was already
	 * settled.
	 */
	public static final MMCode DeniedSinceAlreadySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadySettled";
			definition = "Cancellation request was denied because the instruction was already settled.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Instruction has been processed and cannot be cancelled.
	 */
	public static final MMCode InstructionProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			definition = "Instruction has been processed and cannot be cancelled.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "IPNC";
		}
	};
	/**
	 * Received after market deadline.
	 */
	public static final MMCode MarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "LATE";
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
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Execution is denied due to a process linked to the currency of the
	 * transaction.
	 */
	public static final MMCode ConditionalCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is denied due to a process linked to the currency of the transaction.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is denied due to the execution of a process of realignment at
	 * the issuer CSD.
	 */
	public static final MMCode ConditionalRealignement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is denied due to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * Execution is denied due to the execution of a process at the registrar.
	 */
	public static final MMCode ConditionalRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is denied due to the execution of a process at the registrar.";
			owner_lazy = () -> DeniedReasonCode.mmObject();
			codeName = "CDRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeniedReasonCode";
				definition = "Specifies the denied reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeniedReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.DeniedReasonCode.CallDeniedSinceAlreadyApplied,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceAlreadyCancelled, com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceNotAllowed,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceInProgress, com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceRepoEnded,
						com.tools20022.repository.codeset.DeniedReasonCode.DeniedSinceAlreadySettled, com.tools20022.repository.codeset.DeniedReasonCode.InstructionProcessed,
						com.tools20022.repository.codeset.DeniedReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.DeniedReasonCode.Other, com.tools20022.repository.codeset.DeniedReasonCode.ConditionalCurrency,
						com.tools20022.repository.codeset.DeniedReasonCode.ConditionalRealignement, com.tools20022.repository.codeset.DeniedReasonCode.ConditionalRegistrar);
			}
		});
		return mmObject_lazy.get();
	}
}
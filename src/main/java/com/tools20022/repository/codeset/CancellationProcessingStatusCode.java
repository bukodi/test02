package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a cancellation request.
 */
public class CancellationProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation has been completed.
	 */
	public static final MMCode CancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Cancellation has been completed.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation is pending. It is not known at this time whether
	 * cancellation can be affected.
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation is pending. It is not known at this time whether cancellation can be affected.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation will not be executed.
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Cancellation will not be executed.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Cancellation has been received at the stock exchange.
	 */
	public static final MMCode ReceivedAtStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Cancellation has been received at the stock exchange.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Cancellation has been received at the intermediary.
	 */
	public static final MMCode ReceivedAtIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Cancellation has been received at the intermediary.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Cancellation request has been acknowledged for further processing by the
	 * account servicer.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Cancellation request has been acknowledged for further processing by the account servicer.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order is partially filled, cancellation processing accepted for the
	 * remainder.
	 */
	public static final MMCode PartiallyFilled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilled";
			definition = "Order is partially filled, cancellation processing accepted for the remainder.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "PARF";
		}
	};
	/**
	 * Cancellation has been rejected for further processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Cancellation has been rejected for further processing.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Cancellation request is in repair.
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Cancellation request is in repair.";
			owner_lazy = () -> CancellationProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationProcessingStatusCode";
				definition = "Specifies the status of a cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationProcessingStatusCode.CancellationCompleted, com.tools20022.repository.codeset.CancellationProcessingStatusCode.PendingCancellation,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.Denied, com.tools20022.repository.codeset.CancellationProcessingStatusCode.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.CancellationProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.PartiallyFilled, com.tools20022.repository.codeset.CancellationProcessingStatusCode.Rejected,
						com.tools20022.repository.codeset.CancellationProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}
}
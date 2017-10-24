package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the processing status of the replacement request.
 */
public class ReplacementProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Replacement request cannot be executed.
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Replacement request cannot be executed.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Replacement request previously received from you has been received at the
	 * stock exchange.
	 */
	public static final MMCode ReceivedAtStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			definition = "Replacement request previously received from you has been received at the stock exchange.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Replacement request previously received from you has been received at
	 * intermediary (if not stock exchange).
	 */
	public static final MMCode ReceivedAtIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			definition = "Replacement request previously received from you has been received at intermediary (if not stock exchange).";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Replacement request has been accepted for further processing by the
	 * account servicer (technical receipt).
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Replacement request has been accepted for further processing by the account servicer (technical receipt).";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Order is partially filled, replacement processing accepted for the
	 * remaining.
	 */
	public static final MMCode PartialReplacementAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReplacementAccepted";
			definition = "Order is partially filled, replacement processing accepted for the remaining.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Replacement request is pending.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Replacement request is pending.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Replacement request has been rejected for further processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Replacement request has been rejected for further processing.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Replacement request has been completed.
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Replacement request has been completed.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Replacement request previously received from you is in repair.
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Replacement request previously received from you is in repair.";
			owner_lazy = () -> ReplacementProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DEND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReplacementProcessingStatusCode";
				definition = "Specifies the processing status of the replacement request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Denied, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.ReceivedAtStockExchange,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.ReceivedAtIntermediary, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.PartialReplacementAccepted, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Rejected, com.tools20022.repository.codeset.ReplacementProcessingStatusCode.Completed,
						com.tools20022.repository.codeset.ReplacementProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}
}
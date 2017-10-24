package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current status of the order cancellation request.
 */
public class OrderCancellationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order cancellation request has been sent to the next party, eg, the next
	 * intermediary.
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "Order cancellation request has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> OrderCancellationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Order cancellation request is pending, The order cancellation request has
	 * been received but this does not indicate the order has been cancelled.
	 */
	public static final MMCode CancellationPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationPending";
			definition = "Order cancellation request is pending, The order cancellation request has been received but this does not indicate the order has been cancelled.";
			owner_lazy = () -> OrderCancellationStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Status of the order cancellation request is completed. The cancellation
	 * request has been accepted and processed; the order has been cancelled.
	 */
	public static final MMCode CancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Status of the order cancellation request is completed. The cancellation request has been accepted and processed; the order has been cancelled.";
			owner_lazy = () -> OrderCancellationStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Status of the order cancellation request is received, that is, technical
	 * validation of the message is ok, and the message is now at the receiving
	 * side.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Status of the order cancellation request is received, that is, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> OrderCancellationStatusCode.mmObject();
			codeName = "RECE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STNP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatusCode";
				definition = "Specifies the current status of the order cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderCancellationStatusCode.SentToNextParty, com.tools20022.repository.codeset.OrderCancellationStatusCode.CancellationPending,
						com.tools20022.repository.codeset.OrderCancellationStatusCode.CancellationCompleted, com.tools20022.repository.codeset.OrderCancellationStatusCode.Received);
			}
		});
		return mmObject_lazy.get();
	}
}
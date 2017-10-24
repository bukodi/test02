package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the state of a payment instruction at a specified time.
 */
public class CashPaymentStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The payment is awaiting settlement.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "The payment is awaiting settlement.";
			owner_lazy = () -> CashPaymentStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * The payment has been settled or stopped.
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "The payment has been settled or stopped.";
			owner_lazy = () -> CashPaymentStatusCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * The payment is cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "The payment is cancelled.";
			owner_lazy = () -> CashPaymentStatusCode.mmObject();
			codeName = "CANC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PDNG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashPaymentStatusCode";
				definition = "Specifies the state of a payment instruction at a specified time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashPaymentStatusCode.Pending, com.tools20022.repository.codeset.CashPaymentStatusCode.Final,
						com.tools20022.repository.codeset.CashPaymentStatusCode.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}
}
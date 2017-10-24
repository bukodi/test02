package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the clearing channel for the routing of the transaction, as part of
 * the payment type identification.
 */
public class ClearingChannelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Clearing channel is a real-time gross settlement system.
	 */
	public static final MMCode RealTimeGrossSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealTimeGrossSettlementSystem";
			definition = "Clearing channel is a real-time gross settlement system.";
			owner_lazy = () -> ClearingChannelCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Clearing channel is a real-time net settlement system.
	 */
	public static final MMCode RealTimeNetSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealTimeNetSettlementSystem";
			definition = "Clearing channel is a real-time net settlement system.";
			owner_lazy = () -> ClearingChannelCode.mmObject();
			codeName = "RTNS";
		}
	};
	/**
	 * Clearing channel is a mass payment net settlement system.
	 */
	public static final MMCode MassPaymentNetSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MassPaymentNetSystem";
			definition = "Clearing channel is a mass payment net settlement system.";
			owner_lazy = () -> ClearingChannelCode.mmObject();
			codeName = "MPNS";
		}
	};
	/**
	 * Payment through internal book transfer.
	 */
	public static final MMCode BookTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookTransfer";
			definition = "Payment through internal book transfer.";
			owner_lazy = () -> ClearingChannelCode.mmObject();
			codeName = "BOOK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RTGS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingChannelCode";
				definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingChannelCode.RealTimeGrossSettlementSystem, com.tools20022.repository.codeset.ClearingChannelCode.RealTimeNetSettlementSystem,
						com.tools20022.repository.codeset.ClearingChannelCode.MassPaymentNetSystem, com.tools20022.repository.codeset.ClearingChannelCode.BookTransfer);
				derivation_lazy = () -> Arrays.asList(ClearingChannel2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
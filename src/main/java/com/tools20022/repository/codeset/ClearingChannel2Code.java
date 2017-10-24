package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.ClearingChannelCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the clearing channel for the routing of the transaction, as part of
 * the payment type identification.
 */
public class ClearingChannel2Code extends ClearingChannelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode RealTimeGrossSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeGrossSettlementSystem";
			owner_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RealTimeNetSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeNetSettlementSystem";
			owner_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode MassPaymentNetSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MassPaymentNetSystem";
			owner_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode BookTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookTransfer";
			owner_lazy = () -> ClearingChannel2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RTGS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingChannel2Code";
				definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingChannel2Code.RealTimeGrossSettlementSystem, com.tools20022.repository.codeset.ClearingChannel2Code.RealTimeNetSettlementSystem,
						com.tools20022.repository.codeset.ClearingChannel2Code.MassPaymentNetSystem, com.tools20022.repository.codeset.ClearingChannel2Code.BookTransfer);
				trace_lazy = () -> ClearingChannelCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
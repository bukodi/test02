package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how expenses are paid.
 */
public class ChargePaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment is with cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Payment is with cash.";
			owner_lazy = () -> ChargePaymentMethodCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Units are redeemed to cover payment.
	 */
	public static final MMCode Unit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Units are redeemed to cover payment.";
			owner_lazy = () -> ChargePaymentMethodCode.mmObject();
			codeName = "UNIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargePaymentMethodCode";
				definition = "Specifies how expenses are paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargePaymentMethodCode.Cash, com.tools20022.repository.codeset.ChargePaymentMethodCode.Unit);
			}
		});
		return mmObject_lazy.get();
	}
}
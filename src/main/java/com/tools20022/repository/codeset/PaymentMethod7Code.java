package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.PaymentMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transfer method that will be used to transfer the cash.
 */
public class PaymentMethod7Code extends PaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			owner_lazy = () -> PaymentMethod7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransfer";
			owner_lazy = () -> PaymentMethod7Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentMethod7Code";
				definition = "Specifies the transfer method that will be used  to transfer the cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentMethod7Code.Cheque, com.tools20022.repository.codeset.PaymentMethod7Code.CreditTransfer);
				trace_lazy = () -> PaymentMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
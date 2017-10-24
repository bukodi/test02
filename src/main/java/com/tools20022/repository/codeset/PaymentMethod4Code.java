package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.PaymentMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transfer method that will be used to transfer an amount of
 * money.
 */
public class PaymentMethod4Code extends PaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			owner_lazy = () -> PaymentMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransfer";
			owner_lazy = () -> PaymentMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			owner_lazy = () -> PaymentMethod4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TransferAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAdvice";
			owner_lazy = () -> PaymentMethod4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentMethod4Code";
				definition = "Specifies the transfer method that will be used  to transfer an amount of money.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentMethod4Code.Cheque, com.tools20022.repository.codeset.PaymentMethod4Code.CreditTransfer,
						com.tools20022.repository.codeset.PaymentMethod4Code.DirectDebit, com.tools20022.repository.codeset.PaymentMethod4Code.TransferAdvice);
				trace_lazy = () -> PaymentMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
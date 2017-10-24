package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the cash payment occurs or will occur in advance of receipt
 * of proceeds from the issuer and based on a contractual agreement established
 * with the account servicer or upon receipt of proceeds from the issuer.
 */
public class PaymentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The cash payment occurs or will occur upon receipt of proceeds from the
	 * issuer.
	 */
	public static final MMCode ActualPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualPayment";
			definition = "The cash payment occurs or will occur upon receipt of proceeds from the issuer.";
			owner_lazy = () -> PaymentCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * The cash payment occurs or will occur in advance of receipt of proceeds
	 * from the issuer and based on a contractual agreement established with the
	 * account servicer.
	 */
	public static final MMCode ContractualPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractualPayment";
			definition = "The cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer.";
			owner_lazy = () -> PaymentCode.mmObject();
			codeName = "CONT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCode";
				definition = "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCode.ActualPayment, com.tools20022.repository.codeset.PaymentCode.ContractualPayment);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the state of payment of a security at a particular time.
 */
public class SecuritiesPaymentStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security is fully paid.
	 */
	public static final MMCode FullyPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyPaid";
			definition = "Security is fully paid.";
			owner_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Security is nill paid.
	 */
	public static final MMCode NillPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NillPaid";
			definition = "Security is nill paid.";
			owner_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
			codeName = "NILL";
		}
	};
	/**
	 * Security is partially paid.
	 */
	public static final MMCode PartiallyPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyPaid";
			definition = "Security is partially paid.";
			owner_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
			codeName = "PART";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPaymentStatusCode";
				definition = "Specifies the state of payment of a security at a particular time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.FullyPaid, com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.NillPaid,
						com.tools20022.repository.codeset.SecuritiesPaymentStatusCode.PartiallyPaid);
			}
		});
		return mmObject_lazy.get();
	}
}
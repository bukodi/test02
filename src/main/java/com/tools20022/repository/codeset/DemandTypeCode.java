package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of demand for payment.
 */
public class DemandTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pay only.
	 */
	public static final MMCode PayOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayOnly";
			definition = "Pay only.";
			owner_lazy = () -> DemandTypeCode.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Pay or extend.
	 */
	public static final MMCode PayOrExtend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayOrExtend";
			definition = "Pay or extend.";
			owner_lazy = () -> DemandTypeCode.mmObject();
			codeName = "PAEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PAYM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DemandTypeCode";
				definition = "Specifies the type of demand for payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DemandTypeCode.PayOnly, com.tools20022.repository.codeset.DemandTypeCode.PayOrExtend);
			}
		});
		return mmObject_lazy.get();
	}
}
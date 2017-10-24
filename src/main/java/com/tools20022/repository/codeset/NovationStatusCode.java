package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the novation.
 */
public class NovationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a novation.
	 */
	public static final MMCode Novation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Novation";
			definition = "Transaction is a novation.";
			owner_lazy = () -> NovationStatusCode.mmObject();
			codeName = "NOVA";
		}
	};
	/**
	 * Transaction is not a novation.
	 */
	public static final MMCode NoNovation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoNovation";
			definition = "Transaction is not a novation.";
			owner_lazy = () -> NovationStatusCode.mmObject();
			codeName = "NONO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NovationStatusCode";
				definition = "Specifies the status of the novation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NovationStatusCode.Novation, com.tools20022.repository.codeset.NovationStatusCode.NoNovation);
			}
		});
		return mmObject_lazy.get();
	}
}
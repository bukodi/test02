package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the affirmation status of a trade.
 */
public class AffirmationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the transaction is affirmed.
	 */
	public static final MMCode Affirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Affirmed";
			definition = "Status of the transaction is affirmed.";
			owner_lazy = () -> AffirmationStatusCode.mmObject();
			codeName = "AFFI";
		}
	};
	/**
	 * Status of the transaction is unaffirmed.
	 */
	public static final MMCode Unaffirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unaffirmed";
			definition = "Status of the transaction is unaffirmed.";
			owner_lazy = () -> AffirmationStatusCode.mmObject();
			codeName = "NAFI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AFFI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AffirmationStatusCode";
				definition = "Specifies the affirmation status of a trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AffirmationStatusCode.Affirmed, com.tools20022.repository.codeset.AffirmationStatusCode.Unaffirmed);
			}
		});
		return mmObject_lazy.get();
	}
}
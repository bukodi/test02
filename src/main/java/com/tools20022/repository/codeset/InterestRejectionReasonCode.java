package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the interest request is rejected due a value date or an
 * interest amount difference.
 */
public class InterestRejectionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the interest request is rejected due a value date
	 * difference.
	 */
	public static final MMCode ValueDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Indicates whether the interest request is rejected due a value date difference.";
			owner_lazy = () -> InterestRejectionReasonCode.mmObject();
			codeName = "VADA";
		}
	};
	/**
	 * Indicates whether the interest request is rejected due an interest amount
	 * difference.
	 */
	public static final MMCode DisputeAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeAmount";
			definition = "Indicates whether the interest request is rejected due an interest amount difference.";
			owner_lazy = () -> InterestRejectionReasonCode.mmObject();
			codeName = "DIAM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VADA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestRejectionReasonCode";
				definition = "Indicates whether the interest request is rejected due a value date or an interest amount difference.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestRejectionReasonCode.ValueDate, com.tools20022.repository.codeset.InterestRejectionReasonCode.DisputeAmount);
			}
		});
		return mmObject_lazy.get();
	}
}
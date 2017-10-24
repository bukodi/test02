package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if there is a pre-confirmation of cash or securities.
 */
public class PreConfirmationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-confirmation of the movement of the cash, pending the movement of
	 * securities.
	 */
	public static final MMCode PreConfirmCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreConfirmCash";
			definition = "Pre-confirmation of the movement of the cash, pending the movement of securities.";
			owner_lazy = () -> PreConfirmationCode.mmObject();
			codeName = "PRCA";
		}
	};
	/**
	 * Pre-confirmation of the movement of the securities, pending the movement
	 * of cash.
	 */
	public static final MMCode PreConfirmSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreConfirmSecurities";
			definition = "Pre-confirmation of the movement of the securities, pending the movement of cash.";
			owner_lazy = () -> PreConfirmationCode.mmObject();
			codeName = "PRSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRCA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PreConfirmationCode";
				definition = "Specifies if there is a pre-confirmation of cash or securities.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreConfirmationCode.PreConfirmCash, com.tools20022.repository.codeset.PreConfirmationCode.PreConfirmSecurities);
			}
		});
		return mmObject_lazy.get();
	}
}
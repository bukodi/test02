package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies when the option contract settles.
 */
public class SettleStyleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is only allowed on the opening of the future contract.
	 */
	public static final MMCode SettleOnOpen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleOnOpen";
			definition = "Settlement is only allowed on the opening of the future contract.";
			owner_lazy = () -> SettleStyleCode.mmObject();
			codeName = "SETO";
		}
	};
	/**
	 * Settlement is only allowed on the closing of the future contract.
	 */
	public static final MMCode SettleOnClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleOnClose";
			definition = "Settlement is only allowed on the closing of the future contract.";
			owner_lazy = () -> SettleStyleCode.mmObject();
			codeName = "SETC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SETO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettleStyleCode";
				definition = "Specifies when the option contract settles.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettleStyleCode.SettleOnOpen, com.tools20022.repository.codeset.SettleStyleCode.SettleOnClose);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the dividend is in the scope of the European directive on
 * taxation of savings income in the form of interest payments.
 */
public class EUDividendStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is in the scope of the directive.
	 */
	public static final MMCode DividendInScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendInScope";
			definition = "Dividend is in the scope of the directive.";
			owner_lazy = () -> EUDividendStatusCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Dividend is out of the scope of the directive.
	 */
	public static final MMCode DividendOutScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendOutScope";
			definition = "Dividend is out of the scope of the directive.";
			owner_lazy = () -> EUDividendStatusCode.mmObject();
			codeName = "DIVO";
		}
	};
	/**
	 * Unknown whether the dividend is in or out of the scope of the directive.
	 */
	public static final MMCode DividendUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendUnknown";
			definition = "Unknown whether the dividend is in or out of the scope of the directive.";
			owner_lazy = () -> EUDividendStatusCode.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EUDividendStatusCode";
				definition = "Specifies whether the dividend is in the scope of the European directive on taxation of savings income in the form of interest payments.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUDividendStatusCode.DividendInScope, com.tools20022.repository.codeset.EUDividendStatusCode.DividendOutScope,
						com.tools20022.repository.codeset.EUDividendStatusCode.DividendUnknown);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the form of the security.
 */
public class FormOfSecurityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Shareholder name of the financial instrument appears in the
	 * corporation/funds books.
	 */
	public static final MMCode Registered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Shareholder name of the financial instrument appears in the corporation/funds books.";
			owner_lazy = () -> FormOfSecurityCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * The financial instrument does not specify any registration of ownership,
	 * and is payable to whomever possesses the certificate.
	 */
	public static final MMCode Bearer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bearer";
			definition = "The financial instrument does not specify any registration of ownership, and  is payable to whomever possesses the certificate.";
			owner_lazy = () -> FormOfSecurityCode.mmObject();
			codeName = "BEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REGD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FormOfSecurityCode";
				definition = "Specifies the form of the security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FormOfSecurityCode.Registered, com.tools20022.repository.codeset.FormOfSecurityCode.Bearer);
			}
		});
		return mmObject_lazy.get();
	}
}
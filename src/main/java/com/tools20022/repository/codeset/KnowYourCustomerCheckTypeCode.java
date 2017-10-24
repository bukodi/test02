package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Know Your Customer (KYC) or anti-money laundering due
 * diligence to which the investor has been subjected.
 */
public class KnowYourCustomerCheckTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ordinary check, typically carried out on standard accounts.
	 */
	public static final MMCode Ordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Ordinary check, typically carried out on standard accounts.";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Simple check, typically carried out on accounts that have a low risk of
	 * anti-money laundering, such as an account owned by a financial
	 * institution.
	 */
	public static final MMCode Simple = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "Simple check, typically carried out on accounts that have a low risk of anti-money laundering, such as an account owned by a financial institution.";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Enhanced check, typically carried out on accounts that are considered
	 * high risk.
	 */
	public static final MMCode Enhanced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enhanced";
			definition = "Enhanced check, typically carried out on accounts that are considered high risk. ";
			owner_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
			codeName = "ENHA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "KnowYourCustomerCheckTypeCode";
				definition = "Specifies the type of Know Your Customer (KYC) or anti-money laundering due diligence to which the investor has been subjected.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode.Ordinary, com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode.Simple,
						com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode.Enhanced);
			}
		});
		return mmObject_lazy.get();
	}
}
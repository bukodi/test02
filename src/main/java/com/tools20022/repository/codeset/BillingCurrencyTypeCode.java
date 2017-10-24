package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the currency type to be used in the billing balance.
 */
public class BillingCurrencyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency type used for the billing is the account currency.
	 */
	public static final MMCode Account = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Currency type used for the billing is the account currency.";
			owner_lazy = () -> BillingCurrencyTypeCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Currency type used for the billing is the settlement currency.
	 */
	public static final MMCode Settlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Currency type used for the billing is the settlement currency.";
			owner_lazy = () -> BillingCurrencyTypeCode.mmObject();
			codeName = "STLM";
		}
	};
	/**
	 * Currency type used for the billing is the pricing currency.
	 */
	public static final MMCode Pricing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pricing";
			definition = "Currency type used for the billing is the pricing currency.";
			owner_lazy = () -> BillingCurrencyTypeCode.mmObject();
			codeName = "PRCG";
		}
	};
	/**
	 * Currency type used for the billing is the host currency.
	 */
	public static final MMCode Host = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Currency type used for the billing is the host currency.";
			owner_lazy = () -> BillingCurrencyTypeCode.mmObject();
			codeName = "HOST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingCurrencyTypeCode";
				definition = "Defines the currency type to be used in the billing balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingCurrencyTypeCode.Account, com.tools20022.repository.codeset.BillingCurrencyTypeCode.Settlement,
						com.tools20022.repository.codeset.BillingCurrencyTypeCode.Pricing, com.tools20022.repository.codeset.BillingCurrencyTypeCode.Host);
			}
		});
		return mmObject_lazy.get();
	}
}
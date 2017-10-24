package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the investment account category.
 */
public class InvestmentAccountCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is a standard account managed by the investor. The investor
	 * issues instructions for the account to the financial institution.
	 */
	public static final MMCode RetailAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailAccount";
			definition = "Account is a standard account managed by the investor. The investor issues instructions for the account to the financial institution.";
			owner_lazy = () -> InvestmentAccountCategoryCode.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Account is fully managed by the financial institution, that is, an
	 * investor gives a 'mandate' to the financial institution to execute a
	 * mutually agreed investment strategy on its behalf.
	 */
	public static final MMCode MandateAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateAccount";
			definition = "Account is fully managed by the financial institution, that is, an investor gives a 'mandate' to the financial institution to execute a mutually agreed investment strategy on its behalf.";
			owner_lazy = () -> InvestmentAccountCategoryCode.mmObject();
			codeName = "MAND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountCategoryCode";
				definition = "Specifies the investment account category.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentAccountCategoryCode.RetailAccount, com.tools20022.repository.codeset.InvestmentAccountCategoryCode.MandateAccount);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the options for distribution of dividend income.
 */
public class IncomePreferenceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Distribution in cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Distribution in cash.";
			owner_lazy = () -> IncomePreferenceCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Reinvestment of proceeds into securities.
	 */
	public static final MMCode DividendReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendReinvestment";
			definition = "Reinvestment of proceeds into securities.";
			owner_lazy = () -> IncomePreferenceCode.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Distribution in securities.
	 */
	public static final MMCode Securities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Distribution in securities.";
			owner_lazy = () -> IncomePreferenceCode.mmObject();
			codeName = "SECU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IncomePreferenceCode";
				definition = "Specifies the options for distribution of dividend income.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IncomePreferenceCode.Cash, com.tools20022.repository.codeset.IncomePreferenceCode.DividendReinvestment,
						com.tools20022.repository.codeset.IncomePreferenceCode.Securities);
			}
		});
		return mmObject_lazy.get();
	}
}
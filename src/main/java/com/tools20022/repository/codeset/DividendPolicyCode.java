package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the dividend policy of the financial instrument.
 */
public class DividendPolicyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is paid daily and can be accrued.
	 */
	public static final MMCode DailyAccruingDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DailyAccruingDividend";
			definition = "Dividend is paid daily and can be accrued.";
			owner_lazy = () -> DividendPolicyCode.mmObject();
			codeName = "DACR";
		}
	};
	/**
	 * Dividend is paid in cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Dividend is paid in cash.";
			owner_lazy = () -> DividendPolicyCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Dividend is paid in units.
	 */
	public static final MMCode Units = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Units";
			definition = "Dividend is paid in units.";
			owner_lazy = () -> DividendPolicyCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Dividend is paid in both Cash and Units.
	 */
	public static final MMCode Both = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Dividend is paid in both Cash and Units.";
			owner_lazy = () -> DividendPolicyCode.mmObject();
			codeName = "BOTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DACR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DividendPolicyCode";
				definition = "Specifies the dividend policy of the financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendPolicyCode.DailyAccruingDividend, com.tools20022.repository.codeset.DividendPolicyCode.Cash,
						com.tools20022.repository.codeset.DividendPolicyCode.Units, com.tools20022.repository.codeset.DividendPolicyCode.Both);
			}
		});
		return mmObject_lazy.get();
	}
}
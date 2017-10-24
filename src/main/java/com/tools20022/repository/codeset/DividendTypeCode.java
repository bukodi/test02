package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the dividend.
 */
public class DividendTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is paid in cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Dividend is paid in cash.";
			owner_lazy = () -> DividendTypeCode.mmObject();
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
			owner_lazy = () -> DividendTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Dividend is paid in the form of scrip.
	 */
	public static final MMCode Scrip = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scrip";
			definition = "Dividend is paid in the form of scrip.";
			owner_lazy = () -> DividendTypeCode.mmObject();
			codeName = "SCRI";
		}
	};
	/**
	 * Dividend is paid in kind.
	 */
	public static final MMCode InKind = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InKind";
			definition = "Dividend is paid in kind.";
			owner_lazy = () -> DividendTypeCode.mmObject();
			codeName = "KIND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DividendTypeCode";
				definition = "Specifies the nature of the dividend.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendTypeCode.Cash, com.tools20022.repository.codeset.DividendTypeCode.Units, com.tools20022.repository.codeset.DividendTypeCode.Scrip,
						com.tools20022.repository.codeset.DividendTypeCode.InKind);
			}
		});
		return mmObject_lazy.get();
	}
}
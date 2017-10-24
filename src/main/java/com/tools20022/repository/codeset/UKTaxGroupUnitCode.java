package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the UK tax group to which units belong. For UK tax, the first
 * dividend that an investor receives from a funds investment is deemed to be
 * part income and part return of capital. The capital element is
 * 'equalisation', and is exempt from income tax.
 */
public class UKTaxGroupUnitCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The units that were purchased prior to the last ex-div date.
	 */
	public static final MMCode Group1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Group1";
			definition = "The units that were purchased prior to the last ex-div date.";
			owner_lazy = () -> UKTaxGroupUnitCode.mmObject();
			codeName = "GRP1";
		}
	};
	/**
	 * The units that were purchased since the ex-div date, and that benefit
	 * from the tax exemption.
	 */
	public static final MMCode Group2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Group2";
			definition = "The units that were purchased since the ex-div date, and that benefit from the tax exemption.";
			owner_lazy = () -> UKTaxGroupUnitCode.mmObject();
			codeName = "GRP2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GRP1");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UKTaxGroupUnitCode";
				definition = "Specifies the UK tax group to which units belong. For UK tax, the first dividend that an investor receives from a funds investment is deemed to be part income and part return of capital. The capital element is 'equalisation', and is exempt from income tax.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UKTaxGroupUnitCode.Group1, com.tools20022.repository.codeset.UKTaxGroupUnitCode.Group2);
			}
		});
		return mmObject_lazy.get();
	}
}
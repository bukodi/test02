package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of financial or commercial document.
 */
public class ExchangeRateType1Code extends ExchangeRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Spot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spot";
			owner_lazy = () -> ExchangeRateType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Sale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sale";
			owner_lazy = () -> ExchangeRateType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Agreed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreed";
			owner_lazy = () -> ExchangeRateType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SPOT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangeRateType1Code";
				definition = "Specifies a type of financial or commercial document.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExchangeRateType1Code.Spot, com.tools20022.repository.codeset.ExchangeRateType1Code.Sale, com.tools20022.repository.codeset.ExchangeRateType1Code.Agreed);
				trace_lazy = () -> ExchangeRateTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
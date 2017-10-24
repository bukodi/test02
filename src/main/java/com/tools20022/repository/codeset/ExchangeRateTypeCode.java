package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code used to define the type of the currency exchange.
 */
public class ExchangeRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange rate applied is the spot rate.
	 */
	public static final MMCode Spot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spot";
			definition = "Exchange rate applied is the spot rate.";
			owner_lazy = () -> ExchangeRateTypeCode.mmObject();
			codeName = "SPOT";
		}
	};
	/**
	 * Exchange rate applied is the market rate at the time of the sale.
	 */
	public static final MMCode Sale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sale";
			definition = "Exchange rate applied is the market rate at the time of the sale.";
			owner_lazy = () -> ExchangeRateTypeCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Exchange rate applied is the rate agreed between the parties.
	 */
	public static final MMCode Agreed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreed";
			definition = "Exchange rate applied is the rate agreed between the parties.";
			owner_lazy = () -> ExchangeRateTypeCode.mmObject();
			codeName = "AGRD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SPOT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangeRateTypeCode";
				definition = "Code used to define the type of the currency exchange.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExchangeRateTypeCode.Spot, com.tools20022.repository.codeset.ExchangeRateTypeCode.Sale, com.tools20022.repository.codeset.ExchangeRateTypeCode.Agreed);
				derivation_lazy = () -> Arrays.asList(ExchangeRateType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
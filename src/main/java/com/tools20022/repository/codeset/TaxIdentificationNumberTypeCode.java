package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of tax identification number.
 */
public class TaxIdentificationNumberTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax identification number.
	 */
	public static final MMCode TaxIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Tax identification number.";
			owner_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
			codeName = "GTIN";
		}
	};
	/**
	 * Global intermediary tax identification number.
	 */
	public static final MMCode GlobalIntermediaryIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalIntermediaryIdentificationNumber";
			definition = "Global intermediary tax identification number.";
			owner_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
			codeName = "GIIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxIdentificationNumberTypeCode";
				definition = "Specifies the type of tax identification number.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.TaxIdentificationNumber,
						com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode.GlobalIntermediaryIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}
}
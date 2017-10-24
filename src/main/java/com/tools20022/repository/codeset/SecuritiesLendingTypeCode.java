package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of securities lending contract.
 */
public class SecuritiesLendingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities lending contract is new and registered.
	 */
	public static final MMCode NewRegistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewRegistration";
			definition = "Securities lending contract is new and registered.";
			owner_lazy = () -> SecuritiesLendingTypeCode.mmObject();
			codeName = "NWRG";
		}
	};
	/**
	 * Securities lending contract is renewed.
	 */
	public static final MMCode RollOverRenewal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollOverRenewal";
			definition = "Securities lending contract is renewed.";
			owner_lazy = () -> SecuritiesLendingTypeCode.mmObject();
			codeName = "RENW";
		}
	};
	/**
	 * Securities lending contract is called back.
	 */
	public static final MMCode CallBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			definition = "Securities lending contract is called back.";
			owner_lazy = () -> SecuritiesLendingTypeCode.mmObject();
			codeName = "CABK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NWRG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLendingTypeCode";
				definition = "Type of securities lending contract.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesLendingTypeCode.NewRegistration, com.tools20022.repository.codeset.SecuritiesLendingTypeCode.RollOverRenewal,
						com.tools20022.repository.codeset.SecuritiesLendingTypeCode.CallBack);
			}
		});
		return mmObject_lazy.get();
	}
}
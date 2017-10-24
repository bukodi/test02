package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the named type of the undertaking.
 */
public class UndertakingNameCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking is a demand guarantee.
	 */
	public static final MMCode DemandGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandGuarantee";
			definition = "Undertaking is a demand guarantee.";
			owner_lazy = () -> UndertakingNameCode.mmObject();
			codeName = "DGAR";
		}
	};
	/**
	 * Undertaking is a standby letter of credit.
	 */
	public static final MMCode StandbyLetterOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandbyLetterOfCredit";
			definition = "Undertaking is a standby letter of credit.";
			owner_lazy = () -> UndertakingNameCode.mmObject();
			codeName = "STBY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DGAR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingNameCode";
				definition = "Specifies the named type of the undertaking.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingNameCode.DemandGuarantee, com.tools20022.repository.codeset.UndertakingNameCode.StandbyLetterOfCredit);
			}
		});
		return mmObject_lazy.get();
	}
}
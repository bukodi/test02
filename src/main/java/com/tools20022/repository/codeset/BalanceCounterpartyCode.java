package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of counterparty to be taken into account for calculation
 * of the balance.
 */
public class BalanceCounterpartyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance calculated regarding one member in the system.
	 */
	public static final MMCode Bilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Balance calculated regarding one member in the system.";
			owner_lazy = () -> BalanceCounterpartyCode.mmObject();
			codeName = "BILA";
		}
	};
	/**
	 * Balance calculated regarding all members in the system.
	 */
	public static final MMCode Multilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Multilateral";
			definition = "Balance calculated regarding all members in the system.";
			owner_lazy = () -> BalanceCounterpartyCode.mmObject();
			codeName = "MULT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BILA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceCounterpartyCode";
				definition = "Specifies the type of counterparty to be taken into account for calculation of the balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceCounterpartyCode.Bilateral, com.tools20022.repository.codeset.BalanceCounterpartyCode.Multilateral);
			}
		});
		return mmObject_lazy.get();
	}
}
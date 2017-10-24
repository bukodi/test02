package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lending method applied to the securities financing contract.
 */
public class LendingTransactionMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contract applies to a specific security only.
	 */
	public static final MMCode OnDemandTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandTrade";
			definition = "Contract applies to a specific security only.";
			owner_lazy = () -> LendingTransactionMethodCode.mmObject();
			codeName = "ODTR";
		}
	};
	/**
	 * Contract applies to a number of different securities within the same
	 * pool/fund.
	 */
	public static final MMCode ExclusiveTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveTrade";
			definition = "Contract applies to a number of different securities within the same pool/fund.";
			owner_lazy = () -> LendingTransactionMethodCode.mmObject();
			codeName = "EXTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ODTR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LendingTransactionMethodCode";
				definition = "Lending method applied to the securities financing contract.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LendingTransactionMethodCode.OnDemandTrade, com.tools20022.repository.codeset.LendingTransactionMethodCode.ExclusiveTrade);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of pay-in call report.
 */
public class CallInCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pay-in call is for account value.
	 */
	public static final MMCode CallForAccountValue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForAccountValue";
			definition = "Pay-in call is for account value.";
			owner_lazy = () -> CallInCode.mmObject();
			codeName = "CFAV";
		}
	};
	/**
	 * Pay-in call is for settlement.
	 */
	public static final MMCode CallForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForSettlement";
			definition = "Pay-in call is for settlement.";
			owner_lazy = () -> CallInCode.mmObject();
			codeName = "CFST";
		}
	};
	/**
	 * Pay-in call is for currency close.
	 */
	public static final MMCode CallForCurrencyClose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallForCurrencyClose";
			definition = "Pay-in call is for currency close.";
			owner_lazy = () -> CallInCode.mmObject();
			codeName = "CFCC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CFAV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CallInCode";
				definition = "Specifies the type of pay-in call report.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CallInCode.CallForAccountValue, com.tools20022.repository.codeset.CallInCode.CallForSettlement,
						com.tools20022.repository.codeset.CallInCode.CallForCurrencyClose);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the clearing account type.
 */
public class ClearingAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the account is used to register trades executed for either
	 * the clearing member or its subsidiaries.
	 */
	public static final MMCode House = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			definition = "Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.";
			owner_lazy = () -> ClearingAccountTypeCode.mmObject();
			codeName = "HOUS";
		}
	};
	/**
	 * Specifies that the account is used to register trades executed for the
	 * clearing member's customers.
	 */
	public static final MMCode Client = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Specifies that the account is used to register trades executed for the clearing member's customers.";
			owner_lazy = () -> ClearingAccountTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Specifies that the account is used to register trades executed for
	 * liquidity providers (also known as market maker) activities.
	 */
	public static final MMCode LiquidityProvider = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			definition = "Specifies that the account is used to register trades executed for liquidity providers (also known as market maker) activities.";
			owner_lazy = () -> ClearingAccountTypeCode.mmObject();
			codeName = "LIPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingAccountTypeCode";
				definition = "Specifies the clearing account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingAccountTypeCode.House, com.tools20022.repository.codeset.ClearingAccountTypeCode.Client,
						com.tools20022.repository.codeset.ClearingAccountTypeCode.LiquidityProvider);
			}
		});
		return mmObject_lazy.get();
	}
}
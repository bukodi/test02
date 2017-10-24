package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the collateral account type.
 */
public class CollateralAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for either the clearing member or
	 * its subsidiaries.
	 */
	public static final MMCode House = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries.";
			owner_lazy = () -> CollateralAccountTypeCode.mmObject();
			codeName = "HOUS";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for the clearing member's
	 * customers.
	 */
	public static final MMCode Client = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for the clearing member's customers.";
			owner_lazy = () -> CollateralAccountTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for liquidity providers (also
	 * known as market maker) activities.
	 */
	public static final MMCode LiquidityProvider = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for liquidity providers (also known as market maker) activities.";
			owner_lazy = () -> CollateralAccountTypeCode.mmObject();
			codeName = "LIPR";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers the
	 * exposure resulting from trades executed for either the clearing member or
	 * its subsidiaries, or for the clearing member's customers.
	 */
	public static final MMCode Margin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			definition = "Specifies that the account is used to post collateral that covers the exposure resulting from trades executed for either the clearing member or its subsidiaries, or for the clearing member's customers.";
			owner_lazy = () -> CollateralAccountTypeCode.mmObject();
			codeName = "MGIN";
		}
	};
	/**
	 * Specifies that the account is used to post collateral that covers
	 * clearing member's default risk.
	 */
	public static final MMCode DefaultFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			definition = "Specifies that the account is used to post collateral that covers clearing member's default risk.";
			owner_lazy = () -> CollateralAccountTypeCode.mmObject();
			codeName = "DFLT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralAccountTypeCode";
				definition = "Specifies the collateral account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralAccountTypeCode.House, com.tools20022.repository.codeset.CollateralAccountTypeCode.Client,
						com.tools20022.repository.codeset.CollateralAccountTypeCode.LiquidityProvider, com.tools20022.repository.codeset.CollateralAccountTypeCode.Margin,
						com.tools20022.repository.codeset.CollateralAccountTypeCode.DefaultFund);
			}
		});
		return mmObject_lazy.get();
	}
}
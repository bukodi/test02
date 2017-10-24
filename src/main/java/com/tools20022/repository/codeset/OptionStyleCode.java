package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines how an option can be exercised
 */
public class OptionStyleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option can be exercised before or on expiry date.
	 */
	public static final MMCode American = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "American";
			definition = "Option can be exercised before or on expiry date.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "AMER";
		}
	};
	/**
	 * Option that can be exercised on expiry date only.
	 */
	public static final MMCode European = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "European";
			definition = "Option that can be exercised on expiry date only.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Option that can be exercised on multiple discrete dates prior to, or on
	 * expiry date.
	 */
	public static final MMCode Bermudan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bermudan";
			definition = "Option that can be exercised on multiple discrete dates prior to, or on expiry date.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "BERM";
		}
	};
	/**
	 * Option where the payoff is not determined by the underlying price at
	 * maturity but by the average underlying price over some pre-set period of
	 * time.
	 */
	public static final MMCode Asian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asian";
			definition = "Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "ASIA";
		}
	};
	/**
	 * Option whose exercise style lies somewhere between European options and
	 * Bermudan options. The holder can exercise the option at quaterly dates,
	 * but not before a set time period (typically one year) has elapsed.
	 */
	public static final MMCode Canary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Canary";
			definition = "Option whose exercise style lies somewhere between European options and Bermudan options. The holder can exercise the option at quaterly dates, but not before a set time period (typically one year) has elapsed.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "CANA";
		}
	};
	/**
	 * Other type of option style.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of option style.";
			owner_lazy = () -> OptionStyleCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AMER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OptionStyleCode";
				definition = "Defines how an option can be exercised";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionStyleCode.American, com.tools20022.repository.codeset.OptionStyleCode.European, com.tools20022.repository.codeset.OptionStyleCode.Bermudan,
						com.tools20022.repository.codeset.OptionStyleCode.Asian, com.tools20022.repository.codeset.OptionStyleCode.Canary, com.tools20022.repository.codeset.OptionStyleCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}
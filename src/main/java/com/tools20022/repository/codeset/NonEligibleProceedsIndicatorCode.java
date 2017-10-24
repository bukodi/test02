package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information regarding the non eligibility of the outturn resources.
 */
public class NonEligibleProceedsIndicatorCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security not eligible in the Central Securities Depository (CSD).
	 */
	public static final MMCode NonEligibleSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleSecurity";
			definition = "Security not eligible in the Central Securities Depository (CSD).";
			owner_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "NELS";
		}
	};
	/**
	 * Currency not eligible for settlement in the Central Securities Depository
	 * (CSD).
	 */
	public static final MMCode NonEligibleCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonEligibleCurrency";
			definition = "Currency not eligible for settlement in the Central Securities Depository (CSD).";
			owner_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "NELC";
		}
	};
	/**
	 * Participant's account limitation.
	 */
	public static final MMCode AccountLimitation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLimitation";
			definition = "Participant's account limitation.";
			owner_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "ACLI";
		}
	};
	/**
	 * Other source of non eligibility.
	 */
	public static final MMCode OtherNonEligibility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherNonEligibility";
			definition = "Other source of non eligibility.";
			owner_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
			codeName = "ONEL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NELS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonEligibleProceedsIndicatorCode";
				definition = "Specifies information regarding the non eligibility of the outturn resources.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.NonEligibleSecurity, com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.NonEligibleCurrency,
						com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.AccountLimitation, com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode.OtherNonEligibility);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of interest rate.
 */
public class InterestRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate is fixed.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Rate is fixed.";
			owner_lazy = () -> InterestRateTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * No specific repurchase rate applies to the transaction Repo, only a
	 * forfeit.
	 */
	public static final MMCode Forfeit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forfeit";
			definition = "No specific repurchase rate applies to the transaction Repo, only a forfeit.";
			owner_lazy = () -> InterestRateTypeCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Rate is variable.
	 */
	public static final MMCode Variable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			definition = "Rate is variable.";
			owner_lazy = () -> InterestRateTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Rate of the scheduled payment.
	 */
	public static final MMCode Scheduled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scheduled";
			definition = "Rate of the scheduled payment.";
			owner_lazy = () -> InterestRateTypeCode.mmObject();
			codeName = "SCHD";
		}
	};
	/**
	 * Rate of the unscheduled payment.
	 */
	public static final MMCode Unscheduled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unscheduled";
			definition = "Rate of the unscheduled payment.";
			owner_lazy = () -> InterestRateTypeCode.mmObject();
			codeName = "USCD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestRateTypeCode";
				definition = "Specifies the type of interest rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestRateTypeCode.Fixed, com.tools20022.repository.codeset.InterestRateTypeCode.Forfeit, com.tools20022.repository.codeset.InterestRateTypeCode.Variable,
						com.tools20022.repository.codeset.InterestRateTypeCode.Scheduled, com.tools20022.repository.codeset.InterestRateTypeCode.Unscheduled);
			}
		});
		return mmObject_lazy.get();
	}
}
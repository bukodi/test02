package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of instalment plan.
 */
public class InstalmentPlanCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The payment is split in several instalments of equal amounts.
	 */
	public static final MMCode EqualPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualPayment";
			definition = "The payment is split in several instalments of equal amounts.";
			owner_lazy = () -> InstalmentPlanCode.mmObject();
			codeName = "EQPM";
		}
	};
	/**
	 * The payment is split in several instalments of different amounts.
	 */
	public static final MMCode InequalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InequalPayment";
			definition = "The payment is split in several instalments of different amounts.";
			owner_lazy = () -> InstalmentPlanCode.mmObject();
			codeName = "NQPM";
		}
	};
	/**
	 * The first instalment is deferred.
	 */
	public static final MMCode DeferredInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredInstalment";
			definition = "The first instalment is deferred.";
			owner_lazy = () -> InstalmentPlanCode.mmObject();
			codeName = "DFRI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstalmentPlanCode";
				definition = "Type of instalment plan.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstalmentPlanCode.EqualPayment, com.tools20022.repository.codeset.InstalmentPlanCode.InequalPayment,
						com.tools20022.repository.codeset.InstalmentPlanCode.DeferredInstalment);
			}
		});
		return mmObject_lazy.get();
	}
}
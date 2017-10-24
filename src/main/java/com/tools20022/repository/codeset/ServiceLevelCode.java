package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the pre-agreed level of service between the parties.
 */
public class ServiceLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment must be executed with same day value to the creditor.
	 */
	public static final MMCode SameDayValue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SameDayValue";
			definition = "Payment must be executed with same day value to the creditor.";
			owner_lazy = () -> ServiceLevelCode.mmObject();
			codeName = "SDVA";
		}
	};
	/**
	 * Payment must be executed following the Single Euro Payments Area scheme.
	 */
	public static final MMCode SingleEuroPaymentsArea = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SingleEuroPaymentsArea";
			definition = "Payment must be executed following the Single Euro Payments Area scheme.";
			owner_lazy = () -> ServiceLevelCode.mmObject();
			codeName = "SEPA";
		}
	};
	/**
	 * Transaction must be processed according to the EBA Priority Service.
	 */
	public static final MMCode EBAPriorityService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EBAPriorityService";
			definition = "Transaction must be processed according to the EBA\nPriority Service.";
			owner_lazy = () -> ServiceLevelCode.mmObject();
			codeName = "PRPT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SDVA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceLevelCode";
				definition = "Specifies the pre-agreed level of service between the parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceLevelCode.SameDayValue, com.tools20022.repository.codeset.ServiceLevelCode.SingleEuroPaymentsArea,
						com.tools20022.repository.codeset.ServiceLevelCode.EBAPriorityService);
			}
		});
		return mmObject_lazy.get();
	}
}
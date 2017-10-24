package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction/request has been cancelled.
 */
public class CollateralManagementCancellationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to message being sent in error.
	 */
	public static final MMCode ProcessingError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingError";
			definition = "Cancellation due to message being sent in error.";
			owner_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
			codeName = "PRER";
		}
	};
	/**
	 * Cancellation due to a change in exposure or collateral or independent
	 * amount or margin terms. For collateral proposal submitting new/different
	 * collateral.
	 */
	public static final MMCode PendingNewSubmission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNewSubmission";
			definition = "Cancellation due to a change in exposure or collateral or independent amount or margin terms. For collateral proposal submitting new/different collateral.";
			owner_lazy = () -> CollateralManagementCancellationReasonCode.mmObject();
			codeName = "PNSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralManagementCancellationReasonCode";
				definition = "Specifies the reason why the instruction/request has been cancelled.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.ProcessingError, com.tools20022.repository.codeset.CollateralManagementCancellationReasonCode.PendingNewSubmission);
			}
		});
		return mmObject_lazy.get();
	}
}
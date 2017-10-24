package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the termination reason.
 */
public class TerminationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for termination is underlying business has finished.
	 */
	public static final MMCode UnderlyingBusinessFinished = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingBusinessFinished";
			definition = "Reason for termination is underlying business has finished.";
			owner_lazy = () -> TerminationReasonCode.mmObject();
			codeName = "BUFI";
		}
	};
	/**
	 * Reason for termination is warranty obligation period has expired.
	 */
	public static final MMCode WarrantyObligationPeriodExpired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantyObligationPeriodExpired";
			definition = "Reason for termination is warranty obligation period has expired.";
			owner_lazy = () -> TerminationReasonCode.mmObject();
			codeName = "WOEX";
		}
	};
	/**
	 * Reason for termination is non-acceptance of a tender.
	 */
	public static final MMCode TenderNonAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderNonAcceptance";
			definition = "Reason for termination is non-acceptance of a tender.";
			owner_lazy = () -> TerminationReasonCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Reason for termination is reduction terms have been fulfilled.
	 */
	public static final MMCode ReductionTermsFulfilled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReductionTermsFulfilled";
			definition = "Reason for termination is reduction terms have been fulfilled.";
			owner_lazy = () -> TerminationReasonCode.mmObject();
			codeName = "REFU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BUFI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminationReasonCode";
				definition = "Specifies the termination reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminationReasonCode.UnderlyingBusinessFinished, com.tools20022.repository.codeset.TerminationReasonCode.WarrantyObligationPeriodExpired,
						com.tools20022.repository.codeset.TerminationReasonCode.TenderNonAcceptance, com.tools20022.repository.codeset.TerminationReasonCode.ReductionTermsFulfilled);
			}
		});
		return mmObject_lazy.get();
	}
}
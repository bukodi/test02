package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies reasons for cancellation of a corporate action event.
 */
public class CorporateActionCancellationReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation due to a processing error.
	 */
	public static final MMCode Processing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Processing";
			definition = "Cancellation due to a processing error.";
			owner_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
			codeName = "PROC";
		}
	};
	/**
	 * Cancellation due to the corporate action event being cancelled by the
	 * issuer.
	 */
	public static final MMCode Withrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withrawal";
			definition = "Cancellation due to the corporate action event being cancelled by the issuer.";
			owner_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
			codeName = "WITH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellationReasonCode";
				definition = "Specifies reasons for cancellation of a corporate action event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.Processing, com.tools20022.repository.codeset.CorporateActionCancellationReasonCode.Withrawal);
			}
		});
		return mmObject_lazy.get();
	}
}
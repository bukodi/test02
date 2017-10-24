package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies additional information about the status of the repurchase agreement
 * call processed instruction.
 */
public class RepoCallRequestStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Repurchase agreement call request is acknowledged/accepted.
	 */
	public static final MMCode AcknowledgedAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Repurchase agreement call request is acknowledged/accepted.";
			owner_lazy = () -> RepoCallRequestStatusCode.mmObject();
			codeName = "CACK";
		}
	};
	/**
	 * Repuchase agreement call request is denied.
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Repuchase agreement call request is denied.";
			owner_lazy = () -> RepoCallRequestStatusCode.mmObject();
			codeName = "DEND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CACK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepoCallRequestStatusCode";
				definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallRequestStatusCode.AcknowledgedAccepted, com.tools20022.repository.codeset.RepoCallRequestStatusCode.Denied);
			}
		});
		return mmObject_lazy.get();
	}
}
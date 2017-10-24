package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies additional information about the repurchase agreement call
 * processed instruction.
 */
public class RepoCallAcknowledgementReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 */
	public static final MMCode AccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Repuchase agreement call is in process.
	 */
	public static final MMCode InProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProcess";
			definition = "Repuchase agreement call is in process.";
			owner_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALD";
		}
	};
	/**
	 * Repurchase agreement call is issued.
	 */
	public static final MMCode Issued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "Repurchase agreement call is issued.";
			owner_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALI";
		}
	};
	/**
	 * Repurchase agreement call is processed.
	 */
	public static final MMCode Processed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			definition = "Repurchase agreement call is processed.";
			owner_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALP";
		}
	};
	/**
	 * Repurchase agreement call request is being processed.
	 */
	public static final MMCode BeingProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingProcessed";
			definition = "Repurchase agreement call request is being processed.";
			owner_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
			codeName = "CALR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepoCallAcknowledgementReasonCode";
				definition = "Specifies additional information about the repurchase agreement call processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.InProcess,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.Issued, com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.Processed,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode.BeingProcessed);
			}
		});
		return mmObject_lazy.get();
	}
}
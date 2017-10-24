package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an account management instruction.
 */
public class AccountManagementStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The account management instruction has been received and is acknowledged.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "The account management instruction has been received and is acknowledged.";
			owner_lazy = () -> AccountManagementStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The account management instruction has been validated and accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "The account management instruction has been validated and accepted.";
			owner_lazy = () -> AccountManagementStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * The account management instruction is being processed and the
	 * confirmation will follow.
	 */
	public static final MMCode ProcessingOngoing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOngoing";
			definition = "The account management instruction is being processed and the confirmation will follow.";
			owner_lazy = () -> AccountManagementStatusCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * The account management instruction has been sent to the next party, eg,
	 * the next intermediary.
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "The account management instruction has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> AccountManagementStatusCode.mmObject();
			codeName = "STNP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatusCode";
				definition = "Specifies the status of an account management instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementStatusCode.Received, com.tools20022.repository.codeset.AccountManagementStatusCode.Accepted,
						com.tools20022.repository.codeset.AccountManagementStatusCode.ProcessingOngoing, com.tools20022.repository.codeset.AccountManagementStatusCode.SentToNextParty);
			}
		});
		return mmObject_lazy.get();
	}
}
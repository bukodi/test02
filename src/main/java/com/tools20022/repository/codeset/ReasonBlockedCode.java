package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies information about blocked accounts.
 */
public class ReasonBlockedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is part of a bankruptcy action.
	 */
	public static final MMCode Bankruptcy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bankruptcy";
			definition = "Account is part of a bankruptcy action.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "BKRP";
		}
	};
	/**
	 * Account has been given as a warranty.
	 */
	public static final MMCode Commitment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			definition = "Account has been given as a warranty.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "CMNT";
		}
	};
	/**
	 * Account is confiscated.
	 */
	public static final MMCode Confiscation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			definition = "Account is confiscated.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "CNFS";
		}
	};
	/**
	 * Account is reserved in contemplation of death.
	 */
	public static final MMCode MortisCausa = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			definition = "Account is reserved in contemplation of death.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Account has been given as pledge.
	 */
	public static final MMCode Pledged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Account has been given as pledge.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "PLDG";
		}
	};
	/**
	 * Account is being reregistered.
	 */
	public static final MMCode Reregistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			definition = "Account is being reregistered.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Account is being transferred.
	 */
	public static final MMCode Transfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Account is being transferred.";
			owner_lazy = () -> ReasonBlockedCode.mmObject();
			codeName = "TRNF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BKRP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReasonBlockedCode";
				definition = "Specifies information about blocked accounts.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReasonBlockedCode.Bankruptcy, com.tools20022.repository.codeset.ReasonBlockedCode.Commitment,
						com.tools20022.repository.codeset.ReasonBlockedCode.Confiscation, com.tools20022.repository.codeset.ReasonBlockedCode.MortisCausa, com.tools20022.repository.codeset.ReasonBlockedCode.Pledged,
						com.tools20022.repository.codeset.ReasonBlockedCode.Reregistration, com.tools20022.repository.codeset.ReasonBlockedCode.Transfer);
			}
		});
		return mmObject_lazy.get();
	}
}
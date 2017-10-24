package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason an account is blocked.
 */
public class BlockedReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Commitment.
	 */
	public static final MMCode Commitment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			definition = "Commitment.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CMMT";
		}
	};
	/**
	 * Pledged.
	 */
	public static final MMCode Pledged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Pledged.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "PLDG";
		}
	};
	/**
	 * Confiscation.
	 */
	public static final MMCode Confiscation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			definition = "Confiscation.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CNFS";
		}
	};
	/**
	 * Bankruptcy.
	 */
	public static final MMCode Bankruptcy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			definition = "Bankruptcy.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "BKRP";
		}
	};
	/**
	 * Reserved in contemplation of death.
	 */
	public static final MMCode MortisCausa = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			definition = "Reserved in contemplation of death.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Transfer.
	 */
	public static final MMCode Transfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Transfer.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Reregistration.
	 */
	public static final MMCode Reregistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			definition = "Reregistration.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "TRPE";
		}
	};
	/**
	 * Sanctions are in place.
	 */
	public static final MMCode Sanctions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sanctions";
			definition = "Sanctions are in place.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "SANC";
		}
	};
	/**
	 * Pending compliance verification.
	 */
	public static final MMCode PendingComplianceVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingComplianceVerification";
			definition = "Pending compliance verification.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "PCOM";
		}
	};
	/**
	 * Account closing is in process.
	 */
	public static final MMCode AccountClosingInProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosingInProcess";
			definition = "Account closing is in process.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Account was pending opening but is now rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Account was pending opening but is now rejected.";
			owner_lazy = () -> BlockedReasonCode.mmObject();
			codeName = "REJT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CMMT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BlockedReasonCode";
				definition = "Specifies the reason an account is blocked.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockedReasonCode.Commitment, com.tools20022.repository.codeset.BlockedReasonCode.Pledged, com.tools20022.repository.codeset.BlockedReasonCode.Confiscation,
						com.tools20022.repository.codeset.BlockedReasonCode.Bankruptcy, com.tools20022.repository.codeset.BlockedReasonCode.MortisCausa, com.tools20022.repository.codeset.BlockedReasonCode.Transfer,
						com.tools20022.repository.codeset.BlockedReasonCode.Reregistration, com.tools20022.repository.codeset.BlockedReasonCode.Sanctions, com.tools20022.repository.codeset.BlockedReasonCode.PendingComplianceVerification,
						com.tools20022.repository.codeset.BlockedReasonCode.AccountClosingInProcess, com.tools20022.repository.codeset.BlockedReasonCode.Rejected);
			}
		});
		return mmObject_lazy.get();
	}
}
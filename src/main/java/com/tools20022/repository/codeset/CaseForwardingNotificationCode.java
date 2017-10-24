package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the action requested when forwarding a case. Assignees taking the
 * decision to cancel or modify to further case assignees must communicate this
 * decision to their case assigners.
 */
public class CaseForwardingNotificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Case has been forwarded to the next party for further investigation.
	 */
	public static final MMCode FurtherInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FurtherInvestigation";
			definition = "Case has been forwarded to the next party for further investigation.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "FTHI";
		}
	};
	/**
	 * Case has been forwarded to the next party for cancellation.
	 */
	public static final MMCode RequestToCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestToCancel";
			definition = "Case has been forwarded to the next party for cancellation.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Case has been forwarded to the next party for modification.
	 */
	public static final MMCode RequestToModify = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestToModify";
			definition = "Case has been forwarded to the next party for modification.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Case has been forwarded to obtain authorisation to debit.
	 */
	public static final MMCode RequestDebitAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestDebitAuthorisation";
			definition = "Case has been forwarded to obtain authorisation to debit.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "DTAU";
		}
	};
	/**
	 * Additional information has been forwarded to the creditor.
	 */
	public static final MMCode SentAdditionalInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SentAdditionalInformation";
			definition = "Additional information has been forwarded to the creditor.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "SAIN";
		}
	};
	/**
	 * Case is taken up by an assigned agent.
	 */
	public static final MMCode FoundInvestigatingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FoundInvestigatingAgent";
			definition = "Case is taken up by an assigned agent.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "FIAG";
		}
	};
	/**
	 * Case is been handled by the assigned party.
	 */
	public static final MMCode MineInvestigationCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MineInvestigationCase";
			definition = "Case is been handled by the assigned party.";
			owner_lazy = () -> CaseForwardingNotificationCode.mmObject();
			codeName = "MINE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FTHI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseForwardingNotificationCode";
				definition = "Specifies the action requested when forwarding a case. Assignees taking the decision to cancel or modify to further case assignees must communicate this decision to their case assigners.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseForwardingNotificationCode.FurtherInvestigation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToCancel,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestToModify, com.tools20022.repository.codeset.CaseForwardingNotificationCode.RequestDebitAuthorisation,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.SentAdditionalInformation, com.tools20022.repository.codeset.CaseForwardingNotificationCode.FoundInvestigatingAgent,
						com.tools20022.repository.codeset.CaseForwardingNotificationCode.MineInvestigationCase);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for rejecting an investigation case.
 */
public class InvestigationRejectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying instruction can not be found.
	 */
	public static final MMCode UnderlyingPaymentNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingPaymentNotFound";
			definition = "Underlying instruction can not be found.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "NFND";
		}
	};
	/**
	 * Case assignee is not allowed to investigate on this instruction or a
	 * party has been by-passed in the payment chain or no bilateral agreement
	 * has been established for this type of query.
	 */
	public static final MMCode NotAuthorisedToInvestigate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorisedToInvestigate";
			definition = "Case assignee is not allowed to investigate on this instruction or a party has been by-passed in the payment chain or no bilateral agreement has been established for this type of query.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Case has never been assigned before.
	 */
	public static final MMCode UnknownCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCase";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Used when the payment instruction has previously been cancelled or
	 * rejected.
	 */
	public static final MMCode PaymentPreviouslyCancelledOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			definition = "Used when the payment instruction has previously been cancelled or rejected.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "PCOR";
		}
	};
	/**
	 * Wrong message has been used in the investigation workflow.
	 */
	public static final MMCode WrongMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongMessage";
			definition = "Wrong message has been used in the investigation workflow.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "WMSG";
		}
	};
	/**
	 * Used to reject a non-cash related query that is not covered in the
	 * workflow.
	 */
	public static final MMCode RejectNonCashRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectNonCashRelated";
			definition = "Used to reject a non-cash related query that is not covered in the workflow.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "RNCR";
		}
	};
	/**
	 * Resolution of Investigation has not been received on reopened case.
	 */
	public static final MMCode MissingResolutionOfInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResolutionOfInvestigation";
			definition = "Resolution of Investigation has not been received on reopened case.";
			owner_lazy = () -> InvestigationRejectionCode.mmObject();
			codeName = "MROI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NFND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationRejectionCode";
				definition = "Specifies the reason for rejecting an investigation case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationRejectionCode.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.InvestigationRejectionCode.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.InvestigationRejectionCode.UnknownCase, com.tools20022.repository.codeset.InvestigationRejectionCode.PaymentPreviouslyCancelledOrRejected,
						com.tools20022.repository.codeset.InvestigationRejectionCode.WrongMessage, com.tools20022.repository.codeset.InvestigationRejectionCode.RejectNonCashRelated,
						com.tools20022.repository.codeset.InvestigationRejectionCode.MissingResolutionOfInvestigation);
			}
		});
		return mmObject_lazy.get();
	}
}
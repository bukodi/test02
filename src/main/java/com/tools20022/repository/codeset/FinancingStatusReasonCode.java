package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the coded reason for the financing status.
 */
public class FinancingStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation request message was received after the end of the financing
	 * process previously activated.
	 */
	public static final MMCode CancellationRequestOutOfTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestOutOfTime";
			definition = "Cancellation request message was received after the end of the financing process previously activated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA01";
		}
	};
	/**
	 * Cancellation request does not match with an invoice financing request
	 * received previously.
	 */
	public static final MMCode NoMatchingFinancingRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingFinancingRequest";
			definition = "Cancellation request does not match with an invoice financing request received previously.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA02";
		}
	};
	/**
	 * Format of the account number specified is not correct.
	 */
	public static final MMCode IncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			definition = "Format of the account number specified is not correct.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC01";
		}
	};
	/**
	 * Account number specified has been closed on the Receiver's books.
	 */
	public static final MMCode ClosedAccountNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			definition = "Account number specified has been closed on the Receiver's books.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC04";
		}
	};
	/**
	 * Account specified is blocked, prohibiting posting of transactions against
	 * it.
	 */
	public static final MMCode BlockedAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			definition = "Account specified is blocked, prohibiting posting of transactions against it.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "AC06";
		}
	};
	/**
	 * Party who sent the request message is not recognised by the first agent.
	 */
	public static final MMCode UnrecognisedFinancingRequestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedFinancingRequestor";
			definition = "Party who sent the request message is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE08";
		}
	};
	/**
	 * Party who forwarded the request message is not recognised by the first
	 * agent.
	 */
	public static final MMCode UnrecognisedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIntermediaryAgent";
			definition = "Party who forwarded the request message is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE09";
		}
	};
	/**
	 * Financing Requestor is expected to send requests through a different
	 * Intermediary Agent.
	 */
	public static final MMCode UnexpectedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedIntermediaryAgent";
			definition = "Financing Requestor is expected to send requests through a different Intermediary Agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE10";
		}
	};
	/**
	 * Party is not recognised by the first agent.
	 */
	public static final MMCode UnrecognisedParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedParty";
			definition = "Party is not recognised by the first agent.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "BE11";
		}
	};
	/**
	 * PaymentDueDate is occurring before the request message creation date.
	 */
	public static final MMCode InvalidPaymentDueDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPaymentDueDate";
			definition = "PaymentDueDate is occurring before the request message creation date.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "DT02";
		}
	};
	/**
	 * Request message received appears to have been duplicated.
	 */
	public static final MMCode DuplicatedRequestMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatedRequestMessage";
			definition = "Request message received appears to have been duplicated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID01";
		}
	};
	/**
	 * Request message received appears to have a wrong identification.
	 */
	public static final MMCode WrongIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongIdentification";
			definition = "Request message received appears to have a wrong identification.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID02";
		}
	};
	/**
	 * Document number is invalid.
	 */
	public static final MMCode InvalidDocumentNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDocumentNumber";
			definition = "Document number is invalid.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "ID03";
		}
	};
	/**
	 * Information bilateral agreed as mandatory is missing.
	 */
	public static final MMCode MissingMandatoryInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMandatoryInformation";
			definition = "Information bilateral agreed as mandatory is missing.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "MI01";
		}
	};
	/**
	 * Reason is provided as narrative information in the additional reason
	 * information.
	 */
	public static final MMCode Narrative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			definition = "Reason is provided as narrative information in the additional reason information.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "NA01";
		}
	};
	/**
	 * Cancellation request was correctly received but the financing process has
	 * already been initiated.
	 */
	public static final MMCode FinancingProcessAlreadyInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingProcessAlreadyInitiated";
			definition = "Cancellation request was correctly received but the financing process has already been initiated.";
			owner_lazy = () -> FinancingStatusReasonCode.mmObject();
			codeName = "CA03";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CA01");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancingStatusReasonCode";
				definition = "Specifies the coded reason for the financing status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancingStatusReasonCode.CancellationRequestOutOfTime, com.tools20022.repository.codeset.FinancingStatusReasonCode.NoMatchingFinancingRequest,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.IncorrectAccountNumber, com.tools20022.repository.codeset.FinancingStatusReasonCode.ClosedAccountNumber,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.BlockedAccount, com.tools20022.repository.codeset.FinancingStatusReasonCode.UnrecognisedFinancingRequestor,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.UnrecognisedIntermediaryAgent, com.tools20022.repository.codeset.FinancingStatusReasonCode.UnexpectedIntermediaryAgent,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.UnrecognisedParty, com.tools20022.repository.codeset.FinancingStatusReasonCode.InvalidPaymentDueDate,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.DuplicatedRequestMessage, com.tools20022.repository.codeset.FinancingStatusReasonCode.WrongIdentification,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.InvalidDocumentNumber, com.tools20022.repository.codeset.FinancingStatusReasonCode.MissingMandatoryInformation,
						com.tools20022.repository.codeset.FinancingStatusReasonCode.Narrative, com.tools20022.repository.codeset.FinancingStatusReasonCode.FinancingProcessAlreadyInitiated);
			}
		});
		return mmObject_lazy.get();
	}
}
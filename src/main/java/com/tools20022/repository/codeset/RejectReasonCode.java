package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason of transmission of a rejection message in response to a request or an
 * advice.
 */
public class RejectReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Not possible to process the message, for instance the security module is
	 * unavailable, the hardware is unavailable, or there is a problem of
	 * resource.
	 */
	public static final MMCode UnableToProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnableToProcess";
			definition = "Not possible to process the message, for instance the security module is unavailable, the hardware is unavailable, or there is a problem of resource.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "UNPR";
		}
	};
	/**
	 * Invalid envelope of the message.
	 */
	public static final MMCode InvalidMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidMessage";
			definition = "Invalid envelope of the message.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "IMSG";
		}
	};
	/**
	 * Invalid message: At least one of the data element or data structure is
	 * not present , the format, or the content of one data element or one data
	 * structure is not correct.
	 */
	public static final MMCode ParsingError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParsingError";
			definition = "Invalid message:  At least one of the data element or data structure is not present , the format, or the content of one data element or one data structure is not correct.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "PARS";
		}
	};
	/**
	 * Security error (for example an invalid key or an incorrect MAC value).
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security error (for example an invalid key or an incorrect MAC value).";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Invalid identification data for the sender.
	 */
	public static final MMCode InitiatingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitiatingParty";
			definition = "Invalid identification data for the sender.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "INTP";
		}
	};
	/**
	 * Invalid identification data for the the receiver.
	 */
	public static final MMCode RecipientParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecipientParty";
			definition = "Invalid identification data for the the receiver.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "RCPP";
		}
	};
	/**
	 * Duplicate message, the identification of the exchange is the same than a
	 * previous message.
	 */
	public static final MMCode DuplicateMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateMessage";
			definition = "Duplicate message, the identification of the exchange is the same than a previous message.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "DPMG";
		}
	};
	/**
	 * Version of the protocol couldn't be supported by the recipient.
	 */
	public static final MMCode ProtocolVersion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the protocol couldn't be supported by the recipient.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "VERS";
		}
	};
	/**
	 * Type of message the recipient receives is unknow or unsupported.
	 */
	public static final MMCode MessageType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MessageType";
			definition = "Type of message the recipient receives is unknow or unsupported.";
			owner_lazy = () -> RejectReasonCode.mmObject();
			codeName = "MSGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UNPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectReasonCode";
				definition = "Reason of transmission of a rejection message in response to a request or an advice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectReasonCode.UnableToProcess, com.tools20022.repository.codeset.RejectReasonCode.InvalidMessage,
						com.tools20022.repository.codeset.RejectReasonCode.ParsingError, com.tools20022.repository.codeset.RejectReasonCode.Security, com.tools20022.repository.codeset.RejectReasonCode.InitiatingParty,
						com.tools20022.repository.codeset.RejectReasonCode.RecipientParty, com.tools20022.repository.codeset.RejectReasonCode.DuplicateMessage, com.tools20022.repository.codeset.RejectReasonCode.ProtocolVersion,
						com.tools20022.repository.codeset.RejectReasonCode.MessageType);
			}
		});
		return mmObject_lazy.get();
	}
}
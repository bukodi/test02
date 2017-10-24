package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Final result of the processed terminal management action.
 */
public class TerminalManagementActionResultCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Access is denied while performing the action.
	 */
	public static final MMCode AccessDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccessDenied";
			definition = "Access is denied while performing the action.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "ACCD";
		}
	};
	/**
	 * Problem to connect while performing the action.
	 */
	public static final MMCode ConnectionError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConnectionError";
			definition = "Problem to connect while performing the action.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "CNTE";
		}
	};
	/**
	 * Data transferred has a wrong format.
	 */
	public static final MMCode FormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormatError";
			definition = "Data transferred has a wrong format.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "FMTE";
		}
	};
	/**
	 * Content of the data is invalid.
	 */
	public static final MMCode InvalidContent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvalidContent";
			definition = "Content of the data is invalid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "INVC";
		}
	};
	/**
	 * Data transferred has a wrong length.
	 */
	public static final MMCode LengthError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LengthError";
			definition = "Data transferred has a wrong length.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "LENE";
		}
	};
	/**
	 * Memory to store the date exceeded.
	 */
	public static final MMCode MemoryOverflow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemoryOverflow";
			definition = "Memory to store the date exceeded.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Data set to be maintained is missing.
	 */
	public static final MMCode MissingFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingFile";
			definition = "Data set to be maintained is missing.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "MISS";
		}
	};
	/**
	 * Action is not supported.
	 */
	public static final MMCode NotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotSupported";
			definition = "Action is not supported.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "NSUP";
		}
	};
	/**
	 * Data transferred has a wrong digital signature.
	 */
	public static final MMCode SignatureError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureError";
			definition = "Data transferred has a wrong digital signature.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "SIGE";
		}
	};
	/**
	 * Action was successfully performed.
	 */
	public static final MMCode Success = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Success";
			definition = "Action was successfully performed.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "SUCC";
		}
	};
	/**
	 * Data transferred has a wrong syntax.
	 */
	public static final MMCode SyntaxError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SyntaxError";
			definition = "Data transferred has a wrong syntax.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "SYNE";
		}
	};
	/**
	 * Timeout expired during the data transfer.
	 */
	public static final MMCode Timeout = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Timeout";
			definition = "Timeout expired during the data transfer.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "TIMO";
		}
	};
	/**
	 * Data set identification invalid.
	 */
	public static final MMCode UnknownData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownData";
			definition = "Data set identification invalid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "UKDT";
		}
	};
	/**
	 * Cryptographic key reference used for the data signature is not valid.
	 */
	public static final MMCode UnknownKeyReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownKeyReference";
			definition = "Cryptographic key reference used for the data signature is not valid.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "UKRF";
		}
	};
	/**
	 * Hardware error.
	 */
	public static final MMCode Hardware = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			definition = "Hardware error.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "HRDW";
		}
	};
	/**
	 * Security error.
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Security error.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * The content analysis of the AcceptorConfigurationUpdate reveals
	 * unexpected parameters.
	 */
	public static final MMCode DelegationParametersReceivedUnauthorized = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			definition = "The content analysis of the AcceptorConfigurationUpdate reveals unexpected parameters.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "DPRU";
		}
	};
	/**
	 * One action of the AcceptorManagementPlan refers to an update unauthorized
	 * by the delegation.
	 */
	public static final MMCode InvalidDelegationInManagementPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			definition = "One action of the AcceptorManagementPlan refers to an update unauthorized by the delegation.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "IDMP";
		}
	};
	/**
	 * Delegation Proof transmitted by the delegated TMS is not the one
	 * expected.
	 */
	public static final MMCode InvalidDelegationProof = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			definition = "Delegation Proof transmitted by the delegated TMS is not the one expected.";
			owner_lazy = () -> TerminalManagementActionResultCode.mmObject();
			codeName = "INDP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResultCode";
				definition = "Final result of the processed terminal management action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResultCode.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResultCode.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResultCode.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResultCode.UnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.Hardware, com.tools20022.repository.codeset.TerminalManagementActionResultCode.Security,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized, com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResultCode.InvalidDelegationProof);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Action to perform in case of error during the action in progress.
 */
public class TerminalManagementErrorActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ignore the error.
	 */
	public static final MMCode IgnoreError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IgnoreError";
			definition = "Ignore the error.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "IGNR";
		}
	};
	/**
	 * Send a status report immediately.
	 */
	public static final MMCode SendStatusReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SendStatusReport";
			definition = "Send a status report immediately.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "SDSR";
		}
	};
	/**
	 * Stop the current sequence of terminal management actions without any
	 * action, and do not notice the error with a status report.
	 */
	public static final MMCode StopSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopSequence";
			definition = "Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "STOP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("IGNR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementErrorActionCode";
				definition = "Action to perform in case of error during the action in progress.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementErrorActionCode.IgnoreError, com.tools20022.repository.codeset.TerminalManagementErrorActionCode.SendStatusReport,
						com.tools20022.repository.codeset.TerminalManagementErrorActionCode.StopSequence);
			}
		});
		return mmObject_lazy.get();
	}
}
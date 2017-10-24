package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an investigation case.
 */
public class CaseStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Case has been closed.
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "Case has been closed.";
			owner_lazy = () -> CaseStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * Case has been assigned to another party.
	 */
	public static final MMCode Assigned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assigned";
			definition = "Case has been assigned to another party.";
			owner_lazy = () -> CaseStatusCode.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * Case is currently under investigation.
	 */
	public static final MMCode UnderInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderInvestigation";
			definition = "Case is currently under investigation.";
			owner_lazy = () -> CaseStatusCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Case has never been assigned before.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> CaseStatusCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Investigation is taking too long.
	 */
	public static final MMCode Overdue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Overdue";
			definition = "Investigation is taking too long.";
			owner_lazy = () -> CaseStatusCode.mmObject();
			codeName = "ODUE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CLSD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseStatusCode";
				definition = "Specifies the status of an investigation case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseStatusCode.Closed, com.tools20022.repository.codeset.CaseStatusCode.Assigned, com.tools20022.repository.codeset.CaseStatusCode.UnderInvestigation,
						com.tools20022.repository.codeset.CaseStatusCode.Unknown, com.tools20022.repository.codeset.CaseStatusCode.Overdue);
			}
		});
		return mmObject_lazy.get();
	}
}
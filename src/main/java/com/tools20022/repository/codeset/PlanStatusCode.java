package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a plan.
 */
public class PlanStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Plan is active.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			definition = "Plan is active.";
			owner_lazy = () -> PlanStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Plan is suspended.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Plan is suspended.";
			owner_lazy = () -> PlanStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Plan is closed.
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			definition = "Plan is closed.";
			owner_lazy = () -> PlanStatusCode.mmObject();
			codeName = "CLOS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PlanStatusCode";
				definition = "Specifies the status of a plan.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PlanStatusCode.Active, com.tools20022.repository.codeset.PlanStatusCode.Suspended, com.tools20022.repository.codeset.PlanStatusCode.Closed);
			}
		});
		return mmObject_lazy.get();
	}
}
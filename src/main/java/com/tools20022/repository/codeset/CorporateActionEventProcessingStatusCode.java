package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the stage in the corporate action event life cycle.
 */
public class CorporateActionEventProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that a corporate action event processing has been completed.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Specifies that a corporate action event processing has been completed.";
			owner_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Specifies that a corporate action event processing has not been
	 * completed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Specifies that a corporate action event processing has not been completed.";
			owner_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Corporate action event processing specifying that the funds paid have
	 * been reconciled with the funds received from the agent (meaning that
	 * there is no more risk of payment to be reversed).
	 */
	public static final MMCode Reconciled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciled";
			definition = "Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed).";
			owner_lazy = () -> CorporateActionEventProcessingStatusCode.mmObject();
			codeName = "RECD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingStatusCode";
				definition = "Specifies the stage in the corporate action event life cycle.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Complete, com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.CorporateActionEventProcessingStatusCode.Reconciled);
			}
		});
		return mmObject_lazy.get();
	}
}
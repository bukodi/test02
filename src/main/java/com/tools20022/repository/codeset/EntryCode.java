package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of an entry in a report.
 */
public class EntryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trial pay-in schedule.
	 */
	public static final MMCode Trial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trial";
			definition = "Trial pay-in schedule.";
			owner_lazy = () -> EntryCode.mmObject();
			codeName = "TRIA";
		}
	};
	/**
	 * Official pay-in schedule.
	 */
	public static final MMCode Official = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Official";
			definition = "Official pay-in schedule.";
			owner_lazy = () -> EntryCode.mmObject();
			codeName = "OFFI";
		}
	};
	/**
	 * Pay-in schedule on request.
	 */
	public static final MMCode Requested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Pay-in schedule on request.";
			owner_lazy = () -> EntryCode.mmObject();
			codeName = "REQU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TRIA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EntryCode";
				definition = "Specifies the type of an entry in a report.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EntryCode.Trial, com.tools20022.repository.codeset.EntryCode.Official, com.tools20022.repository.codeset.EntryCode.Requested);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the obligation.
 */
public class ObligationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the obligation is related to a failed trade.
	 */
	public static final MMCode Fails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fails";
			definition = "Specifies that the obligation is related to a failed trade.";
			owner_lazy = () -> ObligationTypeCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Specifies that the obligation is related to new a trade.
	 */
	public static final MMCode New = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			definition = "Specifies that the obligation is related to new a trade.";
			owner_lazy = () -> ObligationTypeCode.mmObject();
			codeName = "NEW1";
		}
	};
	/**
	 * Specifies that the obligation is related to a corporate event.
	 */
	public static final MMCode CorporateEvent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateEvent";
			definition = "Specifies that the obligation is related to a corporate event.";
			owner_lazy = () -> ObligationTypeCode.mmObject();
			codeName = "COEV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ObligationTypeCode";
				definition = "Specifies the type of the obligation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ObligationTypeCode.Fails, com.tools20022.repository.codeset.ObligationTypeCode.New, com.tools20022.repository.codeset.ObligationTypeCode.CorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}
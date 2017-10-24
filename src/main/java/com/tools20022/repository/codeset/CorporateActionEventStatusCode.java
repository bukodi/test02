package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the CA event or option.
 */
public class CorporateActionEventStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The CA event is active.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The CA event is active.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "ACTI";
		}
	};
	/**
	 * The CA event is deactivated. The clients cannot send instruction anymore.
	 */
	public static final MMCode Deactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The CA event is deactivated. The clients cannot send instruction anymore.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The CA event is expired, no more processing, claims, transformations take
	 * place.
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "The CA event is expired, no more processing, claims, transformations take place.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * The CA event is cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "The CA event is cancelled.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * The CA event is withrawn, ie, cancelled by the market.
	 */
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "The CA event is withrawn, ie, cancelled by the market.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, eg, expired
	 * option.
	 */
	public static final MMCode Inactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.";
			owner_lazy = () -> CorporateActionEventStatusCode.mmObject();
			codeName = "INAC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStatusCode";
				definition = "Specifies the status of the CA event or option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStatusCode.Active, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Expired, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Cancelled,
						com.tools20022.repository.codeset.CorporateActionEventStatusCode.Withdrawn, com.tools20022.repository.codeset.CorporateActionEventStatusCode.Inactive);
			}
		});
		return mmObject_lazy.get();
	}
}
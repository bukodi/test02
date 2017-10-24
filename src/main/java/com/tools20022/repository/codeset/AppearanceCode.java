package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the deliverability of a security.
 */
public class AppearanceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical certificates exist.
	 */
	public static final MMCode Deliverable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deliverable";
			definition = "Physical certificates exist.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * Not yet deliverable contract.
	 */
	public static final MMCode NotDeliverable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotDeliverable";
			definition = "Not yet deliverable contract.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "NDEL";
		}
	};
	/**
	 * Limited or partial deliverability.
	 */
	public static final MMCode Limited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Limited";
			definition = "Limited or partial deliverability.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "LIMI";
		}
	};
	/**
	 * Security exists only as an electronic record, ie, there are no physical
	 * certificates representing the security.
	 */
	public static final MMCode BookEntry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Security exists only as an electronic record, ie, there are no physical certificates representing the security.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "BENT";
		}
	};
	/**
	 * Deferred printing, book entry.
	 */
	public static final MMCode DeferredBookEntry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeferredBookEntry";
			definition = "Deferred printing, book entry.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DFBE";
		}
	};
	/**
	 * Deliverable, book entry.
	 */
	public static final MMCode DeliverableBookEntry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliverableBookEntry";
			definition = "Deliverable, book entry.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "DLBE";
		}
	};
	/**
	 * Deferred printing, global certificate.
	 */
	public static final MMCode TemporaryGlobal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TemporaryGlobal";
			definition = "Deferred printing, global certificate.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "TMPG";
		}
	};
	/**
	 * Not deliverable, global certificate.
	 */
	public static final MMCode Global = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Global";
			definition = "Not deliverable, global certificate.";
			owner_lazy = () -> AppearanceCode.mmObject();
			codeName = "GLOB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DELI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AppearanceCode";
				definition = "Specifies the deliverability of a security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AppearanceCode.Deliverable, com.tools20022.repository.codeset.AppearanceCode.NotDeliverable, com.tools20022.repository.codeset.AppearanceCode.Limited,
						com.tools20022.repository.codeset.AppearanceCode.BookEntry, com.tools20022.repository.codeset.AppearanceCode.DeferredBookEntry, com.tools20022.repository.codeset.AppearanceCode.DeliverableBookEntry,
						com.tools20022.repository.codeset.AppearanceCode.TemporaryGlobal, com.tools20022.repository.codeset.AppearanceCode.Global);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of event processing.
 */
public class CorporateActionEventProcessingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No debit or credit of resources.
	 */
	public static final MMCode General = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "General";
			definition = "No debit or credit of resources.";
			owner_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "GENL";
		}
	};
	/**
	 * Holder of the relevant security on a certain date, for example, the
	 * record date, will receive a benefit without giving up the underlying
	 * security.
	 */
	public static final MMCode Distribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Holder of the relevant security on a certain date, for example, the record date, will receive a benefit without giving up the underlying security.";
			owner_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "DISN";
		}
	};
	/**
	 * Underlying security will be debited and may be replaced by another
	 * resource (or resources).
	 */
	public static final MMCode Reorganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reorganisation";
			definition = "Underlying security will be debited and may be replaced by another resource (or resources).";
			owner_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
			codeName = "REOR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GENL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingTypeCode";
				definition = "Specifies the type of event processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.General, com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.Distribution,
						com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode.Reorganisation);
			}
		});
		return mmObject_lazy.get();
	}
}
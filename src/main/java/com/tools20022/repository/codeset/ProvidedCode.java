package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether items have been provided.
 */
public class ProvidedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provided.
	 */
	public static final MMCode Provided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Provided";
			definition = "Provided.";
			owner_lazy = () -> ProvidedCode.mmObject();
			codeName = "PROV";
		}
	};
	/**
	 * Not provided.
	 */
	public static final MMCode NotProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotProvided";
			definition = "Not provided.";
			owner_lazy = () -> ProvidedCode.mmObject();
			codeName = "NPRO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProvidedCode";
				definition = "Specifies whether items have been provided.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProvidedCode.Provided, com.tools20022.repository.codeset.ProvidedCode.NotProvided);
			}
		});
		return mmObject_lazy.get();
	}
}
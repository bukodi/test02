package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the garnishment type as published in an external document type code
 * list.
 */
public class ExternalGarnishmentType1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalGarnishmentType1Code";
				definition = "Specifies the garnishment type as published in an external document type code list.";
			}
		});
		return mmObject_lazy.get();
	}
}
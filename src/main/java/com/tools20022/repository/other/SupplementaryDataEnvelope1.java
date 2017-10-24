package com.tools20022.repository.other;

import com.tools20022.metamodel.MMExternalSchema;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technical component that contains the validated supplementary data
 * information. This technical envelope allows to segregate the supplementary
 * data information from any other information.
 */
public class SupplementaryDataEnvelope1 {

	final static private AtomicReference<MMExternalSchema> mmObject_lazy = new AtomicReference<>();

	final static public MMExternalSchema mmObject() {
		mmObject_lazy.compareAndSet(null, new MMExternalSchema() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SupplementaryDataEnvelope1";
				definition = "Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information.";
				processContent = com.tools20022.metamodel.MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}
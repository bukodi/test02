package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifier of a security assigned by the Consolidated Tape Association.
 */
public class ConsolidatedTapeAssociationIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("483894");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConsolidatedTapeAssociationIdentifier";
				definition = "Identifier of a security assigned by the Consolidated Tape Association.";
				identificationScheme = "CTAIdentifier; CTAIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
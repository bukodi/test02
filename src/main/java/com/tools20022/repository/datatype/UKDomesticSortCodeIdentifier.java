package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * United Kingdom (UK) Sort Code. Identifies British financial institutions on
 * the British national clearing systems. The sort code is assigned by the
 * Association for Payments and Clearing Services (APACS).
 */
public class UKDomesticSortCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SC123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UKDomesticSortCodeIdentifier";
				definition = "United Kingdom (UK) Sort Code. Identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
				identificationScheme = "Association for Payment Clearing Services (APACS); UK Sort Code";
			}
		});
		return mmObject_lazy.get();
	}
}
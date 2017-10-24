package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Fedwire Routing Number. Identifies financial institutions, in the US, on the
 * FedWire system. The routing number is assigned by the American Bankers
 * Association (ABA).
 */
public class FedwireRoutingNumberIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FW123456789");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FedwireRoutingNumberIdentifier";
				definition = "Fedwire Routing Number. Identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
				identificationScheme = "US Federal Reserve Bank ; FedwireRoutingNumberIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
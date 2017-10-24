package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifier of securities issued in Luxembourg. The common code is a 9-digit
 * code that replaces the CEDEL (Clearstream) and Euroclear codes.
 */
public class EuroclearClearstreamIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("12197");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EuroclearClearstreamIdentifier";
				definition = "Identifier of securities issued in Luxembourg. The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
				identificationScheme = "Clearstream; EuroclearClearstreamIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
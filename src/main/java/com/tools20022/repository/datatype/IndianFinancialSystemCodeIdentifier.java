package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indian Financial System Code Identifier. Identifies Indian financial
 * institutions on the Indian national clearing system.
 */
public class IndianFinancialSystemCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("IN12azBX12345");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IndianFinancialSystemCodeIdentifier";
				definition = "Indian Financial System Code Identifier. Identifies Indian financial institutions on the Indian national clearing system.";
				identificationScheme = "Indian Financial System; Payment Routing Number";
			}
		});
		return mmObject_lazy.get();
	}
}
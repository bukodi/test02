package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Stock Exchange Daily Official List (SEDOL) number. A code used by the London
 * Stock Exchange to identify foreign stocks, especially those that aren't
 * actively traded in the US and don't have a CUSIP number.
 */
public class SEDOLIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("5719210");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SEDOLIdentifier";
				definition = "Stock Exchange Daily Official List (SEDOL) number. A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
				identificationScheme = "London Stock Exchange; SEDOLIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
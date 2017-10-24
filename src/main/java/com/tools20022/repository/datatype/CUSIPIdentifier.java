package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Committee on Uniform Securities and Identification Procedures (CUSIP). The
 * standards body that created and maintains the securities classification
 * system in the US. Non-US securities have a similar number called the CINS
 * number.
 */
public class CUSIPIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("3134A33L8");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CUSIPIdentifier";
				definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. Non-US securities have a similar number called the CINS number.";
				identificationScheme = "Standards and Poor's CUSIP Service Bureau; CUSIPIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
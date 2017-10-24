package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifier of a security assigned by the Japanese QUICK identification scheme
 * for financial instruments.
 */
public class QUICKIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("97334");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QUICKIdentifier";
				definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
				identificationScheme = "QUICK;  QUICKIdentifier";
			}
		});
		return mmObject_lazy.get();
	}
}
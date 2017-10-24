package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Global Location Number. A non-significant reference number used to identify
 * legal entities, functional entities or physical entities according to the
 * European Association for Numbering (EAN) numbering scheme rules. The number
 * is used to retrieve the detailed information linked to it.
 */
public class EANGLNIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("7265658971233");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EANGLNIdentifier";
				definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve the detailed information linked to it.";
				identificationScheme = "European Association for Numbering; EAN Global Location Number";
			}
		});
		return mmObject_lazy.get();
	}
}
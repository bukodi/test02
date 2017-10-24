package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMBinary;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a binary string with a maximum length of 10000 binary bytes.
 */
public class Max10000Binary {

	final static private AtomicReference<MMBinary> mmObject_lazy = new AtomicReference<>();

	final static public MMBinary mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBinary() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Max10000Binary";
				definition = "Specifies a binary string with a maximum length of 10000 binary bytes.";
				minLength = 1;
				maxLength = 10000;
			}
		});
		return mmObject_lazy.get();
	}
}
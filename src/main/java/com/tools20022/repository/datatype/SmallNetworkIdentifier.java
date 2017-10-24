package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The small network list of the Australian Bank State Branch (BSB) Code. The
 * codes are used for identifying Australian financial institutions, as assigned
 * by the Australian Payments Clearing Association (APCA).
 */
public class SmallNetworkIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AU123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SmallNetworkIdentifier";
				definition = "The small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
				identificationScheme = "Australian Payments Clearing Association (APCA); Australian BSB";
			}
		});
		return mmObject_lazy.get();
	}
}
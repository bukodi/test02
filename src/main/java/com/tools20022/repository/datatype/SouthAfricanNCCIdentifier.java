package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * South African National Clearing Code (NCC). Identifies South African
 * financial institutions on the South African national clearing system. The
 * code is assigned by the South African Bankers Services Company Ltd.
 * (BankServ).
 */
public class SouthAfricanNCCIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ZA123456");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SouthAfricanNCCIdentifier";
				definition = "South African National Clearing Code (NCC). Identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
				identificationScheme = "South African Bankers Services Company Ltd (Bank Serv); South African National Clearing system Code";
			}
		});
		return mmObject_lazy.get();
	}
}
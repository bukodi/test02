package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the external family code of the bank transaction code in the format
 * of character string with a maximum length of 4 characters.<br>
 * The list of valid codes is an external code list published separately, and is
 * a sub-list of the bank transaction domain list.<br>
 * External code sets can be downloaded from www.iso20022.org.
 */
public class ExternalBankTransactionFamilyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("F001");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalBankTransactionFamilyCode";
				definition = "Specifies the external family code of the bank transaction code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately, and is a sub-list of the bank transaction domain list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}
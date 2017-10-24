package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines how a warrant can be exercised.
 */
public class WarrantStyleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option that can be exercised on expiry date only.
	 */
	public static final MMCode European = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "European";
			definition = "Option that can be exercised on expiry date only.";
			owner_lazy = () -> WarrantStyleCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Option can be exercised before or on expiry date.
	 */
	public static final MMCode American = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "American";
			definition = "Option can be exercised before or on expiry date.";
			owner_lazy = () -> WarrantStyleCode.mmObject();
			codeName = "AMER";
		}
	};
	/**
	 * Option that can be exercised on multiple discrete dates prior to, or on
	 * expiry date.
	 */
	public static final MMCode Bermudan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bermudan";
			definition = "Option that can be exercised on multiple discrete dates prior to, or on expiry date.";
			owner_lazy = () -> WarrantStyleCode.mmObject();
			codeName = "BERM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EURO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "WarrantStyleCode";
				definition = "Defines how a warrant can be exercised.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WarrantStyleCode.European, com.tools20022.repository.codeset.WarrantStyleCode.American, com.tools20022.repository.codeset.WarrantStyleCode.Bermudan);
			}
		});
		return mmObject_lazy.get();
	}
}
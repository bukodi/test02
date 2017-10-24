package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies that the transaction has been modified.
 */
public class ModifiedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Modification of a transaction by the account owner.
	 */
	public static final MMCode ModifiedByYourself = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedByYourself";
			definition = "Modification of a transaction by the account owner.";
			owner_lazy = () -> ModifiedStatusReasonCode.mmObject();
			codeName = "MDBY";
		}
	};
	/**
	 * Other. See Narrative.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> ModifiedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MDBY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModifiedStatusReasonCode";
				definition = "Specifies that the transaction has been modified.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModifiedStatusReasonCode.ModifiedByYourself, com.tools20022.repository.codeset.ModifiedStatusReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}
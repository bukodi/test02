package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether capital gain is in the scope of the European directive on
 * taxation of savings income in the form of interest payments (Council
 * Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or
 * redemption of shares and units etc.
 */
public class EUCapitalGainCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Capital gain is in the scope of the directive.
	 */
	public static final MMCode CapitalGainInScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGainInScope";
			definition = "Capital gain is in the scope of the directive.";
			owner_lazy = () -> EUCapitalGainCode.mmObject();
			codeName = "EUSI";
		}
	};
	/**
	 * Capital gain is out of the scope of the directive.
	 */
	public static final MMCode CapitalGainOutScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGainOutScope";
			definition = "Capital gain is out of the scope of the directive.";
			owner_lazy = () -> EUCapitalGainCode.mmObject();
			codeName = "EUSO";
		}
	};
	/**
	 * Unknown whether capital gain is in or out of the scope of the directive.
	 */
	public static final MMCode CapitalGainUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGainUnknown";
			definition = "Unknown whether capital gain is in or out of the scope of the directive.";
			owner_lazy = () -> EUCapitalGainCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Another type of EU capital gain.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of EU capital gain.";
			owner_lazy = () -> EUCapitalGainCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EUCapitalGainCode";
				definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or redemption of shares and units etc.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainInScope, com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainOutScope,
						com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainUnknown, com.tools20022.repository.codeset.EUCapitalGainCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}
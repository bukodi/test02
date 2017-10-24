package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by
 * the Internal Revenue Service under which the security is issued.
 */
public class TEFRARulesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the security is issued under the TEFRA rule C.
	 */
	public static final MMCode C = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "C";
			definition = "Indicates that the security is issued under the TEFRA rule C.";
			owner_lazy = () -> TEFRARulesCode.mmObject();
			codeName = "RULC";
		}
	};
	/**
	 * Indicates that the security is issued under the TEFRA rule D.
	 */
	public static final MMCode D = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "D";
			definition = "Indicates that the security is issued under the TEFRA rule D.";
			owner_lazy = () -> TEFRARulesCode.mmObject();
			codeName = "RULD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RULC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TEFRARulesCode";
				definition = "Indicates the Tax Equity and Fiscal Responsibility Act (TEFRA) rule levied by the Internal Revenue Service under which the security is issued.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TEFRARulesCode.C, com.tools20022.repository.codeset.TEFRARulesCode.D);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the tax role capacity of the instructing party.
 */
public class TaxLiabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement party is acting as a principal for tax liability.
	 */
	public static final MMCode TaxPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPrincipal";
			definition = "Settlement party is acting as a principal for tax liability.";
			owner_lazy = () -> TaxLiabilityCode.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Settlement party is acting as an agent for tax liability.
	 */
	public static final MMCode TaxAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAgent";
			definition = "Settlement party is acting as an agent for tax liability.";
			owner_lazy = () -> TaxLiabilityCode.mmObject();
			codeName = "AGEN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxLiabilityCode";
				definition = "Specifies the tax role capacity of the instructing party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxLiabilityCode.TaxPrincipal, com.tools20022.repository.codeset.TaxLiabilityCode.TaxAgent);
			}
		});
		return mmObject_lazy.get();
	}
}
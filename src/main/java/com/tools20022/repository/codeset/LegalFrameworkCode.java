package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the legal framework of the transaction.
 */
public class LegalFrameworkCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to the French legal framework for repos, that is, relates to a
	 * "Pension Livrée".
	 */
	public static final MMCode PensionLivree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionLivree";
			definition = "Relates to the French legal framework for repos, that is, relates to a \"Pension Livrée\".";
			owner_lazy = () -> LegalFrameworkCode.mmObject();
			codeName = "FRAN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FRAN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegalFrameworkCode";
				definition = "Identifies the legal framework of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalFrameworkCode.PensionLivree);
			}
		});
		return mmObject_lazy.get();
	}
}
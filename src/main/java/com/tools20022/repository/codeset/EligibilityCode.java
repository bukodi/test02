package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of investor. The rules that apply to each type of client
 * are different.
 */
public class EligibilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Eligible customers are the most sophisticated level of investor, able to
	 * opt out of some the protections afforded by conduct of business rules.
	 */
	public static final MMCode EligibleCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleCounterparty";
			definition = "Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules.";
			owner_lazy = () -> EligibilityCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Retail customers are the least sophisticated level of investor.
	 */
	public static final MMCode RetailClient = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailClient";
			definition = "Retail customers are the least sophisticated level of investor.";
			owner_lazy = () -> EligibilityCode.mmObject();
			codeName = "RETL";
		}
	};
	/**
	 * Professional customers are, for example, investment firms, credit
	 * institutions, insurance companies.
	 */
	public static final MMCode ProfessionalClient = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfessionalClient";
			definition = "Professional customers are, for example, investment firms, credit institutions, insurance companies.";
			owner_lazy = () -> EligibilityCode.mmObject();
			codeName = "PROF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EligibilityCode";
				definition = "Identifies  the type of investor. The rules that apply to each type of client are different.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EligibilityCode.EligibleCounterparty, com.tools20022.repository.codeset.EligibilityCode.RetailClient,
						com.tools20022.repository.codeset.EligibilityCode.ProfessionalClient);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies to whom or what the restriction applies.
 */
public class InvestorRestrictionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Restriction applies to a legal resident.
	 */
	public static final MMCode LegalResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalResident";
			definition = "Restriction applies to a legal resident.";
			owner_lazy = () -> InvestorRestrictionTypeCode.mmObject();
			codeName = "LERE";
		}
	};
	/**
	 * Restriction applies to a citizen.
	 */
	public static final MMCode Citizen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Restriction applies to a citizen.";
			owner_lazy = () -> InvestorRestrictionTypeCode.mmObject();
			codeName = "CITI";
		}
	};
	/**
	 * Restriction applies to an individual.
	 */
	public static final MMCode Individual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Restriction applies to an individual.";
			owner_lazy = () -> InvestorRestrictionTypeCode.mmObject();
			codeName = "INDV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LERE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestorRestrictionTypeCode";
				definition = "Specifies to whom or what the restriction applies.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorRestrictionTypeCode.LegalResident, com.tools20022.repository.codeset.InvestorRestrictionTypeCode.Citizen,
						com.tools20022.repository.codeset.InvestorRestrictionTypeCode.Individual);
			}
		});
		return mmObject_lazy.get();
	}
}
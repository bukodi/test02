package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the legal standing of the organisation.
 */
public class LegalStructureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Legal structure is a corporation.
	 */
	public static final MMCode Corporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Corporation";
			definition = "Legal structure is a corporation.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Legal structure is an individual.
	 */
	public static final MMCode Individual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Legal structure is an individual.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "INDV";
		}
	};
	/**
	 * Legal structure is a supranational.
	 */
	public static final MMCode Supranational = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Supranational";
			definition = "Legal structure is a supranational.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "SNAT";
		}
	};
	/**
	 * Legal structure is a sovereign.
	 */
	public static final MMCode Sovereign = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sovereign";
			definition = "Legal structure is a sovereign.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "SOVR";
		}
	};
	/**
	 * Legal structure is a municipal.
	 */
	public static final MMCode Municipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Municipal";
			definition = "Legal structure is a municipal.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "MUNI";
		}
	};
	/**
	 * Legal structure is a province.
	 */
	public static final MMCode Province = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "Legal structure is a province.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "PVIN";
		}
	};
	/**
	 * Legal structure is a state.
	 */
	public static final MMCode State = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Legal structure is a state.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "STAE";
		}
	};
	/**
	 * Legal structure is a county.
	 */
	public static final MMCode County = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "County";
			definition = "Legal structure is a county.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "CNTY";
		}
	};
	/**
	 * Legal structure is a partnership.
	 */
	public static final MMCode Partnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Partnership";
			definition = "Legal structure is a partnership.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "PNTR";
		}
	};
	/**
	 * Legal structure is a financial institution.
	 */
	public static final MMCode FinancialInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstitution";
			definition = "Legal structure is a financial institution.";
			owner_lazy = () -> LegalStructureCode.mmObject();
			codeName = "FINI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CORR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegalStructureCode";
				definition = "Specifies the legal standing of the organisation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalStructureCode.Corporation, com.tools20022.repository.codeset.LegalStructureCode.Individual,
						com.tools20022.repository.codeset.LegalStructureCode.Supranational, com.tools20022.repository.codeset.LegalStructureCode.Sovereign, com.tools20022.repository.codeset.LegalStructureCode.Municipal,
						com.tools20022.repository.codeset.LegalStructureCode.Province, com.tools20022.repository.codeset.LegalStructureCode.State, com.tools20022.repository.codeset.LegalStructureCode.County,
						com.tools20022.repository.codeset.LegalStructureCode.Partnership, com.tools20022.repository.codeset.LegalStructureCode.FinancialInstitution);
			}
		});
		return mmObject_lazy.get();
	}
}
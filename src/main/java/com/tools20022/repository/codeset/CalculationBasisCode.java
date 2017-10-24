package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the calculation basis.
 */
public class CalculationBasisCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Average basis.
	 */
	public static final MMCode Average = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Average";
			definition = "Average basis.";
			owner_lazy = () -> CalculationBasisCode.mmObject();
			codeName = "AVER";
		}
	};
	/**
	 * Daily basis.
	 */
	public static final MMCode Daily = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Daily";
			definition = "Daily basis.";
			owner_lazy = () -> CalculationBasisCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Another type of calculation basis.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of calculation basis.";
			owner_lazy = () -> CalculationBasisCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Monthly basis.
	 */
	public static final MMCode Monthly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Monthly basis.";
			owner_lazy = () -> CalculationBasisCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Yearly basis.
	 */
	public static final MMCode Annual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Yearly basis.";
			owner_lazy = () -> CalculationBasisCode.mmObject();
			codeName = "YEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AVER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CalculationBasisCode";
				definition = "Specifies the calculation basis.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationBasisCode.Average, com.tools20022.repository.codeset.CalculationBasisCode.Daily, com.tools20022.repository.codeset.CalculationBasisCode.Other,
						com.tools20022.repository.codeset.CalculationBasisCode.Monthly, com.tools20022.repository.codeset.CalculationBasisCode.Annual);
			}
		});
		return mmObject_lazy.get();
	}
}
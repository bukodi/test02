package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the calculation method.
 */
public class CorporateActionCalculationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pro-rata for drawings.
	 */
	public static final MMCode ProRata = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProRata";
			definition = "Pro-rata for drawings.";
			owner_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Lottery for drawings.
	 */
	public static final MMCode Lottery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for drawings.";
			owner_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
			codeName = "LOTT";
		}
	};
	/**
	 * Reduction of nominal for partial redemption.
	 */
	public static final MMCode NominalReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NominalReduction";
			definition = "Reduction of nominal for partial redemption.";
			owner_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Without reduction of nominal (via pool factor) for partial redemption.
	 */
	public static final MMCode NoNominalReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoNominalReduction";
			definition = "Without  reduction of nominal (via pool factor) for partial redemption.";
			owner_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
			codeName = "NNOM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCalculationMethodCode";
				definition = "Specifies the calculation method.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.ProRata, com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.Lottery,
						com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.NominalReduction, com.tools20022.repository.codeset.CorporateActionCalculationMethodCode.NoNominalReduction);
			}
		});
		return mmObject_lazy.get();
	}
}
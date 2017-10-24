package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of investor.
 */
public class InvestorTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is a retail investor.
	 */
	public static final MMCode Retail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retail";
			definition = "Investor is a retail investor.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "RETL";
		}
	};
	/**
	 * Investor is a professional or institutional investor.
	 */
	public static final MMCode Professional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Professional";
			definition = "Investor is a professional or institutional investor.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "PROF";
		}
	};
	/**
	 * Investor is an employee.
	 */
	public static final MMCode Staff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Staff";
			definition = "Investor is an employee.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "STAF";
		}
	};
	/**
	 * Investor is a physical person.
	 */
	public static final MMCode PhysicalPerson = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalPerson";
			definition = "Investor is a physical person.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "PPER";
		}
	};
	/**
	 * Investor is an institutional investor.
	 */
	public static final MMCode Institutional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Institutional";
			definition = "Investor is an institutional investor.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Investor is both an institutional and an individual investor.
	 */
	public static final MMCode RetailAndInstitutional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailAndInstitutional";
			definition = "Investor is both an institutional and an individual investor.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "BOTH";
		}
	};
	/**
	 * Investor is eligible to receive income gross, eg, a pension scheme.
	 */
	public static final MMCode GrossDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDistribution";
			definition = "Investor is eligible to receive income gross, eg, a pension scheme.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Investor meets the fund entry policy restriction.
	 */
	public static final MMCode Qualified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualified";
			definition = "Investor meets the fund entry policy restriction.";
			owner_lazy = () -> InvestorTypeCode.mmObject();
			codeName = "QUAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RETL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestorTypeCode";
				definition = "Specifies the  type of investor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorTypeCode.Retail, com.tools20022.repository.codeset.InvestorTypeCode.Professional, com.tools20022.repository.codeset.InvestorTypeCode.Staff,
						com.tools20022.repository.codeset.InvestorTypeCode.PhysicalPerson, com.tools20022.repository.codeset.InvestorTypeCode.Institutional, com.tools20022.repository.codeset.InvestorTypeCode.RetailAndInstitutional,
						com.tools20022.repository.codeset.InvestorTypeCode.GrossDistribution, com.tools20022.repository.codeset.InvestorTypeCode.Qualified);
			}
		});
		return mmObject_lazy.get();
	}
}
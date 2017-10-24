package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.codeset.IncomePreferenceCode;
import com.tools20022.repository.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 */
public class InvestmentAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 */
	public static final MMBusinessAttribute IncomePreference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncomePreferenceCode.mmObject();
		}
	};
	/**
	 * Method by which the tax (withholding tax) is to be processed i.e. either
	 * withheld at source or tax information reported to tax authorities or tax
	 * information is reported due to the provision of a tax certificate.
	 */
	public static final MMBusinessAttribute TaxWithholdingMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxWithholdingMethodCode.mmObject();
		}
	};
	/**
	 * Rounding method used to determine the quantity of investment fund units.
	 */
	public static final MMBusinessAssociationEnd RoundingMethod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundingMethod";
			definition = "Rounding method used to determine the quantity of investment fund units.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RoundingParameters.mmObject();
		}
	};
	/**
	 * Indicates whether the beneficial ownership certification has been sent,
	 * certifying that the beneficial owner is eligible to own a specific
	 * investment fund or investment fund class.
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationIndicator";
			definition = "Indicates whether the beneficial ownership certification has been sent, certifying that the beneficial owner is eligible to own a specific investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Beneficial owner or its designated agent certifies that it complies with
	 * any holding or investment restrictions or requirements of the fund.
	 */
	public static final MMBusinessAttribute BeneficiaryCertificationCompletion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationCompletionCode.mmObject();
		}
	};
	/**
	 * Investment plan associated with an investment account.
	 */
	public static final MMBusinessAssociationEnd SystematicInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystematicInvestmentPlan";
			definition = "Investment plan associated with an investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.RelatedService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}
	};
	/**
	 * Contract which specifies the services related to an account.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract which specifies the services related to an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	/**
	 * Reporting services parameters for an investment account.
	 */
	public static final MMBusinessAssociationEnd ReportingService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingService";
			definition = "Reporting services parameters for an investment account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
		}
	};
	/**
	 * Reinvestment information included in the investment account contract.
	 */
	public static final MMBusinessAssociationEnd Reinvestment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccountService.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment information included in the investment account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reinvestment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService, com.tools20022.repository.entity.InvestmentAccountContract.Services,
						com.tools20022.repository.entity.RoundingParameters.InvestmentAccountService, com.tools20022.repository.entity.InvestmentPlan.RelatedService,
						com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.IncomePreference, com.tools20022.repository.entity.InvestmentAccountService.TaxWithholdingMethod,
						com.tools20022.repository.entity.InvestmentAccountService.RoundingMethod, com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationIndicator,
						com.tools20022.repository.entity.InvestmentAccountService.BeneficiaryCertificationCompletion, com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccountService.ReportingService,
						com.tools20022.repository.entity.InvestmentAccountService.Reinvestment);
			}
		});
		return mmObject_lazy.get();
	}
}
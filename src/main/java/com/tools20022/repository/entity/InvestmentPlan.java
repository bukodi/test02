package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.PlanStatusCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Plan that allows investors to schedule periodical investments or divestments,
 * according to pre-defined criteria.
 */
public class InvestmentPlan {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency of the investment or divestment, eg, daily, weekly, or monthly.
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Currency and amount of the periodical payments. When the standing order
	 * is related to a fund investment plan, this is the cash part of the
	 * invested amount.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	/**
	 * Specifies information on the successive payments in an investment plan.
	 */
	public static final MMBusinessAssociationEnd Instalment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Instalment";
			definition = "Specifies information on the successive payments in an investment plan.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Instalment.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Instalment.mmObject();
		}
	};
	/**
	 * Service which provides a systematic investment plan.
	 */
	public static final MMBusinessAssociationEnd RelatedService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedService";
			definition = "Service which provides a systematic investment plan.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountService.mmObject();
		}
	};
	/**
	 * Insurance contract which covers the investment plan.
	 */
	public static final MMBusinessAssociationEnd Insurance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Insurance contract which covers the investment plan.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InsuranceCertificate.mmObject();
		}
	};
	/**
	 * Order generated automatically, according to the terms of the investment
	 * plan.
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Order generated automatically, according to the terms of the investment plan.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrder.mmObject();
		}
	};
	/**
	 * Specifies whether the investment plan is multi currency or not.
	 */
	public static final MMBusinessAttribute MultiCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultiCurrency";
			definition = "Specifies whether the investment plan is multi currency or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency of the investment plan.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the investment plan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Portfolio for which the investment plan invests or divests.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio for which the investment plan invests or divests.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.InvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Period during which an investment plan has to be executed.
	 */
	public static final MMBusinessAssociationEnd InvestmentPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPeriod";
			definition = "Period during which an investment plan has to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Status of the savings or withdrawal investment plan.
	 */
	public static final MMBusinessAttribute PlanStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentPlan.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlanStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan,
						com.tools20022.repository.entity.InvestmentAccountService.SystematicInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan, com.tools20022.repository.entity.Instalment.InvestmentPlan,
						com.tools20022.repository.entity.InsuranceCertificate.RelatedInvestmentPlan, com.tools20022.repository.entity.Portfolio.InvestmentPlan);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.Frequency, com.tools20022.repository.entity.InvestmentPlan.Amount, com.tools20022.repository.entity.InvestmentPlan.Asset,
						com.tools20022.repository.entity.InvestmentPlan.Instalment, com.tools20022.repository.entity.InvestmentPlan.RelatedService, com.tools20022.repository.entity.InvestmentPlan.Insurance,
						com.tools20022.repository.entity.InvestmentPlan.StandingOrder, com.tools20022.repository.entity.InvestmentPlan.MultiCurrency, com.tools20022.repository.entity.InvestmentPlan.Currency,
						com.tools20022.repository.entity.InvestmentPlan.Portfolio, com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod, com.tools20022.repository.entity.InvestmentPlan.PlanStatus);
			}
		});
		return mmObject_lazy.get();
	}
}
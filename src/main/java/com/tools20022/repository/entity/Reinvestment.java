package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of the reinvestment of the income on the fund.
 */
public class Reinvestment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment account services which include reinvestment information.
	 */
	public static final MMBusinessAssociationEnd RelatedinvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reinvestment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedinvestmentAccountService";
			definition = "Investment account services which include reinvestment information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.Reinvestment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountService.mmObject();
		}
	};
	/**
	 * Investment fund class which is the fund in which the income must be
	 * reinvested.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reinvestment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class which is the fund in which the income must be reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.Reinvestment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Percentage on the income on the fund to be reinvested.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reinvestment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Percentage on the income on the fund to be reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reinvestment";
				definition = "Parameters of the reinvestment of the income on the fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.Reinvestment, com.tools20022.repository.entity.InvestmentAccountService.Reinvestment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reinvestment.RelatedinvestmentAccountService, com.tools20022.repository.entity.Reinvestment.InvestmentFundClass,
						com.tools20022.repository.entity.Reinvestment.Percentage);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount applied as an add-on to the exposure usually intended to cover a
 * possible increase in exposure before the next valuation date.
 */
public class IndependentAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Risk coverage for which an independent amount is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> IndependentAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRiskCalculation";
			definition = "Risk coverage for which an independent amount is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};
	/**
	 * Independent amounts that are related to specific trades or groups of
	 * trades.
	 */
	public static final MMBusinessAttribute IndependentAmountPerTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IndependentAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPerTrade";
			definition = "Independent amounts that are related to specific trades or groups of trades.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Portfolio level independent amount which reflects portfolio change over a
	 * short time period using statistical techniques such as volatility and
	 * risk factor correlations.
	 */
	public static final MMBusinessAttribute IndependentAmountValueAtRisk = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IndependentAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountValueAtRisk";
			definition = "Portfolio level independent amount which reflects portfolio change over a short time period using statistical techniques such as volatility and risk factor correlations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Portfolio level independent amount related to FX net open position, i.e.
	 * to the difference between assets and liabilities in a particular
	 * currency. This may be measured on a per currency basis or the position of
	 * all currencies when calculated in base currency.
	 */
	public static final MMBusinessAttribute IndependentAmountNetOpenPosition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IndependentAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountNetOpenPosition";
			definition = "Portfolio level independent amount related to FX net open position, i.e. to the difference between assets and liabilities in a particular currency. This may be measured on a per currency basis or the position of all currencies when calculated in base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndependentAmount";
				definition = "Amount applied as an add-on to the exposure usually intended to cover a possible increase in exposure before the next valuation date.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IndependentAmount.RelatedRiskCalculation, com.tools20022.repository.entity.IndependentAmount.IndependentAmountPerTrade,
						com.tools20022.repository.entity.IndependentAmount.IndependentAmountValueAtRisk, com.tools20022.repository.entity.IndependentAmount.IndependentAmountNetOpenPosition);
			}
		});
		return mmObject_lazy.get();
	}
}
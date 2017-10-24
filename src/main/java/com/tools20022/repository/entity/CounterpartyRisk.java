package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on its credit risk.
 */
public class CounterpartyRisk {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies which role played by a party was taken into consideration for
	 * the risk calculation, for instance clearing member role.
	 */
	public static final MMBusinessAssociationEnd Party = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Specifies which role played by a party was taken into consideration for the risk calculation, for instance clearing member role.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.CounterpartyRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Role.mmObject();
		}
	};
	/**
	 * The amount which needs to be covered for the counterparty risk.
	 */
	public static final MMBusinessAttribute ExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmount";
			definition = "The amount which needs to be covered for the counterparty risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exposure for which the risk is calculated on a counterparty
	 * basis.
	 */
	public static final MMBusinessAssociationEnd ExposureCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CounterpartyRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureCalculation";
			definition = "Specifies the exposure for which the risk is calculated on a counterparty basis.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CounterpartyRisk";
				definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on its credit risk.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.CounterpartyRisk, com.tools20022.repository.entity.ExposureCalculation.CounterpartyRisk);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CounterpartyRisk.Party, com.tools20022.repository.entity.CounterpartyRisk.ExposedAmount,
						com.tools20022.repository.entity.CounterpartyRisk.ExposureCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
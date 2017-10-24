package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on the transactions that are not yet
 * settled.
 */
public class TransactionRisk {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the obligations used to calculate the transaction risk.<br>
	 * Specifies the quantity of securities and/or the cash amounts that have to
	 * be taken into account to calculate the exposure of one trading party
	 * versus one of its counterparties.
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligations used to calculate the transaction risk.\r\nSpecifies the quantity of securities and/or the cash amounts that have to be taken into account to calculate the exposure of one trading party versus one of its counterparties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.TransactionRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	/**
	 * The sum of the exposures of all transactions which are in favour of a
	 * Party. That is, all transactions which would have an amount payable by
	 * the counterparty if they were being terminated.
	 */
	public static final MMBusinessAttribute ExposedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmount";
			definition = "The sum of the exposures of all transactions which are in favour of a Party. That is, all transactions which would have an amount payable by the counterparty if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exposure for which the risk is calculated on a transaction
	 * basis.
	 */
	public static final MMBusinessAssociationEnd ExposureCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TransactionRisk.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureCalculation";
			definition = "Specifies the exposure for which the risk is calculated on a transaction basis.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.TransactionRisk;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionRisk";
				definition = "Calculation of the exposure amount that one party has vis-a-vis one counterparty or a central system, based on the transactions that are not yet settled.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.TransactionRisk, com.tools20022.repository.entity.ExposureCalculation.TransactionRisk);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransactionRisk.Obligation, com.tools20022.repository.entity.TransactionRisk.ExposedAmount,
						com.tools20022.repository.entity.TransactionRisk.ExposureCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}
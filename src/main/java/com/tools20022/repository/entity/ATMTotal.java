package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Current totals of the ATM.
 */
public class ATMTotal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total balance of the ATM including reject cassette, but excluding the
	 * retract cassette.
	 */
	public static final MMBusinessAttribute ATMBalance = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMBalance";
			definition = "Total balance of the ATM including reject cassette, but excluding the retract cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Currency of the totals.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the totals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Total number of units for non-valued media, excluding reject cassette.
	 */
	public static final MMBusinessAttribute ATMCurrentNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMCurrentNumber";
			definition = "Total number of units for non-valued media, excluding reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total number of units for non-valued media, including reject cassette.
	 */
	public static final MMBusinessAttribute ATMBalanceNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMBalanceNumber";
			definition = "Total number of units for non-valued media, including reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Available amount for dispense in the ATM.
	 */
	public static final MMBusinessAttribute ATMCurrent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMCurrent";
			definition = "Available amount for dispense in the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Related payments representing the current totals of the ATM.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ATMTotal.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Related payments representing the current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.ATMTotal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTotal";
				definition = "Current totals of the ATM.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.ATMTotal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ATMTotal.ATMBalance, com.tools20022.repository.entity.ATMTotal.Currency, com.tools20022.repository.entity.ATMTotal.ATMCurrentNumber,
						com.tools20022.repository.entity.ATMTotal.ATMBalanceNumber, com.tools20022.repository.entity.ATMTotal.ATMCurrent, com.tools20022.repository.entity.ATMTotal.RelatedCardPayment);
			}
		});
		return mmObject_lazy.get();
	}
}
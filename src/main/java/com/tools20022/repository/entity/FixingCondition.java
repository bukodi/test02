package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BusinessDayConventionCode;
import com.tools20022.repository.codeset.DisruptionFallbackCode;
import com.tools20022.repository.codeset.FinancialCenterCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of parameters used to calculate a rate for instance the fixing rate to be
 * applied to a non-deliverable agreement.
 */
public class FixingCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which a rate is observed.
	 */
	public static final MMBusinessAttribute FixingDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingDateTime";
			definition = "Date and time at which a rate is observed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Non Deliverable trade for which fixing conditions are specified.
	 */
	public static final MMBusinessAssociationEnd NonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableTrade";
			definition = "Non Deliverable trade for which fixing conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.mmObject();
		}
	};
	/**
	 * Rate obtained at fixing time by following the fixing conditions (agreed
	 * upon by the trading parties).
	 */
	public static final MMBusinessAssociationEnd FixingRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingRate";
			definition = "Rate obtained at fixing time by following the fixing conditions (agreed upon by the trading parties).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.FixingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Source used for determining the fixing rate, as provided by various
	 * financial publishing organisations.
	 */
	public static final MMBusinessAttribute SettlementRateOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementRateOption";
			definition = "Source used for determining the fixing rate, as provided by various financial publishing organisations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Method that gives rise to either an alternative basis for determining the
	 * settlement rate, or an alternative basis for settling a transaction when
	 * a disruption event has occurred.
	 */
	public static final MMBusinessAttribute DisruptionFallback = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisruptionFallback";
			definition = "Method that gives rise to either an alternative basis for determining the settlement rate, or an alternative basis for settling a transaction when a disruption event has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DisruptionFallbackCode.mmObject();
		}
	};
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FixingCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FixingCondition";
				definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.FixingConditions, com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FixingCondition.FixingDateTime, com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade,
						com.tools20022.repository.entity.FixingCondition.FixingRate, com.tools20022.repository.entity.FixingCondition.SettlementRateOption, com.tools20022.repository.entity.FixingCondition.FinancialCenter,
						com.tools20022.repository.entity.FixingCondition.DisruptionFallback, com.tools20022.repository.entity.FixingCondition.BusinessDayConvention);
			}
		});
		return mmObject_lazy.get();
	}
}
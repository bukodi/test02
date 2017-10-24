package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Right to buy (call) or sell (put) an underlying amount in one currency
 * against another amount in another currency at a predetermined exchange rate,
 * within a specified period of time or at a specified date and time.
 */
public class CurrencyOption extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Call amount and currency of a foreign exchange option trade.
	 */
	public static final MMBusinessAttribute CallAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallAmount";
			definition = "Call amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Put amount and currency of a foreign exchange option trade.
	 */
	public static final MMBusinessAttribute PutAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutAmount";
			definition = "Put amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the way the premium is calculated.
	 */
	public static final MMBusinessAssociationEnd PremiumCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumCalculation";
			definition = "Specifies the way the premium is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.mmObject();
		}
	};
	/**
	 * Specifies the different parameters used to define an option.
	 */
	public static final MMBusinessAssociationEnd OptionDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionDefinition";
			definition = "Specifies the different parameters used to define an option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.CurrencyOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Option.mmObject();
		}
	};
	/**
	 * Specifies the amount of the premium paid by the buyer of the option and
	 * its settlement place.
	 */
	public static final MMBusinessAssociationEnd PremiumSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumSettlement";
			definition = "Specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the trade that may take place to exercise the option.
	 */
	public static final MMBusinessAssociationEnd ExercisedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisedOption";
			definition = "Specifies the trade that may take place to exercise the option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};
	/**
	 * Currency that must be used to settle the option when it is netted off.
	 */
	public static final MMBusinessAttribute OptionSettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionSettlementCurrency";
			definition = "Currency that must be used to settle the option when it is netted off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Fixed exchange rate at which the option contract can be exercised.
	 */
	public static final MMBusinessAttribute StrikeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CurrencyOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeRate";
			definition = "Fixed exchange rate at which the option contract can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyOption";
				definition = "Right to buy (call) or sell (put) an underlying amount in one currency against another amount in another currency at a predetermined exchange rate, within a specified period of time or at a specified date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption, com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption,
						com.tools20022.repository.entity.Option.CurrencyOption, com.tools20022.repository.entity.PremiumCalculation.Option);
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.CallAmount, com.tools20022.repository.entity.CurrencyOption.PutAmount, com.tools20022.repository.entity.CurrencyOption.PremiumCalculation,
						com.tools20022.repository.entity.CurrencyOption.OptionDefinition, com.tools20022.repository.entity.CurrencyOption.PremiumSettlement, com.tools20022.repository.entity.CurrencyOption.ExercisedOption,
						com.tools20022.repository.entity.CurrencyOption.OptionSettlementCurrency, com.tools20022.repository.entity.CurrencyOption.StrikeRate);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between two parties in which one party buys a currency and the
 * other party sells a different currency.
 */
public class ForeignExchangeTrade extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exchange rate between two currencies. The rate is agreed by the trading
	 * parties during the negotiation process.
	 */
	public static final MMBusinessAssociationEnd AgreedRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate between two currencies. The rate is agreed by the trading parties during the negotiation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Specifies the type of trade.
	 */
	public static final MMBusinessAttribute TypeOfProduct = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TypeOfProduct";
			definition = "Specifies the type of trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency and amount bought in a foreign exchange trade.
	 */
	public static final MMBusinessAttribute BuyAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Currency and amount sold in a foreign exchange trade.
	 */
	public static final MMBusinessAttribute SellAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Payment of the settlement amount to the account(s) of the final
	 * beneficiary. A payment may be settled gross, through split amounts at
	 * several agents of the buyer, or netted with several other treasury
	 * agreements.
	 */
	public static final MMBusinessAssociationEnd ResultingSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingSettlement";
			definition = "Payment of the settlement amount to the account(s) of the final beneficiary. A payment may be settled gross, through split amounts at several agents of the buyer, or netted with several other treasury agreements.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Securities settlement process for which a currency exchange is provided.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesSettlement";
			definition = "Securities settlement process for which a currency exchange is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Non deliverable trade for which an opening closing leg is specified.
	 */
	public static final MMBusinessAssociationEnd OpeningLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which an opening closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> NonDeliverableTrade.mmObject();
		}
	};
	/**
	 * Non deliverable trade for which a closing leg is specified.
	 */
	public static final MMBusinessAssociationEnd ClosingLegRelatedNonDeliverableTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegRelatedNonDeliverableTrade";
			definition = "Non deliverable trade for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> NonDeliverableTrade.mmObject();
		}
	};
	/**
	 * FX swap for which the FX trade is one leg.
	 */
	public static final MMBusinessAssociationEnd RelatedSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSwap";
			definition = "FX swap for which the FX trade is one leg.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeSwap.mmObject();
		}
	};
	/**
	 * Option which is executed by one (or more) FX trade.
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option which is executed by one (or more) FX trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.ExercisedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyOption.mmObject();
		}
	};
	/**
	 * Tax voucher for which currency exchange information is specified.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTaxVoucher";
			definition = "Tax voucher for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TaxVoucher.mmObject();
		}
	};
	/**
	 * Difference between the foreign exchange spot rate and the foreign
	 * exchange forward rate expressed in basis points quoted in accordance with
	 * the prevailing market conventions for the currency pair.
	 */
	public static final MMBusinessAttribute ExchangeForwardPoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForwardPoint";
			definition = "Difference between the foreign exchange spot rate and the foreign exchange forward rate expressed in basis points quoted in accordance with the prevailing market conventions for the currency pair. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTrade";
				definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation, com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade, com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction,
						com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg, com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg,
						com.tools20022.repository.entity.CurrencyOption.ExercisedOption);
				subType_lazy = () -> Arrays.asList(NonDeliverableTrade.mmObject());
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate, com.tools20022.repository.entity.ForeignExchangeTrade.TypeOfProduct,
						com.tools20022.repository.entity.ForeignExchangeTrade.BuyAmount, com.tools20022.repository.entity.ForeignExchangeTrade.SellAmount, com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap,
						com.tools20022.repository.entity.ForeignExchangeTrade.RelatedOption, com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.ForeignExchangeTrade.ExchangeForwardPoint);
			}
		});
		return mmObject_lazy.get();
	}
}
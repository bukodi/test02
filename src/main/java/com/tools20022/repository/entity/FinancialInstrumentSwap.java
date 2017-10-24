package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.InterestComputationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics and conditions by which a borrower can exchange one type of
 * financial instrument for another.
 */
public class FinancialInstrumentSwap {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Range of time during which a swap is in effect.
	 */
	public static final MMBusinessAssociationEnd Maturity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Maturity";
			definition = "Range of time during which a swap is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Details of the spot leg of the sell-side of a swap.
	 */
	public static final MMBusinessAssociationEnd SpotSell = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotSell";
			definition = "Details of the spot leg of the sell-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}
	};
	/**
	 * Details of the spot leg of the buy-side of a swap.
	 */
	public static final MMBusinessAssociationEnd SpotBuy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotBuy";
			definition = "Details of the spot leg of the buy-side of a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}
	};
	/**
	 * Details of the forward leg of a swap that has been sold and is being
	 * returned, ie, bought back.
	 */
	public static final MMBusinessAssociationEnd ForwardBuyBack = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBack";
			definition = "Details of the forward leg of a swap that has been sold and is being returned, ie, bought back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}
	};
	/**
	 * Details of the forward leg of a swap that has been bought and is being
	 * returned, ie, sold back.
	 */
	public static final MMBusinessAssociationEnd ForwardSellBack = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBack";
			definition = "Details of the forward leg of a swap that has been bought and is being returned, ie, sold back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSwapLeg.mmObject();
		}
	};
	/**
	 * Quote related to a swap.
	 */
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote related to a swap.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuoteSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Frequency at which the sold financial instrument is being returned.
	 */
	public static final MMBusinessAttribute ForwardSellBackFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackFrequency";
			definition = "Frequency at which the sold financial instrument is being returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Frequency at which the bought financial instrument is being returned.
	 */
	public static final MMBusinessAttribute ForwardBuyBackFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackFrequency";
			definition = "Frequency at which the bought financial instrument is being returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Method used to compute the accrued interest of a financial instrument.
	 */
	public static final MMBusinessAttribute InterestComputation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> FinancialInstrumentSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestComputation";
			definition = "Method used to compute the accrued interest of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentSwap";
				definition = "Characteristics and conditions by which a borrower can exchange one type of financial instrument for another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap, com.tools20022.repository.entity.Quote.QuoteSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity, com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell,
						com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack,
						com.tools20022.repository.entity.FinancialInstrumentSwap.RelatedQuote, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBackFrequency,
						com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBackFrequency, com.tools20022.repository.entity.FinancialInstrumentSwap.InterestComputation);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contains the details of one of the legs of a swap, both in time (spot versus
 * [partial] forward details) and the side (sell versus buy).
 */
public class SecuritiesSwapLeg {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Contains the currency and amount of a buy or sell leg of a swap for the
	 * spot or the forward.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Contains the currency and amount of a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Contains the benchmark used for a buy or sell leg of a swap for the spot
	 * or the forward.
	 */
	public static final MMBusinessAttribute Benchmark = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Benchmark";
			definition = "Contains the benchmark used for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}
	};
	/**
	 * Identifies a point on a benchmark curve.
	 */
	public static final MMBusinessAttribute CurvePoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurvePoint";
			definition = "Identifies a point on a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Contains the yield against a benchmark for a buy or sell leg of a swap
	 * for the spot or the forward.
	 */
	public static final MMBusinessAttribute BenchmarkYield = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkYield";
			definition = "Contains the yield against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the offset in basis points against a benchmark for a buy or sell
	 * leg of a swap for the spot or the forward.
	 */
	public static final MMBusinessAttribute BenchmarkOffset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkOffset";
			definition = "Contains the offset in basis points against a benchmark for a buy or sell leg of a swap for the spot or the forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Swap for which a spot sell leg is specified.
	 */
	public static final MMBusinessAssociationEnd SpotSellSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotSellSwap";
			definition = "Swap for which a spot sell leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}
	};
	/**
	 * Swap for which a spot buy leg is specified.
	 */
	public static final MMBusinessAssociationEnd SpotBuySwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpotBuySwap";
			definition = "Swap for which a spot buy leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}
	};
	/**
	 * Swap for which a forward buy back leg is specified.
	 */
	public static final MMBusinessAssociationEnd ForwardBuyBackSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardBuyBackSwap";
			definition = "Swap for which a forward buy back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}
	};
	/**
	 * Swap for which a forward sell back leg is specified.
	 */
	public static final MMBusinessAssociationEnd ForwardSellBackSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesSwapLeg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardSellBackSwap";
			definition = "Swap for which a forward sell back leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSwapLeg";
				definition = "Contains the details of one of the legs of a swap, both in time (spot versus [partial] forward details) and the side (sell versus buy).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialInstrumentSwap.SpotSell, com.tools20022.repository.entity.FinancialInstrumentSwap.SpotBuy,
						com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardBuyBack, com.tools20022.repository.entity.FinancialInstrumentSwap.ForwardSellBack);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSwapLeg.Amount, com.tools20022.repository.entity.SecuritiesSwapLeg.Benchmark, com.tools20022.repository.entity.SecuritiesSwapLeg.CurvePoint,
						com.tools20022.repository.entity.SecuritiesSwapLeg.BenchmarkYield, com.tools20022.repository.entity.SecuritiesSwapLeg.BenchmarkOffset, com.tools20022.repository.entity.SecuritiesSwapLeg.SpotSellSwap,
						com.tools20022.repository.entity.SecuritiesSwapLeg.SpotBuySwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardBuyBackSwap, com.tools20022.repository.entity.SecuritiesSwapLeg.ForwardSellBackSwap);
			}
		});
		return mmObject_lazy.get();
	}
}
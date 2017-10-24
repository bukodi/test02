package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Margin over or under an index which determines a rate.
 */
public class Spread {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security used as a reference to express the value of another security.
	 */
	public static final MMBusinessAssociationEnd BenchmarkSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkSecurity";
			definition = "Security used as a reference to express the value of another security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Securities financing process for which a repurchase spread is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Securities financing process for which a repurchase spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	/**
	 * Margin over or under an index which determines the interest rate of an
	 * interest bearing instrument.
	 */
	public static final MMBusinessAttribute SpreadRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the number of points to be added or substracted to the rate.
	 */
	public static final MMBusinessAttribute BasisPointSpread = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasisPointSpread";
			definition = "Specifies the number of points to be added or substracted to the rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Index for which a spread is specified.
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	/**
	 * Identifies the price of the benchmark security.
	 */
	public static final MMBusinessAssociationEnd BenchmarkPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indication of interest process for which a spread to benchmark is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a spread to benchmark is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	/**
	 * Indication of interest process for which a spread is specified.
	 */
	public static final MMBusinessAssociationEnd IndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	/**
	 * Interest calculation process for which a spread is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest calculation process for which a spread is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}
	};
	/**
	 * Describes a benchmark curve.
	 */
	public static final MMBusinessAssociationEnd BenchmarkCurve = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkCurve";
			definition = "Describes a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Curve.Spread;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Curve.mmObject();
		}
	};
	/**
	 * Either a swap spread or spread to benchmark depending upon order type. In
	 * case of a spread to benchmark, the price offset is expressed in terms of
	 * basis points relative to a benchmark - this can be a positive or a
	 * negative spread. In case of a swap spread, the price offset is target
	 * spread for a swap.
	 */
	public static final MMBusinessAttribute PriceOffset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Spread.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceOffset";
			definition = "Either a swap spread or spread to benchmark depending upon order type.  In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread.  In case of a swap spread, the price offset is target spread for a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Spread";
				definition = "Margin over or under an index which determines a rate.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Spread, com.tools20022.repository.entity.SecuritiesPricing.Spread, com.tools20022.repository.entity.InterestCalculation.Spread,
						com.tools20022.repository.entity.Index.Spread, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread, com.tools20022.repository.entity.Curve.Spread);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.BenchmarkSecurity, com.tools20022.repository.entity.Spread.SecuritiesFinancing, com.tools20022.repository.entity.Spread.SpreadRate,
						com.tools20022.repository.entity.Spread.BasisPointSpread, com.tools20022.repository.entity.Spread.Index, com.tools20022.repository.entity.Spread.BenchmarkPrice,
						com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.IndicationOfInterest, com.tools20022.repository.entity.Spread.RelatedInterest,
						com.tools20022.repository.entity.Spread.BenchmarkCurve, com.tools20022.repository.entity.Spread.PriceOffset);
			}
		});
		return mmObject_lazy.get();
	}
}
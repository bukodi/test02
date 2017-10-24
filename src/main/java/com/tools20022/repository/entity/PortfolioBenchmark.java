package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Security or other price against which the performance of the portfolio is
 * evaluated.
 */
public class PortfolioBenchmark {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the index which may be used for decomposition.
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index which may be used for decomposition.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.PortfolioBenchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	/**
	 * Portfolio to which the benchmark applies.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio to which the benchmark applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Benchmark;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Instrument weighting in the benchmark for the portfolio.
	 */
	public static final MMBusinessAttribute BenchmarkWeight = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenchmarkWeight";
			definition = "Instrument weighting in the benchmark for the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum allowable deviation from the benchmark.
	 */
	public static final MMBusinessAttribute MaximumDeviation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumDeviation";
			definition = "Maximum allowable deviation from the benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum allowable deviation from the benchmark.
	 */
	public static final MMBusinessAttribute MinimumDeviation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDeviation";
			definition = "Minimum allowable deviation from the benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Period during which the instrument is used as a benchmark for the
	 * portfolio.
	 */
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the instrument is used as a benchmark for the portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Free text description of the benchmark used to determine the performance
	 * of a portfolio.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PortfolioBenchmark.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Free text description of the benchmark used to determine the performance of a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioBenchmark";
				definition = "Security or other price against which the performance of the portfolio is evaluated.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Portfolio.Benchmark, com.tools20022.repository.entity.Index.PortfolioBenchmark);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioBenchmark.Index, com.tools20022.repository.entity.PortfolioBenchmark.Portfolio,
						com.tools20022.repository.entity.PortfolioBenchmark.BenchmarkWeight, com.tools20022.repository.entity.PortfolioBenchmark.MaximumDeviation, com.tools20022.repository.entity.PortfolioBenchmark.MinimumDeviation,
						com.tools20022.repository.entity.PortfolioBenchmark.EffectivePeriod, com.tools20022.repository.entity.PortfolioBenchmark.Description);
			}
		});
		return mmObject_lazy.get();
	}
}
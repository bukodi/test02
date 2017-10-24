package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the index.
 */
public class Index {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reference rate.
	 */
	public static final MMBusinessAttribute IndexRateBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Index rate applied to the amount paid to adjust it for instance to
	 * inflation.
	 */
	public static final MMBusinessAssociationEnd IndexFactor = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFactor";
			definition = "Index rate applied to the amount paid to adjust it for instance to inflation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Number of points above the index used to calculate a price.
	 */
	public static final MMBusinessAttribute IndexPoints = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexPoints";
			definition = "Number of points above the index used to calculate a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Date/time at which an index rate will be determined .
	 */
	public static final MMBusinessAttribute IndexFixingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexFixingDate";
			definition = "Date/time at which an index rate will be determined .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the index by a name for instance LIBOR.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the index by a name for instance LIBOR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the reference source. The source can be the fixing agent or a
	 * system.
	 */
	public static final MMBusinessAttribute ReferenceSource = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceSource";
			definition = "Identifies the reference source. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the currency of the reference rate for fixed income instruments
	 * where the price of the instrument is indexed to the price of an
	 * underlying benchmark.
	 */
	public static final MMBusinessAttribute IndexRateCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Frequency at which the index changes.
	 */
	public static final MMBusinessAttribute IndexRateFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the index changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Multiplier for the variable rate.
	 */
	public static final MMBusinessAttribute IndexRateMultiplier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Percentage to be added to or deducted from the index rate to calculate
	 * the effective rate.
	 */
	public static final MMBusinessAssociationEnd Spread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Percentage to be added to or deducted from the index rate to calculate the effective rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	/**
	 * Portfolio benchmark which uses an index for decomposition,
	 */
	public static final MMBusinessAssociationEnd PortfolioBenchmark = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortfolioBenchmark";
			definition = "Portfolio benchmark which uses an index for decomposition,";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioBenchmark.mmObject();
		}
	};
	/**
	 * Variable interest which uises the index.
	 */
	public static final MMBusinessAssociationEnd VariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Variable interest which uises the index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	/**
	 * Pricing which uses an index.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Index.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses an index.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Index;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Index";
				definition = "Identifies the index.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Index, com.tools20022.repository.entity.VariableInterest.Index, com.tools20022.repository.entity.RateAndAmount.Index,
						com.tools20022.repository.entity.Spread.Index, com.tools20022.repository.entity.PortfolioBenchmark.Index);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Index.IndexRateBasis, com.tools20022.repository.entity.Index.IndexFactor, com.tools20022.repository.entity.Index.IndexPoints,
						com.tools20022.repository.entity.Index.IndexFixingDate, com.tools20022.repository.entity.Index.Identification, com.tools20022.repository.entity.Index.ReferenceSource,
						com.tools20022.repository.entity.Index.IndexRateCurrency, com.tools20022.repository.entity.Index.IndexRateFrequency, com.tools20022.repository.entity.Index.IndexRateMultiplier,
						com.tools20022.repository.entity.Index.Spread, com.tools20022.repository.entity.Index.PortfolioBenchmark, com.tools20022.repository.entity.Index.VariableInterest,
						com.tools20022.repository.entity.Index.SecuritiesPricing);
			}
		});
		return mmObject_lazy.get();
	}
}
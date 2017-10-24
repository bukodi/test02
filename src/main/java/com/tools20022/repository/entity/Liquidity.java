package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LiquidityIndicatorTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ability of a financial instrument to be easily traded and converted to cash,
 * at conditions that do not affect its price.
 */
public class Liquidity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of a financial instrument for which liquidity range details are
	 * provided.
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a financial instrument for which liquidity range details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Liquidity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * List trading process for which liquidity data is provided.
	 */
	public static final MMBusinessAssociationEnd ListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTrading";
			definition = "List trading process for which liquidity data is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ListTrading.Liquidity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
		}
	};
	/**
	 * Type of liquidity measure, of a financial instrument, on a market.
	 */
	public static final MMBusinessAttribute IndicatorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndicatorType";
			definition = "Type of liquidity measure, of a financial instrument, on a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
		}
	};
	/**
	 * Upper liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
	 */
	public static final MMBusinessAttribute Upper = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Upper";
			definition = "Upper liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Lower liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
	 */
	public static final MMBusinessAttribute Lower = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lower";
			definition = "Lower liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Market value of the securities position for which liquidity details are
	 * provided.
	 */
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Market value of the securities position for which liquidity details are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates the overall weighted average liquidity expressed as a
	 * percentage of average daily volume.
	 */
	public static final MMBusinessAttribute WeightedAverageLiquidity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Liquidity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLiquidity";
			definition = "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Liquidity";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Liquidity, com.tools20022.repository.entity.ListTrading.Liquidity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Liquidity.Quantity, com.tools20022.repository.entity.Liquidity.ListTrading, com.tools20022.repository.entity.Liquidity.IndicatorType,
						com.tools20022.repository.entity.Liquidity.Upper, com.tools20022.repository.entity.Liquidity.Lower, com.tools20022.repository.entity.Liquidity.Value,
						com.tools20022.repository.entity.Liquidity.WeightedAverageLiquidity);
			}
		});
		return mmObject_lazy.get();
	}
}
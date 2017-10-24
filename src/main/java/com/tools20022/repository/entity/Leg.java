package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Separate transactions which combined together form a trade.
 */
public class Leg {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Asset for which leg information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAsset";
			definition = "Asset for which leg information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.LegAdditionalInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}
	};
	/**
	 * Only for multileg instrument - Ratio of quantity for an individual leg
	 * relative to the entire multileg security.
	 */
	public static final MMBusinessAttribute RatioQuantity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioQuantity";
			definition = "Only for multileg instrument - Ratio of quantity for an individual leg relative to the entire multileg security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Only for multileg instrument - Currency associated with a particular
	 * Leg's quantity.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Only for multileg instrument - Currency associated with a particular Leg's quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * For Fixed Income, used instead of LegQty or LegOrderQty to requests the
	 * respondent to calculate the quantity based on the quantity on the
	 * opposite side of the swap.
	 */
	public static final MMBusinessAttribute SwapType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwapType";
			definition = "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * For Fixed Income, identifies MBS / ABS pool for a specific leg of a
	 * multi-leg instrument.
	 */
	public static final MMBusinessAttribute Pool = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pool";
			definition = "For Fixed Income, identifies MBS / ABS pool for a specific leg of a multi-leg instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Trade which is composed of several legs.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Leg.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade which is composed of several legs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Leg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Leg";
				definition = "Separate transactions which combined together form a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.LegAdditionalInformation, com.tools20022.repository.entity.Trade.Leg);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Leg.RelatedAsset, com.tools20022.repository.entity.Leg.RatioQuantity, com.tools20022.repository.entity.Leg.Currency,
						com.tools20022.repository.entity.Leg.SwapType, com.tools20022.repository.entity.Leg.Pool, com.tools20022.repository.entity.Leg.Trade);
			}
		});
		return mmObject_lazy.get();
	}
}
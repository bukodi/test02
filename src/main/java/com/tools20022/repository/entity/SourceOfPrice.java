package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PriceSourceCode;
import com.tools20022.repository.entity.InformationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Place from which the price was obtained.
 */
public class SourceOfPrice extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Market on which this price is valid (MIC - ISO 3166).
	 */
	public static final MMBusinessAssociationEnd MarketIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketIdentification";
			definition = "Market on which this price is valid (MIC - ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.SourceOfPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Specifies the type of the source of the price.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the source of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceSourceCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SourceOfPrice";
				definition = "Place from which the price was obtained.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.SourceOfPrice);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SourceOfPrice.MarketIdentification, com.tools20022.repository.entity.SourceOfPrice.Type);
			}
		});
		return mmObject_lazy.get();
	}
}
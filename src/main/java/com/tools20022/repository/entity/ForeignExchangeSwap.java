package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Combination of two foreign exchange trades, in opposite directions, for
 * different value dates and for the same pair(s) of currencies.
 */
public class ForeignExchangeSwap extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Correlation identification for the near and far leg of a swap
	 * transaction.
	 */
	public static final MMBusinessAttribute LinkSwapIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Correlation identification for the near and far leg of a swap transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * One-side of a pair of foreign exchange trades executed as part of a swap
	 * agreement.
	 */
	public static final MMBusinessAssociationEnd SwapLeg = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ForeignExchangeSwap.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwapLeg";
			definition = "One-side of a pair of foreign exchange trades executed as part of a swap agreement.";
			maxOccurs = 2;
			minOccurs = 2;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeSwap";
				definition = "Combination of two foreign exchange trades, in opposite directions, for different value dates and for the same pair(s) of currencies.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.RelatedSwap);
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeSwap.LinkSwapIdentification, com.tools20022.repository.entity.ForeignExchangeSwap.SwapLeg);
			}
		});
		return mmObject_lazy.get();
	}
}
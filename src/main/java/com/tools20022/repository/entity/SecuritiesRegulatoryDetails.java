package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.OrderClassificationCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to order and required for regulatory purposes.
 */
public class SecuritiesRegulatoryDetails {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification and restrictions linked to an order (for regulatory
	 * purpose).
	 */
	public static final MMBusinessAttribute OrderRestrictions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderRestrictions";
			definition = "Classification and restrictions linked to an order (for regulatory purpose).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderClassificationCode.mmObject();
		}
	};
	/**
	 * Indicates whether the trading party has suggested to his client to
	 * buy/sell a financial instrument or whether the investor acts on its own
	 * without advice from its trading party.
	 */
	public static final MMBusinessAttribute BrokerSolicitedTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerSolicitedTrade";
			definition = "Indicates whether the trading party has suggested to his client to buy/sell a financial instrument or whether the investor acts on its own without advice from its trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Order for which legal parameters are provided.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRegulatoryDetails.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which legal parameters are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.LegalParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRegulatoryDetails";
				definition = "Information related to order and required for regulatory purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.LegalParameters);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRegulatoryDetails.OrderRestrictions, com.tools20022.repository.entity.SecuritiesRegulatoryDetails.BrokerSolicitedTrade,
						com.tools20022.repository.entity.SecuritiesRegulatoryDetails.RelatedOrder);
			}
		});
		return mmObject_lazy.get();
	}
}
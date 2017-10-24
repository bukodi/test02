package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Settlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement of a commercial trade, that is, the instruction to deliver goods
 * or services against the payment of an amount of money.
 */
public class CommercialTradeSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement of the payment side of a commercial trade.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Settlement of the payment side of a commercial trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Specifies for which invoice the settlement takes place.
	 */
	public static final MMBusinessAssociationEnd Invoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Invoice";
			definition = "Specifies for which invoice the settlement takes place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 */
	public static final MMBusinessAssociationEnd LetterOfCredit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	/**
	 * Delivery of the goods or services to the buyer.
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery of the goods or services to the buyer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	/**
	 * Specifies the commercial trade which is settled.
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTradeSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Specifies the commercial trade which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.TradeSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommercialTradeSettlement";
				definition = "Settlement of a commercial trade, that is, the instruction to deliver goods or services against the payment of an amount of money.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.TradeSettlement, com.tools20022.repository.entity.Invoice.TradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.TradeSettlement, com.tools20022.repository.entity.ProductDelivery.TradeSettlement, com.tools20022.repository.entity.LetterOfCredit.CommercialTradeSettlement);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTradeSettlement.Payment, com.tools20022.repository.entity.CommercialTradeSettlement.Invoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.LetterOfCredit, com.tools20022.repository.entity.CommercialTradeSettlement.ProductDelivery,
						com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade);
			}
		});
		return mmObject_lazy.get();
	}
}
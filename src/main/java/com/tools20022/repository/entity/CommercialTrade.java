package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Trade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 */
public class CommercialTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specific purchase account for recording debits and credits for accounting
	 * purposes.
	 */
	public static final MMBusinessAssociationEnd PurchaseAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Obligation for the buyer to settle the value of the products bought.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation for the buyer to settle the value of the products bought.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Total amount of a trade, that is the sum of the accepted items.
	 */
	public static final MMBusinessAttribute TotalAcceptedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAcceptedAmount";
			definition = "Total amount of a trade, that is the sum of the accepted items.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of a trade.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTradePartyRole.mmObject();
		}
	};
	/**
	 * Process of settling a commercial trade.
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Process of settling a commercial trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}
	};
	/**
	 * Obligation for the seller to deliver the products to the buyer.
	 */
	public static final MMBusinessAssociationEnd ProductDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryObligation";
			definition = "Obligation for the seller to deliver the products to the buyer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
		}
	};
	/**
	 * Specifies the purchase order related to a commercial trade.
	 */
	public static final MMBusinessAssociationEnd PurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order related to a commercial trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	/**
	 * Documents related to a commercial trade transaction.
	 */
	public static final MMBusinessAssociationEnd Documents = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Documents";
			definition = "Documents related to                             a commercial trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Undertaking related to the commercial trade.
	 */
	public static final MMBusinessAssociationEnd RelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking related to the commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UnderlyingTransaction.mmObject();
		}
	};
	/**
	 * Status of a commercial trade processed in a central system.
	 */
	public static final MMBusinessAssociationEnd TransactionStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of a commercial trade processed in a central system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BaselineStatus.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BaselineStatus.mmObject();
		}
	};
	/**
	 * Agreement between trade parties which describes the conditions under
	 * which they agree to execute trades amongst themselves.
	 */
	public static final MMBusinessAssociationEnd Agreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CommercialTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommercialTrade";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade, com.tools20022.repository.entity.Agreement.Trade, com.tools20022.repository.entity.Document.CommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.CommercialTrade, com.tools20022.repository.entity.UnderlyingTransaction.CommercialTrade, com.tools20022.repository.entity.CommercialTradePartyRole.CommercialTrade,
						com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade, com.tools20022.repository.entity.BaselineStatus.CommercialTrade, com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade,
						com.tools20022.repository.entity.ProductDeliveryObligation.CommercialTrade);
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.PurchaseAccount, com.tools20022.repository.entity.CommercialTrade.PaymentObligation,
						com.tools20022.repository.entity.CommercialTrade.TotalAcceptedAmount, com.tools20022.repository.entity.CommercialTrade.PartyRole, com.tools20022.repository.entity.CommercialTrade.TradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.ProductDeliveryObligation, com.tools20022.repository.entity.CommercialTrade.PurchaseOrder, com.tools20022.repository.entity.CommercialTrade.Documents,
						com.tools20022.repository.entity.CommercialTrade.RelatedUndertaking, com.tools20022.repository.entity.CommercialTrade.TransactionStatus, com.tools20022.repository.entity.CommercialTrade.Agreement);
			}
		});
		return mmObject_lazy.get();
	}
}
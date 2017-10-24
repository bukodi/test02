package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SettlementStatusCode;
import com.tools20022.repository.codeset.TradeStatusCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a treasury trade at a specified time.
 */
public class TreasuryTradeSettlementStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of a treasury trade in a central matching/settlement system.
	 */
	public static final MMBusinessAttribute TradeStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeStatus";
			definition = "Status of a treasury trade in a central matching/settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeStatusCode.mmObject();
		}
	};
	/**
	 * Specifies whether a trade is alleged (notified by the counterparty) or
	 * not.
	 */
	public static final MMBusinessAttribute AllegedTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged (notified by the counterparty) or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Treasury trade for which a settlement status is provided.
	 */
	public static final MMBusinessAssociationEnd TreasuryTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Treasury trade for which a settlement status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
		}
	};
	/**
	 * Specifies the status of a settlement eg rejected, settled or awaiting
	 * authorisation.
	 */
	public static final MMBusinessAttribute Settlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	/**
	 * Amount that cannot be settled for instance by a settlement system.
	 */
	public static final MMBusinessAttribute RejectedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled for instance by a settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash settlement is suspended.
	 */
	public static final MMBusinessAttribute SettlementSuspended = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSuspended";
			definition = "Cash settlement is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Cash settlement is pending.
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Cash settlement is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which the trade is actually settled.
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is actually settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Reason that an alleged trade is withdrawn.
	 */
	public static final MMBusinessAttribute WithdrawalReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalReason";
			definition = "Reason that an alleged trade is withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradeSettlementStatus";
				definition = "Specifies the status of a treasury trade at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TradeStatus, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.AllegedTrade,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.Settlement,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.RejectedAmount, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementSuspended,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.PendingSettlement, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementDate,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.WithdrawalReason);
			}
		});
		return mmObject_lazy.get();
	}
}
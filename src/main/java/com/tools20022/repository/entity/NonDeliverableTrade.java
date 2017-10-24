package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Foreign exchange contract where one of the exchanged amounts is specified in
 * a non-deliverable currency.
 */
public class NonDeliverableTrade extends ForeignExchangeTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Currency in which a non-deliverable contract is settled.
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which a non-deliverable contract is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Set of parameters used to calculate a rate for instance the fixing rate
	 * to be applied to a non-deliverable agreement.
	 */
	public static final MMBusinessAssociationEnd FixingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance the fixing rate to be applied to a non-deliverable agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FixingCondition.mmObject();
		}
	};
	/**
	 * Specifies the opening leg of a non deliverable trade in which the forward
	 * rate and amount are specified together with the fixing conditions.
	 */
	public static final MMBusinessAssociationEnd OpeningLeg = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLeg";
			definition = "Specifies the opening leg of a non deliverable trade in which the forward rate and amount are specified together with the fixing conditions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};
	/**
	 * Specifies the closing leg of a non deliverable trade in which the amount
	 * to be settled is the difference in the deliverable currency betweem its
	 * original value and the countervalue calculated against the fixing rate.
	 */
	public static final MMBusinessAssociationEnd ClosingLeg = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> NonDeliverableTrade.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLeg";
			definition = "Specifies the closing leg of a non deliverable trade in which the amount to be settled is the difference in the deliverable currency betweem its original value and the countervalue calculated against the fixing rate.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableTrade";
				definition = "Foreign exchange contract where one of the exchanged amounts is specified in a non-deliverable currency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ForeignExchangeTrade.OpeningLegRelatedNonDeliverableTrade,
						com.tools20022.repository.entity.ForeignExchangeTrade.ClosingLegRelatedNonDeliverableTrade, com.tools20022.repository.entity.FixingCondition.NonDeliverableTrade);
				superType_lazy = () -> ForeignExchangeTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NonDeliverableTrade.SettlementCurrency, com.tools20022.repository.entity.NonDeliverableTrade.FixingConditions,
						com.tools20022.repository.entity.NonDeliverableTrade.OpeningLeg, com.tools20022.repository.entity.NonDeliverableTrade.ClosingLeg);
			}
		});
		return mmObject_lazy.get();
	}
}
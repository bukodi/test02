package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CreditInstrument;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Movement of cash between two accounts. One account is debited and the other
 * account is credited.
 */
public class BookEntry extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the amount transferred on the account. An account entry may
	 * result in several cash entries for instance net amount (credited) and
	 * charges (debited).
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited).";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Specifies the debit entry resuling from a settlement instruction.
	 */
	public static final MMBusinessAssociationEnd DebitEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitEntry";
			definition = "Specifies the debit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Specifies the credit entry resuling from a settlement instruction.
	 */
	public static final MMBusinessAssociationEnd CreditEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditEntry";
			definition = "Specifies the credit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Indicates that when an amount of money has been transferred in the books
	 * of the account servicer, an advice should be sent back to the account
	 * owner.
	 */
	public static final MMBusinessAttribute TransferAdvice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money received from investors as a result of a subscription.
	 */
	public static final MMBusinessAssociationEnd FundSubscriptionCashInFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionCashInFlow";
			definition = "Amount of money received from investors as a result of a subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}
	};
	/**
	 * Amount of money paid to investors as a result of a redemption.
	 */
	public static final MMBusinessAssociationEnd FundRedemptionCashOutFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionCashOutFlow";
			definition = "Amount of money paid to investors as a result of a redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}
	};
	/**
	 * Related settlement instruction wich is the source of the book entry.
	 */
	public static final MMBusinessAssociationEnd RelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BookEntry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Related settlement instruction wich is the source of the book entry.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.BookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BookEntry";
				definition = "Movement of cash between two accounts. One account is debited and the other account is credited.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.RelatedBookEntry, com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry, com.tools20022.repository.entity.CashSettlement.BookEntry, com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry,
						com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BookEntry.CashEntry, com.tools20022.repository.entity.BookEntry.DebitEntry, com.tools20022.repository.entity.BookEntry.CreditEntry,
						com.tools20022.repository.entity.BookEntry.TransferAdvice, com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow,
						com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}
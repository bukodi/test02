package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.CreditTransferTransaction22;
import com.tools20022.repository.msg.CreditTransferTransaction26;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment made by transferring an amount of money from a debtor to a creditor.
 * The payment flows through one or more financial institutions or systems.
 */
public class CreditTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a standing order. This information is derived from the
	 * presence of detailed standing order specification.
	 */
	public static final MMBusinessAttribute StandingOrder = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order. This information is derived from the presence of detailed standing order specification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Standing order which creates the credit transfers.
	 */
	public static final MMBusinessAssociationEnd RelatedStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CreditTransfer.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order which creates the credit transfers.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.CreditTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashStandingOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer";
				definition = "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashStandingOrder.CreditTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction23.CreditTransferTransaction, com.tools20022.repository.msg.PaymentInstruction22.CreditTransferTransactionInformation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditTransfer.StandingOrder, com.tools20022.repository.entity.CreditTransfer.RelatedStandingOrder);
				derivationComponent_lazy = () -> Arrays.asList(CreditTransferTransaction26.mmObject(), CreditTransferTransaction22.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
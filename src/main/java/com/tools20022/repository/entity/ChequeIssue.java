package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ChequeDeliveryMethod1Choice;
import com.tools20022.repository.codeset.ChequeDeliveryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.msg.Cheque7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Action to issue a cheque in order to settle an amount due to a creditor.
 */
public class ChequeIssue extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the characteristics of the cheque used to pay an amount to a
	 * creditor.
	 */
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ChequeIssue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Specifies the characteristics of the cheque used to pay an amount to a creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.ChequeDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};
	/**
	 * Specifies the delivery method of the cheque by the debtor's agent.
	 */
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ChequeDeliveryMethod1Choice.Code, com.tools20022.repository.choice.ChequeDeliveryMethod1Choice.Proprietary,
					com.tools20022.repository.msg.Cheque7.DeliveryMethod);
			isDerived = false;
			elementContext_lazy = () -> ChequeIssue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies the delivery method of the cheque by the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChequeDeliveryCode.mmObject();
		}
	};
	/**
	 * Identifies the party to whom the debtor's agent should send the cheque.
	 */
	public static final MMBusinessAssociationEnd DeliverTo = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.DeliverTo);
			isDerived = false;
			elementContext_lazy = () -> ChequeIssue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliverTo";
			definition = "Identifies the party to whom the debtor's agent should send the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.ChequeIssue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};
	/**
	 * Specifies the print location of the cheque.
	 */
	public static final MMBusinessAttribute PrintLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.PrintLocation);
			isDerived = false;
			elementContext_lazy = () -> ChequeIssue.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrintLocation";
			definition = "Specifies the print location of the cheque.";
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
				name = "ChequeIssue";
				definition = "Action to issue a cheque in order to settle an amount due to a creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.ChequeIssue, com.tools20022.repository.entity.Cheque.ChequeDelivery);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.ChequeInstruction, com.tools20022.repository.msg.CreditTransferTransaction22.ChequeInstruction);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ChequeIssue.Cheque, com.tools20022.repository.entity.ChequeIssue.DeliveryMethod, com.tools20022.repository.entity.ChequeIssue.DeliverTo,
						com.tools20022.repository.entity.ChequeIssue.PrintLocation);
				derivationComponent_lazy = () -> Arrays.asList(ChequeDeliveryMethod1Choice.mmObject(), Cheque7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
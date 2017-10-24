package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference information provided by the creditor to allow the identification of
 * the underlying documents.
 */
public class CreditorReferenceInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of creditor reference.
	 */
	public static final MMMessageAssociationEnd Type = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CreditorReferenceInformation2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of creditor reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditorReferenceType2.mmObject();
		}
	};
	/**
	 * Unique reference, as assigned by the creditor, to unambiguously refer to
	 * the payment transaction.
	 * 
	 * Usage: If available, the initiating party should provide this reference
	 * in the structured remittance information, to enable reconciliation by the
	 * creditor upon receipt of the amount of money.
	 * 
	 * If the business context requires the use of a creditor reference or a
	 * payment remit identification, and only one identifier can be passed
	 * through the end-to-end chain, the creditor's reference or payment
	 * remittance identification should be quoted in the end-to-end transaction
	 * identification.
	 */
	public static final MMMessageAttribute Reference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.CreditorReference;
			componentContext_lazy = () -> CreditorReferenceInformation2.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.\n\nUsage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money.\n\nIf the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceInformation2.Type, com.tools20022.repository.msg.CreditorReferenceInformation2.Reference);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditorReferenceInformation2";
				definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			}
		});
		return mmObject_lazy.get();
	}
}
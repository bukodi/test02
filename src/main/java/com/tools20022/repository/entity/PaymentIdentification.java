package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.CreditorReferenceInformation2;
import com.tools20022.repository.msg.PaymentIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by
	 * the clearing agent or the initiating party.
	 */
	public static final MMBusinessAttribute ExecutionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader48.MessageIdentification, com.tools20022.repository.msg.GroupHeader55.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader56.MessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader3.OriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader52.MessageIdentification,
					com.tools20022.repository.msg.GroupHeader47.MessageIdentification, com.tools20022.repository.msg.GroupHeader46.MessageIdentification, com.tools20022.repository.msg.GroupHeader45.MessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader7.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation28.OriginalMessageIdentification);
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment as assigned by the
	 * originator. The payment transaction reference is used for reconciliation
	 * or to link tasks relating to the payment.
	 */
	public static final MMBusinessAttribute EndToEndIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification1.EndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction83.OriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction77.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction82.OriginalEndToEndIdentification);
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction.
	 */
	public static final MMBusinessAttribute InstructionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentIdentification1.InstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction83.OriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction82.OriginalInstructionIdentification);
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification assigned by the first instructing agent to
	 * unambiguously identify the transaction and passed on, unchanged,
	 * throughout the entire interbank chain.
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing system.
	 */
	public static final MMBusinessAttribute ClearingSystemReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction83.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction82.ClearingSystemReference);
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference assigned by the creditor to refer to the
	 * payment obligation.
	 */
	public static final MMBusinessAttribute CreditorReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceInformation2.Reference, com.tools20022.repository.msg.StructuredRemittanceInformation13.CreditorReferenceInformation);
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment for which identifications are provided.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.TransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.ClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.CreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.Payment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentification1.mmObject(), CreditorReferenceInformation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
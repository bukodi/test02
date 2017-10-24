package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details on the original transactions, to which the status report
 * message refers.
 */
public class OriginalPaymentInstruction21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the reversed payment
	 * information group. Usage: The instructing party is the party sending the
	 * reversal message and not the party that sent the original instruction
	 * that is being reversed.
	 */
	public static final MMMessageAttribute ReversalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification;
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "RvslPmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed payment information group.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the original sending party, to
	 * unambiguously identify the original payment information group.
	 */
	public static final MMMessageAttribute OriginalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number of individual transactions contained in the original payment
	 * information group.
	 */
	public static final MMMessageAttribute OriginalNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original payment information group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the original payment
	 * information group, irrespective of currencies.
	 */
	public static final MMMessageAttribute OriginalControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original payment information group, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Identifies whether a single entry per individual transaction or a batch
	 * entry for the sum of the amounts of all transactions within the group of
	 * a message is requested. Usage: Batch booking is used to request and not
	 * order a possible batch booking.
	 */
	public static final MMMessageAttribute BatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether or not the reversal applies to the complete original
	 * payment information group or to individual transactions within that
	 * group.
	 */
	public static final MMMessageAttribute PaymentInformationReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "PmtInfRvsl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationReversal";
			definition = "Indicates whether or not the reversal applies to the complete original payment information group or to individual transactions within that group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Provides detailed information on the reversal reason.
	 */
	public static final MMMessageAssociationEnd ReversalReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Provides detailed information on the reversal reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentReversalReason7.mmObject();
		}
	};
	/**
	 * Provides information on the original transactions to which the reversal
	 * message refers.
	 */
	public static final MMMessageAssociationEnd TransactionInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> OriginalPaymentInstruction21.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Provides information on the original transactions to which the reversal message refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction77.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalPaymentInformationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction21.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction21.OriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalPaymentInstruction21.OriginalControlSum, com.tools20022.repository.msg.OriginalPaymentInstruction21.BatchBooking,
						com.tools20022.repository.msg.OriginalPaymentInstruction21.PaymentInformationReversal, com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction21.TransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentReversalV07.OriginalPaymentInformationAndReversal);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction21";
				definition = "Provides details on the original transactions, to which the status report message refers.";
			}
		});
		return mmObject_lazy.get();
	}
}
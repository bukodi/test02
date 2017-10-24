package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the reversal
 * message applies.
 */
public class PaymentTransaction77 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the reversed transaction.
	 * Usage: The instructing party is the party sending the reversal message
	 * and not the party that sent the original instruction that is being
	 * reversed.
	 */
	public static final MMMessageAttribute ReversalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "RvslId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed transaction.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the original instructing party for
	 * the original instructed party, to unambiguously identify the original
	 * instruction.
	 */
	public static final MMMessageAttribute OriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.InstructionIdentification;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by the original initiating party, to
	 * unambiguously identify the original transaction.
	 */
	public static final MMMessageAttribute OriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.EndToEndIdentification;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Amount of money, as provided in the original transaction, to be moved
	 * between the debtor and the creditor, before deduction of charges,
	 * expressed in the currency, as ordered by the original initiating party.<br>
	 * Usage: This amount has to be transported unchanged through the
	 * transaction chain.
	 */
	public static final MMMessageAttribute OriginalInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructedAmount;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructedAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party.\r\nUsage: This amount has to be transported unchanged through the transaction chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money to be moved between the debtor and the creditor, before
	 * deduction of charges, in the reversed transaction.<br>
	 * Usage: This amount has to be transported unchanged through the
	 * transaction chain.
	 */
	public static final MMMessageAttribute ReversedInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.InstructedAmount;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "RvsdInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmount";
			definition = "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction.\r\nUsage: This amount has to be transported unchanged through the transaction chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies if the creditor and/or debtor will bear the charges associated
	 * with the processing of the payment transaction.
	 * 
	 * Usage: The ChargeBearer applies to the reversal message, not to the
	 * original instruction.
	 */
	public static final MMMessageAttribute ChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.BearerType;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * Provides detailed information on the reversal reason.
	 */
	public static final MMMessageAssociationEnd ReversalReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
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
	 * Key elements used to identify the original transaction that is being
	 * referred to.
	 */
	public static final MMMessageAssociationEnd OriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Key elements used to identify the original transaction that is being referred to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalTransactionReference24.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 */
	public static final MMMessageAttribute SupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransaction77.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction77.ReversalIdentification, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructionIdentification,
						com.tools20022.repository.msg.PaymentTransaction77.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructedAmount,
						com.tools20022.repository.msg.PaymentTransaction77.ReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransaction77.ChargeBearer,
						com.tools20022.repository.msg.PaymentTransaction77.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction77.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction77.SupplementaryData);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction77";
				definition = "Provides further details on the reference and status on the original transactions, included in the original instruction, to which the reversal message applies.";
			}
		});
		return mmObject_lazy.get();
	}
}
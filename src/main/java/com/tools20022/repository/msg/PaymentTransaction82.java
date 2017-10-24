package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ExternalPaymentTransactionStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details on the original transactions, to which the status
 * report message refers.
 */
public class PaymentTransaction82 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the reported status. Usage:
	 * The instructing party is the party sending the status message and not the
	 * party that sent the original instruction that is being reported on.
	 */
	public static final MMMessageAttribute StatusIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "StsId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reported status.\nUsage: The instructing party is the party sending the status message and not the party that sent the original instruction that is being reported on.";
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
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
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
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
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
	 * Specifies the status of a transaction, in a coded form.
	 */
	public static final MMMessageAttribute TransactionStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.PaymentStatus;
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Specifies the status of a transaction, in a coded form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalPaymentTransactionStatus1Code.mmObject();
		}
	};
	/**
	 * Provides detailed information on the status reason.
	 */
	public static final MMMessageAssociationEnd StatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Provides detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReasonInformation9.mmObject();
		}
	};
	/**
	 * Provides information on the charges related to the processing of the
	 * rejection of the instruction. Usage: This is passed on for information
	 * purposes only. Settlement of the charges will be done separately.
	 */
	public static final MMMessageAssociationEnd ChargesInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "ChrgsInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformation";
			definition = "Provides information on the charges related to the processing of the rejection of the instruction.\nUsage: This is passed on for information purposes only. Settlement of the charges will be done separately.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charges2.mmObject();
		}
	};
	/**
	 * Point in time when the payment order from the initiating party meets the
	 * processing conditions of the account servicing agent. This means that the
	 * account servicing agent has received the payment order and has applied
	 * checks such as authorisation, availability of funds.
	 */
	public static final MMMessageAttribute AcceptanceDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.AcceptanceDateTime;
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "AccptncDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent. This means that the account servicing agent has received the payment order and has applied checks such as authorisation, availability of funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique reference, as assigned by the account servicing institution, to
	 * unambiguously identify the instruction.
	 */
	public static final MMMessageAttribute AccountServicerReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.AccountServicerTransactionIdentification;
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Unique reference, as assigned by the account servicing institution, to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique reference, as assigned by a clearing system, to unambiguously
	 * identify the instruction.
	 */
	public static final MMMessageAttribute ClearingSystemReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ClearingSystemReference;
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
			isDerived = false;
			xmlTag = "ClrSysRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique reference, as assigned by a clearing system, to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Key elements used to identify the original transaction that is being
	 * referred to.
	 */
	public static final MMMessageAssociationEnd OriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
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
			componentContext_lazy = () -> PaymentTransaction82.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction82.StatusIdentification, com.tools20022.repository.msg.PaymentTransaction82.OriginalInstructionIdentification,
						com.tools20022.repository.msg.PaymentTransaction82.OriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction82.TransactionStatus,
						com.tools20022.repository.msg.PaymentTransaction82.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction82.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction82.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction82.AccountServicerReference,
						com.tools20022.repository.msg.PaymentTransaction82.ClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction82.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction82.SupplementaryData);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction82";
				definition = "Provides further details on the original transactions, to which the status report message refers.";
			}
		});
		return mmObject_lazy.get();
	}
}
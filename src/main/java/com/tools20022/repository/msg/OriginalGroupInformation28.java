package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ExternalPaymentGroupStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide information on the original group, to which
 * the message refers.
 */
public class OriginalGroupInformation28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Point to point reference, as assigned by the original instructing party,
	 * to unambiguously identify the original message.
	 */
	public static final MMMessageAttribute OriginalMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification;
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the original message name identifier to which the message
	 * refers.
	 */
	public static final MMMessageAttribute OriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which the original message was created.
	 */
	public static final MMMessageAttribute OriginalCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CreationDate;
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Number of individual transactions contained in the original message.
	 */
	public static final MMMessageAttribute OriginalNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the original message,
	 * irrespective of currencies.
	 */
	public static final MMMessageAttribute OriginalControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original message, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Specifies the status of a group of transactions.
	 */
	public static final MMMessageAttribute GroupStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.Status;
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "GrpSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Specifies the status of a group of transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalPaymentGroupStatus1Code.mmObject();
		}
	};
	/**
	 * Set of elements used to provide detailed information on the status
	 * reason.
	 */
	public static final MMMessageAssociationEnd StatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Set of elements used to provide detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReasonInformation9.mmObject();
		}
	};
	/**
	 * Detailed information on the number of transactions for each identical
	 * transaction status.
	 */
	public static final MMMessageAssociationEnd NumberOfTransactionsPerStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalGroupInformation28.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerStatus";
			definition = "Detailed information on the number of transactions for each identical transaction status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation28.OriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation28.OriginalMessageNameIdentification,
						com.tools20022.repository.msg.OriginalGroupInformation28.OriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation28.OriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalGroupInformation28.OriginalControlSum, com.tools20022.repository.msg.OriginalGroupInformation28.GroupStatus,
						com.tools20022.repository.msg.OriginalGroupInformation28.StatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation28.NumberOfTransactionsPerStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.OriginalGroupInformationAndStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalGroupInformation28";
				definition = "Set of elements used to provide information on the original group, to which the message refers.";
			}
		});
		return mmObject_lazy.get();
	}
}
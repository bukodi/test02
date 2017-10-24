package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ExternalPaymentGroupStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details information on the original transactions, to which the
 * status report message refers.
 */
public class OriginalPaymentInstruction23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the original sending party, to
	 * unambiguously identify the original payment information group.
	 */
	public static final MMMessageAttribute OriginalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
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
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
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
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
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
	 * Specifies the status of the payment information group.
	 */
	public static final MMMessageAttribute PaymentInformationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.Status;
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "PmtInfSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatus";
			definition = "Specifies the status of the payment information group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalPaymentGroupStatus1Code.mmObject();
		}
	};
	/**
	 * Provides detailed information on the status reason.
	 */
	public static final MMMessageAssociationEnd StatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
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
	 * Detailed information on the number of transactions for each identical
	 * transaction status.
	 */
	public static final MMMessageAssociationEnd NumberOfTransactionsPerStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
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
	/**
	 * Provides information on the original transactions to which the status
	 * report message refers.
	 */
	public static final MMMessageAssociationEnd TransactionInformationAndStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Provides information on the original transactions to which the status report message refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction82.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction23.OriginalPaymentInformationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.OriginalNumberOfTransactions, com.tools20022.repository.msg.OriginalPaymentInstruction23.OriginalControlSum,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.PaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.StatusReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.NumberOfTransactionsPerStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.TransactionInformationAndStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.OriginalPaymentInformationAndStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction23";
				definition = "Provides details information on the original transactions, to which the status report message refers.";
			}
		});
		return mmObject_lazy.get();
	}
}
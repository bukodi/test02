package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader52;
import com.tools20022.repository.msg.OriginalGroupHeader7;
import com.tools20022.repository.msg.OriginalPaymentInstruction23;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The CustomerPaymentStatusReport message is sent by an instructed agent to the
 * previous party in the payment chain. It is used to inform this party about
 * the positive or negative status of an instruction (either single or file). It
 * is also used to report on a pending instruction.<br>
 * <b>Usage</b><br>
 * The CustomerPaymentStatusReport message is exchanged between an agent and a
 * non-financial institution customer to provide status information on
 * instructions previously sent. Its usage will always be governed by a
 * bilateral agreement between the agent and the non-financial institution
 * customer.<br>
 * The CustomerPaymentStatusReport message can be used to provide information
 * about the status (e.g. rejection, acceptance) of the initiation of a credit
 * transfer, a direct debit, as well as on the initiation of other customer
 * instructions.<br>
 * The CustomerPaymentStatusReport message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The CustomerPaymentStatusReport message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerPaymentStatusReport may also be sent to the receiver of the
 * payment in a real time payment scenario, as both sides of the transactions
 * must be informed of the status of the transaction (e.g. either the
 * beneficiary is credited, or the transaction is rejected).
 */
public class CustomerPaymentStatusReportV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the status report message.
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status report message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader52.mmObject();
		}
	};
	/**
	 * Original group information concerning the group of transactions, to which
	 * the status report message refers to.
	 */
	public static final MMMessageBuildingBlock OriginalGroupInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the status report message refers to.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupHeader7.mmObject();
		}
	};
	/**
	 * Information concerning the original payment information, to which the
	 * status report message refers.
	 */
	public static final MMMessageBuildingBlock OriginalPaymentInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Information concerning the original payment information, to which the status report message refers.";
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInstruction23.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "pain";
			messageFunctionality = "002";
			flavour = "001";
			version = "08";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentStatusReportV08";
				definition = "Scope\r\nThe CustomerPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe CustomerPaymentStatusReport message is exchanged between an agent and a non-financial institution customer to provide status information on instructions previously sent. Its usage will always be governed by a bilateral agreement between the agent and the non-financial institution customer.\r\nThe CustomerPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of the initiation of a credit transfer, a direct debit, as well as on the initiation of other customer instructions.\r\nThe CustomerPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentStatusReport message can be used in domestic and cross-border scenarios.\r\nThe CustomerPaymentStatusReport may also be sent to the receiver of the payment in a real time payment scenario, as both sides of the transactions must be informed of the status of the transaction (e.g. either the beneficiary is credited, or the transaction is rejected). ";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "CstmrPmtStsRpt";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.GroupHeader,
						com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.OriginalGroupInformationAndStatus, com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.OriginalPaymentInformationAndStatus,
						com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
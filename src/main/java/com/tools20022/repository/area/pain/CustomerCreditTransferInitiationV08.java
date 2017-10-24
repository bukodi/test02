package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader48;
import com.tools20022.repository.msg.PaymentInstruction22;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The CustomerCreditTransferInitiation message is sent by the initiating party
 * to the forwarding agent or debtor agent. It is used to request movement of
 * funds from the debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The CustomerCreditTransferInitiation message can contain one or more customer
 * credit transfer instructions.<br>
 * The CustomerCreditTransferInitiation message is used to exchange:<br>
 * - One or more instances of a credit transfer initiation;<br>
 * - Payment transactions that result in book transfers at the debtor agent or
 * payments to another financial institution;<br>
 * - Payment transactions that result in an electronic cash transfer to the
 * creditor account or in the emission of a cheque.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the debtor agent. The
 * debtor agent is the account servicer of the debtor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerCreditTransferInitiation message to the debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the debtor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerCreditTransferInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerCreditTransferInitiation message must not be used by the debtor
 * agent to execute the credit transfer instruction(s). The
 * FIToFICustomerCreditTransfer message must be used instead.
 */
public class CustomerCreditTransferInitiationV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader48.mmObject();
		}
	};
	/**
	 * Set of characteristics that applies to the debit side of the payment
	 * transactions included in the credit transfer initiation.
	 */
	public static final MMMessageBuildingBlock PaymentInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that applies to the debit side of the payment transactions included in the credit transfer initiation.";
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstruction22.mmObject();
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
			messageFunctionality = "001";
			flavour = "001";
			version = "08";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerCreditTransferInitiationV08";
				definition = "Scope\r\nThe CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.\r\nUsage\r\nThe CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.\r\nThe CustomerCreditTransferInitiation message is used to exchange:\r\n- One or more instances of a credit transfer initiation;\r\n- Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;\r\n- Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead.";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "CstmrCdtTrfInitn";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.GroupHeader,
						com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.PaymentInformation, com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
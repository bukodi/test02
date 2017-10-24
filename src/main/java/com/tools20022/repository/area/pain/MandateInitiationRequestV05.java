package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.Mandate10;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MandateInitiationRequest message is sent by the initiator of the request
 * to his agent. The initiator can either be the debtor or the creditor.<br>
 * The MandateInitiationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty.<br>
 * The MandateInitiationRequest message is used to setup the instruction that
 * allows the debtor agent to accept instructions from the creditor, through the
 * creditor agent, to debit the account of the debtor.<br>
 * <b>Usage</b><br>
 * The MandateInitiationRequest message can contain one or more request(s) to
 * setup a specific mandate.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor.<br>
 * The MandateInitiationRequest message can be used in domestic and cross-border
 * scenarios.
 */
public class MandateInitiationRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate initiation, but which are not part of the mandate.
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate initiation, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}
	};
	/**
	 * Set of elements used to provide the details of the mandate signed between
	 * the (ultimate) creditor and the (ultimate) debtor.
	 */
	public static final MMMessageBuildingBlock Mandate = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Set of elements used to provide the details of the mandate signed between the (ultimate) creditor and the (ultimate) debtor.";
			minOccurs = 1;
			complexType_lazy = () -> Mandate10.mmObject();
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
			messageFunctionality = "009";
			flavour = "001";
			version = "05";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateInitiationRequestV05";
				definition = "Scope\r\nThe MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nThe MandateInitiationRequest message is used to setup the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.\r\nUsage\r\nThe MandateInitiationRequest message can contain one or more request(s) to setup a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateInitiationRequest message can be used in domestic and cross-border scenarios.";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "MndtInitnReq";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateInitiationRequestV05.GroupHeader, com.tools20022.repository.area.pain.MandateInitiationRequestV05.Mandate,
						com.tools20022.repository.area.pain.MandateInitiationRequestV05.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.MandateInitiationRequestV05.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
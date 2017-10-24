package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateCopy1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MandateCopyRequest message is sent by the initiator of the request to his
 * agent. The initiator can either be the debtor or the creditor.<br>
 * The MandateCopyRequest message is forwarded by the agent of the initiator to
 * the agent of the counterparty.<br>
 * A MandateCopyRequest message is used to request a copy of an existing
 * mandate. If accepted, the mandate copy can be sent using the
 * MandateAcceptanceReport message.<br>
 * <b>Usage</b><br>
 * The MandateCopyRequest message can contain one or more copy requests.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor.<br>
 * The MandateCopyRequest message can be used in domestic and cross-border
 * scenarios.<br>
 */
public class MandateCopyRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate copy request, but which are not part of the mandate.
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate copy request, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}
	};
	/**
	 * Set of information used to identify the mandate for which a copy is
	 * requested.
	 */
	public static final MMMessageBuildingBlock UnderlyingCopyRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygCpyReqDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingCopyRequestDetails";
			definition = "Set of information used to identify the mandate for which a copy is requested.";
			minOccurs = 1;
			complexType_lazy = () -> MandateCopy1.mmObject();
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
			messageFunctionality = "017";
			flavour = "001";
			version = "01";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateCopyRequestV01";
				definition = "Scope\r\nThe MandateCopyRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateCopyRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nA MandateCopyRequest message is used to request a copy of an existing mandate. If accepted, the mandate copy can be sent using the MandateAcceptanceReport message.\r\nUsage\r\nThe MandateCopyRequest message can contain one or more copy requests.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateCopyRequest message can be used in domestic and cross-border scenarios.\r\n";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "MndtCpyReq";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateCopyRequestV01.GroupHeader, com.tools20022.repository.area.pain.MandateCopyRequestV01.UnderlyingCopyRequestDetails,
						com.tools20022.repository.area.pain.MandateCopyRequestV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.MandateCopyRequestV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
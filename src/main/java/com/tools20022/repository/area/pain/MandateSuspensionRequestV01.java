package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateSuspension1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MandateSuspensionRequest message is sent by the initiator of the request
 * to its agent. The initiator can either be the debtor, debtor agent, creditor
 * or creditor agent.<br>
 * A MandateSuspensionRequest message is used to request the suspension of an
 * existing mandate until the suspension is lifted. <br>
 * <b>Usage</b><br>
 * The MandateSuspensionRequest message can contain one or more suspension
 * requests.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The MandateSuspensionRequest message can be used in domestic and cross-border
 * scenarios.<br>
 */
public class MandateSuspensionRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate suspension request, but which are not part of the mandate.
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate suspension request, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}
	};
	/**
	 * Set of elements used to provide information on the suspension request of
	 * the mandate.
	 */
	public static final MMMessageBuildingBlock UnderlyingSuspensionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygSspnsnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSuspensionDetails";
			definition = "Set of elements used to provide information on the suspension request of the mandate.";
			minOccurs = 1;
			complexType_lazy = () -> MandateSuspension1.mmObject();
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
			messageFunctionality = "018";
			flavour = "001";
			version = "01";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateSuspensionRequestV01";
				definition = "Scope\r\nThe MandateSuspensionRequest message is sent by the initiator of the request to its agent. The initiator can either be the debtor, debtor agent, creditor or creditor agent.\r\nA MandateSuspensionRequest message is used to request the suspension of an existing mandate until the suspension is lifted. \r\nUsage\r\nThe MandateSuspensionRequest message can contain one or more suspension requests.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe MandateSuspensionRequest message can be used in domestic and cross-border scenarios.\r\n";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "MndtSspnsnReq";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateSuspensionRequestV01.GroupHeader, com.tools20022.repository.area.pain.MandateSuspensionRequestV01.UnderlyingSuspensionDetails,
						com.tools20022.repository.area.pain.MandateSuspensionRequestV01.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.MandateSuspensionRequestV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
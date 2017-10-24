package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader46;
import com.tools20022.repository.msg.OriginalGroupInformation28;
import com.tools20022.repository.msg.OriginalPaymentInstruction24;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The CreditorPaymentActivationRequestStatusReport message is sent by a party
 * to the next party in the creditor payment activation request chain. It is
 * used to inform the latter about the positive or negative status of a creditor
 * payment activation request (either single or file).
 */
public class CreditorPaymentActivationRequestStatusReportV06 {

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
			complexType_lazy = () -> GroupHeader46.mmObject();
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
			complexType_lazy = () -> OriginalGroupInformation28.mmObject();
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
			complexType_lazy = () -> OriginalPaymentInstruction24.mmObject();
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
			messageFunctionality = "014";
			flavour = "001";
			version = "06";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditorPaymentActivationRequestStatusReportV06";
				definition = "The CreditorPaymentActivationRequestStatusReport message is sent by a party to the next party in the creditor payment activation request chain. It is used to inform the latter about the positive or negative status of a creditor payment activation request (either single or file).";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				xmlTag = "CdtrPmtActvtnReqStsRpt";
				rootElement = "Document";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.GroupHeader,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.OriginalGroupInformationAndStatus,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.OriginalPaymentInformationAndStatus,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}
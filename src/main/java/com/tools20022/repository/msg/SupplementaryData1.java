package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 */
public class SupplementaryData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance.<br>
	 * In the case of XML, this is expressed by a valid XPath.
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Technical element wrapping the supplementary data.
	 */
	public static final MMMessageAssociationEnd Envelope = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "Envlp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Envelope";
			definition = "Technical element wrapping the supplementary data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SupplementaryDataEnvelope1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupplementaryData1.PlaceAndName, com.tools20022.repository.msg.SupplementaryData1.Envelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAcceptanceReportV05.SupplementaryData, com.tools20022.repository.area.pain.MandateAmendmentRequestV05.SupplementaryData,
						com.tools20022.repository.area.pain.MandateInitiationRequestV05.SupplementaryData, com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08.SupplementaryData,
						com.tools20022.repository.area.pain.MandateCancellationRequestV05.SupplementaryData, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07.SupplementaryData,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06.SupplementaryData, com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.SupplementaryData,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06.SupplementaryData, com.tools20022.repository.area.pain.CustomerPaymentReversalV07.SupplementaryData,
						com.tools20022.repository.area.pain.MandateSuspensionRequestV01.SupplementaryData, com.tools20022.repository.area.pain.MandateCopyRequestV01.SupplementaryData);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SupplementaryData1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}
}
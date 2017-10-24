package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.OriginalMandate5Choice;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the mandate, which is being accepted.
 */
public class MandateAcceptance5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides information on the original message.
	 */
	public static final MMMessageAssociationEnd OriginalMessageInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Provides information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMessageInformation1.mmObject();
		}
	};
	/**
	 * Provides detailed information on the acceptance result.
	 */
	public static final MMMessageAssociationEnd AcceptanceResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.MandateStatus;
			componentContext_lazy = () -> MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "AccptncRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceResult";
			definition = "Provides detailed information on the acceptance result.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptanceResult6.mmObject();
		}
	};
	/**
	 * Provides the original mandate data.
	 */
	public static final MMMessageAssociationEnd OriginalMandate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.OriginalMandate;
			componentContext_lazy = () -> MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMandate5Choice.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 */
	public static final MMMessageAttribute SupplementaryData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateAcceptance5.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.OriginalMessageInformation, com.tools20022.repository.msg.MandateAcceptance5.AcceptanceResult,
						com.tools20022.repository.msg.MandateAcceptance5.OriginalMandate, com.tools20022.repository.msg.MandateAcceptance5.SupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAcceptanceReportV05.UnderlyingAcceptanceDetails);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateAcceptance5";
				definition = "Identifies the mandate, which is being accepted.";
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.MandateStatus1Choice;
import com.tools20022.repository.choice.OriginalMandate4Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the mandate, for which a copy of the details is requested.
 */
public class MandateCopy1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides information on the original message.
	 */
	public static final MMMessageAssociationEnd OriginalMessageInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCopy1.mmObject();
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
	 * Provides the original mandate data.
	 */
	public static final MMMessageAssociationEnd OriginalMandate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate4Choice.mmObject();
		}
	};
	/**
	 * Indicates the status of the mandate.
	 */
	public static final MMMessageAssociationEnd MandateStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "MndtSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateStatus";
			definition = "Indicates the status of the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateStatus1Choice.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 */
	public static final MMMessageAssociationEnd SupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateCopy1.OriginalMessageInformation, com.tools20022.repository.msg.MandateCopy1.OriginalMandate,
						com.tools20022.repository.msg.MandateCopy1.MandateStatus, com.tools20022.repository.msg.MandateCopy1.SupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateCopyRequestV01.UnderlyingCopyRequestDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateCopy1";
				definition = "Identifies the mandate, for which a copy of the details is requested.";
			}
		});
		return mmObject_lazy.get();
	}
}
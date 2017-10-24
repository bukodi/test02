package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide information on the remittance advice.
 */
public class RemittanceLocation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the initiating party, to
	 * unambiguously identify the remittance information sent separately from
	 * the payment instruction, such as a remittance advice.
	 */
	public static final MMMessageAttribute RemittanceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceLocation4.mmObject();
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Set of elements used to provide information on the location and/or
	 * delivery of the remittance information.
	 */
	public static final MMMessageAssociationEnd RemittanceLocationDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ContactPoint.mmObject();
			componentContext_lazy = () -> RemittanceLocation4.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationDetails";
			definition = "Set of elements used to provide information on the location and/or delivery of the remittance information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceLocationDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocation4.RemittanceIdentification, com.tools20022.repository.msg.RemittanceLocation4.RemittanceLocationDetails);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocation4";
				definition = "Set of elements used to provide information on the remittance advice.";
			}
		});
		return mmObject_lazy.get();
	}
}
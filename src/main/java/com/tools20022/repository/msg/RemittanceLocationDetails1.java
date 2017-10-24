package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.RemittanceLocationMethod2Code;
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.entity.ContactPoint;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information on the remittance advice.
 */
public class RemittanceLocationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method used to deliver the remittance advice information.
	 */
	public static final MMMessageAttribute Method = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RemittanceDeliveryMethod;
			componentContext_lazy = () -> RemittanceLocationDetails1.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method used to deliver the remittance advice information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * Electronic address to which an agent is to send the remittance
	 * information.
	 */
	public static final MMMessageAttribute ElectronicAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			componentContext_lazy = () -> RemittanceLocationDetails1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicAddress";
			definition = "Electronic address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}
	};
	/**
	 * Postal address to which an agent is to send the remittance information.
	 */
	public static final MMMessageAssociationEnd PostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			componentContext_lazy = () -> RemittanceLocationDetails1.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Postal address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocationDetails1.Method, com.tools20022.repository.msg.RemittanceLocationDetails1.ElectronicAddress,
						com.tools20022.repository.msg.RemittanceLocationDetails1.PostalAddress);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationDetails1";
				definition = "Provides information on the remittance advice.";
			}
		});
		return mmObject_lazy.get();
	}
}
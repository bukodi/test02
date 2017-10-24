package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TaxPartyRole;
import com.tools20022.repository.entity.TaxPayer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about the entity involved in the tax paid or to be paid.
 */
public class TaxParty1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax identification number of the creditor.
	 */
	public static final MMMessageAttribute TaxIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber;
			componentContext_lazy = () -> TaxParty1.mmObject();
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Tax identification number of the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identification, as assigned by an organisation, to unambiguously
	 * identify a party.
	 */
	public static final MMMessageAttribute RegistrationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber;
			componentContext_lazy = () -> TaxParty1.mmObject();
			isDerived = false;
			xmlTag = "RegnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of tax payer.
	 */
	public static final MMMessageAttribute TaxType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TaxPayer.mmObject();
			componentContext_lazy = () -> TaxParty1.mmObject();
			isDerived = false;
			xmlTag = "TaxTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxType";
			definition = "Type of tax payer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty1.TaxIdentification, com.tools20022.repository.msg.TaxParty1.RegistrationIdentification, com.tools20022.repository.msg.TaxParty1.TaxType);
				trace_lazy = () -> TaxPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxParty1";
				definition = "Details about the entity involved in the tax paid or to be paid.";
			}
		});
		return mmObject_lazy.get();
	}
}
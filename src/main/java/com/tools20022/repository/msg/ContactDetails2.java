package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PersonIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Communication device number or electronic address used for communication.
 */
public class ContactDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the terms used to formally address a person.
	 */
	public static final MMMessageAttribute NamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.NamePrefix;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 */
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.Name;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Collection of information that identifies a phone number, as defined by
	 * telecom services.
	 */
	public static final MMMessageAttribute PhoneNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PhoneAddress.PhoneNumber;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PhoneNumber.mmObject();
		}
	};
	/**
	 * Collection of information that identifies a mobile phone number, as
	 * defined by telecom services.
	 */
	public static final MMMessageAttribute MobileNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PhoneAddress.MobileNumber;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "MobNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileNumber";
			definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PhoneNumber.mmObject();
		}
	};
	/**
	 * Collection of information that identifies a FAX number, as defined by
	 * telecom services.
	 */
	public static final MMMessageAttribute FaxNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PhoneAddress.FaxNumber;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PhoneNumber.mmObject();
		}
	};
	/**
	 * Address for electronic mail (e-mail).
	 */
	public static final MMMessageAttribute EmailAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.EmailAddress;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}
	};
	/**
	 * Contact details in an other form.
	 */
	public static final MMMessageAttribute Other = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			componentContext_lazy = () -> ContactDetails2.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Contact details in an other form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.NamePrefix, com.tools20022.repository.msg.ContactDetails2.Name, com.tools20022.repository.msg.ContactDetails2.PhoneNumber,
						com.tools20022.repository.msg.ContactDetails2.MobileNumber, com.tools20022.repository.msg.ContactDetails2.FaxNumber, com.tools20022.repository.msg.ContactDetails2.EmailAddress,
						com.tools20022.repository.msg.ContactDetails2.Other);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContactDetails2";
				definition = "Communication device number or electronic address used for communication.";
			}
		});
		return mmObject_lazy.get();
	}
}
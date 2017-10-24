package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.msg.OrganisationIdentification8;
import com.tools20022.repository.msg.PersonIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nature or use of the account.
 */
public class Party11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous way to identify an organisation.
	 */
	public static final MMMessageAssociationEnd OrganisationIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			componentContext_lazy = () -> Party11Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification8.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of a person, eg, passport.
	 */
	public static final MMMessageAssociationEnd PrivateIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PersonIdentification.mmObject();
			componentContext_lazy = () -> Party11Choice.mmObject();
			isDerived = false;
			xmlTag = "PrvtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateIdentification";
			definition = "Unique and unambiguous identification of a person, eg, passport.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonIdentification5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Party11Choice.OrganisationIdentification, com.tools20022.repository.choice.Party11Choice.PrivateIdentification);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party11Choice";
				definition = "Nature or use of the account.";
			}
		});
		return mmObject_lazy.get();
	}
}
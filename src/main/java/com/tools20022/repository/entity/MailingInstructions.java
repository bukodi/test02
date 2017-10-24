package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of an address.
 */
public class MailingInstructions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether mail should be sent to an address.
	 */
	public static final MMBusinessAttribute MailingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MailingInstructions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailingIndicator";
			definition = "Indicates whether mail should be sent to an address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the address is the official address of the party.
	 */
	public static final MMBusinessAttribute RegistrationAddressIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MailingInstructions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationAddressIndicator";
			definition = "Indicates whether the address is the official address of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Postal address for which mailing instructions are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPostalAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MailingInstructions.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which mailing instructions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.MailingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MailingInstructions";
				definition = "Characteristics of an address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.MailingInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MailingInstructions.MailingIndicator, com.tools20022.repository.entity.MailingInstructions.RegistrationAddressIndicator,
						com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress);
			}
		});
		return mmObject_lazy.get();
	}
}
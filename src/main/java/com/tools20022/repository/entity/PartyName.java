package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 */
public class PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party. This name is derived from the concatenation of the elements that
	 * compose the name of a person or from the legal name of an organisation.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.Name, com.tools20022.repository.msg.BranchData2.Name, com.tools20022.repository.msg.ContactDetails2.Name,
					com.tools20022.repository.msg.PartyIdentification43.Name, com.tools20022.repository.msg.NameAndAddress10.Name, com.tools20022.repository.msg.TaxAuthorisation1.Name,
					com.tools20022.repository.msg.RegulatoryAuthority2.Name);
			isDerived = false;
			elementContext_lazy = () -> PartyName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Party identification which contains a name.
	 */
	public static final MMBusinessAssociationEnd PartyIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PartyName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.PartyName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.PartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.Name, com.tools20022.repository.entity.PartyName.PartyIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which an organisation is known and which is usually used to identify
 * that organisation.
 */
public class OrganisationName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Organisation identification which contains a name.
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.OrganisationName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> OrganisationIdentification.mmObject();
		}
	};
	/**
	 * Official name under which an organisation is registered.
	 */
	public static final MMBusinessAttribute LegalName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalName";
			definition = "Official name under which an organisation is registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name used by a business for commercial purposes, although its registered
	 * legal name, used for contracts and other formal situations, may be
	 * another.
	 */
	public static final MMBusinessAttribute TradingName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the short name of the organisation.
	 */
	public static final MMBusinessAttribute ShortName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> OrganisationName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Specifies the short name of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationName";
				definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.OrganisationName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationName.Organisation, com.tools20022.repository.entity.OrganisationName.LegalName, com.tools20022.repository.entity.OrganisationName.TradingName,
						com.tools20022.repository.entity.OrganisationName.ShortName);
			}
		});
		return mmObject_lazy.get();
	}
}
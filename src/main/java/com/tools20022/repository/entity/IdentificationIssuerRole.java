package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InformationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that assigns the identification.
 */
public class IdentificationIssuerRole extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Country of the proprietary identification scheme.
	 */
	public static final MMBusinessAttribute Country = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Entity that issues the proprietary identification.
	 */
	public static final MMBusinessAttribute EntityName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code representing the organisation that owns and is responsible of an
	 * enumerated code list, for example ISO.
	 */
	public static final MMBusinessAttribute OwnerCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
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
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericFinancialIdentification1.Issuer, com.tools20022.repository.msg.GenericAccountIdentification1.Issuer,
						com.tools20022.repository.msg.GenericOrganisationIdentification1.Issuer, com.tools20022.repository.msg.GenericPersonIdentification1.Issuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.Country, com.tools20022.repository.entity.IdentificationIssuerRole.EntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.OwnerCode);
			}
		});
		return mmObject_lazy.get();
	}
}
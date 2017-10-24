package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name of the security.
 */
public class LocalName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the security.
	 */
	public static final MMBusinessAttribute FullName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LocalName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identification which contains a name.
	 */
	public static final MMBusinessAssociationEnd RelatedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LocalName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurity";
			definition = "Identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.Name;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}
	};
	/**
	 * Short name of the security
	 */
	public static final MMBusinessAttribute ShortName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LocalName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Short name of the security";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Language in which the security name is expressed.
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LocalName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the security name is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LocalName";
				definition = "Name of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.Name);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LocalName.FullName, com.tools20022.repository.entity.LocalName.RelatedSecurity, com.tools20022.repository.entity.LocalName.ShortName,
						com.tools20022.repository.entity.LocalName.Language);
			}
		});
		return mmObject_lazy.get();
	}
}
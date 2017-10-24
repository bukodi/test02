package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 */
public class PowerOfAttorneyRequirements {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the power of attorney needs to be validated by some
	 * authority.
	 */
	public static final MMBusinessAttribute LegalRequirement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalRequirement";
			definition = "Specifies whether the power of attorney needs to be validated by some authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
		}
	};
	/**
	 * Specifies the documents needed to obtain a valid power of attorney.
	 */
	public static final MMBusinessAttribute OtherDocumentation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherDocumentation";
			definition = "Specifies the documents needed to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Power of attorney for which the requirements are provided.
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney for which the requirements are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	/**
	 * Meeting to which the power of attorney requirements apply.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorneyRequirements.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting to which the power  of attorney requirements apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyRequirements";
				definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements, com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorneyRequirements.LegalRequirement, com.tools20022.repository.entity.PowerOfAttorneyRequirements.OtherDocumentation,
						com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney, com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}
package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of business of the organisation, for example, pharmaceutical.
 */
public class Sector {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which a sector is specified.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Sector.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a sector is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Sector;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Information regarding the entity that assigns the sector code.
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Sector.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding the entity that assigns the sector code.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.Sector;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	/**
	 * Organisation which belongs to a specific sector.
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Sector.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which belongs to a specific sector.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.Sector;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	/**
	 * Type of business of the organisation, for example, pharmaceutical.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Sector.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Type of business of the organisation, for example, pharmaceutical.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Strategy based on sector.
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Sector.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy based on sector.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SectorStrategy.Sector;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SectorStrategy.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Sector";
				definition = "Type of business of the organisation, for example, pharmaceutical.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Sector, com.tools20022.repository.entity.Organisation.Sector, com.tools20022.repository.entity.Scheme.Sector,
						com.tools20022.repository.entity.SectorStrategy.Sector);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Sector.Security, com.tools20022.repository.entity.Sector.Scheme, com.tools20022.repository.entity.Sector.Organisation,
						com.tools20022.repository.entity.Sector.Identification, com.tools20022.repository.entity.Sector.Strategy);
			}
		});
		return mmObject_lazy.get();
	}
}
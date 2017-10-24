package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters that identify a system.
 */
public class SystemIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * System which is identified.
	 */
	public static final MMBusinessAssociationEnd IdentificationForSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSystem";
			definition = "System which is identified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.SystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}
	};
	/**
	 * Identification of a model for a given manufacturer.
	 */
	public static final MMBusinessAttribute Model = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Model";
			definition = "Identification of a model for a given manufacturer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Serial number of a component.
	 */
	public static final MMBusinessAttribute SerialNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique approval number for a component, delivered by a certification
	 * body.
	 */
	public static final MMBusinessAttribute ApprovalNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique approval number for a component, delivered by a certification body.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Version of the system, eg, "4.0.1" to indicate version 4.0.1.
	 */
	public static final MMBusinessAttribute SystemVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemVersion";
			definition = "Version of the system, eg, \"4.0.1\" to indicate version 4.0.1.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name by which a system is known.
	 */
	public static final MMBusinessAssociationEnd SystemName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemName";
			definition = "Name by which a system is known.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemName.SystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemName.mmObject();
		}
	};
	/**
	 * Identification of a system.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemIdentification";
				definition = "Parameters that identify a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification, com.tools20022.repository.entity.System.SystemIdentification,
						com.tools20022.repository.entity.SystemName.SystemIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem, com.tools20022.repository.entity.SystemIdentification.Model,
						com.tools20022.repository.entity.SystemIdentification.SerialNumber, com.tools20022.repository.entity.SystemIdentification.ApprovalNumber, com.tools20022.repository.entity.SystemIdentification.SystemVersion,
						com.tools20022.repository.entity.SystemIdentification.SystemName, com.tools20022.repository.entity.SystemIdentification.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}
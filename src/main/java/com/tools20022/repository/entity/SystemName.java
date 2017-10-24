package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name of a system.
 */
public class SystemName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of a system for instance the common name assigned by the acquirer to
	 * the POI system.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a system for instance the common name assigned by the acquirer to the POI system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * System identification which contains a name.
	 */
	public static final MMBusinessAssociationEnd SystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemName.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "System identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.SystemName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemName";
				definition = "Name of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemIdentification.SystemName);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemName.Name, com.tools20022.repository.entity.SystemName.SystemIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}
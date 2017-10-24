package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SystemClosureReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about inactivity of a system.
 */
public class SystemClosureInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period of time when the system is closed/not operating.
	 */
	public static final MMBusinessAttribute Period = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemClosureInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Period of time when the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * System for which closure information is specified.
	 */
	public static final MMBusinessAssociationEnd SystemAvailability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemClosureInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemAvailability";
			definition = "System for which closure information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.ClosureInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
		}
	};
	/**
	 * Reason the system is closed/not operating.
	 */
	public static final MMBusinessAttribute ClosureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemClosureInformation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemClosureReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemClosureInformation";
				definition = "Information about inactivity of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemAvailability.ClosureInformation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemClosureInformation.Period, com.tools20022.repository.entity.SystemClosureInformation.SystemAvailability,
						com.tools20022.repository.entity.SystemClosureInformation.ClosureReason);
			}
		});
		return mmObject_lazy.get();
	}
}
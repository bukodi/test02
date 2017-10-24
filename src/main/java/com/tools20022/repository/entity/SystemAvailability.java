package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * information about the periods of activity and non-activity of a system.
 */
public class SystemAvailability {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Time window of system activity.
	 */
	public static final MMBusinessAssociationEnd AvailableSessionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemAvailability.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableSessionPeriod";
			definition = "Time window of system activity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TimePeriod.SystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TimePeriod.mmObject();
		}
	};
	/**
	 * System for which the system availability is provided.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemAvailability.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which the system availability is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Availability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * System availability parameters which contain closure information.
	 */
	public static final MMBusinessAssociationEnd ClosureInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemAvailability.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureInformation";
			definition = "System availability parameters which contain closure information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemClosureInformation.SystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemClosureInformation.mmObject();
		}
	};
	/**
	 * Date for which the availability information is provided.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemAvailability.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date for which the availability information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Period for which the system is closed/not operating.
	 */
	public static final MMBusinessAssociationEnd ClosurePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SystemAvailability.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosurePeriod";
			definition = "Period for which the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemAvailability";
				definition = "information about the periods of activity and non-activity of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability, com.tools20022.repository.entity.System.Availability,
						com.tools20022.repository.entity.TimePeriod.SystemAvailability, com.tools20022.repository.entity.SystemClosureInformation.SystemAvailability);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemAvailability.AvailableSessionPeriod, com.tools20022.repository.entity.SystemAvailability.System,
						com.tools20022.repository.entity.SystemAvailability.ClosureInformation, com.tools20022.repository.entity.SystemAvailability.Date, com.tools20022.repository.entity.SystemAvailability.ClosurePeriod);
			}
		});
		return mmObject_lazy.get();
	}
}
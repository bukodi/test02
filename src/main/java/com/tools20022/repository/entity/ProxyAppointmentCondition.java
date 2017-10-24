package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conditions that must be met to appoint a proxy.
 */
public class ProxyAppointmentCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address where the information on the proxy should be sent.
	 */
	public static final MMBusinessAssociationEnd NotificationAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Specifies the meeting to which the proxy appointment conditions aplly.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Specifies the meeting to which the proxy appointment conditions aplly.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * Indicates how to register a proxy.
	 */
	public static final MMBusinessAttribute RegistrationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies who can be assigned as a proxy.
	 */
	public static final MMBusinessAttribute AllowedProxyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowedProxyType";
			definition = "Specifies who can be assigned as a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentCondition";
				definition = "Conditions that must be met to appoint a proxy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedProxyAppointment, com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointmentCondition.NotificationAddress, com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting,
						com.tools20022.repository.entity.ProxyAppointmentCondition.RegistrationMethod, com.tools20022.repository.entity.ProxyAppointmentCondition.AllowedProxyType);
			}
		});
		return mmObject_lazy.get();
	}
}
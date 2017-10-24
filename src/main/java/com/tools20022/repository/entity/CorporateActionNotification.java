package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CorporateActionNotificationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The process of notifying of an upcoming corporate action. It provides
 * corporate action details including the different options.
 */
public class CorporateActionNotification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}
	};
	/**
	 * Identifies the corporate action notification.
	 */
	public static final MMBusinessAttribute CorporateActionNotificationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionNotificationIdentification";
			definition = "Identifies the corporate action notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of notification.
	 */
	public static final MMBusinessAttribute NotificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationType";
			definition = "Specifies the type of notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the date and time when the notification was issued.
	 */
	public static final MMBusinessAttribute CreationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the date and time when the notification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification";
				definition = "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing, com.tools20022.repository.entity.CorporateActionNotification.CorporateActionNotificationIdentification,
						com.tools20022.repository.entity.CorporateActionNotification.NotificationType, com.tools20022.repository.entity.CorporateActionNotification.CreationDateTime);
			}
		});
		return mmObject_lazy.get();
	}
}
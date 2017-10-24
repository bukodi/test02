package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services which consists in notifying the investor or its agent of a corporate
 * event and calculating its proceeds based on its holdings.
 */
public class CorporateActionServicing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account on which the entitlement is calculated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account on which the entitlement is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Service which consists in notifying the investor or its agent of a
	 * corporate event.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEventNotification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventNotification";
			definition = "Service which consists in notifying the investor or its agent of a corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionNotification.mmObject();
		}
	};
	/**
	 * Distribution of cash or securities as a result of a corporate action
	 * election.
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of cash or securities as a result of a corporate action election.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	/**
	 * Service which consists in notifying the investor or its entitlement per
	 * option.
	 */
	public static final MMBusinessAssociationEnd CorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Service which consists in notifying the investor or its entitlement per option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}
	};
	/**
	 * Specifies the event which is at the origin of the action.
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specifies the event which is at the origin of the action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Service which consists in validating, calculating and transferring the
	 * investor's instruction.
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Service which consists in validating, calculating and transferring the investor's instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	/**
	 * Calculation of the proceeds based on the balance in the account.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionServicing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Calculation of the proceeds based on the balance in the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.RelatedServicing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionServicing";
				definition = "Services which consists in notifying the investor or its agent of a corporate event and calculating its proceeds based on its holdings.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing, com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionEvent.Services, com.tools20022.repository.entity.CorporateActionEntitlement.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionElection.RelatedServicing, com.tools20022.repository.entity.CorporateActionDistribution.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedServicing);
				subType_lazy = () -> Arrays.asList(MeetingServicing.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification,
						com.tools20022.repository.entity.CorporateActionServicing.CorporateActionDistribution, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionServicing.Event, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEntitlement);
			}
		});
		return mmObject_lazy.get();
	}
}
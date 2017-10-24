package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the maximum risk that a party accepts to
 * take with respect to a counterparty or a set of counterparties. A risk
 * management limit is either bilateral, for a counterparty, or multilateral,
 * for a set of counterparties or all other members in a system.The limit may
 * also apply to sponsored or indirect members. In principle, a risk management
 * limit is calculated on the net position between two members and is expressed
 * as a credit or debit limit, from the point of view of the party setting the
 * limit.
 */
public class RiskManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash management service which offers limit management services.
	 */
	public static final MMBusinessAssociationEnd CashManagementService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Cash management service which offers limit management services.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.RiskManagementLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}
	};
	/**
	 * Identification of the system member for which the limit is established.
	 */
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Identification of the system member for which the limit is established.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RiskManagementLimit";
				definition = "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.Limit, com.tools20022.repository.entity.CashManagementService.RiskManagementLimit);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.CashManagementService, com.tools20022.repository.entity.RiskManagementLimit.Counterparty);
			}
		});
		return mmObject_lazy.get();
	}
}
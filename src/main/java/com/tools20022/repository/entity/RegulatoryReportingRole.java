package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party which plays a role for regulatory reporting.
 */
public class RegulatoryReportingRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Related party which must register the contract for regulatory reporting
	 * reasons.
	 */
	public static final MMBusinessAssociationEnd RelatedReportingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReportingParty";
			definition = "Related party which must register the contract for regulatory reporting reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReportingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};
	/**
	 * Related agent which is in charge of the registration of the contract.
	 */
	public static final MMBusinessAssociationEnd RelatedRegistrationAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrationAgent";
			definition = "Related agent which is in charge of the registration of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RegistrationAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};
	/**
	 * Related party which receives support information about the registered
	 * contract.
	 */
	public static final MMBusinessAssociationEnd RelatedReceivingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedReceivingParty";
			definition = "Related party which receives support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ReceivingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};
	/**
	 * Related Party which sends support information about the registered
	 * contract.
	 */
	public static final MMBusinessAssociationEnd RelatedSendingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegulatoryReportingRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSendingParty";
			definition = "Related Party which sends support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.SendingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingRole";
				definition = "Party which plays a role for regulatory reporting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.ReportingParty, com.tools20022.repository.entity.RegisteredContract.RegistrationAgent,
						com.tools20022.repository.entity.RegisteredContract.ReceivingParty, com.tools20022.repository.entity.RegisteredContract.SendingParty);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty);
			}
		});
		return mmObject_lazy.get();
	}
}